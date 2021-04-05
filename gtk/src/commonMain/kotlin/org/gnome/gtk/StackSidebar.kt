package org.gnome.gtk

import gtk3.GtkStackSidebar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias StackSidebar = CPointer<GtkStackSidebar>

public val StackSidebar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val StackSidebar.asWidget: Widget
  get() = reinterpret()

public val StackSidebar.asContainer: Container
  get() = reinterpret()

public val StackSidebar.asBin: Bin
  get() = reinterpret()
