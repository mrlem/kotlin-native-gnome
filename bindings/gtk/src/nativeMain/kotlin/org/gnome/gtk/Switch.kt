@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSwitch
import interop.gtk_switch_get_active
import interop.gtk_switch_get_state
import interop.gtk_switch_new
import interop.gtk_switch_set_active
import interop.gtk_switch_set_state
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias Switch = CPointer<GtkSwitch>

public val Switch.asObject: Object
  get() = reinterpret()

public val Switch.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Switch.asWidget: Widget
  get() = reinterpret()

public object SwitchFactory {
  public fun new(): Switch = gtk_switch_new()!!.reinterpret()
}

public var Switch.active: Boolean
  get() = gtk_switch_get_active(this).toBoolean()
  set(`value`) {
    gtk_switch_set_active(this@active, `value`.toInt())
  }

public var Switch.state: Boolean
  get() = gtk_switch_get_state(this).toBoolean()
  set(`value`) {
    gtk_switch_set_state(this@state, `value`.toInt())
  }

public fun Switch.onActivate(callback: (Switch) -> Unit): Switch {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}

public fun Switch.onStateSet(callback: (Switch) -> Unit): Switch {
  // TODO - handle callback data

  asObject.connect("state-set") { callback(this) }
  return this
}
