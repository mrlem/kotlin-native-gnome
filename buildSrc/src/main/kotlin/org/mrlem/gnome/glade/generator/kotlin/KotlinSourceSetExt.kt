package org.mrlem.gnome.glade.generator.kotlin

import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.mrlem.gnome.glade.ViewBindingGeneratorPlugin

val KotlinSourceSet.gladeFiles
    get() = resources.srcDirs
        .flatMap { dir ->
            dir?.listFiles { _, name -> name.endsWith(ViewBindingGeneratorPlugin.GLADE_EXTENSION) }
                ?.asList()
                .orEmpty()
        }
