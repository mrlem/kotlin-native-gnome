# Sample Glade GTK application

This sample demonstrates how to create a GTK application based on a Glade UI, using Kotlin Native.

It includes a minimalistic GTK binding that is:
* light: no wrapper objects, just extensions
* incomplete: I just exposed what I needed, but I do hope you'll get the idea :)

## Pre-requisites

```
sudo apt install libtinfo5
```

## Build

```
./gradlew runDebugExecutableGtk
```
