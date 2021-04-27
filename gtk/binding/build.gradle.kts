import java.net.URI

plugins {
    kotlin("multiplatform")
    `maven-publish`
    signing
}

group = "org.mrlem.gnome"
version = "0.1.3-SNAPSHOT"

extra["isReleaseVersion"] = !version.toString().endsWith("SNAPSHOT")

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

publishing { configure(project.name) }
signing { configure(publishing) }

tasks.withType<Sign>().configureEach {
    onlyIf { project.extra["isReleaseVersion"] as Boolean }
}
