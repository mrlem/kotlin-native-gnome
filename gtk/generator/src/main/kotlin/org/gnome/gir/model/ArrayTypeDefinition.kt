package org.gnome.gir.model

import org.gnome.gir.model.meta.AnyType

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
    val type: TypeDefinition
) : AnyType
