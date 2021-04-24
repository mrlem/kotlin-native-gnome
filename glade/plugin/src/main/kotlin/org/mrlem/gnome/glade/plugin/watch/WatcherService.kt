package org.mrlem.gnome.glade.plugin.watch

import dev.vishna.watchservice.*
import dev.vishna.watchservice.KWatchEvent.Kind.*
import java.io.File
import java.util.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlin.concurrent.fixedRateTimer
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.mrlem.gnome.glade.plugin.GladePlugin
import org.mrlem.gnome.glade.plugin.generator.kotlin.ViewBindingGenerator
import org.mrlem.gnome.glade.plugin.generator.kotlin.isGladeFile

/**
 * Service that, when started monitors kotlin source sets resources, and regenerates glade UI classes when glade files
 * change.
 */
class WatcherService : ServiceHandler.Service {

    private val watchChannels = mutableListOf<KWatchChannel>()
    private var timer: Timer? = null
    private var hasChanges = mutableMapOf<KotlinSourceSet, File>()

    @ObsoleteCoroutinesApi
    override fun onStart() {
        GladePlugin.sourceSetsWithGeneratedDir
            .forEach { (sourceSet, generatedDir) ->
                sourceSet.resources.srcDirs
                    .filter { it.exists() }
                    .forEach { dir ->
                        val channel = dir.asWatchChannel()
                            .also { watchChannels += it }

                        // monitor resource directory for changes on glade files
                        GlobalScope.launch {
                            channel.consumeEach { event ->
                                when (event.kind) {
                                    Initialized ->
                                        hasChanges[sourceSet] = generatedDir
                                    Created,
                                    Deleted,
                                    Modified ->
                                        if (event.file.isGladeFile) hasChanges[sourceSet] = generatedDir
                                }
                            }
                        }
                    }
            }

        timer = fixedRateTimer("keep-alive-and-update", false, 0L, 5000L) {
            // regenerate glade files in source sets with glade file changes
            hasChanges.forEach { (sourceSet, generatedDir) ->
                ViewBindingGenerator().generateGladeFiles(sourceSet, generatedDir)
            }

            hasChanges.clear()
        }
    }

    override fun onStop() {
        watchChannels.forEach { it.close() }
        watchChannels.clear()

        timer?.cancel()
        timer?.purge()
    }

}
