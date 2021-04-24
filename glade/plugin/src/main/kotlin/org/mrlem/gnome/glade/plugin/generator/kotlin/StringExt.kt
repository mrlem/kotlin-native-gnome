package org.mrlem.gnome.glade.plugin.generator.kotlin

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)
