# Glade view binding generator

This generator creates a Kotlin class for each Glade file. The generated class:
- embeds the XML so you don't have to worry about shipping it with your executable
- loads the widget tree using GtkBuilder
- exposes type-safe accessors to the named widgets

For now, it doesn't execute automatically upon glade file change, though it is [planned](https://github.com/mrlem/sample-kotlin-glade/issues/10).
