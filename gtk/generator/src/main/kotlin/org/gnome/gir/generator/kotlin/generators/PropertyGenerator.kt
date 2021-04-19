package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.GNOME_PACKAGE_NAME
import org.gnome.gir.GTK_CINTEROP_PACKAGE_NAME
import org.gnome.gir.model.CallableDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.resolver.Resolver

// TODO - share code with addMethod
fun FileSpec.Builder.addProperties(methods: MutableList<CallableDefinition>, className: ClassName, resolver: Resolver) {
    val getters = methods
        .filter { it.name.startsWith("get_") && it.callable.parameters.isEmpty() }
    val setters = methods.filter { it.name.startsWith("set_") && it.callable.parameters.size == 1 }
    for (getter in getters) {
        val propertyName = getter.name.removePrefix("get_")
        val setter = setters.firstOrNull { it.name == "set_$propertyName" }
            ?.takeIf { (it.callable.parameters.first().type as? TypeDefinition)?.name == (getter.callable.returnValue?.type as? TypeDefinition)?.name }

        val name = propertyName.snakeCaseToCamelCase.decapitalize()
        val type = getter.callable.returnValue!!.type
        val toKType = type?.toKTypeConverter

        when {
            getter.callable.info.deprecated -> {
                println("info: method '${className.simpleName}.${getter.name}' ignored: deprecated")
                continue
            }
            getter.callable.cIdentifier == null -> {
                println("warning: method '${className.simpleName}.${getter.name}' ignored: no cIdentifier")
                continue
            }
            // FIXME - not handled for now
            getter.callable.throws
                    || (type as? TypeDefinition)?.cType?.let { resolver.isEnum(it) } == true
                    || type?.kType == null -> {
                addComment("TODO - ${getter.name}\n")
                continue
            }
        }

        methods.remove(getter)
        setter?.let { methods.remove(it) }


        val isCPointer = (type as? TypeDefinition)?.name?.let { resolver.isCPointer(it) } == true
        val (converterTemplate, converterArray) = if (isCPointer) {
            "?.%M()" to arrayOf(MemberName("kotlinx.cinterop", "reinterpret"))
        } else {
            type?.toCTypeConverter
                ?.let { converter ->
                    ".%M" to arrayOf(MemberName(GNOME_PACKAGE_NAME, converter))
                }
                ?: "" to emptyArray()
        }

        addProperty(
            PropertySpec.builder(name, type!!.kType!!.copy(nullable = isCPointer))
                .receiver(className)
                .getter(
                    FunSpec.getterBuilder()
                        .apply {
                            val gtkFunction = MemberName(GTK_CINTEROP_PACKAGE_NAME, getter.callable.cIdentifier!!)
                            if (toKType == null) {
                                addStatement("return %M(this)$converterTemplate", gtkFunction, *converterArray)
                            } else {
                                addStatement("return %M(this).%M", gtkFunction, MemberName(GNOME_PACKAGE_NAME, toKType))
                            }
                        }
                        .build()
                )
                .apply {
                    setter?.let {
                        val toGType = type.toCTypeConverter
                        val gtkFunction = MemberName(GTK_CINTEROP_PACKAGE_NAME, setter.callable.cIdentifier!!)

                        mutable()
                        setter(
                            FunSpec.setterBuilder()
                                .addParameter("value", type.kType!!)
                                .apply {
                                    if (toGType == null) {
                                        addStatement("%M(this, value)", gtkFunction)
                                    } else {
                                        addStatement("%M(this, value.%M)", gtkFunction, MemberName(GNOME_PACKAGE_NAME, toGType))
                                    }
                                }
                                .build()
                        )
                    }
                }
                .build()
        )
    }
}
