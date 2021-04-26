package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.ClassName
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.KOTLIN_CINTEROP_PACKAGE

val cpointerClassName = ClassName(KOTLIN_CINTEROP_PACKAGE, "CPointer")
val gerrorClassName = ClassName(INTEROP_PACKAGE, "GError")
val throwsClassName= ClassName("kotlin", "Throws")
val unitClassName= ClassName("kotlin", "Unit")
