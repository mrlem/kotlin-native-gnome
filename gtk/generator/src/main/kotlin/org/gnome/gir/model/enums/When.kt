package org.gnome.gir.model.enums

/**
 * GIR signal execution time.
 */
enum class When {
    First,
    Last,
    Cleanup;

    companion object {
        fun fromName(name: String?) = values().firstOrNull { name.equals(it.name, true) }
    }
}
