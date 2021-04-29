package org.gnome.gir.parser

import org.gnome.gir.model.*

///////////////////////////////////////////////////////////////////////////
// Repository resolution utils
///////////////////////////////////////////////////////////////////////////

internal fun RepositoryDefinition.resolveIncludes() {
    val namespacesNames = namespaces.map { it.name }
    includes.removeAll { namespacesNames.contains(it.name) }
}
