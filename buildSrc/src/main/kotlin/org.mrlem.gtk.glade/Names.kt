package org.mrlem.gtk.glade

import com.squareup.kotlinpoet.*
import java.io.File

///////////////////////////////////////////////////////////////////////////
// Types
///////////////////////////////////////////////////////////////////////////

val button = ClassName("org.mrlem.gtk", "Button")
val entry = ClassName("org.mrlem.gtk", "Entry")
val toolButton = ClassName("org.mrlem.gtk", "ToolButton")
val window = ClassName("org.mrlem.gtk", "Window")

///////////////////////////////////////////////////////////////////////////
// Functions
///////////////////////////////////////////////////////////////////////////

val File.uiClassName
    get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

val String.classToClassName
    get() = when (this) {
        // TODO - cover all cases
        "GtkButton" -> button
        "GtkEntry" -> entry
        "GtkToolButton" -> toolButton
        "GtkWindow" -> window
        else -> null
    }
