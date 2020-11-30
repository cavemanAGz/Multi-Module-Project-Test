// Need to have Kotlin directive with NO version in sub project
plugins {
	kotlin("jvm")
	kotlin("plugin.spring")
}

group = "com.caveman.services"
version = "1.0.0-SNAPSHOT"

// TODO: add data service as dependacy
// https://docs.gradle.org/current/userguide/declaring_dependencies_between_subprojects.html

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("org.junit.jupiter:junit-jupiter:5.4.2")
}

// Module Test Framework???
tasks.withType<Test> {
	useJUnitPlatform()
}

// Below is managed in parent file
//
//tasks.withType<KotlinCompile> {
//	kotlinOptions {
//		freeCompilerArgs = listOf("-Xjsr305=strict")
//		jvmTarget = "1.8"
//	}
//}
