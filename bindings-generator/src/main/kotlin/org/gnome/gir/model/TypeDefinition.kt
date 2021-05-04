package org.gnome.gir.model

import org.gnome.gir.model.types.AnyType
import org.gnome.gir.model.meta.DocElements

/**
 * GIR type.
 *
 * TODO
 */
data class TypeDefinition(
    val name: String,
    val cType: String?,
    val introspectable: Boolean,
    val doc: DocElements,
    val types: List<AnyType>
) : AnyType {

    companion object {
        fun create(name: String) = TypeDefinition(
            name = name,
            cType = null,
            introspectable = false,
            doc = DocElements.create(),
            types = emptyList()
        )
    }

}
