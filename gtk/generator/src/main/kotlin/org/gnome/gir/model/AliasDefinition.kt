package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements

/**
 * GIR alias.
 *
 * Type's name substitution, representing a typedef in C.
 *
 * @property name new name or typedef'd name.
 * @property cType corresponding C type's name.
 * @property info alias info.
 * @property type alias type.
 */
data class AliasDefinition(
    val name: String,
    val cType: String,
    val info: InfoElements,
    val type: TypeDefinition?
)
