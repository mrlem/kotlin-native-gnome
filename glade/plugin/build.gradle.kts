import java.net.URI

plugins {
    kotlin("jvm") version(kotlinVersion)
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    signing
    id("com.gradle.plugin-publish") version "0.14.0"
}

group = "org.mrlem.gnome"
version = "0.1.0-SNAPSHOT"

extra["isReleaseVersion"] = !version.toString().endsWith("SNAPSHOT")

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

gradlePlugin {
    plugins {
        create("gladePlugin") {
            id = "org.mrlem.gnome.glade"
            displayName = "Glade plugin for Kotlin Native"
            description = "Glade plugin generating view-binding classes for all glade files, using the Kotlin Gnome API"
            implementationClass = "org.mrlem.gnome.glade.plugin.GladePlugin"
        }
    }
}

dependencies {
    // kotlin generation
    implementation("com.squareup:kotlinpoet:1.8.0")
    implementation("com.github.vishna:watchservice-ktx:master-SNAPSHOT")

    // gradle
    // .. plugin API
    implementation(gradleApi())
    // .. kotlin plugin API
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
}

pluginBundle {
    website = "https://github.com/mrlem/kotlin-native-gnome"
    vcsUrl = "https://github.com/mrlem/kotlin-native-gnome.git"
    tags = listOf("glade", "kotlin-native", "kotlin-native-gnome", "gtk")
}
