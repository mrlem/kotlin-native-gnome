package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import org.gnome.gir.GNOME_PACKAGE_NAME
import org.gnome.gir.model.ClassDefinition
import org.gnome.gir.model.EnumDefinition
import org.gnome.gir.model.NamespaceDefinition
import org.gnome.gir.model.RecordDefinition

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

val String.toClassName: ClassName
    get() {
        val (namespaceName, className) = split('.')
        return ClassName(
            "$GNOME_PACKAGE_NAME.${namespaceName.toLowerCase()}",
            className
        )
    }
