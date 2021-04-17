package org.gnome.gir.parser

import org.w3c.dom.Node

///////////////////////////////////////////////////////////////////////////
// DOM utils
///////////////////////////////////////////////////////////////////////////

internal inline fun Node.forEach(onItem: (Node) -> Unit) {
    for (i in 0 until childNodes.length) {
        childNodes.item(i)
            .takeIf { it.nodeType == Node.ELEMENT_NODE }
            ?.let { onItem(it) }
    }
}

internal fun Node.all(name: String): List<Node> {
    val nodes = mutableListOf<Node>()
    forEach { node -> if (node.nodeName == name) { nodes += node } }
    return nodes
}

internal fun Node.firstOrNull(vararg name: String): Node? {
    forEach { node ->
        node
            .takeIf { name.isEmpty() || name.contains(it.nodeName) }
            ?.let { return it }
    }
    return null
}

internal val Node.text
    get() = firstChild
        .takeIf { it.nodeType == Node.TEXT_NODE }
        ?.textContent
        .orEmpty()

internal operator fun Node?.get(name: String): String? =
    this?.attributes?.getNamedItem(name)?.textContent

internal fun Node.error(message: String) = Exception("${this.nodeName} '${this["name"]}' failed: $message")
