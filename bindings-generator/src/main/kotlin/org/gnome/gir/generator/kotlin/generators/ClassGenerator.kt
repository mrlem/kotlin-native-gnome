package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.*
import org.gnome.gir.model.*
import org.gnome.gir.parser.Fixer.fix
import org.gnome.gir.resolver.Resolver

fun ClassDefinition.toFileSpec(namespace: NamespaceDefinition, resolver: Resolver): FileSpec? {
    val classNameString = "${namespace.name}.$name"
    val className = classNameString.toClassName
    val packageName = namespace.packageName
    val ancestors = resolver.ancestors(classNameString)
    val glibTypeName = fix(glibTypeName)

    // filter out some classes
    when {
        deprecated && classNameString != "Gtk.Misc" -> return null
        // FIXME - Factory naming clash
        className.simpleName == "NoOpObjectFactory" -> {
            println("info: class '$name' ignored: naming clash")
            return null
        }
        // FIXME - Misc is annoying: deprecated, but not its children, try figure that out
        ancestors.any { it != "Gtk.Misc" && resolver.classDefinition(it)?.deprecated == true } -> {
            println("info: class '$name' ignored: deprecated ancestor")
            return null
        }
        // TODO - problematic classes: use gpointer
        arrayOf("Gio.Task", "Gio.MemoryOutputStream", "Gtk.EntryIconAccessible", "Gtk.HeaderBarAccessible").contains(classNameString) -> {
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
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, cpointerClassName.plusParameter(ClassName(INTEROP_PACKAGE, glibTypeName)))
                .build()
        )
        .addConverters(classNameString, className, resolver)
        .addConstructors(constructors, className, resolver)
        .addFields(className, fields, resolver)
        .addMethods(className, methods, resolver)
        .addSignals(className, signals)
        .build()
}

///////////////////////////////////////////////////////////////////////////
// Private
///////////////////////////////////////////////////////////////////////////

private fun FileSpec.Builder.addConverters(classNameString: String, className: ClassName, resolver: Resolver): FileSpec.Builder {
    resolver.ancestors(classNameString)
        .reversed()
        .forEach { ancestor ->
            addConverter(className, ancestor)
        }
    return this
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

private fun FileSpec.Builder.addConstructors(constructors: List<CallableDefinition>, className: ClassName, resolver: Resolver): FileSpec.Builder {
    if (constructors.isNotEmpty()) {
        addType(
            TypeSpec.objectBuilder("${className.simpleName}Factory")
                .apply { constructors.forEach { addConstructor(className, it, this@addConstructors, resolver) } }
                .build()
        )
    }

    return this
}

private fun FileSpec.Builder.addFields(className: ClassName, fields: List<FieldDefinition>, resolver: Resolver): FileSpec.Builder {
    fields.forEach { addField( className, it, resolver) }

    return this
}

private fun FileSpec.Builder.addMethods(className: ClassName, methods: List<CallableDefinition>, resolver: Resolver): FileSpec.Builder {
    val methodsToAdd = methods.toMutableList()
    addProperties(methodsToAdd, className, resolver)
    methodsToAdd.forEach { addMethod(className, it, resolver) }

    return this
}

private fun FileSpec.Builder.addSignals(className: ClassName, signals: List<SignalDefinition>): FileSpec.Builder {
    signals.forEach { addSignal(className, it) }

    return this
}
