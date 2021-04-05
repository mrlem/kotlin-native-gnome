package org.gnome.gtk

import gtk3.GtkGrid
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Grid = CPointer<GtkGrid>

public val Grid.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Grid.asWidget: Widget
  get() = reinterpret()

public val Grid.asContainer: Container
  get() = reinterpret()
