dependencies {
    // submodule implementation
    api(project(":template-app"))

    // spring implementation
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.digda.sample:library:0.0.1-SNAPSHOT")
}

tasks.named("bootJar") {

}