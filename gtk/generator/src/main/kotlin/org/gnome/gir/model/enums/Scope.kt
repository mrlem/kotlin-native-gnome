package org.gnome.gir.model.enums

enum class Scope {
    Notified,
    Async,
    Call;

    companion object {
        fun fromName(name: String?) = values().firstOrNull { name.equals(it.name, true) }
    }
}
