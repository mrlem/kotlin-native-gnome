package org.gnome.gtk

import gtk3.GtkLevelBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias LevelBar = CPointer<GtkLevelBar>

public val LevelBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LevelBar.asWidget: Widget
  get() = reinterpret()
