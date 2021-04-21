package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.*
import org.gnome.gir.model.ClassDefinition
import org.gnome.gir.model.NamespaceDefinition
import org.gnome.gir.resolver.Resolver

fun ClassDefinition.toFileSpec(namespace: NamespaceDefinition, resolver: Resolver): FileSpec? {
    val cType = cType
    if (cType == null) {
        println("warning: class '$name' ignored: no cType")
        return null
    }

    val classNameString = "${namespace.name}.$name"
    val className = classNameString.toClassName
    val packageName = namespace.packageName
    val ancestors = resolver.ancestors(classNameString)

    // filter out some classes
    when {
        deprecated && classNameString != "Gtk.Misc" -> {
            println("info: class '$name' ignored: deprecated")
            return null
        }
        // FIXME - Misc is annoying: deprecated, but not its children, try figure that out
        ancestors.any { it != "Gtk.Misc" && resolver.classDefinition(it)?.deprecated == true } -> {
            println("info: class '$name' ignored: deprecated ancestor")
            return null
        }
        // TODO - problematic classes: investigate
        arrayOf("Gtk.Plug", "Gtk.Socket", "Gtk.HeaderBarAccessible").contains(classNameString) -> {
            println("warning: class '$name' ignored: excluded class")
            return null
        }
    }

    return FileSpec.builder(packageName, name)
        .suppressWarningTypes(
            "RemoveRedundantBackticks",
            "RedundantVisibilityModifier",
            "unused",
            "RedundantUnitReturnType"
        )
        // type
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, cpointerClassName.plusParameter(ClassName(GTK_CINTEROP_PACKAGE, cType)))
                .build()
        )
        // converters
        .apply { addConverters(classNameString, className, resolver) }
        // sub-elements
        .apply {
            val methodsToAdd = methods.toMutableList()
            addProperties(methodsToAdd, className, resolver)
            methodsToAdd.forEach { addMethod(className, it, resolver) }
        }
        .apply {
            signals.forEach { addSignal(className, it) }
        }
        .build()
}

///////////////////////////////////////////////////////////////////////////
// Private
///////////////////////////////////////////////////////////////////////////

private fun FileSpec.Builder.addConverters(classNameString: String, className: ClassName, resolver: Resolver) {
    resolver.ancestors(classNameString)
        .reversed()
        .forEach { ancestor ->
            addConverter(className, ancestor)
        }
}

private fun FileSpec.Builder.addConverter(className: ClassName, ancestor: String) {
    val (ancestorNamespaceName, ancestorClassName) = ancestor.split(".")
    val ancestorPackageName = "${GNOME_PACKAGE}.${ancestorNamespaceName.toLowerCase()}"
    val ancestorUniqueClassName = if (ancestorClassName == "Object" && ancestorNamespaceName != "GObject") "$ancestorNamespaceName$ancestorClassName" else ancestorClassName
    addProperty(
        PropertySpec.builder("as$ancestorUniqueClassName", ClassName(ancestorPackageName, ancestorClassName))
            .receiver(className)
            .getter(
                FunSpec.getterBuilder()
                    .addStatement("return %M()", reinterpretMemberName)
                    .build()
            )
            .build()
    )
}
