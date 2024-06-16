apply(plugin = "java")
apply(plugin = "kotlin")

buildscript {

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    }
}

repositories {
    mavenCentral()
}

dependencies
