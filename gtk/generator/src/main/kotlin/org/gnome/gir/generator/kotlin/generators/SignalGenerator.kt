package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.GOBJECT_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.snakeCaseToCamelCase
import org.gnome.gir.model.SignalDefinition

fun FileSpec.Builder.addSignal(className: ClassName, signal: SignalDefinition): FileSpec.Builder {
    addFunction(
        FunSpec.builder("on${signal.name.snakeCaseToCamelCase}")
            .receiver(className)
            .addComment("TODO - handle callback data\n")
            .returns(className)
            .addParameter("callback", LambdaTypeName.get(returnType = UNIT, parameters = arrayOf(className)))
            .addStatement(
                "asObject.%M(\"${signal.name}\") { callback(this) }",
                MemberName("org.mrlem.gnome.gobject", "connect")
            )
            .addStatement("return this")
            .build()
    )
    return this
}
