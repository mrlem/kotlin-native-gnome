package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec

fun FileSpec.Builder.suppressWarningTypes(vararg types: String): FileSpec.Builder {
    if (types.isNotEmpty()) {
        val format = "%S,".repeat(types.count()).trimEnd(',')
        addAnnotation(
            AnnotationSpec.builder(ClassName("", "Suppress"))
                .addMember(format, *types)
                .build()
        )
    }

    return this
}
