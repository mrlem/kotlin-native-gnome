package org.mrlem.gnome.gobject

import interop.g_signal_connect_data
import interop.gpointer
import kotlinx.cinterop.*
import org.gnome.gobject.Object

fun Object.connect(name: String, function: () -> Unit) {
    g_signal_connect_data(this, name, staticCFunction { _: COpaquePointer?, data: gpointer? ->
        data?.asStableRef<() -> Unit>()?.get()?.let { it() }
        @Suppress("USELESS_CAST")
        null as COpaquePointer? // needed to prevent compiler crash
    }
        .reinterpret(), StableRef.create(function).asCPointer(), null, 0.convert())
}
