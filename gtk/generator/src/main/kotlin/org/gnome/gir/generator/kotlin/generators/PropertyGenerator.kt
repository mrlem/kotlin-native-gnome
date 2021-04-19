package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import org.gnome.gir.GLIB_PACKAGE_NAME
import org.gnome.gir.model.PropertyDefinition
/*
// TODO
fun FileSpec.Builder.addProperty(className: ClassName, classPrefix: String, propertyDefinition: PropertyDefinition) {
    val name = propertyDefinition.name.snakeCaseToCamelCase.decapitalize()
    val toKType = propertyDefinition.type.toKTypeConverter
    addProperty(
        PropertySpec.builder(name, propertyDefinition.type.kType)
            .receiver(className)
            .getter(
                FunSpec.getterBuilder()
                    .apply {
                        val gtkFunction = MemberName("gtk3", propertyDefinition.getterFunctionName)
                        if (toKType == null) {
                            addStatement("return %M(this)", gtkFunction)
                        } else {
                            addStatement("return %M(this).%M", gtkFunction, MemberName(GLIB_PACKAGE_NAME, toKType))
                        }
                    }
                    .build()
            )
            .apply {
                propertyDefinition.setterFunctionName?.let { setterFunctionName ->
                    val toGType = propertyDefinition.type.toGTypeConverter
                    val gtkFunction = MemberName("gtk3", setterFunctionName)

                    mutable()
                    setter(
                        FunSpec.setterBuilder()
                            .addParameter("value", propertyDefinition.type.kType)
                            .apply {
                                if (toGType == null) {
                                    addStatement("%M(this, value)", gtkFunction)
                                } else {
                                    addStatement("%M(this, value.%M)", gtkFunction, MemberName(GLIB_PACKAGE_NAME, toGType))
                                }
                            }
                            .build()
                    )
                }
            }
            .build()
    )
}
*/
