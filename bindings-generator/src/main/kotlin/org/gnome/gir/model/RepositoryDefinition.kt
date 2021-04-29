package org.gnome.gir.model

/**
 * GIR repository.
 *
 * Root node of a GIR repository. It contains namespaces, which can in turn be implemented in several libraries.
 *
 * @property version namespace version.
 * @property cIdentifierPrefixes data-structures & types prefix (eg. Gtk in GtkWindow).
 * @property cSymbolPrefixes C-functions prefix (eg. gtk_ in gtk_window_new), defaults to identifierPrefixes.
 * @property includes repository includes.
 * @property cIncludes repository C includes.
 * @property packages repository packages.
 * @property namespaces repository namespaces.
 */
data class RepositoryDefinition(
    val version: String? = null,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    val includes: MutableList<IncludeDefinition>,
    val cIncludes: MutableList<CIncludeDefinition>,
    val packages: MutableList<PackageDefinition>,
    val namespaces: MutableList<NamespaceDefinition>
)
