package org.mrlem.gtk.glade.xml

/**
 * Reference to a widget in the glade file.
 *
 * @property name the name used to identify the widget.
 * @property className the name of the class for this widget.
 */
data class WidgetReference(
    val name: String,
    val className: String
)
