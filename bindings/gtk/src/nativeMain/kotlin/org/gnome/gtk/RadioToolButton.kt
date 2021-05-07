// TODO - constructor: new_from_stock
// TODO - constructor: new_with_stock_from_widget
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRadioToolButton
import interop.gtk_radio_tool_button_get_group
import interop.gtk_radio_tool_button_new
import interop.gtk_radio_tool_button_new_from_widget
import interop.gtk_radio_tool_button_set_group
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias RadioToolButton = CPointer<GtkRadioToolButton>

public val RadioToolButton.asObject: Object
  get() = reinterpret()

public val RadioToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioToolButton.asWidget: Widget
  get() = reinterpret()

public val RadioToolButton.asContainer: Container
  get() = reinterpret()

public val RadioToolButton.asBin: Bin
  get() = reinterpret()

public val RadioToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val RadioToolButton.asToolButton: ToolButton
  get() = reinterpret()

public val RadioToolButton.asToggleToolButton: ToggleToolButton
  get() = reinterpret()

public object RadioToolButtonFactory {
  public fun new(group: SList?): RadioToolButton =
      gtk_radio_tool_button_new(group?.reinterpret())!!.reinterpret()

  public fun newFromWidget(group: RadioToolButton?): RadioToolButton =
      gtk_radio_tool_button_new_from_widget(group?.reinterpret())!!.reinterpret()
}

public val RadioToolButton.parent: ToggleToolButton
  get() = pointed.parent.ptr

public var RadioToolButton.group: SList?
  get() = gtk_radio_tool_button_get_group(this)?.reinterpret()
  set(`value`) {
    gtk_radio_tool_button_set_group(this@group, `value`)
  }
