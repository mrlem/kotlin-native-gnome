package org.gnome.gir.model

import org.gnome.gir.model.enums.Space

/**
 * GIR documentation text.
 *
 * Generic documentation text.
 *
 * @property space preserve the original formatting of the documentation from the source code.
 * @property whitespace preserve the original formatting of the documentation from the source code. Recommended to use
 *  this instead of xml:space.
 * @property text the text of the documentation.
 */
data class DocTextDefinition(
    val space: Space?,
    val whitespace: Space?,
    val text: String
)
