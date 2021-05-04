package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.*
import org.gnome.gir.model.ArrayTypeDefinition
import org.gnome.gir.model.CallableDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.resolver.Resolver

fun FileSpec.Builder.addProperties(methods: MutableList<CallableDefinition>, className: ClassName, resolver: Resolver) {
    val getters = methods
        .filter { it.name.startsWith("get_") && it.callable.parameters.isEmpty() }
    val setters = methods.filter { it.name.startsWith("set_") && it.callable.parameters.size == 1 }
    for (getter in getters) {
        val getterCIdentifier = getter.callable
            .takeUnless { it.throws || it.info.deprecated }
            ?.cIdentifier
            ?: continue

        // determine type
        val type = getter.callable.returnValue?.type ?: continue
        val typeInfo = type.typeInfo(resolver) ?: continue
        val isArray = type is ArrayTypeDefinition

        // produce & consume getter
        methods.remove(getter)
        val (returnTemplate, returnArray) = typeInfo.getReturnData()
        val propertyName = getter.name.removePrefix("get_")
        val propertyKName = propertyName.snakeCaseToCamelCase.decapitalize()
        addProperty(
            PropertySpec.builder(propertyKName, typeInfo.kType)
                .receiver(className)
                .getter(
                    FunSpec.getterBuilder()
                        .addStatement(
                            "return %M(this)$returnTemplate",
                            MemberName(INTEROP_PACKAGE, getterCIdentifier),
                            *returnArray
                        )
                        .build()
                )
                // produce & consume setter, if any
                .apply {
                    setters.firstOrNull { it.name == "set_$propertyName" }
                        ?.takeIf { it.callable.cIdentifier != null }
                        ?.takeIf { (it.callable.parameters.first().type as? TypeDefinition)?.name == (type as? TypeDefinition)?.name }
                        ?.let { setter ->
                            methods.remove(setter)
                            mutable()

                            // setter param conversion
                            val (paramTemplate, paramArray) = mapOf("value" to typeInfo)
                                .getParamsData(false, resolver)

                            // memScoped if required
                            val (memScopedStart, memScopedEnd, memScopedArray) = if (isArray) {
                                Triple("%M { ", " }", arrayOf(MemberName("kotlinx.cinterop", "memScoped")))
                            } else {
                                Triple("", "", emptyArray())
                            }

                            setter(
                                FunSpec.setterBuilder()
                                    .addParameter("value", typeInfo.kType)
                                    .addStatement(
                                        "$memScopedStart%M(this@%M$paramTemplate)$memScopedEnd",
                                        *memScopedArray,
                                        MemberName(INTEROP_PACKAGE, setter.callable.cIdentifier!!),
                                        MemberName("", propertyKName),
                                        *paramArray
                                    )
                                    .build()
                            )
                        }
                }
                .build()
        )
    }
}
