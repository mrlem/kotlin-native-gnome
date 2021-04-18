package org.gnome.gir.resolver

import org.gnome.gir.model.ClassDefinition
import org.gnome.gir.model.NamespaceDefinition
import org.gnome.gir.model.RepositoryDefinition
import java.util.*

class Resolver(repository: RepositoryDefinition) {

    private val classesInfo = mutableMapOf<String, ClassInfo>()
    // TODO - functions

    init {
        // add all classes
        repository.namespaces.forEach { namespace ->
            namespace.classes.forEach {
                classesInfo["${namespace.name}.${it.name}"] = ClassInfo(it, namespace, emptyList())
            }
        }

        // resolve ancestors
        classesInfo.forEach { (_, classInfo) ->
            val ancestors = Stack<String>()
            classInfo.resolveAncestors(ancestors)
            classInfo.ancestors = ancestors
        }
    }

    fun ancestors(className: String) = classesInfo[className]?.ancestors

    private fun ClassInfo.resolveAncestors(ancestors: Stack<String>) {
        val parent = definition.parent
            ?.let {
                if (it.contains('.')) it else "${namespace.name}.$it" }
            ?: return
        ancestors.push(parent)

        // walk recursively
        classesInfo[parent]?.resolveAncestors(ancestors)
    }

    private data class ClassInfo(
        val definition: ClassDefinition,
        val namespace: NamespaceDefinition,
        var ancestors: List<String>
    )
}
