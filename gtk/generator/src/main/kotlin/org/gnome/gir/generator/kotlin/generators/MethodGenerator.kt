package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import org.gnome.gir.GNOME_PACKAGE_NAME
import org.gnome.gir.GTK_CINTEROP_PACKAGE_NAME
import org.gnome.gir.model.CallableDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.model.VarargsDefinition
import org.gnome.gir.model.enums.Direction.InOut
import org.gnome.gir.model.enums.Direction.Out
import org.gnome.gir.model.types.AnyType
import org.gnome.gir.resolver.Resolver

fun FileSpec.Builder.addMethod(className: ClassName, method: CallableDefinition, resolver: Resolver) {
    val name = method.name.snakeCaseToCamelCase.decapitalize()
    val cIdentifier = method.callable.cIdentifier

    val returnType = method.callable.returnValue?.type
    val returnToKType = returnType?.toKTypeConverter
    val returnIsCPointer = (returnType as? TypeDefinition)?.name?.let { resolver.isCPointer(it) } == true
    val returnTypeKType = returnType?.kType
        ?.copy(nullable = returnIsCPointer)
        ?.takeUnless { (returnType as? TypeDefinition)?.cType?.let { resolver.isEnum(it) } == true } // TODO - handle

    var paramsHandled: Boolean

    val params = method.callable.parameters
        .map { param ->
            when (val type = param.type) {
                is TypeDefinition -> {
                    type
                        .takeIf { it.kType != null && it.cType != null }
                        ?.let { param.name.snakeCaseToCamelCase.decapitalize() to (param.type as? AnyType) }
                        ?.takeUnless { type.cType?.let { resolver.isEnum(type.cType) } == true } // TODO - handle
                        ?.takeUnless { param.direction == Out || param.direction == InOut } // TODO - handle
                }
                is VarargsDefinition -> null // TODO - handle
                else -> null
            }
        }
        .takeIf { params ->
            paramsHandled = params.all { it != null }
            paramsHandled
        }
        .orEmpty()
        .requireNoNulls()

    when {
        method.callable.info.deprecated -> {
            println("info: method '${className.simpleName}.${method.name}' ignored: deprecated")
            return
        }
        cIdentifier == null -> {
            println("warning: method '${className.simpleName}.${method.name}' ignored: no cIdentifier")
            return
        }
        // FIXME - not handled for now
        method.callable.throws
                || !paramsHandled
                || (returnType != null && returnTypeKType == null) -> {
            addComment("TODO - ${method.name}\n")
            return
        }
    }

    val paramsConverters = mutableListOf<MemberName>()
    val paramsNames = params
        .joinToString(", ") { (name, type) ->
            val converter = if ((type as? TypeDefinition)?.name?.let { resolver.isCPointer(it) } == true) {
                paramsConverters += MemberName("kotlinx.cinterop", "reinterpret")
                ".%M()"
            } else {
                type?.toCTypeConverter
                    ?.let { converter ->
                        paramsConverters += MemberName(GNOME_PACKAGE_NAME, converter)
                        ".%M"
                    }
                    .orEmpty()
            }
            "$name$converter"
        }
        .takeUnless { it.isEmpty() }
        ?.let { ", $it" }
        .orEmpty()
    val paramsConvertersArray = paramsConverters.toTypedArray()

    addFunction(
        FunSpec.builder(name)
            .receiver(className)
            .apply {
                params.forEach { param ->
                    addParameter(param.first, param.second!!.kType!!)
                }
            }
            .apply {
                returnType ?: return@apply
                returns(returnTypeKType!!)
            }
            .apply {
                val gtkFunction = MemberName(GTK_CINTEROP_PACKAGE_NAME, cIdentifier!!)
                val reinterpretTemplate = if (returnIsCPointer) "?.%M()" else ""
                val reinterpretArray = if (returnIsCPointer) arrayOf(MemberName("kotlinx.cinterop", "reinterpret")) else emptyArray()
                when {
                    returnType == null -> addStatement("%M(this$paramsNames)", gtkFunction, *paramsConvertersArray)
                    returnToKType == null -> addStatement("return %M(this$paramsNames)$reinterpretTemplate", gtkFunction, *paramsConvertersArray, *reinterpretArray)
                    else -> addStatement("return %M(this$paramsNames).%M", gtkFunction, *paramsConvertersArray, MemberName(GNOME_PACKAGE_NAME, returnToKType))
                }
            }
            .build()
    )
}
