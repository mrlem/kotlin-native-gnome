package org.mrlem.gnome.glade.plugin.generator.kotlin

import org.mrlem.gnome.glade.plugin.GladePlugin.Companion.GLADE_EXTENSION
import java.io.File

val File.uiClassName
    get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

val File.isGladeFile
    get() = name.endsWith(GLADE_EXTENSION)