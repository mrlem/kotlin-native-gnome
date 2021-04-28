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
            implementation("org.mrlem.gnome:gtk-binding:0.1.3")
        }
    }

    // for UI-independent code
    val commonMain by sourceSets.getting {
        dependencies {
            implementation(kotlin("stdlib-common"))
        }
    }
}
