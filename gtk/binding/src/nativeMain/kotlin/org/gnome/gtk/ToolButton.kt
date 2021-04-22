// TODO - constructor: new_from_stock
// TODO - method: get_stock_id
// TODO - method: set_stock_id
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToolButton
import interop.gtk_tool_button_get_icon_name
import interop.gtk_tool_button_get_icon_widget
import interop.gtk_tool_button_get_label
import interop.gtk_tool_button_get_label_widget
import interop.gtk_tool_button_get_use_underline
import interop.gtk_tool_button_new
import interop.gtk_tool_button_set_icon_name
import interop.gtk_tool_button_set_icon_widget
import interop.gtk_tool_button_set_label
import interop.gtk_tool_button_set_label_widget
import interop.gtk_tool_button_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias ToolButton = CPointer<GtkToolButton>

public val ToolButton.asObject: Object
  get() = reinterpret()

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

public object ToolButtonFactory {
  public fun new(iconWidget: Widget?, label: String): ToolButton =
      gtk_tool_button_new(iconWidget?.reinterpret(), label)!!.reinterpret()
}

public var ToolButton.iconName: String
  get() = gtk_tool_button_get_icon_name(this).toKString
  set(`value`) {
    gtk_tool_button_set_icon_name(this, value)
  }

public var ToolButton.iconWidget: Widget?
  get() = gtk_tool_button_get_icon_widget(this)?.reinterpret()
  set(`value`) {
    gtk_tool_button_set_icon_widget(this, value)
  }

public var ToolButton.label: String
  get() = gtk_tool_button_get_label(this).toKString
  set(`value`) {
    gtk_tool_button_set_label(this, value)
  }

public var ToolButton.labelWidget: Widget?
  get() = gtk_tool_button_get_label_widget(this)?.reinterpret()
  set(`value`) {
    gtk_tool_button_set_label_widget(this, value)
  }

public var ToolButton.useUnderline: Boolean
  get() = gtk_tool_button_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_tool_button_set_use_underline(this, value.toInt)
  }

public fun ToolButton.onClicked(callback: (ToolButton) -> Unit): ToolButton {
  // TODO - handle callback data

  asObject.connect("clicked") { callback(this) }
  return this
}
