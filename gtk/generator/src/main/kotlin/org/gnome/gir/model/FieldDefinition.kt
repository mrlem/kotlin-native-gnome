package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements
import org.gnome.gir.model.meta.AnyTypeOrCallback

/**
 * GIR record field.
 *
 * A field of struct of union structure, that is a C bit field, that is a fixed length in bits variable.
 *
 * @property name name of the field.
 * @property writable binary attribute, true if the field is writeable.
 * @property readable binary attribute, true if the field is readable.
 * @property private binary attribute, true if the field is private to the structure or has public ("0") visibility.
 * @property bits number of bits of the field.
 * @property info field info.
 * @property anyTypeOrCallback field callback or type.
 */
data class FieldDefinition(
    val name: String,
    val writable: Boolean,
    val readable: Boolean,
    val private: Boolean,
    val bits: Int?,
    val info: InfoElements,
    val anyTypeOrCallback: AnyTypeOrCallback
)
