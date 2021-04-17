package org.gnome.gir.model

/**
 * GIR source position.
 *
 * Documentation of an element.
 *
 * @property filename the file containing this documentation.
 * @property line the first line of the documentation in the source code
 * @property column the first column of the documentation in the source code
 */
data class SourcePositionDefinition(
    val filename: String,
    val line: String,
    val column: String?
)
