package org.mrlem.gtk.glade

import com.squareup.kotlinpoet.*
import java.io.File

private val types = mutableMapOf<String, ClassName>()

const val GTK_PACKAGE = "org.gnome.gtk"

///////////////////////////////////////////////////////////////////////////
// Functions
///////////////////////////////////////////////////////////////////////////

val File.uiClassName
    get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

val String.classToClassName: ClassName
    get() = types[this]
        ?: ClassName(GTK_PACKAGE, this.removePrefix("Gtk"))
            .also { types[this] = it }
