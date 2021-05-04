package org.gnome.gir.model

import org.gnome.gir.model.types.AnyType

/**
 * GIR array type.
 *
 * TODO
 */
data class ArrayTypeDefinition(
    val name: String?,
    val zeroTerminated: Boolean,
    val fixedSize: Int?,
    val introspectable: Boolean,
    val length: Int?,
    val cType: String?,
    var type: TypeDefinition
) : AnyType {

    companion object {
        fun create(type: TypeDefinition) = ArrayTypeDefinition(
            name = null,
            zeroTerminated = true,
            fixedSize = null,
            introspectable = false,
            length = null,
            cType = null,
            type = type
        )
    }

}
