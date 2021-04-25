package org.gnome.gir.resolver

import org.gnome.gir.model.*
import org.gnome.gir.model.types.AnyType
import java.util.*

class Resolver(repository: RepositoryDefinition) {

    private val classesInfo = mutableMapOf<String, ClassInfo>()
    private val records = mutableSetOf<String>()
    private val callbacks = mutableSetOf<String>()
    private val interfaces = mutableSetOf<String>()
    private val enumsInfo = mutableMapOf<String, EnumInfo>()
    private val bitFieldsInfo = mutableMapOf<String, BitFieldInfo>()

    init {
        // add all classes
        repository.namespaces.forEach { namespace ->
            namespace.callbacks.forEach { callbacks.add("${namespace.name}.${it.name}") }
            namespace.records.forEach { records.add("${namespace.name}.${it.name}") }
            namespace.interfaces.forEach { interfaces.add("${namespace.name}.${it.name}") }
            namespace.enums.forEach {
                // stored under C type here
                enumsInfo[it.glibTypeName!!] = EnumInfo(it, namespace)
            }
            namespace.bitFields.forEach {
                // stored under C type here
                bitFieldsInfo[it.glibTypeName!!] = BitFieldInfo(it, namespace)
            }
            namespace.classes.forEach {
                classesInfo["${namespace.name}.${it.name}"] = ClassInfo(it, namespace, emptyList())
            }
        }

        // resolve ancestors
        classesInfo.forEach { (_, classInfo) ->
            val ancestors = Stack<String>()
            classInfo.resolveAncestors(ancestors)
            classInfo.ancestors = ancestors
        }
    }

    fun ancestors(className: String) = classesInfo[className]?.ancestors.orEmpty()

    fun classDefinition(className: String) = classesInfo[className]?.definition

    fun enumInfo(type: AnyType) = (type as? TypeDefinition)?.cType?.let { enumsInfo[it] }

    fun bitFieldInfo(type: AnyType) = (type as? TypeDefinition)?.cType?.let { bitFieldsInfo[it] }

    fun isClass(name: String) = classesInfo[name] != null

    fun isCallback(name: String) = callbacks.contains(name)

    fun isInterface(name: String) = interfaces.contains(name)

    fun isEnum(type: AnyType) = (type as? TypeDefinition)?.cType?.let { isEnum(it) } == true

    fun isBitField(type: AnyType) = (type as? TypeDefinition)?.cType?.let { isBitField(it) } == true

    fun isCPointer(type: AnyType) = (type as? TypeDefinition)?.name?.let { isCPointer(it) } == true

    ///////////////////////////////////////////////////////////////////////////
    // Private
    ///////////////////////////////////////////////////////////////////////////

    private fun isRecord(name: String) = records.contains(name)

    private fun isCPointer(name: String) = isClass(name) || isRecord(name) || isCallback(name) || isInterface(name)

    private fun isBitField(name: String) = bitFieldsInfo.contains(name)

    private fun isEnum(name: String) = enumsInfo.contains(name)

    private fun ClassInfo.resolveAncestors(ancestors: Stack<String>) {
        val parent = definition.parent
            ?.let {
                if (it.contains('.')) it else "${namespace.name}.$it" }
            ?: return
        ancestors.push(parent)

        // walk recursively
        val parentClassInfo = classesInfo[parent]
        if (parentClassInfo != null) {
            parentClassInfo.resolveAncestors(ancestors)
        } else if (parent != GOBJECT_CLASS_NAME) {
            ancestors.push(GOBJECT_CLASS_NAME)
        }
    }

    private data class ClassInfo(
        val definition: ClassDefinition,
        val namespace: NamespaceDefinition,
        var ancestors: List<String>
    )

    data class EnumInfo(
        val definition: EnumDefinition,
        val namespace: NamespaceDefinition,
    )

    data class BitFieldInfo(
        val definition: BitFieldDefinition,
        val namespace: NamespaceDefinition,
    )

    private companion object {
        private const val GOBJECT_CLASS_NAME = "GObject.Object"
    }
}
