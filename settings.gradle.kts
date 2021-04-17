import java.io.File

rootProject.name = "kotlin-glade"
include("gtk-binding", "gtk-generator", "sample")

project(":gtk-binding").projectDir = File(settingsDir, "gtk/binding")
project(":gtk-generator").projectDir = File(settingsDir, "gtk/generator")
