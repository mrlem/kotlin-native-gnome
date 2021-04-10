package org.mrlem.gnome.gir.parser.xml

import groovy.util.Node
import groovy.util.XmlParser
import groovy.xml.QName
import org.mrlem.gnome.gir.model.ClassDefinition
import org.mrlem.gnome.gir.model.EnumDefinition
import org.mrlem.gnome.gir.model.MemberDefinition
import org.mrlem.gnome.gir.model.RecordDefinition
import org.mrlem.gnome.gir.model.TopLevelDefinition
import org.mrlem.gnome.gir.model.Type
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
    fun parse(sourceText: String): List<TopLevelDefinition> {
        return XmlParser()
            .parseText(sourceText)
            .findAllTopLevelDefinitions()
    }

    private fun Node.findAllTopLevelDefinitions(): List<TopLevelDefinition> {
        // list class definitions
        val definitions = children()
            .firstOrNull { ((it as? Node)?.nameMatches("namespace") == true) }
            ?.let { it as? Node }
            ?.children()
            ?.mapNotNull { node ->
                when {
                    node !is Node -> null
                    node.nameMatches("enumeration") -> node.toEnumDefinition()
                    node.nameMatches("class") -> node.toClassDefinition()
                    node.nameMatches("record") -> node.toRecordDefinition()
                    else -> null
                }
            }
            .orEmpty()

        // determine parent -> children relations
        val classesByParent = mutableMapOf<String, MutableList<ClassDefinition>>()
        definitions
            .filterIsInstance<ClassDefinition>()
            .forEach { definition ->
                val siblings = classesByParent[definition.parent]
                    ?: mutableListOf<ClassDefinition>()
                        .also { classesByParent[definition.parent] = it }
                siblings.add(definition)
            }

        // determine ancestors list: all parent class names with a '.' are considered root types
        val stack: Stack<String> = Stack()
        classesByParent["GObject.Object"]?.apply {
            add(ClassDefinition("GObject.InitiallyUnowned", "", "", "GObject.Object"))
            add(ClassDefinition("Gio.Application", "", "", "GObject.Object"))
            add(ClassDefinition("Gio.MountOperation", "", "", "GObject.Object"))
        }
        populateAncestors("GObject.Object", stack, classesByParent)

        return definitions
            .filter { it !is ClassDefinition || it.ancestors.isNotEmpty() }
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

    private fun Node.toEnumDefinition(): EnumDefinition? {
        val name = name

        val isExcluded = name == "ExpanderStyle"
        if (isExcluded) return null

        val deprecated = attributes().keys
            .firstOrNull { it?.nameMatches("deprecated") == true }
            ?.let { attribute(it) }
            .let { it == "1" }
        if (deprecated) return null

        val glibTypeName = attributes().keys
            .firstOrNull { it?.nameMatches("type-name") == true }
            ?.let { attribute(it) }
            ?.toString() ?: return null

        return EnumDefinition(
            name,
            glibTypeName
        )
    }

    private fun Node.toRecordDefinition(): RecordDefinition? {
        val name = name

        val isExcluded = name == "Gradient" || name == "SymbolicColor"
        if (isExcluded) return null

        val deprecated = attributes().keys
            .firstOrNull { it?.nameMatches("deprecated") == true }
            ?.let { attribute(it) }
            .let { it == "1" }
        if (deprecated) return null

        val glibTypeName = attributes().keys
            .firstOrNull { it?.nameMatches("type-name") == true }
            ?.let { attribute(it) }
            ?.toString() ?: return null

        return RecordDefinition(
            name,
            glibTypeName
        )
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

        val functionName = attributes().keys
            .firstOrNull { it?.nameMatches("identifier") == true }
            ?.let { attribute(it) }
            ?.toString()

        val deprecated = attributes().keys
            .firstOrNull { it?.nameMatches("deprecated") == true }
            ?.let { attribute(it) }
            .let { it == "1" }

        val throws = attributes().keys
            .firstOrNull { it?.nameMatches("throws") == true }
            ?.let { attribute(it) }
            .let { it == "1" }

        val name = name
        val firstParameterType = parameters.firstOrNull()?.type
        return when {
            name.startsWith(GETTER_PREFIX) && instanceParameter != null && parameters.isEmpty() && returnType != null && functionName != null ->
                MemberDefinition.PropertyGetter(name.removePrefix(GETTER_PREFIX), deprecated, returnType, functionName)
            name.startsWith(SETTER_PREFIX) && instanceParameter != null && parameters.size == 1 && firstParameterType != null && functionName != null ->
                MemberDefinition.PropertySetter(name.removePrefix(SETTER_PREFIX), deprecated, firstParameterType, functionName)
            // TODO - all methods (not just those with no param)
            parameters.isEmpty() && functionName != null && !throws -> MemberDefinition.Method(name, deprecated, throws, returnType, functionName)
            else -> MemberDefinition.Todo(name)
        }
    }

    private fun MutableList<MemberDefinition>.mergePropertyAccessors() {
        // convert all getter+setter combinations to read-write properties
        filterIsInstance<MemberDefinition.PropertySetter>()
            .forEach { propertySetter ->
                remove(propertySetter)

                val propertyName = propertySetter.name
                val propertyGetter = firstOrNull { it is MemberDefinition.PropertyGetter && it.name == propertyName } as? MemberDefinition.PropertyGetter
                val property = if (propertyGetter != null) {
                    remove(propertyGetter)
                    MemberDefinition.Property(propertySetter.name, propertySetter.type, propertyGetter.functionName, propertySetter.functionName)
                } else {
                    // TODO - method
                    MemberDefinition.Todo("$SETTER_PREFIX${propertySetter.name}")
                }

                add(property)
            }

        // replace remaining getters to read-only properties
        val getters = filterIsInstance<MemberDefinition.PropertyGetter>()
        removeAll(getters)
        addAll(getters.map { MemberDefinition.Property(it.name, it.type, it.functionName, null) })
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