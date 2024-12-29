apply(plugin = "kotlin-jpa")

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.springframework:spring-context")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    runtimeOnly("com.mysql:mysql-connector-j")
//
//    testImplementation(platform("org.junit:junit-bom:5.10.0"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}