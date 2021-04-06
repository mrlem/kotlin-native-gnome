// TODO - implement:
//   get_icon_widget
//   get_label_widget
//   set_icon_widget
//   set_label_widget
package org.gnome.gtk

import gtk3.GtkToolButton
import gtk3.gtk_tool_button_get_icon_name
import gtk3.gtk_tool_button_get_label
import gtk3.gtk_tool_button_get_stock_id
import gtk3.gtk_tool_button_get_use_underline
import gtk3.gtk_tool_button_set_icon_name
import gtk3.gtk_tool_button_set_label
import gtk3.gtk_tool_button_set_stock_id
import gtk3.gtk_tool_button_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

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

public var ToolButton.iconName: String?
  get() = gtk_tool_button_get_icon_name(this).toKString
  set(`value`) {
    gtk_tool_button_set_icon_name(this, value)
  }

public var ToolButton.label: String?
  get() = gtk_tool_button_get_label(this).toKString
  set(`value`) {
    gtk_tool_button_set_label(this, value)
  }

public var ToolButton.stockId: String?
  get() = gtk_tool_button_get_stock_id(this).toKString
  set(`value`) {
    gtk_tool_button_set_stock_id(this, value)
  }

public var ToolButton.useUnderline: Boolean
  get() = gtk_tool_button_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_tool_button_set_use_underline(this, value.toInt)
  }

///////////////////////////////////////////////////////////////////////////
// Event handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun ToolButton.onClick(onClick: (ToolButton) -> Unit): ToolButton {
  asInitiallyUnowned.asObject.connect("clicked") { onClick(this) }
  return this
}
