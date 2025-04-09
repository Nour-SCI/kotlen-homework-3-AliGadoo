group = rootProject.group
version = rootProject.version

plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":module2"))
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
}

tasks.test {
    useJUnitPlatform()
}