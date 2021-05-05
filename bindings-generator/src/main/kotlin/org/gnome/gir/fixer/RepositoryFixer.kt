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

        // FIXME - handle difference between type name & c-type
        repository.namespaces["GdkPixbuf"]!!
            .classes["Pixbuf"]!!
            .methods
            .removeAll { it.name == "read_pixels" }

        // FIXME - needs callback generation
        repository.namespaces["Gio"]!!
            .classes["Task"]!!
            .methods
            .removeAll { it.name == "run_in_thread" || it.name == "run_in_thread_sync" }

        // FIXME - factory naming clash
        repository.namespaces["Atk"]!!
            .classes
            .removeAll { it.name == "NoOpObjectFactory" }

        // FIXME - string based on gucharVar instead of gcharVar
        repository.namespaces["Gio"]!!
            .classes["TlsPassword"]!!
            .methods
            .removeAll { it.name == "get_value" }

        // remove all deprecated class... except Misc, as it is parent to non deprecated classes
        repository.namespaces.forEach { namespace ->
            namespace.classes.removeAll { it.deprecated && !(namespace.name == "Gtk" && it.name == "Misc") }

            // remove all deprecated methods
            namespace.classes.forEach { `class` ->
                `class`.methods.removeAll { it.callable.info.deprecated }

                // replace some incorrect class names
                `class`.glibTypeName
                    .takeIf { it.startsWith("GParam") }
                    ?.replace("GParam", "GParamSpec")
                    ?.let { `class`.glibTypeName = it }
            }
        }

        // incorrectly typed as String instead of string array
        repository.namespaces["Gio"]!!
            .classes["SimpleProxyResolver"]!!
            .methods["set_ignore_hosts"]!!
            .callable.parameters["ignore_hosts"]!!
            .apply { type = ArrayTypeDefinition.create(TypeDefinition.create("utf8")) }

        // incorrectly typed as GObject
        repository.namespaces["Gio"]!!
            .classes["ListStore"]!!
            .methods["splice"]!!
            .callable.parameters["additions"]!!
            .type = TypeDefinition.create("gpointer")

        // should be marked private
        repository.namespaces["Gdk"]!!
            .classes["Window"]!!
            .methods
            .removeAll { it.name == "destroy_notify" }

        // doesn't exist
        repository.namespaces["GdkPixbuf"]!!
            .classes
            .removeAll { it.name == "PixbufSimpleAnimIter" }

        // apparently, the includes for those were forgotten in gtk/gtk-a11y.h
        repository.namespaces["Gtk"]!!
            .classes
            .removeAll { it.name == "HeaderBarAccessible" || it.name == "EntryIconAccessible" }
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
