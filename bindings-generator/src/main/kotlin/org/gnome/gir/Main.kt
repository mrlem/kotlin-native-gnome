package org.gnome.gir

import org.gnome.gir.fixer.RepositoryFixer
import org.gnome.gir.generator.kotlin.BindingGenerator
import org.gnome.gir.parser.RepositoryReader
import java.io.File
import kotlin.system.exitProcess

const val GNOME_PACKAGE = "org.gnome"
const val GLIB_PACKAGE = "$GNOME_PACKAGE.glib"
const val INTEROP_PACKAGE = "interop"
const val KOTLIN_CINTEROP_PACKAGE = "kotlinx.cinterop"

/**
 * Generates the GTK binding based on GObject introspection (GIR) files.
 */
fun main() {
    // target directory
    val sourcesDir = File("../bindings/gtk/src/nativeMain/kotlin")
    if (!sourcesDir.exists()) {
        println("error: not such directory '${sourcesDir.absolutePath}'")
        exitProcess(1)
    }

    // parse GIR file & generate
    val reader = RepositoryReader()
        .apply {
            read("/gobject.gir")
            read("/gio.gir")
            read("/gtk3.gir")
        }
    reader.repository?.let {
        RepositoryFixer.fix(it)
        BindingGenerator.generate(it, sourcesDir)
    }
}
