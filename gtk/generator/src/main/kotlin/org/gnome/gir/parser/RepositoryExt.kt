package org.gnome.gir.parser

import org.gnome.gir.model.*
import org.gnome.gir.model.enums.KnownType
import org.gnome.gir.model.meta.CallableElements
import org.gnome.gir.model.meta.CustomType
import org.gnome.gir.model.meta.TypeReference
import kotlin.reflect.KMutableProperty

///////////////////////////////////////////////////////////////////////////
// Repository resolution utils
///////////////////////////////////////////////////////////////////////////

internal fun RepositoryDefinition.resolveIncludes() {
    val namespacesNames = namespaces.map { it.name }
    includes.removeAll { namespacesNames.contains(it.name) }
}

internal fun RepositoryDefinition.resolveTypeReferences() {
    namespaces.forEach { namespace ->
        // TODO - add missing resolutions
        namespace.apply {
            classes.forEach { `class` ->
                resolveTypeReference(namespace, `class`::parent)
                `class`.methods.forEach { resolveCallableTypeReferences(namespace, it.callable) }
            }
            interfaces.forEach { `interface` ->
                `interface`.methods.forEach { resolveCallableTypeReferences(namespace, it.callable) }
            }
            records.forEach { record ->
                record.methods.forEach { resolveCallableTypeReferences(namespace, it.callable) }
            }
            constants.forEach { resolveTypeReference(namespace, it::type) }
        }
    }
}

///////////////////////////////////////////////////////////////////////////
// Private
///////////////////////////////////////////////////////////////////////////

private fun RepositoryDefinition.resolveCallableTypeReferences(namespace: NamespaceDefinition, callable: CallableElements) {
    callable.apply {
        resolveTypeReference(namespace, returnValue?.let { it::type })
        resolveTypeReference(namespace, instanceParameter?.let { it::type })

        parameters.forEach { parameter ->
            resolveTypeReference(namespace, parameter::type)
        }
    }
}

private fun RepositoryDefinition.resolveTypeReference(namespace: NamespaceDefinition, property: KMutableProperty<TypeReference?>?) {
    property ?: return

    val ref = property.getter.call()
    if (ref is TypeReference.Unresolved) {
        property.setter.call(resolveType(namespace, ref.name) ?: ref)
    }
}

private fun RepositoryDefinition.resolveType(namespace: NamespaceDefinition, name: String): TypeReference? {
    val baseName = name.removeSuffix("[]")
    val isArray = baseName.length != name.length
    return KnownType.fromName(baseName)
        ?.let { TypeReference.Known(it, isArray) }
        ?: findNamespaceType(namespace, baseName)
            ?.let { TypeReference.Custom(it, isArray) }
}

private fun RepositoryDefinition.findNamespaceType(namespace: NamespaceDefinition, name: String): CustomType? {
    val nameComponents = name.split('.')
    return when (nameComponents.size) {
        1 -> namespace.findType(nameComponents[0])
        2 -> namespaces
            .firstOrNull { it.name == nameComponents[0] }
            ?.findType(nameComponents[1])
        else -> null
    }
}

private fun NamespaceDefinition.findType(name: String) =
    (classes + enums + bitFields + records + interfaces + functions + callbacks + unions)
        .firstOrNull { it.name == name }
