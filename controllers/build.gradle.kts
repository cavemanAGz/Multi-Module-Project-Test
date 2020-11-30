// Need to have Kotlin directive with NO version in sub project
plugins {
	kotlin("jvm")
	kotlin("plugin.spring")
}

// Group Name And JAR version
group = "com.caveman.controllers"
version = "1.0.0-SNAPSHOT"

// Module Dependancies
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

// Module Test Framework???
tasks.withType<Test> {
	useJUnitPlatform()
}

