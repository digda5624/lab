buildscript {
    val versions: Map<String, MutableMap<String, Any>> by extra
    apply(from = "${rootDir}/gradle-submodule/core/properties.gradle.kts")
//    apply(from = "${rootDir}/gradle-submodule/core/buildscript.gradle")

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
apply(from = "${rootDir}/gradle-submodule/core/dependencies.gradle.kts")
//apply(plugin = "org.springframework.boot")

subprojects {
    val versions: Map<String, MutableMap<String, Any>> by extra
    apply(plugin = "kotlin")
    apply(from = "${rootDir}/gradle-submodule/core/dependencies.gradle.kts")

    repositories {
        mavenCentral()
    }

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
