package org.gnome.gir.model

/**
 * GIR namespace.
 *
 * Namespace which maps metadata entries to C functionality. This a similar concept to namespace in C++, but for
 * GObject-based C libraries.
 *
 * @property name namespace name.
 * @property version namespace version.
 * @property cIdentifierPrefixes data-structures & types prefix (eg. Gtk in GtkWindow).
 * @property cSymbolPrefixes C-functions prefix (eg. gtk_ in gtk_window_new), defaults to identifierPrefixes.
 * @property cPrefix same as identifierPrefixes only used for backward compatibility.
 * @property sharedLibrary name of the shared library implementing the namespace.
 * @property aliases namespace aliases.
 * @property classes namespace classes.
 * @property interfaces namespace interfaces.
 * @property records namespace records.
 * @property enums namespace enums.
 * @property functions namespace functions.
 * @property unions namespace unions.
 * @property bitFields namespace bitfields.
 * @property callbacks namespace callbacks.
 * @property constants namespace constants.
 * @property annotations namespace annotations.
 * @property boxedTypes namespace boxed types.
 */
data class NamespaceDefinition(
    val name: String?,
    val version: String?,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    @Deprecated("Same as identifierPrefixes. Only used for backward compatibility")
    val cPrefix: String?,
    val sharedLibrary: String?,
    val aliases: List<AliasDefinition>,
    val classes: List<ClassDefinition>,
    val interfaces: List<InterfaceDefinition>,
    val records: List<RecordDefinition>,
    val enums: List<EnumDefinition>,
    val functions: List<CallableDefinition>,
    val unions: List<UnionDefinition>,
    val bitFields: List<BitFieldDefinition>,
    val callbacks: List<CallbackDefinition>,
    val constants: List<ConstantDefinition>,
    val annotations: List<AnnotationDefinition>,
    val boxedTypes: List<BoxedDefinition>
)
