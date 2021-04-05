package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Widget = CPointer<GtkWidget>

public val Widget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

var Widget.name
  get() = gtk_widget_get_name(this)?.toKString().orEmpty()
  set(value) = gtk_widget_set_name(this, value)

fun Widget.showAll() = gtk_widget_show_all(this)

fun Widget.destroy() = gtk_widget_destroy(this)
