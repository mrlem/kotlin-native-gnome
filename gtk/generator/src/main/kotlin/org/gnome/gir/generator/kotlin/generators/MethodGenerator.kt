package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.*
import org.gnome.gir.model.CallableDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.model.enums.Direction.InOut
import org.gnome.gir.model.enums.Direction.Out
import org.gnome.gir.model.types.AnyType
import org.gnome.gir.resolver.Resolver

fun FileSpec.Builder.addMethod(className: ClassName, method: CallableDefinition, resolver: Resolver) {
    val cIdentifier = method.callable
        .takeUnless { it.info.deprecated }
        ?.takeUnless { it.throws } // TODO - handle
        ?.cIdentifier
        ?: return run { addComment("TODO - ${method.name}\n") }
    val name = method.name.snakeCaseToCamelCase.decapitalize()

    // determine return type
    val returnType = method.callable.returnValue?.type
    val returnIsCPointer = (returnType as? TypeDefinition)?.name?.let { resolver.isCPointer(it) } == true
    val returnKType = returnType?.kType
        ?.copy(nullable = returnIsCPointer) // TODO - use nullable info from type too
        ?.takeUnless { resolver.isEnum(returnType) } // TODO - handle
    if (returnType != null && returnKType == null) {
        addComment("TODO - ${method.name}\n")
        return
    }

    val params = method.callable.parameters
        .map { param ->
            val type = (param.type as? TypeDefinition) // TODO - handle
                ?.takeIf { it.kType != null && it.cType != null }
                ?.takeUnless { it.cType?.let { cType -> resolver.isEnum(cType) } == true } // TODO - handle
                ?.takeUnless { param.direction == Out || param.direction == InOut } // TODO - handle
                ?: run {
                    addComment("TODO - ${method.name}\n")
                    return@addMethod
                }
            param.name.snakeCaseToCamelCase.decapitalize() to type
        }.toMap()

    // return conversion
    val (returnTemplate, returnArray) = returnType.getReturnData(resolver)
    val returnKeyword = if (returnType != null) "return " else ""

    // params conversion
    val (paramsTemplate, paramsArray) = params.getParamsData(true, resolver)

    addFunction(
        FunSpec.builder(name)
            .receiver(className)
            // params
            .apply { params.forEach { (name, type) -> addParameter(name, type.kType!!) } }
            // return
            .apply { returnKType?.let { returns(it) } }
            // block
            .addStatement(
                "$returnKeyword%M(this$paramsTemplate)$returnTemplate",
                MemberName(GTK_CINTEROP_PACKAGE, cIdentifier),
                *paramsArray,
                *returnArray
            )
            .build()
    )
}

///////////////////////////////////////////////////////////////////////////
// Internal
///////////////////////////////////////////////////////////////////////////

fun AnyType?.getReturnData(resolver: Resolver): Pair<String, Array<MemberName>> {
    val converter = this?.toKTypeConverter
    return when {
        converter != null -> ".%M" to arrayOf(MemberName(GNOME_PACKAGE, converter))
        this?.let { resolver.isCPointer(it) } == true -> "?.%M()" to arrayOf(reinterpretMemberName)
        else -> "" to emptyArray()
    }
}

fun Map<String, AnyType>.getParamsData(reinterpretPointers: Boolean, resolver: Resolver): Pair<String, Array<MemberName>> {
    val paramsConverters = mutableListOf<MemberName>()
    val paramsTemplate = entries.joinToString(", ") { (name, type) ->
        val converter = if (resolver.isCPointer(type)) {
            if (reinterpretPointers) {
                paramsConverters += reinterpretMemberName
                ".%M()"
            } else {
                ""
            }
        } else {
            type.toCTypeConverter
                ?.let { converter ->
                    paramsConverters += MemberName(GNOME_PACKAGE, converter)
                    ".%M"
                }
                .orEmpty()
        }
        "$name$converter"
    }
        .takeUnless { it.isEmpty() }
        ?.let { ", $it" }
        .orEmpty()
    val paramsArray = paramsConverters.toTypedArray()
    return paramsTemplate to paramsArray
}
