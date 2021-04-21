package org.mrlem.gnome.glade.generator.kotlin

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)
