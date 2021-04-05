package org.mrlem.gir.xml

data class GirInfo(
    val typesAndAncestors: MutableMap<ClassInfo, List<String>> = mutableMapOf()
    // TODO - more data about constructors, vals, vars and methods
)
