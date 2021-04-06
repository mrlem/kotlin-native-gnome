package org.mrlem.gir.xml

import groovy.util.Node
import groovy.util.XmlParser
import groovy.xml.QName
import java.util.*

/**
 * GObject introspection (GIR) XML file parser: parses all defined classes.
 */
class Parser {

    /**
     * @param sourceText the GIR XML source text.
     *
     * @return a list of all defined classes in the file.
     */
    fun parse(sourceText: String): List<ClassDefinition> {
        return XmlParser()
            .parseText(sourceText)
            .findAllClassDefinitions()
    }

    private fun Node.findAllClassDefinitions(): List<ClassDefinition> {
        // list class definitions
        val definitions = children()
            .firstOrNull { ((it as? Node)?.nameMatches("namespace") == true) }
            ?.let { it as? Node }
            ?.children()
            ?.mapNotNull { node -> (node as? Node)?.takeIf { it.nameMatches("class") } }
            ?.mapNotNull { it.toClassDefinition() }
            .orEmpty()

        // determine parent -> children relations
        val classesByParent = mutableMapOf<String, MutableList<ClassDefinition>>()
        definitions.forEach { definition ->
            val siblings = classesByParent[definition.parent]
                ?: mutableListOf<ClassDefinition>()
                    .also { classesByParent[definition.parent] = it }
            siblings.add(definition)
        }

        // determine ancestors list: all parent class names with a '.' are considered root types
        val stack: Stack<String> = Stack()
        classesByParent
            .keys
            .filter { it.contains(".") }
            .forEach { populateAncestors(it, stack, classesByParent) }

        return definitions
            .filter { it.ancestors.isNotEmpty() }
    }

    private fun populateAncestors(root: String, ancestors: Stack<String>, classesByParent: Map<String, List<ClassDefinition>>) {
        ancestors.push(root)
        classesByParent[root]?.forEach { classDefinition ->
            classDefinition.ancestors.apply {
                clear()
                addAll(ancestors)
            }
            populateAncestors(classDefinition.name, ancestors, classesByParent)
        }
        ancestors.pop()
    }

    private fun Node.toClassDefinition(): ClassDefinition? {
        val name = name

        val cType = attributes().keys
            .firstOrNull { it?.nameMatches("type") == true }
            ?.let { attribute(it) }
            ?.toString() ?: return null
        val cPrefix = attributes().keys
            .firstOrNull { it?.nameMatches("symbol-prefix") == true }
            ?.let { attribute(it) }
            ?.toString() ?: return null
        val parent = attribute("parent")?.toString() ?: return null

        val isExcluded = cType == "GtkSocket" || cType == "GtkPlug" || parent.contains("Atk")
        if (isExcluded) return null

        val isDeprecated = children()
            // FIXME - why the hell is misc flagged as deprecated while being used in label??
            .takeUnless { name == "Misc" }
            ?.filterIsInstance<Node>()
            ?.firstOrNull { it.nameMatches("source-position") }
            ?.attribute("filename")
            ?.toString()
            ?.contains("deprecated") == true
        if (isDeprecated) return null

        // process method definitions
        val members = children()
            .filterIsInstance<Node>()
            .mapNotNull { childNode -> childNode.takeIf { it.nameMatches("method") } }
            .map { childNode -> childNode.toMemberDefinition() }
            .toMutableList()
        members.mergePropertyAccessors()

        // TODO - constructors
        // TODO - event handlers

        return ClassDefinition(
            name,
            cType,
            cPrefix,
            parent,
            members = members
        )
    }

    private fun Node.toMemberDefinition(): MemberDefinition {
        val childrenNodes = children()
            .filterIsInstance<Node>()
        val parameterNodes = childrenNodes
            .firstOrNull { it.nameMatches("parameters") }
            ?.children()
            ?.filterIsInstance<Node>()

        val returnType = childrenNodes
            .firstOrNull { it.nameMatches("return-value") }
            ?.type

        val instanceParameter = parameterNodes
            ?.firstOrNull { it.nameMatches("instance-parameter") }
        val parameters = parameterNodes
            ?.filter { it.nameMatches("parameter") }
            .orEmpty()

        val name = name
        val firstParameterType = parameters.firstOrNull()?.type
        return when {
            name.startsWith(GETTER_PREFIX) && instanceParameter != null && parameters.isEmpty() && returnType != null ->
                MemberDefinition.PropertyGetter(name.removePrefix(GETTER_PREFIX), returnType)
            name.startsWith(SETTER_PREFIX) && instanceParameter != null && parameters.size == 1 && firstParameterType != null ->
                MemberDefinition.PropertySetter(name.removePrefix(SETTER_PREFIX), firstParameterType)
            // TODO - method
            else -> MemberDefinition.Todo(name)
        }
    }

    private fun MutableList<MemberDefinition>.mergePropertyAccessors() {
        // convert all getter+setter combinations to read-write properties
        filterIsInstance<MemberDefinition.PropertySetter>()
            .forEach { propertySetter ->
                remove(propertySetter)

                val propertyName = propertySetter.name
                val propertyGetter = firstOrNull { it is MemberDefinition.PropertyGetter && it.name == propertyName }
                val property = if (propertyGetter != null) {
                    remove(propertyGetter)
                    MemberDefinition.Property(propertySetter.name, false, propertySetter.type)
                } else {
                    // TODO - method
                    MemberDefinition.Todo("$SETTER_PREFIX${propertySetter.name}")
                }

                add(property)
            }

        // replace remaining getters to read-onle properties
        val getters = filterIsInstance<MemberDefinition.PropertyGetter>()
        removeAll(getters)
        addAll(getters.map { MemberDefinition.Property(it.name, true, it.type) })
    }

    private val Node.name
        get() = attribute("name").toString()

    private fun Any.nameMatches(name: String): Boolean = when (this) {
        is String -> this == name
        is QName -> localPart == name
        is Node -> name().nameMatches(name)
        else -> false
    }

    private val Node.type
        get() = children()
            .filterIsInstance<Node>()
            .firstOrNull { it.nameMatches("type") }
            ?.name
            ?.let { Type.fromName(it) }

    companion object {
        const val GETTER_PREFIX = "get_"
        const val SETTER_PREFIX = "set_"
    }

}
