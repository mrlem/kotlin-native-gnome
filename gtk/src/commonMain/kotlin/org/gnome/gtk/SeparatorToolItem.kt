// TODO - implement:
//   get_draw
//   set_draw
package org.gnome.gtk

import gtk3.GtkSeparatorToolItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias SeparatorToolItem = CPointer<GtkSeparatorToolItem>

public val SeparatorToolItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SeparatorToolItem.asWidget: Widget
  get() = reinterpret()

public val SeparatorToolItem.asContainer: Container
  get() = reinterpret()

public val SeparatorToolItem.asBin: Bin
  get() = reinterpret()

public val SeparatorToolItem.asToolItem: ToolItem
  get() = reinterpret()
