// TODO - constructor: new_from_stock
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkToggleToolButton
import gtk3.gtk_toggle_tool_button_get_active
import gtk3.gtk_toggle_tool_button_new
import gtk3.gtk_toggle_tool_button_set_active
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt

public typealias ToggleToolButton = CPointer<GtkToggleToolButton>

public val ToggleToolButton.asObject: Object
  get() = reinterpret()

public val ToggleToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToggleToolButton.asWidget: Widget
  get() = reinterpret()

public val ToggleToolButton.asContainer: Container
  get() = reinterpret()

public val ToggleToolButton.asBin: Bin
  get() = reinterpret()

public val ToggleToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val ToggleToolButton.asToolButton: ToolButton
  get() = reinterpret()

public object ToggleToolButtonFactory {
  public fun new(): ToggleToolButton = gtk_toggle_tool_button_new()!!.reinterpret()
}

public var ToggleToolButton.active: Boolean
  get() = gtk_toggle_tool_button_get_active(this).toBoolean
  set(`value`) {
    gtk_toggle_tool_button_set_active(this, value.toInt)
  }

public fun ToggleToolButton.onToggled(callback: (ToggleToolButton) -> Unit): ToggleToolButton {
  // TODO - handle callback data

  asObject.connect("toggled") { callback(this) }
  return this
}
