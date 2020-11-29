plugins {
    id 'java'
    id 'org.jetbrains.kotlin.jvm' version '1.4.10'
}

group 'org.caveman'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib"
    testCompile group: 'junit', name: 'junit', version: '4.12'
}
