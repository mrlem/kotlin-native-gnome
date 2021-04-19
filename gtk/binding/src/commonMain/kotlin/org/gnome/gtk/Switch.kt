package org.gnome.gtk

import gtk3.GtkSwitch
import gtk3.gtk_switch_get_active
import gtk3.gtk_switch_get_state
import gtk3.gtk_switch_set_active
import gtk3.gtk_switch_set_state
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Switch = CPointer<GtkSwitch>

public val Switch.asObject: Object
  get() = reinterpret()

public val Switch.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Switch.asWidget: Widget
  get() = reinterpret()

public fun Switch.getActive(): Boolean = gtk_switch_get_active(this).toBoolean

public fun Switch.getState(): Boolean = gtk_switch_get_state(this).toBoolean

public fun Switch.setActive(isActive: Boolean): Unit {
  gtk_switch_set_active(this, isActive.toInt)
}

public fun Switch.setState(state: Boolean): Unit {
  gtk_switch_set_state(this, state.toInt)
}
