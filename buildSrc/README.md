# Code generation

This directory contains 2 code generators:
* an API binding generator, relying on GIR (GObject introspection) files
* a Glade UI view binding generator

## API binding generator

This generator generates Kotlin classes for the API described in a GIR XML file.

GIR XML files can be found in the GIR repository. The GIR file can be generated as follows:
```bash
sudo apt install gobject-introspection
g-ir-generate /usr/lib/x86_64-linux-gnu/girepository-1.0/GLib-2.0.typelib --output=glib.gir
```

## Glade view binding generator

This generator creates a Kotlin class for each Glade file. The generated class:
- embeds the XML so you don't have to worry about shipping it with your executable
- loads the widget tree using GtkBuilder
- exposes type-safe accessors to the named widgets
