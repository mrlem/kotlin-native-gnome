package org.gnome.gir.model

import org.gnome.gir.model.meta.CustomType
import org.gnome.gir.model.meta.InfoElements

/**
 * GIR enumeration.
 *
 * Element defining a enumeration type similar to enum in C/C++.
 *
 * @property name name of the enumeration.
 * @property cType TODO.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property glibErrorDomain error domain of this enumeration in a stringified form.
 * @property info enumeration info.
 * @property members enumeration members.
 * @property function enumeration functions.
 */
data class EnumDefinition(
    override val name: String,
    val cType: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val glibErrorDomain: String?,
    val info: InfoElements,
    val members: List<MemberDefinition>,
    val functions: List<CallableDefinition>
) : CustomType
