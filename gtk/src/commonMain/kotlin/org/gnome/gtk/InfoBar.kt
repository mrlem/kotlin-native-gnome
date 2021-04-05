package org.gnome.gtk

import gtk3.GtkInfoBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias InfoBar = CPointer<GtkInfoBar>

public val InfoBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val InfoBar.asWidget: Widget
  get() = reinterpret()

public val InfoBar.asContainer: Container
  get() = reinterpret()

public val InfoBar.asBox: Box
  get() = reinterpret()
