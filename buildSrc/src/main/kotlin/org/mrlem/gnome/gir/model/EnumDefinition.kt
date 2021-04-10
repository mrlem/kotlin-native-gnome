package org.mrlem.gnome.gir.model

/**
 * GIR enum definition.
 *
 * @param name the class name.
 * @param glibTypeName
 */
data class EnumDefinition(
    val name: String,
    val glibTypeName: String
) : TopLevelDefinition
