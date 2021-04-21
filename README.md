# Sample Glade GTK application

This sample demonstrates how to create a **GTK application** based on a **Glade** UI, using **Kotlin Native**.

![Screenshot](doc/readme-screenshot.png)

## Features

* a **lightweight GTK object binding**: no wrapper objects, just extension functions & aliases
* a gradle **glade view binding generator** (coming from android development, it feels like home)
* a sample app

They say a picture is worth a thousand words:

![Generator](doc/readme-generator.png)

## Status

* glade gradle plugin: 100% complete
* [GIR](https://gi.readthedocs.io) parsing: 100% complete
* generated API coverage is progressing well. Notable short-comings:
  - no lambda-based signal handlers (it's the next step)
  - no constructors
  - some data-types are not handled yet (like GLists and arrays)
* tested on Ubuntu 20.04

## Build

Prerequisites:

```bash
sudo apt install libgtk-3-dev libtinfo5
```

Then:

```bash
cd sample
../gradlew runDebugExecutableCommon
```

## Usage

See [sample](sample/src/commonMain/kotlin/org/mrlem/gtk/sample) module.

## See also

Other Kotlin native GTK projects around:
* [kotlin-native-gtk](https://github.com/kropp/kotlin-native-gtk): low-level wrappers bindings, GIR based
* [kotlinx-gtk](https://github.com/Doomsdayrs/kotlinx-gtk): high-level wrappers bindings, manually created
* [gir2java](https://github.com/gstreamer-java/gir2java): GIR file java descriptors generator

For an explanation about why I didn't rely on one of them, see the [FAQ](FAQ.md).
