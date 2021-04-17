package org.gnome.gir.oldmodel

/**
 * GIR record definition.
 *
 * @param name the record name.
 * @param glibTypeName
 */
data class RecordDefinition(
    val name: String,
    val glibTypeName: String
) : TopLevelDefinition
