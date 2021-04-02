# Sample Glade GTK application

This sample demonstrates how to create a GTK application based on a Glade UI, using Kotlin Native.

It includes a minimalistic GTK binding that is:
* light: no wrapper objects, just extensions
* incomplete: I just exposed what I needed, but I do hope you'll get the idea :)

![Screenshot](doc/readme-screenshot.png)

## Pre-requisites

```
sudo apt install libgtk-3-dev libtinfo5
```

## Build

```
cd sample
../gradlew runDebugExecutableGtk
```

## See also

For something closer to a real GTK binding, see either:
* [kotlin-native-gtk](https://github.com/kropp/kotlin-native-gtk): which features an API generator based on GIR
* [kotlinx-gtk](https://github.com/Doomsdayrs/kotlinx-gtk)
