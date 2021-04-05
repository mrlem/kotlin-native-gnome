package org.mrlem.gir

import java.io.File
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.BasePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.mrlem.gir.kotlin.BindingGenerator
import org.mrlem.gir.xml.Parser

/**
 * Gradle plugin that generates the GTK binding based on GObject introspection (GIR) files.
 */
class GirPlugin : Plugin<Project> {
    private lateinit var sourcesDir: File

    override fun apply(project: Project) {
        // task to run
        project.task("generateGtkBinding") {
            group = BasePlugin.BUILD_GROUP

            doLast {
                generateBinding(File("/usr/share/gir-1.0/Gtk-3.0.gir"), GTK_PACKAGE_NAME)
            }
        }

        // project setup
        project.afterEvaluate {
            // lookup kotlin source sets & create generated dirs
            val kotlinExtension = project.extensions.getByName("kotlin") as KotlinMultiplatformExtension
            sourcesDir = kotlinExtension.sourceSets.first().kotlin.srcDirs.first()
        }
    }

    private fun generateBinding(file: File, packageName: String) {
        println("generating binding for: ${file.name}")

        val sourceText = file.readText()
        val definitions = Parser().parse(sourceText)

        BindingGenerator().generate(definitions, sourcesDir, packageName)
    }

    companion object {
        const val GLIB_PACKAGE_NAME = "org.gnome.glib"
        const val GTK_PACKAGE_NAME = "org.gnome.gtk"
        const val GTK_CINTEROP_PACKAGE_NAME = "gtk3"
    }
}
