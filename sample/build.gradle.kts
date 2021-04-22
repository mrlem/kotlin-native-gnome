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

    val nativeMain by sourceSets.getting {
        dependencies {
            implementation(project(":gtk-binding"))
        }
    }
}
