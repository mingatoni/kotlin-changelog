# kotlin-changelog
generates changelog for specific kotlin release from youtrack data

this project contains two solutions:
1) Kotlin Application Project
2) Kotlin script based on gson de/serialization

As it was my first Kotlin project I've tried different ways to solve the exercise.
You can generate changelog fo specific kotlin release using both options.
Both solutions accepting as a parameter the kotlin release version for which you want to generate change log: e.g. 2.2.0 or 2.3.0-Beta1
If you run it without version parameter then you will get list of all possible versions used in the youtrack for Kotlin project.

# How to install and use:

## Kotlin Application Project
1) checkout the project
2) open it as kotlin project e.g. in IntelliJ IDE
3) set Run Configuration -> Program arguments -> Kotlin version as parameter e.g. 2.2.0 or 2.3.0-Beta1
4) build and run

alternatively you can build kotlin-changelog project first and then run .jar application with java
e.g. java -jar kotlin-changelog.jar 2.2.0

## Kotlin script
this solution working out-of-the-box from command line, IDE or teamcity build job.
Just checkout the project and execute the script.
e.g. kotlinc -script get-kotlin-changelog.main.kts 2.2.0

### Why I didn't use kotlinx-serialization for working with json and used gson instead in the kotlin script
I tried first to implement the solution using kotlinx-serialization library. But it requieres also kotlinx-serialization plugin.
I didn't find a proper way to apply the plugin inside of Kotlin script. Sometimes it did work, sometimes it didn't. It seems still to be a open issue according to this youtrack record: https://youtrack.jetbrains.com/issue/KT-69820
