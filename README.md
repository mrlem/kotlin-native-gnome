# Sample Glade GTK application

This sample demonstrates how to create a GTK application based on a Glade UI, using Kotlin Native.

![Screenshot](doc/readme-screenshot.png)

## Features

* a lightweight GTK binding: no wrapper objects (it looks more crude, but does the job)
* a gradle glade binding generator (coming from android development, it feels like home)
* a sample app

They say a picture is worth a thousand words:

![Generator](doc/readme-generator.png)

## Status

* API coverage is still very far from complete, this was mostly a proof-of-concept at first
* working on GIR-based binding generation (though I'm quite sure this won't be a piece of cake :)

## Build

Prerequisites:

```
sudo apt install libgtk-3-dev libtinfo5
```

Then:

```
cd sample
../gradlew runDebugExecutableGtk
```

## See also

Other GTK binding, both using a wrapper objects approach (more memory, but true inheritance), see either:
* [kotlin-native-gtk](https://github.com/kropp/kotlin-native-gtk): which features an API generator based on GIR
* [kotlinx-gtk](https://github.com/Doomsdayrs/kotlinx-gtk)
