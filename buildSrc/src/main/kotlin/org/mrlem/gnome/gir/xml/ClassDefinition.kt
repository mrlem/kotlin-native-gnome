package org.mrlem.gnome.gir.xml

/**
 * GIR class definition.
 *
 * @param name the class name.
 * @param cType the corresponding C API type.
 * @param cPrefix the prefix for C function calls.
 * @param parent the direct parent class name.
 * @param ancestors the list of ancestors, starting from the root type.
 * @param members the list of members for this class.
 */
data class ClassDefinition(
    val name: String,
    val cType: String,
    val cPrefix: String,
    val parent: String,
    val ancestors: MutableList<String> = mutableListOf(),
    val members: MutableList<MemberDefinition> = mutableListOf()
)
