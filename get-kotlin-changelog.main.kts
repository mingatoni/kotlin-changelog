@file:Repository("https://repo1.maven.org/maven2")
@file:DependsOn("io.ktor:ktor-client-core-jvm:2.3.6")
@file:DependsOn("io.ktor:ktor-client-cio-jvm:2.3.6")
@file:DependsOn("io.ktor:ktor-client-content-negotiation-jvm:2.3.6")
@file:DependsOn("io.ktor:ktor-serialization-gson-jvm:2.3.6")

import com.google.gson.Gson
import com.google.gson.JsonElement
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.gson.*
import kotlinx.coroutines.runBlocking
import java.io.File
import java.nio.charset.Charset

data class IssueItem(
    val idReadable: String,
    val summary: String,
    val customFields: List<CustomField> // list of all Custom Fields
)

data class BundleElement(
    val name: String,
)

data class CustomField(
    val name: String,
    val value: JsonElement? // can be an object or array
)

data class BundleList(
    val values: List<BundleElement>
)

data class CustomFieldResponse(
    val bundle: BundleList
)

val VERSION_FIELD_ID = "123-13373"
val YOUTRACK_BASE_URL = "https://youtrack.jetbrains.com"

runBlocking {
    if (args.isEmpty()) {
        println("Error: Missing release version argument.")
        return@runBlocking
    }

    val version = args[0]
    // uncomment if you want to use regexp to check the format
    /*
    if (!Regex("""\d+\.\d+\.\d+(-\w+)?""").matches(version)) {
        println("Error: Invalid version format. Expected format like 2.3.0 or 2.3.0-Beta1.")
        return@runBlocking
    }*/

    // but better to read all possible version values and provide them to the user
    val supportedVersions: List<String> =  getAllSupportedVersions()
    if (!supportedVersions.contains(version)) {
        println("Error: Version isn't supported. Accepted versions list: ${supportedVersions.joinToString(", ")}")
        return@runBlocking
    }

    val issues = fetchIssues(version)

    if (issues.isEmpty()) {
        println("No issues found for version $version. No changelog file has been generated")
        return@runBlocking
    }

    val groupedIssues = groupBySubsystem(issues)
    val markdown = buildMarkdown(version, groupedIssues)

    val fileName = "changelog-$version.md"
    File(fileName).writeText(markdown, Charset.forName("UTF-8"))
    println("Changelog generated: $fileName")

}

suspend fun fetchIssues(version: String): List<IssueItem> {
    return try {
        val client = getHttpClient()
        val youTrackQuery = "Project: Kotlin State: Fixed Available In: $version"
        val fieldsToReturn = "idReadable,summary,customFields(id,name,value(name))"

        val response: HttpResponse = client.get("$YOUTRACK_BASE_URL/api/issues") {
            parameter("query", youTrackQuery)
            parameter("fields", fieldsToReturn)
        }
        client.close()

        if (response.status.isSuccess()) {
            val issues: List<IssueItem> = response.body()
            issues
        } else {
            println("Error: Requesting data returning an error with status code ${response.status}")
            println("Response-Body:\n${response.bodyAsText()}")
            emptyList()
        }
    } catch (e: Exception) {
        println("Error: Failed to connect to $YOUTRACK_BASE_URL, retrieve or process data.")
        println("Trace stack: ${e.stackTraceToString()}")
        emptyList()
    }
}

fun getHttpClient(): HttpClient {
    val client = HttpClient(CIO) {
        // install ContentNegotiation for automatic parsing and serialization of JSON
        install(ContentNegotiation) {
            gson {
                setPrettyPrinting()
            }
        }
    }
    return client
}

fun groupBySubsystem(issues: List<IssueItem>): Map<String, List<IssueItem>> {
    val gsonInstance = Gson()
    val map = mutableMapOf<String, MutableList<IssueItem>>()
        for (issue in issues) {
            var subsystem = "Uncategorized"
            val subsystemsField = issue.customFields.find { it.name == "Subsystems" }
            if (subsystemsField?.value != null) {
                val subsystemElements = subsystemsField.value.asJsonArray
                if (!subsystemElements.isEmpty) {
                    subsystem = gsonInstance.fromJson(subsystemElements.get(0), BundleElement::class.java).name// get only the first subsystem
                }
            }
            map.computeIfAbsent(subsystem) { mutableListOf() }.add(issue)
        }
    return map.toSortedMap()
}

fun buildMarkdown(version: String, groupedIssues: Map<String, List<IssueItem>>): String {
    val sb = StringBuilder("## $version\n")
    for ((subsystem, issues) in groupedIssues) {
        sb.append("\n### $subsystem\n")
        for (issue in issues) {
            val id = issue.idReadable
            val title = issue.summary
            sb.append("[`$id`]($YOUTRACK_BASE_URL/issue/$id) $title\n")
        }
    }
    return sb.toString()
}

suspend fun getAllSupportedVersions() : List<String>  {
    val apiPath = "/api/admin/projects/KT/customFields/$VERSION_FIELD_ID"
    return try {
        val client = getHttpClient()

        val fieldsToReturn = "bundle(values(name))"

        val response: HttpResponse = client.get("$YOUTRACK_BASE_URL$apiPath") {
            parameter("fields", fieldsToReturn)
        }
        client.close()

        if (response.status.isSuccess()) {
            val customResponse: CustomFieldResponse = response.body()
            val versions: List<BundleElement>  = customResponse.bundle.values
            versions.map { it.name }
        } else {
            println("Error: version list isn't found. Statuscode ${response.status}")
            emptyList()
        }
    } catch (e: Exception) {
        println("Error: Failed to connect to $YOUTRACK_BASE_URL, retrieve or process data.")
        println("Trace stack: ${e.stackTraceToString()}")
        emptyList()
    }
}