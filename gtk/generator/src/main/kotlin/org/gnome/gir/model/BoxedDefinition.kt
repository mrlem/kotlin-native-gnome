package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements

/**
 * GIR boxed.
 *
 * Boxed type (wrapper to opaque C structures registered by the type system).
 *
 * @property name GObject compatible type name of the boxed type.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property cSymbolPrefix TODO.
 * @property info boxed type info.
 * @property functions boxed type functions.
 */
data class BoxedDefinition(
    val name: String,
    val glibTypeName: String,
    val glibGetType: String,
    val cSymbolPrefix: String?,
    val info: InfoElements,
    val functions: List<CallableDefinition>
)
