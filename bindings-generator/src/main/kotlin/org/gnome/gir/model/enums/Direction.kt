package org.gnome.gir.model.enums

enum class Direction {
    Out,
    In,
    InOut;

    companion object {
        fun fromName(name: String?) = values().firstOrNull { name.equals(it.name, true) }
    }
}
