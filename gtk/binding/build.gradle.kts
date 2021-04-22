plugins {
    kotlin("multiplatform")
    `maven-publish`
}

group = "org.mrlem.gnome"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        val main by compilations.getting
        val interop by main.cinterops.creating
        binaries { sharedLib() }
    }

    val nativeMain by sourceSets.getting {
        languageSettings.useExperimentalAnnotation("kotlin.ExperimentalStdlibApi")
        languageSettings.useExperimentalAnnotation("kotlin.ExperimentalUnsignedTypes")
    }
}
