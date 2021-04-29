package org.gnome.gir.parser

import org.w3c.dom.Document
import org.xml.sax.InputSource
import java.io.StringReader

import javax.xml.parsers.DocumentBuilderFactory

internal class XmlParser {

    private val factory = DocumentBuilderFactory.newInstance()

    fun parseResource(path: String): Document {
        val text = XmlParser::class.java.getResource(path).readText()
        return parseText(text)
    }

    private fun parseText(text: String): Document {
        val builder = factory.newDocumentBuilder()
        return builder.parse(InputSource(StringReader(text)))
    }

}
