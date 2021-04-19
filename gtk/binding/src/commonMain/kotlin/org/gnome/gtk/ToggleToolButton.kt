package org.gnome.gtk

import gtk3.GtkToggleToolButton
import gtk3.gtk_toggle_tool_button_get_active
import gtk3.gtk_toggle_tool_button_set_active
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
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

public fun ToggleToolButton.getActive(): Boolean = gtk_toggle_tool_button_get_active(this).toBoolean

public fun ToggleToolButton.setActive(isActive: Boolean): Unit {
  gtk_toggle_tool_button_set_active(this, isActive.toInt)
}
