package org.gnome.gir.generator.kotlin.generators

import org.gnome.gir.model.CallableDefinition

fun CallableDefinition.toFunSpec() = com.squareup.kotlinpoet.FunSpec.builder(name)
    // TODO - function: alias in camelcase + typing?
    .addComment("TODO - function: $name")
    .build()
