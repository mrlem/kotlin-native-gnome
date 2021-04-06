package org.mrlem.gnome.glade.model

/**
 * Reference to a widget in the glade file.
 *
 * @property name the name used to identify the widget.
 * @property className the name of the class for this widget.
 */
data class Widget(
    val name: String,
    val className: String
)
