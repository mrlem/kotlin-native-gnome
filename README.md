# Kotlin Native GNOME
![maven-central](https://img.shields.io/maven-central/v/org.mrlem.gnome/gtk-binding)

A set of tools to make **GNOME application** creation easy in **Kotlin Native**, with **Glade** UI integration.

![Screenshot](doc/readme-screenshot.png)

## Features

* a **lightweight GTK object binding**: no wrapper objects, just extension functions & aliases
* a **Glade UI gradle plugin**: produces UI classes for type-safe widget access & glade file integration in the executable
* a sample app

## Usage

Prerequisites:

```bash
sudo apt install libgtk-3-dev libtinfo5
```

Then in your build.gradle.kts:

```kotlin
repositories {
    mavenCentral()
}
```

And:

```kotlin
dependencies {
    implementation("org.mrlem.gnome:gtk-binding:0.1.2")
}
```

Then you can get started: take a look at the [sample project](sample)!

The objective is to focus on what matters to the app developer: developing  a UI, and easily integrate it into the code.

![Generator](doc/readme-generator.png)

## Current status

Still a *work in progress*. Here is the detail:
* [Glade](https://glade.gnome.org/) gradle plugin: 100% complete
* [GIR](https://gi.readthedocs.io) parsing: 100% complete
* generated API coverage is progressing well. Notable short-comings:
  - some data-types are not handled yet (like GLists and arrays)
  - lambda-based signal handlers don't forward any data
  - methods throwing errors are not handled
  - only generates GTK elements for now (but the parser has been tested with other GIR files)
* platform support: Linux only for now

## See also

Other Kotlin native GTK projects around:
* [kotlin-native-gtk](https://github.com/kropp/kotlin-native-gtk): low-level wrappers bindings, GIR based
* [kotlinx-gtk](https://github.com/Doomsdayrs/kotlinx-gtk): high-level wrappers bindings, manually created
* [gir2java](https://github.com/gstreamer-java/gir2java): GIR file java descriptors generator

For an explanation about why I didn't rely on one of them, see the [FAQ](FAQ.md).
