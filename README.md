# kotlin-changelog
generates changelog for specific kotlin release from youtrack data

this project contains three solutions:
1) Kotlin Application Project
2) Kotlin script based on kotlinx de/serialization
3) Kotlin script based on gson de/serialization

As it was my first Kotlin project I've done some exercises with Kotlin.
You can also generate changelog fo specific kotlin release using all those three options.
All three solutions accepting as a parameter the kotlin release version for which you want to generate change log: e.g. 2.2.0 or 2.3.0-Beta1

# How to install and use:

## Kotlin Application Project
1) checkout the project
2) open it as kotlin project e.g. in IntelliJ IDE
3) set Run Configuration -> Program arguments -> Kotlin version as parameter e.g. 2.2.0 or 2.3.0-Beta1
4) build and run

alternatively you can build kotlin-changelog project first and then run .jar application with java
e.g. java -jar kotlin-changelog.jar 2.2.0

## Kotlin script based on kotlinx de/serialization
you can generate the changelog just running kotlin script based on kotlinx de/serialization. In this case you need kotlinc installed on your machine.
{path_to_the_kotlinc_on_your_machine}/kotlinc -script get-kotlin-changelog-with-kotlin-serialization.main.kts 2.2.0

!!!this solution isn't always working if you will try to execute it from IntelliJ or TeamCity because they are using java to run kotlin compiler. In this case kotlinx serialization plugin sometimes won't be activated
see open bug: https://youtrack.jetbrains.com/issue/KT-69820

## Kotlin script based on gson de/serialization
this solution working out-of-the-box from command line, IDE or teamcity build job
e.g. kotlinc -script get-kotlin-changelog.main.kts 2.2.0
