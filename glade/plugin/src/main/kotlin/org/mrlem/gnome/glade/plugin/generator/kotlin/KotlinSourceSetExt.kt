package org.mrlem.gnome.glade.plugin.generator.kotlin

import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.mrlem.gnome.glade.plugin.GladePlugin.Companion.GLADE_EXTENSION

val KotlinSourceSet.gladeFiles
    get() = resources.srcDirs
        .flatMap { dir ->
            dir?.listFiles { _, name -> name.endsWith(GLADE_EXTENSION) }
                ?.asList()
                .orEmpty()
        }
