package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.GLIB_PACKAGE
import org.gnome.gir.INTEROP_PACKAGE
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
        ?.cIdentifier
        ?: return run { addComment("TODO - method: ${method.name}\n") }
    val name = method.name.snakeCaseToCamelCase.decapitalize()

    // determine return type
    val returnType = method.callable.returnValue?.type
    val returnTypeInfo = returnType?.typeInfo(resolver)
    if (returnType != null && returnTypeInfo == null) {
        addComment("TODO - method: ${method.name}\n")
        return
    }

    val params = method.callable.parameters
        .map { param ->
            val type = (param.type as? TypeDefinition) // TODO - handle
                ?.takeIf { it.kType != null && it.cType != null }
                ?.takeUnless { param.direction == Out || param.direction == InOut } // TODO - handle
                ?: run {
                    addComment("TODO - method: ${method.name}\n")
                    return@addMethod
                }
            param.name.snakeCaseToCamelCase.decapitalize() to type
        }.toMap()

    // return conversion
    val (returnTemplate, returnArray) = returnType.getReturnData(resolver)
    val returnKeyword = if (returnType != null) "return " else ""

    // params conversion
    val (paramsTemplate, paramsArray) = params.getParamsData(true, resolver)

    val builder = FunSpec.builder(name)
        .receiver(className)
        // params
        .apply { params.forEach { (name, type) -> addParameter(name, type.typeInfo(resolver)!!.kType) } }
        // return
        .apply { returnTypeInfo?.kType?.let { returns(it) } }

    if (method.callable.throws) {
        builder
            .addAnnotation(
                AnnotationSpec.builder(throwsClassName)
                    .addMember("%T::class", ClassName(GLIB_PACKAGE, "Error"))
                    .build()
            )
            // block
            .beginControlFlow("$returnKeyword%M", memScopedMemberName)
            .addStatement(
                "val errors = %M<%T>().%M",
                allocPointerToMemberName,
                gerrorClassName,
                ptrMemberName
            )
            .addStatement(
                "val result: %T = %M(this@$name$paramsTemplate, errors)$returnTemplate",
                returnTypeInfo?.kType ?: unitClassName,
                MemberName(INTEROP_PACKAGE, cIdentifier),
                *paramsArray,
                *returnArray
            )
            .addStatement(
                "errors.%M.%M?.let { throw %T(it) }",
                pointedMemberName,
                pointedMemberName,
                ClassName(GLIB_PACKAGE, "Error")
            )
            .addStatement("return result")
            .endControlFlow()
    } else {
        builder
            // block
            .addStatement(
                "$returnKeyword%M(this$paramsTemplate)$returnTemplate",
                MemberName(INTEROP_PACKAGE, cIdentifier),
                *paramsArray,
                *returnArray
            )
    }

    addFunction(builder.build())
}

///////////////////////////////////////////////////////////////////////////
// Internal
///////////////////////////////////////////////////////////////////////////

fun AnyType?.getReturnData(resolver: Resolver): Pair<String, Array<MemberName>> {
    val typeInfo = this?.typeInfo(resolver)
    return typeInfo?.toKType
        ?: "" to emptyArray()
}

fun Map<String, AnyType>.getParamsData(reinterpretPointers: Boolean, resolver: Resolver, headingComma: Boolean = true): Pair<String, Array<MemberName>> {
    val paramsMembers = mutableListOf<MemberName>()
    val paramsTemplate = entries.joinToString(", ") { (name, type) ->
        val typeInfo = type.typeInfo(resolver)
        val (paramTemplate, paramArray) = if (reinterpretPointers) {
            typeInfo!!.toCTypeReinterpreted
        } else {
            typeInfo!!.toCType
        }
        paramsMembers += MemberName("", name)
        paramsMembers += paramArray
        "%M$paramTemplate"
    }
        .takeUnless { it.isEmpty() }
        ?.let { if (headingComma) ", $it" else it }
        .orEmpty()
    return paramsTemplate to paramsMembers.toTypedArray()
}
