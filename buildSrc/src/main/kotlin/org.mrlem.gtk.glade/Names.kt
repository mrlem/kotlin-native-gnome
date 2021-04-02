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
// Conversion names
///////////////////////////////////////////////////////////////////////////

val asButton = MemberName("org.mrlem.gtk", "asButton")
val asEntry = MemberName("org.mrlem.gtk", "asEntry")
val asToolButton = MemberName("org.mrlem.gtk", "asToolButton")
val asWindow = MemberName("org.mrlem.gtk", "asWindow")

///////////////////////////////////////////////////////////////////////////
// Functions
///////////////////////////////////////////////////////////////////////////

val File.uiClassName
    get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

val ClassName.cast
    get() = when (simpleName) {
        // TODO - cover all cases
        "Button" -> asButton
        "Entry" -> asEntry
        "ToolButton" -> asToolButton
        "Window" -> asWindow
        else -> null
    }

val String.classToClassName
    get() = when (this) {
        // TODO - cover all cases
        "GtkButton" -> button
        "GtkEntry" -> entry
        "GtkToolButton" -> toolButton
        "GtkWindow" -> window
        else -> null
    }
