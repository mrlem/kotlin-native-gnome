package org.gnome.gir

import org.gnome.gir.generator.kotlin.BindingGenerator
import org.gnome.gir.parser.xml.Parser
import java.io.File
import kotlin.system.exitProcess

const val GLIB_PACKAGE_NAME = "org.gnome.glib"
const val GTK_PACKAGE_NAME = "org.gnome.gtk"
const val GTK_CINTEROP_PACKAGE_NAME = "gtk3"

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
    val definitions = Parser().parse(sourceText)
    BindingGenerator().generate(definitions, sourcesDir, GTK_PACKAGE_NAME)
}
