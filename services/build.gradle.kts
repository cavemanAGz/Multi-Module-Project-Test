// Need to have Kotlin directive with NO version in sub project
plugins {
	kotlin("jvm")
	kotlin("plugin.spring")
}

group = "com.caveman.services"
version = "1.0.0-SNAPSHOT"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
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
