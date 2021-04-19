package org.gnome.gir.generator.kotlin.generators

import org.gnome.gir.GNOME_PACKAGE_NAME
import org.gnome.gir.model.NamespaceDefinition

val NamespaceDefinition.packageName
    get() = "$GNOME_PACKAGE_NAME.${name!!.toLowerCase()}"
