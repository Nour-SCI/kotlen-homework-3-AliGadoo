rootProject.name = "gradle-broken-build-hw"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

include("module1")
include("module2")