import java.io.File

pluginManagement {
    @Suppress("UnstableApiUsage")
    plugins {
        val kotlinVersion: String by settings

        kotlin("multiplatform") version kotlinVersion
        kotlin("jvm") version kotlinVersion
    }
}

rootProject.name = "kotlin-glade"
include("gtk-binding", "gtk-generator", "glade-plugin", "sample")

project(":gtk-binding").projectDir = File(settingsDir, "gtk/binding")
project(":gtk-generator").projectDir = File(settingsDir, "gtk/generator")
project(":glade-plugin").projectDir = File(settingsDir, "glade/plugin")
