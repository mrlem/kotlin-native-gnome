package org.mrlem.gir.kotlin

import com.squareup.kotlinpoet.*
import kotlin.reflect.KClass

val <T : Any> KClass<T>.toK
    get() = when (this) {
        Boolean::class -> "toBoolean"
        String::class -> "toKString"
        else -> ""
    }

val <T : Any> KClass<T>.fromK
    get() = when (this) {
        Boolean::class -> "toInt"
        else -> ""
    }

val <T : Any> KClass<T>.asPropertyTypeName
    get() = when (this) {
        String::class -> this.asTypeName().copy(nullable = true)
        else -> this.asTypeName()
    }
