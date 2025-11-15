plugins {
    kotlin("jvm") version "2.2.20"
    kotlin("plugin.serialization") version "2.2.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(kotlin("test"))
    // Ktor HTTP Client - Core
    implementation("io.ktor:ktor-client-core:2.3.6")
    // Ktor HTTP Client - Engine (z.B. CIO für Coroutines I/O)
    implementation("io.ktor:ktor-client-cio:2.3.6")
    // Ktor Client - Content-Negotiation (für JSON-Verarbeitung)
    implementation("io.ktor:ktor-client-content-negotiation:2.3.6")
    // kotlinx.serialization - JSON-Implementierung
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.6")
}


//tasks.test {
//    useJUnitPlatform()
//}