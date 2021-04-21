package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.FileSpec
import org.gnome.gir.model.SignalDefinition

fun FileSpec.Builder.addSignal(signal: SignalDefinition): FileSpec.Builder {
    // TODO
    addComment("TODO - signal: ${signal.name}\n")
    return this
}