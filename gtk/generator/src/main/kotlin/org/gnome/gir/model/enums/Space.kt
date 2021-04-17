package org.gnome.gir.model.enums

enum class Space {
    Preserve;

    companion object {
        fun fromName(name: String?) = values().firstOrNull { name.equals(it.name, true) }
    }
}
