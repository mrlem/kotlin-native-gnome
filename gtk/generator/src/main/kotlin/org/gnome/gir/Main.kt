package org.gnome.gir

import org.gnome.gir.generator.kotlin.BindingGenerator
import org.gnome.gir.parser.RepositoryReader
import java.io.File
import kotlin.system.exitProcess

const val GNOME_PACKAGE = "org.gnome"
const val GLIB_PACKAGE = "$GNOME_PACKAGE.glib"
const val GTK_PACKAGE = "$GNOME_PACKAGE.gtk"
const val GTK_CINTEROP_PACKAGE = "gtk3"
const val KOTLIN_CINTEROP_PACKAGE = "kotlinx.cinterop"
/**
 * Generates the GTK binding based on GObject introspection (GIR) files.
 */
fun main() {
    // target directory
    val sourcesDir = File("../../gtk/binding/src/commonMain/kotlin")
    if (!sourcesDir.exists()) {
        println("error: not such directory '${sourcesDir.absolutePath}'")
        exitProcess(1)
    }

    // source GIR file
    val url = BindingGenerator::class.java.getResource("/gtk3.gir")
    println("generating binding for: $url to ${sourcesDir.absolutePath}")
    val sourceText = url.readText()

    // parse & generate
    val reader = RepositoryReader()
        .apply {
            read("/gtk3.gir")
        }
    reader.repository?.let {
        BindingGenerator().generate(it, sourcesDir)
    }
}
