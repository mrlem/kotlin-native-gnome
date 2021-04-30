// TODO - constructor: new_from_stock
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToggleToolButton
import interop.gtk_toggle_tool_button_get_active
import interop.gtk_toggle_tool_button_new
import interop.gtk_toggle_tool_button_set_active
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public val ToggleToolButton.parent: ToolButton
  get() = pointed.parent.ptr

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
