package org.gnome.gir.generator.kotlin.generators.ext

import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.model.NamespaceDefinition

val NamespaceDefinition.packageName
    get() = "$GNOME_PACKAGE.${name!!.toLowerCase()}"
