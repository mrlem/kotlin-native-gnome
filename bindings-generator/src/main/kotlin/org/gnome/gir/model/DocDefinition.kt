package org.gnome.gir.model

import org.gnome.gir.model.enums.Space

/**
 * GIR doc.
 *
 * Documentation of an element.
 *
 * @property space preserve the original formatting of the documentation from the source code.
 * @property whitespace preserve the original formatting of the documentation from the source code. Recommended to use
 *  this instead of xml:space.
 * @property filename the file containing this documentation.
 * @property line the first line of the documentation in the source code
 * @property column the first column of the documentation in the source code
 * @property text the text of the version of the documentation.
 */
data class DocDefinition(
    val space: Space?,
    val whitespace: Space?,
    val filename: String,
    val line: String,
    val column: String?,
    val text: String
)
