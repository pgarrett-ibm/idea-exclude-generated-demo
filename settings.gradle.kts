pluginManagement {
    plugins {
        kotlin("jvm") version "1.9.20" apply false
    }
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "scope-demo"