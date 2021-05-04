package org.gnome.gir.model.meta

import org.gnome.gir.model.*

/**
 * Documentation of elements.
 *
 * @property version TODO.
 * @property stability TODO.
 * @property doc TODO.
 * @property deprecated TODO.
 * @property sourcePosition TODO.
 */
data class DocElements(
    val version: DocTextDefinition?,
    val stability: DocTextDefinition?,
    val doc: DocDefinition?,
    val deprecated: DocTextDefinition?,
    val sourcePosition: SourcePositionDefinition?
) {

    companion object {
        fun create() = DocElements(
            version = null,
            stability = null,
            doc = null,
            deprecated = null,
            sourcePosition = null
        )
    }

}
