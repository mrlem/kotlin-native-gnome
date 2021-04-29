# Glade view binding generator

This generator creates a Kotlin class for each Glade file. The generated class:
- embeds the XML so you don't have to worry about shipping it with your executable
- loads the widget tree using GtkBuilder
- exposes type-safe accessors to the named widgets
