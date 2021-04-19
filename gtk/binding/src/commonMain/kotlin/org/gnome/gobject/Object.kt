package org.gnome.gobject

import gtk3.GObject
import gtk3.g_signal_connect_data
import gtk3.gpointer
import kotlinx.cinterop.*

///////////////////////////////////////////////////////////////////////////
// Type
///////////////////////////////////////////////////////////////////////////

typealias Object = CPointer<GObject>

///////////////////////////////////////////////////////////////////////////
// Public API
///////////////////////////////////////////////////////////////////////////

fun Object.connect(name: String, function: () -> Unit) {
    g_signal_connect_data(this, name, staticCFunction { _: COpaquePointer?, data: gpointer? ->
        data?.asStableRef<() -> Unit>()?.get()?.let { it() }
        @Suppress("USELESS_CAST")
        null as COpaquePointer? // needed to prevent compiler crash
    }
        .reinterpret(), StableRef.create(function).asCPointer(), null, 0.convert())
}

///////////////////////////////////////////////////////////////////////////
// Events handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun Object.onActivate(onActivate: (Object) -> Unit): Object {
    connect("activate") { onActivate(this) }
    return this
}
