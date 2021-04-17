package org.gnome.gir.model

/**
 * GIR include.
 *
 * Dependant namespace to include with the current namespace. For example, Gtk will need the namespace GLib.
 *
 * @property name name of the dependant namespace to include.
 * @property version version of the dependant namespace to use.
 */
data class IncludeDefinition(
    val name: String,
    val version: String?
)
