package org.mrlem.gir.xml

/**
 * GIR class definition.
 *
 * @param name the class name.
 * @param cType the corresponding C API type.
 * @param parent the direct parent class name.
 * @param ancestors the list of ancestors, starting from the root type.
 */
data class ClassDefinition(
    val name: String,
    val cType: String,
    val parent: String,
    val ancestors: MutableList<String> = mutableListOf()
)
