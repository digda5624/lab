apply(from = "${rootDir}/gradle-submodule/core/default.gradle.kts")
apply(from = "${rootDir}/gradle-submodule/core/properties.gradle.kts")


buildscript {
    apply(from = "${rootDir}/gradle-submodule/core/properties.gradle.kts")

    val versions: Map<String, MutableMap<String, Any>> by extra

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions["langs"]!!["kotlin"]}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${versions["langs"]!!["kotlin"]}")
        classpath("org.jetbrains.kotlin:kotlin-noarg:${versions["langs"]!!["kotlin"]}")
    }
}

subprojects {
    apply(from = "${rootDir}/gradle-submodule/core/default.gradle.kts")
    apply(from = "${rootDir}/gradle-submodule/core/properties.gradle.kts")

    dependencies {
        val testImplementation by configurations
        testImplementation("org.junit.jupiter:junit-jupiter:5.5.0")
    }
}

tasks.register("printPluginVersions") {
    doLast {
        println("Applied plugins and their versions:")
        project.plugins.forEach { plugin ->
            println("${plugin.javaClass.simpleName} -> ${plugin::class.java.`package`.implementationVersion}")
        }
    }
}
