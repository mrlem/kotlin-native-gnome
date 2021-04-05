package org.gnome.gtk

import gtk3.GtkBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Box = CPointer<GtkBox>

public val Box.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Box.asWidget: Widget
  get() = reinterpret()

public val Box.asContainer: Container
  get() = reinterpret()
