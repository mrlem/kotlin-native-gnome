package org.gnome.gir.generator.kotlin

import org.gnome.gir.generator.kotlin.generators.toFileSpec
import org.gnome.gir.model.RepositoryDefinition
import org.gnome.gir.resolver.Resolver
import java.io.File

object BindingGenerator {

    fun generate(repository: RepositoryDefinition, destination: File) {
        val resolver = Resolver(repository)
        repository.namespaces.forEach { namespace ->
            namespace.apply {
                val fileSpecs = classes.mapNotNull { it.toFileSpec(namespace, resolver) } +
                        enums.mapNotNull { it.toFileSpec(namespace) } +
                        bitFields.mapNotNull { it.toFileSpec(namespace) } +
                        aliases.mapNotNull { it.toFileSpec(namespace) } +
                        records.mapNotNull { it.toFileSpec(namespace) } +
                        interfaces.mapNotNull { it.toFileSpec(namespace) } +
                        callbacks.mapNotNull { it.toFileSpec(namespace) }
                fileSpecs.forEach { it.writeTo(destination) }
            }
        }
    }

}
