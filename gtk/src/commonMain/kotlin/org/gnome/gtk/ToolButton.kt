// TODO - implement:
//   get_icon_name
//   get_icon_widget
//   get_label
//   get_label_widget
//   get_stock_id
//   get_use_underline
//   set_icon_name
//   set_icon_widget
//   set_label
//   set_label_widget
//   set_stock_id
//   set_use_underline
package org.gnome.gtk

import gtk3.GtkToolButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect

public typealias ToolButton = CPointer<GtkToolButton>

public val ToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolButton.asWidget: Widget
  get() = reinterpret()

public val ToolButton.asContainer: Container
  get() = reinterpret()

public val ToolButton.asBin: Bin
  get() = reinterpret()

public val ToolButton.asToolItem: ToolItem
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Event handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun ToolButton.onClick(onClick: (ToolButton) -> Unit): ToolButton {
  asInitiallyUnowned.asObject.connect("clicked") { onClick(this) }
  return this
}
