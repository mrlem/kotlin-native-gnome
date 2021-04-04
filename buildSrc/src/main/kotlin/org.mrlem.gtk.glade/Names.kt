package org.mrlem.gtk.glade

import com.squareup.kotlinpoet.*
import java.io.File

///////////////////////////////////////////////////////////////////////////
// Types
///////////////////////////////////////////////////////////////////////////

private val types = mapOf<String, ClassName>(
    "GtkWidget" to ClassName("org.mrlem.gtk", "Button"),
    "GtkEntry" to ClassName("org.mrlem.gtk", "Entry"),
    "GtkToolButton" to ClassName("org.mrlem.gtk", "ToolButton"),
    "GtkWindow" to ClassName("org.mrlem.gtk", "Window"),
    "GtkToolbar" to ClassName("org.mrlem.gtk", "Toolbar")
)

///////////////////////////////////////////////////////////////////////////
// Functions
///////////////////////////////////////////////////////////////////////////

val File.uiClassName
    get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

val String.classToClassName
    get() = types[this]
