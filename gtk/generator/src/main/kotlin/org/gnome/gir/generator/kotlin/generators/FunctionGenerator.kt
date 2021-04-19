package org.gnome.gir.generator.kotlin.generators

import org.gnome.gir.model.CallableDefinition

fun CallableDefinition.toFunSpec() = com.squareup.kotlinpoet.FunSpec.builder(name)
    // TODO
    .addComment("TODO - implement")
    .build()
