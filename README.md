# Kotlin Native GNOME

An API to make **GTK application** easy in **Kotlin Native**, with **Glade** UI integration.

## Features

* a **lightweight GTK object binding**: no wrapper objects, just extension functions & aliases
* a gradle **glade view binding generator**: type-safe widget access & ui source is embedded into the executable
* a sample app

## Build

Prerequisites:

```bash
sudo apt install libgtk-3-dev libtinfo5
```

To build the sample:

```bash
cd sample
../gradlew runDebugExecutableCommon
```

## Usage

See [sample](sample/src/commonMain/kotlin/org/mrlem/gtk/sample) module.

The objective is to focus on what matters to the app developer: developing  a UI, and easily integrate it into the code.

![Generator](doc/readme-generator.png)

## Current status

* glade gradle plugin: 100% complete
* [GIR](https://gi.readthedocs.io) parsing: 100% complete
* generated API coverage is progressing well. Notable short-comings:
  - some data-types are not handled yet (like GLists and arrays)
  - lambda-based signal handlers don't forward any data
  - methods throwing errors are not handled
* not yet expososed on jitpack, so not easy to integrate
* automated API generation only exports GTK elements for now
* tested on Ubuntu 20.04

## See also

Other Kotlin native GTK projects around:
* [kotlin-native-gtk](https://github.com/kropp/kotlin-native-gtk): low-level wrappers bindings, GIR based
* [kotlinx-gtk](https://github.com/Doomsdayrs/kotlinx-gtk): high-level wrappers bindings, manually created
* [gir2java](https://github.com/gstreamer-java/gir2java): GIR file java descriptors generator

For an explanation about why I didn't rely on one of them, see the [FAQ](FAQ.md).
