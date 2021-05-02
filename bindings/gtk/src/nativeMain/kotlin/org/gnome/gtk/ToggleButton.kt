@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToggleButton
import interop.gtk_toggle_button_get_active
import interop.gtk_toggle_button_get_inconsistent
import interop.gtk_toggle_button_get_mode
import interop.gtk_toggle_button_new
import interop.gtk_toggle_button_new_with_label
import interop.gtk_toggle_button_new_with_mnemonic
import interop.gtk_toggle_button_set_active
import interop.gtk_toggle_button_set_inconsistent
import interop.gtk_toggle_button_set_mode
import interop.gtk_toggle_button_toggled
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias ToggleButton = CPointer<GtkToggleButton>

public val ToggleButton.asObject: Object
  get() = reinterpret()

public val ToggleButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToggleButton.asWidget: Widget
  get() = reinterpret()

public val ToggleButton.asContainer: Container
  get() = reinterpret()

public val ToggleButton.asBin: Bin
  get() = reinterpret()

public val ToggleButton.asButton: Button
  get() = reinterpret()

public object ToggleButtonFactory {
  public fun new(): ToggleButton = gtk_toggle_button_new()!!.reinterpret()

  public fun newWithLabel(label: String): ToggleButton =
      gtk_toggle_button_new_with_label(label)!!.reinterpret()

  public fun newWithMnemonic(label: String): ToggleButton =
      gtk_toggle_button_new_with_mnemonic(label)!!.reinterpret()
}

public var ToggleButton.active: Boolean
  get() = gtk_toggle_button_get_active(this).toBoolean()
  set(`value`) {
    gtk_toggle_button_set_active(this, `value`.toInt())
  }

public var ToggleButton.inconsistent: Boolean
  get() = gtk_toggle_button_get_inconsistent(this).toBoolean()
  set(`value`) {
    gtk_toggle_button_set_inconsistent(this, `value`.toInt())
  }

public var ToggleButton.mode: Boolean
  get() = gtk_toggle_button_get_mode(this).toBoolean()
  set(`value`) {
    gtk_toggle_button_set_mode(this, `value`.toInt())
  }

public fun ToggleButton.toggled(): Unit {
  gtk_toggle_button_toggled(this)
}

public fun ToggleButton.onToggled(callback: (ToggleButton) -> Unit): ToggleButton {
  // TODO - handle callback data

  asObject.connect("toggled") { callback(this) }
  return this
}
