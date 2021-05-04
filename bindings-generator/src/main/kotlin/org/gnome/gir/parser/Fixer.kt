package org.gnome.gir.parser

// TODO - merge in RepositoryFixer
object Fixer {

    fun fix(name: String) = when {
        name.startsWith("GParam") -> name.replace("GParam", "GParamSpec")
        else -> name
    }

}
