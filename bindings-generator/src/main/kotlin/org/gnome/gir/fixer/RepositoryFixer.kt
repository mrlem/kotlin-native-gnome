package org.gnome.gir.fixer

import org.gnome.gir.model.ArrayTypeDefinition
import org.gnome.gir.model.RepositoryDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.parser.get

/**
 * Component that applies fixes & work-around to repositories, so as to improve the generator output.
 */
object RepositoryFixer {

    fun fix(repository: RepositoryDefinition) {
        repository.fixParamsAsStrings()
        repository.fixArrayTypesAsByte()
        repository.fixFieldsDuplicatingMethods()

        // incorrectly typed as GObject
        repository.namespaces["Gio"]!!
            .classes["ListStore"]!!
            .methods["splice"]!!
            .callable.parameters["additions"]!!
            .type = TypeDefinition.create("gpointer")
    }

    ///////////////////////////////////////////////////////////////////////////
    // Private
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Fix parameter declared in various ways but should really be strings.
     */
    private fun RepositoryDefinition.fixParamsAsStrings() {
        val parameters = listOf(
            namespaces["Gio"]!!
                .classes["UnixSocketAddress"]!!
                .constructors["new_with_type"]!!
                .callable.parameters["path"]!!,

            namespaces["Gio"]!!
                .classes["Socket"]!!
                .methods["send"]!!
                .callable.parameters["buffer"]!!,

            namespaces["Gio"]!!
                .classes["Socket"]!!
                .methods["send_to"]!!
                .callable.parameters["buffer"]!!,

            namespaces["Gio"]!!
                .classes["Socket"]!!
                .methods["send_with_blocking"]!!
                .callable.parameters["buffer"]!!,

            namespaces["Gtk"]!!
                .classes["CssProvider"]!!
                .methods["load_from_data"]!!
                .callable.parameters["data"]!!
        )

        parameters.forEach { it.type = TypeDefinition.create("utf8") }
    }

    /**
     * Fix array element types declared as unsigned bytes when they really are signed bytes.
     */
    private fun RepositoryDefinition.fixArrayTypesAsByte() {
        val arrayTypes = listOf(
            namespaces["Gio"]!!
                .classes["Socket"]!!
                .methods["receive"]!!
                .callable.parameters["buffer"]!!
                .type as ArrayTypeDefinition,

            namespaces["Gio"]!!
                .classes["Socket"]!!
                .methods["receive_with_blocking"]!!
                .callable.parameters["buffer"]!!
                .type as ArrayTypeDefinition
        )

        arrayTypes.forEach { it.type = TypeDefinition.create("gint8") }
    }

    /**
     * Remove field names clashing with methods being collapsed as fields.
     */
    private fun RepositoryDefinition.fixFieldsDuplicatingMethods() {
        namespaces.forEach { namespace ->
            namespace.classes.forEach { `class` ->
                `class`.methods.forEach { method ->
                    if (method.name.startsWith("get_")) {
                        val fieldName = method.name.removePrefix("get_")
                        `class`.fields.removeAll { it.name == fieldName }
                    }
                }
            }
        }
    }

}
