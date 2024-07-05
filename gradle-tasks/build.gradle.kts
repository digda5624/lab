//import digda.task.DigdaTask
//
//allprojects {
//    apply { from("${rootDir}/gradle-submodule/core/default.gradle.kts") }
//}
//
//dependencies {
//    implementation("com.squareup.okhttp3:okhttp:4.9.3")
//    implementation("com.google.code.gson:gson:2.8.8")
//}
//
//tasks.register("hello") {
//    group = "digda-task"
//    description = "Hello Task"
//    doFirst {
//        val hello = Hello("property")
//        print(hello)
//    }
//}
//
//tasks.register("printPluginVersions") {
//    doLast {
//        println("Applied plugins and their versions:")
//        project.plugins.forEach { plugin ->
//            println("${plugin.javaClass.simpleName} -> ${plugin::class.java.`package`.implementationVersion}")
//        }
//    }
//}
//
//tasks.register<DigdaTask>("other task") {
//    doLast {
//        println("이것도 되냐?")
//    }
//}
