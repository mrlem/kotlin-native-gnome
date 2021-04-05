package org.gnome.gtk

import gtk3.GtkMenuToolButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias MenuToolButton = CPointer<GtkMenuToolButton>

public val MenuToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuToolButton.asWidget: Widget
  get() = reinterpret()

public val MenuToolButton.asContainer: Container
  get() = reinterpret()

public val MenuToolButton.asBin: Bin
  get() = reinterpret()

public val MenuToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val MenuToolButton.asToolButton: ToolButton
  get() = reinterpret()
