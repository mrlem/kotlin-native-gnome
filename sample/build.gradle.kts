plugins {
    kotlin("multiplatform")
    id("org.mrlem.gnome.glade")
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
            implementation(project(":gtk-binding"))
        }
    }

    // for UI-independent code
    val commonMain by sourceSets.getting {
        dependencies {
            implementation(kotlin("stdlib-common"))
        }
    }
}
