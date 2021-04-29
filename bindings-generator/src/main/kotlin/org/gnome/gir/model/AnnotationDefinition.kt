package org.gnome.gir.model

/**
 * GIR annotation.
 *
 * Element defining an annotation from the source code, usually a user-defined annotation associated to a parameter or a
 * return value
 *
 * @property name name of the attribute.
 * @property value value of the attribute.
 */
data class AnnotationDefinition(
    val name: String,
    val value: String
)
