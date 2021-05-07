# Kotlin Native GNOME
[![maven-central](https://img.shields.io/maven-central/v/org.mrlem.gnome/gtk-binding)](https://search.maven.org/artifact/org.mrlem.gnome/gtk-binding/0.2.0/jar)

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
    implementation("org.mrlem.gnome:gtk-binding:0.2.0")
}
```

Next steps:
* to get started: take a look at the [sample project](sample).
* to learn more: see [internals](doc/INTERNALS.md).

## Current status

Still a *work in progress*:
* [Glade](https://glade.gnome.org/) gradle plugin: 100% complete
* API coverage is still incomplete:
  - signal handler support is partial: no callback data
  - data types is partial for some of them: bitfields, etc
  - some missing generations: Cairo
* platform support: Linux only for now

## See also

Other Kotlin native GTK projects around:
* [kotlin-native-gtk](https://github.com/kropp/kotlin-native-gtk): low-level wrappers bindings, GIR based
* [kotlinx-gtk](https://github.com/Doomsdayrs/kotlinx-gtk): high-level wrappers bindings, manually created
* [gir2java](https://github.com/gstreamer-java/gir2java): GIR file java descriptors generator

For an explanation about why I didn't rely on one of them, see the [FAQ](FAQ.md).
