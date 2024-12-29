buildscript{
    apply(from = "${rootDir}/gradle-submodule/core/buildscript.gradle")
}

tasks.register("printPluginVersions") {
    doLast {
        println("Applied plugins and their versions:")
        project.plugins.forEach { plugin ->
            println("${plugin.javaClass.simpleName} -> ${plugin::class.java.`package`.implementationVersion}")
        }
    }
}

subprojects {
    apply(plugin = "kotlin-jpa")
    apply(from = "${rootDir}/gradle-submodule/core/dependencies.gradle")
    apply(from = "${rootDir}/gradle-submodule/core/kotlin-base.gradle")
    apply(from = "${rootDir}/gradle-submodule/core/spring.gradle")
}