package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.MemberName
import org.gnome.gir.KOTLIN_CINTEROP_PACKAGE

val reinterpretMemberName = MemberName(KOTLIN_CINTEROP_PACKAGE, "reinterpret")
val memScopedMemberName = MemberName(KOTLIN_CINTEROP_PACKAGE, "memScoped")
val allocPointerToMemberName = MemberName(KOTLIN_CINTEROP_PACKAGE, "allocPointerTo")
val ptrMemberName = MemberName(KOTLIN_CINTEROP_PACKAGE, "ptr")
val pointedMemberName = MemberName(KOTLIN_CINTEROP_PACKAGE, "pointed")
