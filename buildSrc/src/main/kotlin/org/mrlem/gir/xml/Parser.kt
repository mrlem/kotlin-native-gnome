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
            .firstOrNull { ((it as? Node)?.name() as? QName)?.localPart == "namespace" }
            ?.let { it as? Node }
            ?.children()
            ?.mapNotNull { node -> (node as? Node)?.takeIf { (it.name() as? QName)?.localPart == "class" } }
            ?.mapNotNull(::nodeToClassDefinition)
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

    private fun nodeToClassDefinition(node: Node): ClassDefinition? {
        val className = node.attribute("name")?.toString() ?: return null
        val cType = node.attributes().keys
            .firstOrNull { (it as? QName)?.localPart == "type" }
            ?.let { node.attribute(it) }
            ?.toString() ?: return null
        val parent = node.attribute("parent")?.toString() ?: return null

        val isExcluded = cType == "GtkSocket" || cType == "GtkPlug" || parent.contains("Atk")
        if (isExcluded) return null

        val isDeprecated = node.children()
            // FIXME - why the hell is misc flagged as deprecated while being used in label??
            .takeUnless { className == "Misc" }
            ?.filterIsInstance<Node>()
            ?.firstOrNull { (it.name() as? QName)?.localPart == "source-position" }
            ?.attribute("filename")
            ?.toString()
            ?.contains("deprecated") == true
        if (isDeprecated) return null

        val members = node.children()
            .filterIsInstance<Node>()
            .mapNotNull { childNode -> childNode.takeIf { (it.name() as? QName)?.localPart == "method" } }
            .map { MemberDefinition.Todo(it.attribute("name").toString()) }
            .toMutableList<MemberDefinition>()

        return ClassDefinition(
            className,
            cType,
            parent,
            members = members
        )
    }

}
