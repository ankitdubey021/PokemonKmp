plugins {
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    id("maven-publish")
    kotlin("jvm") version "2.0.0" apply false
}