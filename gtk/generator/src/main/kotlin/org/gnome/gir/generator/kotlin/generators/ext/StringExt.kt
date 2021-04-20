package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.ClassName
import org.gnome.gir.GNOME_PACKAGE

val String.snakeCaseToCamelCase
    get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

val String.toClassName: ClassName
    get() {
        val (namespaceName, className) = split('.')
        return ClassName(
            "$GNOME_PACKAGE.${namespaceName.toLowerCase()}",
            className
        )
    }
