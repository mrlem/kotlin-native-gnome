package org.gnome.gtk

import gtk3.GtkRadioMenuItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RadioMenuItem = CPointer<GtkRadioMenuItem>

public val RadioMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioMenuItem.asWidget: Widget
  get() = reinterpret()

public val RadioMenuItem.asContainer: Container
  get() = reinterpret()

public val RadioMenuItem.asBin: Bin
  get() = reinterpret()

public val RadioMenuItem.asMenuItem: MenuItem
  get() = reinterpret()

public val RadioMenuItem.asCheckMenuItem: CheckMenuItem
  get() = reinterpret()
