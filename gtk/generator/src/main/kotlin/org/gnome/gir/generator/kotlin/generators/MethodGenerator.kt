package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
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
    val returnTypeInfo = returnType?.typeInfo(resolver)
    if (returnType != null && returnTypeInfo == null) {
        addComment("TODO - ${method.name}\n")
        return
    }

    val params = method.callable.parameters
        .map { param ->
            val type = (param.type as? TypeDefinition) // TODO - handle
                ?.takeIf { it.kType != null && it.cType != null }
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
            .apply { params.forEach { (name, type) -> addParameter(name, type.typeInfo(resolver)!!.kType) } }
            // return
            .apply { returnTypeInfo?.kType?.let { returns(it) } }
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
    val typeInfo = this?.typeInfo(resolver)
    return typeInfo?.toKType
        ?: "" to emptyArray()
}

fun Map<String, AnyType>.getParamsData(reinterpretPointers: Boolean, resolver: Resolver): Pair<String, Array<MemberName>> {
    val paramsConverters = mutableListOf<MemberName>()
    val paramsTemplate = entries.joinToString(", ") { (name, type) ->
        val typeInfo = type.typeInfo(resolver)
        val (paramTemplate, paramArray) = if (reinterpretPointers) {
            typeInfo!!.toCTypeReinterpreted
        } else {
            typeInfo!!.toCType
        }
        paramsConverters += paramArray
        "$name$paramTemplate"
    }
        .takeUnless { it.isEmpty() }
        ?.let { ", $it" }
        .orEmpty()
    return paramsTemplate to paramsConverters.toTypedArray()
}
