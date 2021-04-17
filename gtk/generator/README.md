# GTK API binding generator

Generates a Kotlin API on top of the C-interop layer to make it easy to manipulate your GTK objects.

Based on the GObject introspection (GIR) files.

GIR XML files can be found in the GIR repository. The GIR file can be generated as follows:
```bash
sudo apt install gobject-introspection
g-ir-generate /usr/lib/x86_64-linux-gnu/girepository-1.0/GLib-2.0.typelib --output=glib.gir
```
