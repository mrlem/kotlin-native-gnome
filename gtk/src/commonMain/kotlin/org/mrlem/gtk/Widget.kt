package org.mrlem.gtk

import gtk3.*
import kotlinx.cinterop.*

///////////////////////////////////////////////////////////////////////////
// Type
///////////////////////////////////////////////////////////////////////////

typealias Widget = CPointer<GtkWidget>

///////////////////////////////////////////////////////////////////////////
// Conversion
///////////////////////////////////////////////////////////////////////////

val Widget.asObject: Object
    get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API
///////////////////////////////////////////////////////////////////////////

var Widget.name
    get() = gtk_widget_get_name(this)?.toKString().orEmpty()
    set(value) = gtk_widget_set_name(this, value)

fun Widget.showAll() = gtk_widget_show_all(this)

fun Widget.destroy() = gtk_widget_destroy(this)
