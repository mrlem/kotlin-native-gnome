package org.gnome.gtk

import gtk3.GtkStatusbar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Statusbar = CPointer<GtkStatusbar>

public val Statusbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Statusbar.asWidget: Widget
  get() = reinterpret()

public val Statusbar.asContainer: Container
  get() = reinterpret()

public val Statusbar.asBox: Box
  get() = reinterpret()
