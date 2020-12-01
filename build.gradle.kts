import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
}

// This controls dependency versioning for the entire project including sub projects
plugins {
    id("org.springframework.boot") version "2.4.0" apply false
    id("io.spring.dependency-management") version "1.0.10.RELEASE" apply false
    kotlin("jvm") version "1.4.10" apply false
    kotlin("plugin.spring") version "1.4.20" apply false
}

allprojects {
    group = "com.caveman"
    version = "1.0.0"

    // Do the below for Java compile
    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    // Do the below for Kotlin compile
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
}

subprojects {

    // sub project repos...
    repositories {
        mavenCentral()
    }

    // Apply these to sub all projects
    apply {
        // No version here because of the Plugin version being set above
        plugin("io.spring.dependency-management")
        plugin("org.springframework.boot")

        // Shared dependencies?
    }
}
