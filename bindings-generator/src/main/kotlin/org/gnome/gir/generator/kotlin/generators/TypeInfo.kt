package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName

data class TypeInfo(
    val kType: TypeName,
    val toKType: Pair<String, Array<out Any>>,
    val toCType: Pair<String, Array<MemberName>>,
    val toCTypeReinterpreted: Pair<String, Array<MemberName>>
)
