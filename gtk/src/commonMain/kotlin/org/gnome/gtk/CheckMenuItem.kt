package org.gnome.gtk

import gtk3.GtkCheckMenuItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CheckMenuItem = CPointer<GtkCheckMenuItem>

public val CheckMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CheckMenuItem.asWidget: Widget
  get() = reinterpret()

public val CheckMenuItem.asContainer: Container
  get() = reinterpret()

public val CheckMenuItem.asBin: Bin
  get() = reinterpret()

public val CheckMenuItem.asMenuItem: MenuItem
  get() = reinterpret()