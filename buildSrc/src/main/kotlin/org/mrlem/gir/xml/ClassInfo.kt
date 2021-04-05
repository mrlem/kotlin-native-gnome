package org.mrlem.gir.xml

data class ClassInfo(
    val name: String,
    val cType: String,
    val parent: String,
    var isExcluded: Boolean
)
