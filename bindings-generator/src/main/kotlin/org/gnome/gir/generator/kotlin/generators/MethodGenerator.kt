package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.GLIB_PACKAGE
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.*
import org.gnome.gir.model.ArrayTypeDefinition
import org.gnome.gir.model.CallableDefinition
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

    when (cIdentifier) {
        // TODO - see why these methods don't exist
        "g_settings_backend_path_writable_changed",
        "g_settings_backend_writable_changed" -> return
    }

    // determine return type
    val returnType = method.callable.returnValue?.type
    val returnTypeInfo = returnType?.typeInfo(resolver)
    if (returnType != null && returnTypeInfo == null) {
        addComment("TODO - method: ${method.name}\n")
        return
    }

    var hasArray = false
    val params = method.callable.parameters
        .map { param ->
            val typeInfo = (param.type as? AnyType) // TODO - handle varargs
                ?.also { if (it is ArrayTypeDefinition) hasArray = true }
                ?.takeUnless { param.direction == Out || param.direction == InOut } // TODO - handle in/out
                ?.typeInfo(resolver)
                ?: run {
                    addComment("TODO - method: ${method.name}\n")
                    return@addMethod
                }
            param.name.snakeCaseToCamelCase.decapitalize() to typeInfo
        }.toMap()

    // return conversion
    val (returnTemplate, returnArray) = returnTypeInfo.getReturnData()
    val returnKeyword = if (returnType != null) "return " else ""

    // params conversion
    val (paramsTemplate, paramsArray) = params.getParamsData(true, resolver)

    // memScoped if required
    val (memScopedStart, memScopedEnd, memScopedArray) = if (hasArray) {
        Triple("%M { ", " }", arrayOf(MemberName("kotlinx.cinterop", "memScoped")))
    } else {
        Triple("", "", emptyArray())
    }

    val builder = FunSpec.builder(name)
        .receiver(className)
        // params
        .apply { params.forEach { (name, typeInfo) -> addParameter(name, typeInfo.kType) } }
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
                "val result: %T = $memScopedStart%M(this@%M$paramsTemplate, errors)$returnTemplate$memScopedEnd",
                returnTypeInfo?.kType ?: unitClassName,
                *memScopedArray,
                MemberName(INTEROP_PACKAGE, cIdentifier),
                MemberName("", name),
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
                "$returnKeyword$memScopedStart%M(this@%M$paramsTemplate)$returnTemplate$memScopedEnd",
                *memScopedArray,
                MemberName(INTEROP_PACKAGE, cIdentifier),
                MemberName("", name),
                *paramsArray,
                *returnArray
            )
    }

    addFunction(builder.build())
}

///////////////////////////////////////////////////////////////////////////
// Internal
///////////////////////////////////////////////////////////////////////////

fun TypeInfo?.getReturnData(): Pair<String, Array<MemberName>> {
    return this?.toKType
        ?: "" to emptyArray()
}

fun Map<String, TypeInfo>.getParamsData(reinterpretPointers: Boolean, resolver: Resolver, headingComma: Boolean = true): Pair<String, Array<MemberName>> {
    val paramsMembers = mutableListOf<MemberName>()
    val paramsTemplate = entries.joinToString(", ") { (name, typeInfo) ->
        val (paramTemplate, paramArray) = if (reinterpretPointers) {
            typeInfo.toCTypeReinterpreted
        } else {
            typeInfo.toCType
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
