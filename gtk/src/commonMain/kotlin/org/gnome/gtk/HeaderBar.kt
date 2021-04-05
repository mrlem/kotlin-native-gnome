package org.gnome.gtk

import gtk3.GtkHeaderBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias HeaderBar = CPointer<GtkHeaderBar>

public val HeaderBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val HeaderBar.asWidget: Widget
  get() = reinterpret()

public val HeaderBar.asContainer: Container
  get() = reinterpret()
