package org.gnome.gtk

import gtk3.GtkSeparatorMenuItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias SeparatorMenuItem = CPointer<GtkSeparatorMenuItem>

public val SeparatorMenuItem.asObject: Object
  get() = reinterpret()

public val SeparatorMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SeparatorMenuItem.asWidget: Widget
  get() = reinterpret()

public val SeparatorMenuItem.asContainer: Container
  get() = reinterpret()

public val SeparatorMenuItem.asBin: Bin
  get() = reinterpret()

public val SeparatorMenuItem.asMenuItem: MenuItem
  get() = reinterpret()
