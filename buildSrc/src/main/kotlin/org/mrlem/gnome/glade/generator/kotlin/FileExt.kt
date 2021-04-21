package org.mrlem.gnome.glade.generator.kotlin

import java.io.File
import org.mrlem.gnome.glade.ViewBindingGeneratorPlugin.Companion.GLADE_EXTENSION

val File.uiClassName
    get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

val File.isGladeFile
    get() = name.endsWith(GLADE_EXTENSION)