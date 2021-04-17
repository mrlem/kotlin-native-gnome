package org.gnome.gir.model

/**
 * GIR enum definition.
 *
 * @param name the enum name.
 * @param glibTypeName
 */
data class EnumDefinition(
    val name: String,
    val glibTypeName: String
) : TopLevelDefinition
