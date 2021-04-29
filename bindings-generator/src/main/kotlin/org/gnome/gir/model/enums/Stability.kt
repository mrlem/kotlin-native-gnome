package org.gnome.gir.model.enums

/**
 * GIR element stability.
 */
enum class Stability {
    Stable,
    Unstable,
    Private;

    companion object {
        fun fromName(name: String?) = values().firstOrNull { name.equals(it.name, true) }
    }
}
