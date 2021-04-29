import java.io.File

pluginManagement {
    @Suppress("UnstableApiUsage")
    plugins {
        val kotlinVersion: String by settings

        kotlin("multiplatform") version kotlinVersion
        kotlin("jvm") version kotlinVersion
    }
}

rootProject.name = "kotlin-native-gnome"
include("gtk-binding", "bindings-generator", "glade-plugin", "sample")

project(":gtk-binding").projectDir = File(settingsDir, "bindings/gtk")
project(":glade-plugin").projectDir = File(settingsDir, "plugins/glade")

