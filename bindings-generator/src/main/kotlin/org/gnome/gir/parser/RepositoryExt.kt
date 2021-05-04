package org.gnome.gir.parser

import org.gnome.gir.model.*

///////////////////////////////////////////////////////////////////////////
// Repository resolution utils
///////////////////////////////////////////////////////////////////////////

internal fun RepositoryDefinition.resolveIncludes() {
    val namespacesNames = namespaces.map { it.name }
    includes.removeAll { namespacesNames.contains(it.name) }
}

internal operator fun List<NamespaceDefinition>.get(name: String) = firstOrNull { it.name == name }

internal operator fun List<ClassDefinition>.get(name: String) = firstOrNull { it.name == name }

internal operator fun List<CallableDefinition>.get(name: String) = firstOrNull { it.name == name }

internal operator fun List<ParameterDefinition>.get(name: String) = firstOrNull { it.name == name }
