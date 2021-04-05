package org.mrlem.gir.xml

import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler
import java.util.*

class GirHandler  : DefaultHandler() {
    private val classesByParent = mutableMapOf<String, MutableList<ClassInfo>>()

    // current state
    private var classInfo: ClassInfo? = null
    private var classDocProcessed = false

    val info = GirInfo()

    override fun startElement(uri: String?, localName: String?, qName: String?, attributes: Attributes?) {
        when (qName) {
            "class" -> {
                attributes?.let {
                    val cType = attributes.getValue("c:type") ?: return@let
                    val parent = attributes.getValue("parent") ?: return@let
                    classInfo = ClassInfo(
                        attributes.getValue("name"),
                        cType,
                        parent,
                        isExcluded = cType == "GtkSocket" || cType == "GtkPlug" || parent.contains("Atk") // FIXME
                    )
                    classDocProcessed = false
                }
            }
            "doc" -> {
                attributes?.let {
                    classInfo
                        ?.takeUnless { classDocProcessed || it.isExcluded }
                        // FIXME - why the hell is misc flagged as deprecated while being used in label??
                        ?.takeIf { attributes.getValue("filename").contains("deprecated") && classInfo?.name != "Misc" }
                        ?.apply {
                            isExcluded = true
                        }
                    classDocProcessed = true
                }
            }
        }
    }

    override fun endElement(uri: String?, localName: String?, qName: String?) {
        when (qName) {
            "class" -> {
                classInfo
                    ?.takeUnless { it.isExcluded }
                    ?.let { classInfo ->
                        val siblings = classesByParent[classInfo.parent]
                            ?: mutableListOf<ClassInfo>()
                                .also { classesByParent[classInfo.parent] = it }
                        siblings.add(classInfo)
                    }

                classInfo = null
            }
        }
    }

    override fun endDocument() {
        val stack: Stack<String> = Stack()

        // all parents with a . are non-GTK classes: they serve as roots for GTK classes
        classesByParent
            .keys
            .filter { it.contains(".") }
            .forEach { walkTree(it, stack) }
    }

    private fun walkTree(parent: String, stack: Stack<String>) {
        stack.push(parent)
        classesByParent[parent]?.forEach { classInfo ->
            info.typesAndAncestors[classInfo] = stack.toList()
            walkTree(classInfo.name, stack)
        }
        stack.pop()
    }
}
