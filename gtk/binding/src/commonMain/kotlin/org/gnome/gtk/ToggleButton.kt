// TODO - signal: toggled
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkToggleButton
import gtk3.gtk_toggle_button_get_active
import gtk3.gtk_toggle_button_get_inconsistent
import gtk3.gtk_toggle_button_get_mode
import gtk3.gtk_toggle_button_set_active
import gtk3.gtk_toggle_button_set_inconsistent
import gtk3.gtk_toggle_button_set_mode
import gtk3.gtk_toggle_button_toggled
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public var ToggleButton.active: Boolean
  get() = gtk_toggle_button_get_active(this).toBoolean
  set(`value`) {
    gtk_toggle_button_set_active(this, value.toInt)
  }

public var ToggleButton.inconsistent: Boolean
  get() = gtk_toggle_button_get_inconsistent(this).toBoolean
  set(`value`) {
    gtk_toggle_button_set_inconsistent(this, value.toInt)
  }

public var ToggleButton.mode: Boolean
  get() = gtk_toggle_button_get_mode(this).toBoolean
  set(`value`) {
    gtk_toggle_button_set_mode(this, value.toInt)
  }

public fun ToggleButton.toggled(): Unit {
  gtk_toggle_button_toggled(this)
}
