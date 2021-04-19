package org.gnome.gir.model

import org.gnome.gir.model.types.DefinedType
import org.gnome.gir.model.meta.InfoElements

/**
 * GIR bitfield.
 *
 * Element defining a bit field (as in C).
 *
 * @property name name of the bit field.
 * @property cType TODO.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property info bitfield info.
 * @property members bitfield members.
 * @property functions bitfield functions.
 */
data class BitFieldDefinition(
    override val name: String,
    val cType: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val info: InfoElements,
    val members: List<MemberDefinition>,
    val functions: List<CallableDefinition>,
) : DefinedType
