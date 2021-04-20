package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.*
import org.gnome.gir.model.CallableDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.resolver.Resolver

fun FileSpec.Builder.addProperties(methods: MutableList<CallableDefinition>, className: ClassName, resolver: Resolver) {
    val getters = methods
        .filter { it.name.startsWith("get_") && it.callable.parameters.isEmpty() }
    val setters = methods.filter { it.name.startsWith("set_") && it.callable.parameters.size == 1 }
    for (getter in getters) {
        val getterCIdentifier = getter.callable
            .takeUnless { it.throws || it.info.deprecated } // TODO - handle
            ?.cIdentifier
            ?: continue

        // determine type
        val type = getter.callable.returnValue?.type ?: continue
        val typeInfo = type.typeInfo(resolver) ?: continue

        // produce & consume getter
        methods.remove(getter)
        val (returnTemplate, returnArray) = type.getReturnData(resolver)
        val propertyName = getter.name.removePrefix("get_")
        addProperty(
            PropertySpec.builder(propertyName.snakeCaseToCamelCase.decapitalize(), typeInfo.kType)
                .receiver(className)
                .getter(
                    FunSpec.getterBuilder()
                        .addStatement(
                            "return %M(this)$returnTemplate",
                            MemberName(GTK_CINTEROP_PACKAGE, getterCIdentifier),
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
                            val (paramTemplate, paramArray) = mapOf("value" to type)
                                .getParamsData(false, resolver)

                            setter(
                                FunSpec.setterBuilder()
                                    .addParameter("value", typeInfo.kType)
                                    .addStatement(
                                        "%M(this$paramTemplate)",
                                        MemberName(GTK_CINTEROP_PACKAGE, setter.callable.cIdentifier!!),
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
