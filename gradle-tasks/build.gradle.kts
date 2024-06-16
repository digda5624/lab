

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation("com.google.code.gson:gson:2.8.8")
}

task("hello") {
    group = "digda-task"
    description = "Hello Task"
    doFirst {
        val hello = Hello("property")
        print(hello)
    }
}
