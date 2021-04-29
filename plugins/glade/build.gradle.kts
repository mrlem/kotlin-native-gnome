import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("jvm")
    `java-gradle-plugin`
    `maven-publish`
    signing
    id("com.gradle.plugin-publish") version "0.14.0"
}

group = "org.mrlem.gnome"
version = "0.1.8"
    .also { extra["isReleaseVersion"] = !it.endsWith("SNAPSHOT") }

tasks.withType<KotlinCompile<*>> {
    kotlinOptions {
        // required due to plugin execution environment
        languageVersion = "1.3"
    }
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    // file monitoring
    implementation("com.github.vishna:watchservice-ktx:master-SNAPSHOT")

    // kotlin generation
    implementation("com.squareup:kotlinpoet:1.8.0")

    // gradle
    // .. plugin API
    implementation(gradleApi())
    // .. kotlin plugin API
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
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

pluginBundle {
    website = "https://github.com/mrlem/kotlin-native-gnome"
    vcsUrl = "https://github.com/mrlem/kotlin-native-gnome.git"
    tags = listOf("glade", "kotlin-native", "kotlin-native-gnome", "gtk")
}
