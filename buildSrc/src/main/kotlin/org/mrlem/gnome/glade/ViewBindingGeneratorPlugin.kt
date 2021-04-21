package org.mrlem.gnome.glade

import java.io.File
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.mrlem.gnome.glade.watch.ServiceHandler

/**
 * Gradle plugin that generates a UI class for each glade XML file present in resources.
 * This UI class will:
 * - embed the XML in the app executable
 * - load it
 * - provide convenient widget accessors
 *
 * Note that the glade file needs to end in .glade.
 */
class ViewBindingGeneratorPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        val startTask = project.task("gladeWatchStart") {
            doLast {
                ServiceHandler.start()
            }
        }

        project.task("gladeWatchStop") {
            doLast {
                ServiceHandler.stop()
            }
        }

        project.afterEvaluate {
            // task will run immediately before compiling the kotlin sources
            project.tasks
                .filter { it.name.startsWith("compileKotlin") }
                .forEach { it.dependsOn(startTask) }

            // lookup kotlin source sets & create generated dirs
            val kotlinExtension = project.extensions.getByName("kotlin") as KotlinMultiplatformExtension
            sourceSetsWithGeneratedDir = kotlinExtension.sourceSets
                .map { it to createdGeneratedSrcDir(it, project.buildDir) }
                .toMap()

            // start glade file monitoring
            ServiceHandler.start()
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Private
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Create a generated sources dir for glade UI classes.
     *
     * @param sourceSet the source set to create a generated sources directory for.
     * @param buildDir the build dir to create the generated sources directory in.
     *
     * @return the resulting directory, added to the source set.
     */
    private fun createdGeneratedSrcDir(sourceSet: KotlinSourceSet, buildDir: File): File {
        val generatedDir = File(buildDir, "generated/glade/${sourceSet.name}")
        sourceSet.kotlin.srcDir(generatedDir)
        return generatedDir
    }

    companion object {
        const val GLADE_EXTENSION = ".glade"
        lateinit var sourceSetsWithGeneratedDir: Map<KotlinSourceSet, File>
    }
}
