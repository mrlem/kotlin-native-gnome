buildscript {
    repositories {
        maven("https://jitpack.io")
    }
}

plugins {
    kotlin("multiplatform")
    id("org.mrlem.gnome.glade") version("0.1.8")
}

repositories {
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
}

kotlin {
    linuxX64("native") {
        binaries {
            executable { entryPoint = "org.mrlem.gtk.sample.main" }
        }
    }

    // for UI-tied code
    val nativeMain by sourceSets.getting {
        dependencies {
            implementation("org.mrlem.gnome:gtk-binding:0.1.4-SNAPSHOT")
        }
    }

    // for UI-independent code
    val commonMain by sourceSets.getting {
        dependencies {
            implementation(kotlin("stdlib-common"))
        }
    }
}
