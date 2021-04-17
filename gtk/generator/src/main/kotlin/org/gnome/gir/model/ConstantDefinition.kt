package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements
import org.gnome.gir.model.meta.TypeReference

/**
 * GIR constant.
 *
 * A constant entity, similar to const variable in C.
 *
 * @property name name of the constant.
 * @property value value of the constant.
 * @property cType corresponding C type of the constant in C.
 * @property cIdentifier corresponding C identifier in the source code.
 * @property info constant info.
 * @property type constant type.
 */
data class ConstantDefinition(
    val name: String,
    val value: String,
    val cType: String?,
    val cIdentifier: String?,
    val info: InfoElements,
    var type: TypeReference?
)
