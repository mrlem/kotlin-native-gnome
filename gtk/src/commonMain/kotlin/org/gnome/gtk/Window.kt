package org.gnome.gtk

import gtk3.GtkWindow
import gtk3.gtk_window_get_title
import gtk3.gtk_window_set_default_size
import gtk3.gtk_window_set_title
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Window = CPointer<GtkWindow>

public val Window.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Window.asWidget: Widget
  get() = reinterpret()

public val Window.asContainer: Container
  get() = reinterpret()

public val Window.asBin: Bin
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

var Window.title
  get() = gtk_window_get_title(this)?.toKString().orEmpty()
  set(value) = gtk_window_set_title(this, value)

fun Window.setDefaultSize(width: Int, height: Int) = gtk_window_set_default_size(this, width, height)
