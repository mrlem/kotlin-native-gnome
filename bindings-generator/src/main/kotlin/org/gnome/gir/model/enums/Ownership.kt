package org.gnome.gir.model.enums

enum class Ownership {
    None,
    Container,
    Full;

    companion object {
        fun fromName(name: String?) = values().firstOrNull { name.equals(it.name, true) }
    }
}
