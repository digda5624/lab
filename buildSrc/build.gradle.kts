apply(plugin = "kotlin")

buildscript {
    extra["versions"] = mapOf(
        "langs" to mapOf(
            "kotlin" to "1.8.0",
            "java" to "17"
        )
    )

    val versions: Map<String, MutableMap<String, Any>> by extra

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions["langs"]!!["kotlin"]}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${versions["langs"]!!["kotlin"]}")
        classpath("org.jetbrains.kotlin:kotlin-noarg:${versions["langs"]!!["kotlin"]}")
    }

    repositories {
        mavenCentral()
    }

}

repositories {
    mavenCentral()
}

