package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.reinterpretMemberName
import org.gnome.gir.generator.kotlin.generators.ext.snakeCaseToCamelCase
import org.gnome.gir.generator.kotlin.generators.ext.typeInfo
import org.gnome.gir.model.ArrayTypeDefinition
import org.gnome.gir.model.CallableDefinition
import org.gnome.gir.model.enums.Direction
import org.gnome.gir.model.types.AnyType
import org.gnome.gir.resolver.Resolver

fun TypeSpec.Builder.addConstructor(className: ClassName, constructor: CallableDefinition, fileSpecBuilder: FileSpec.Builder, resolver: Resolver) {
    val cIdentifier = constructor.callable
        .takeUnless { it.info.deprecated }
        ?.takeUnless { it.throws } // TODO - handle
        ?.cIdentifier
        ?: return run { fileSpecBuilder.addComment("TODO - constructor: ${constructor.name}\n") }
    val name = constructor.name.snakeCaseToCamelCase.decapitalize()

    // determine return type
    val returnType = constructor.callable.returnValue?.type
    val returnTypeInfo = returnType?.typeInfo(resolver)
    if (returnType != null && returnTypeInfo == null) {
        fileSpecBuilder.addComment("TODO - constructor: ${constructor.name}\n")
        return
    }

    var hasArray = false
    val params = constructor.callable.parameters
        .map { param ->
            val typeInfo = (param.type as? AnyType) // TODO - handle varargs
                ?.also { if (it is ArrayTypeDefinition) hasArray = true }
                ?.takeUnless { param.direction == Direction.Out || param.direction == Direction.InOut } // TODO - handle in/out
                ?.typeInfo(resolver)
                ?: run {
                    fileSpecBuilder.addComment("TODO - constructor: ${constructor.name}\n")
                    return@addConstructor
                }
            param.name.snakeCaseToCamelCase.decapitalize() to typeInfo
        }.toMap()

    // params conversion
    val (paramsTemplate, paramsArray) = params.getParamsData(true, resolver, headingComma = false)

    // memScoped if required
    val (memScopedStart, memScopedEnd, memScopedArray) = if (hasArray) {
        Triple("%M { ", " }", arrayOf(MemberName("kotlinx.cinterop", "memScoped")))
    } else {
        Triple("", "", emptyArray())
    }

    addFunction(
        FunSpec.builder(name)
            // params
            .apply { params.forEach { (name, typeInfo) -> addParameter(name, typeInfo.kType) } }
            // return
            .apply { returns(className) }
            // block
            .addStatement(
                "return $memScopedStart%M($paramsTemplate)!!.%M()$memScopedEnd",
                *memScopedArray,
                MemberName(INTEROP_PACKAGE, cIdentifier),
                *paramsArray,
                reinterpretMemberName
            )
            .build()
    )

}
