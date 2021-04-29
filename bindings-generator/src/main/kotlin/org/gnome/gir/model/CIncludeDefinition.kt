package org.gnome.gir.model

/**
 * GIR C include.
 *
 * Dependant C header file which should be included in C programs.
 *
 * @property name file name of the C header file, the path can be relative.
 */
data class CIncludeDefinition(
    val name: String
)
