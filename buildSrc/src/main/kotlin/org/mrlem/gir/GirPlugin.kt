package org.mrlem.gir

import java.io.File
import javax.xml.parsers.SAXParserFactory
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.BasePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.mrlem.gir.kotlin.createBindings
import org.mrlem.gir.xml.GirInfo
import org.mrlem.gir.xml.GirHandler

/**
 * Gradle plugin that generates the GTK binding based on GObject introspection (GIR) files.
 */
class GirPlugin : Plugin<Project> {
    private lateinit var sourcesDir: File

    override fun apply(project: Project) {
        // task to run
        project.task("generateGtkBindingClasses") {
            group = BasePlugin.BUILD_GROUP

            doLast {
                parseGir(File("/usr/share/gir-1.0/Gtk-3.0.gir"))
                    .also { generateClasses(it, GTK_PACKAGE_NAME) }
            }
        }

        // project setup
        project.afterEvaluate {
            // lookup kotlin source sets & create generated dirs
            val kotlinExtension = project.extensions.getByName("kotlin") as KotlinMultiplatformExtension
            sourcesDir = kotlinExtension.sourceSets.first().kotlin.srcDirs.first()
        }
    }

    private fun parseGir(file: File): GirInfo {
        // TODO - a DOM based parser would be more convenient: but considering the file size, I opted for a SAX parser
        val parser = SAXParserFactory.newInstance().newSAXParser()
        val handler = GirHandler()
        parser.parse(file, handler)
        return handler.info
    }

    private fun generateClasses(info: GirInfo, packageName: String) {
        info.createBindings(sourcesDir, packageName)
    }

    companion object {
        const val GLIB_PACKAGE_NAME = "org.gnome.glib"
        const val GTK_PACKAGE_NAME = "org.gnome.gtk"
        const val GTK_CINTEROP_PACKAGE_NAME = "gtk3"
    }
}
