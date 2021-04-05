package org.mrlem.gir.kotlin

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.mrlem.gir.GirPlugin.Companion.GLIB_PACKAGE_NAME
import org.mrlem.gir.GirPlugin.Companion.GTK_CINTEROP_PACKAGE_NAME
import org.mrlem.gir.xml.GirInfo
import java.io.File

fun GirInfo.createBindings(
    destination: File,
    packageName: String
) {
    typesAndAncestors.forEach { (classInfo, ancestors) ->
        FileSpec.builder(packageName, classInfo.name)
            // type
            .addTypeAlias(
                TypeAliasSpec.builder(
                    classInfo.name,
                    ClassName("kotlinx.cinterop", "CPointer")
                        .plusParameter(ClassName(GTK_CINTEROP_PACKAGE_NAME, classInfo.cType))
                )
                    .build()
            )
            // converters
            .apply {
                ancestors.forEach {
                    addConverter(packageName, classInfo.name, it)
                }
            }
            // TODO - add public API
            // TODO - add event handlers
            .build()
            .run { writeTo(destination) }
    }
}

private fun FileSpec.Builder.addConverter(
    packageName: String,
    current: String,
    ancestor: String
) {
    val ancestorParts = ancestor.split(".")
    val ancestorClassName = ancestorParts.last()
    val ancestorPackageName = ancestorParts.first()
        .takeIf { ancestorParts.size > 1 }
        ?.toLowerCase()
        ?.let { "$GLIB_PACKAGE_NAME.$it" }
        ?: packageName

    addProperty(
        PropertySpec.builder("as$ancestorClassName", ClassName(ancestorPackageName, ancestorClassName))
            .receiver(ClassName(packageName, current))
            .getter(
                FunSpec.getterBuilder()
                    .addStatement("return %M()", MemberName("kotlinx.cinterop", "reinterpret"))
                    .build()
            )
            .build()
    )
}
