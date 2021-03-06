package org.mrlem.gnome.glade.plugin.parser.xml

import groovy.util.Node
import groovy.util.XmlParser
import org.mrlem.gnome.glade.plugin.model.Widget

/**
 * Glade XML file parser: parses all named widgets.
 */
class Parser {

    /**
     * @param sourceText the glade XML source text.
     *
     * @return a list of all named widgets in the file.
     */
    fun parse(sourceText: String): List<Widget> {
        return XmlParser()
            .parseText(sourceText)
            .findAllNamedWidgets()
    }

    /**
     * Find all widgets in a node hierarchy.
     *
     * @param widgets the initial map of widget ids to class names.
     *
     * @return the resulting map of widget ids to class names.
     */
    private fun Node.findAllNamedWidgets(
        widgets: MutableList<Widget> = mutableListOf()
    ): List<Widget> {
        // check this node
        val idValue = attribute("id")?.toString()?.takeUnless { it.isEmpty() }
        val classValue = attribute("class")?.toString()?.takeUnless { it.isEmpty() }
        if (idValue != null && classValue != null) {
            widgets.add(Widget(idValue, classValue))
        }

        // check children nodes
        children().forEach { node ->
            (node as? Node)?.findAllNamedWidgets(widgets)
        }
        return widgets
    }

}
