package org.gnome.gtk

import gtk3.GtkSwitch
import gtk3.gtk_switch_get_active
import gtk3.gtk_switch_get_state
import gtk3.gtk_switch_set_active
import gtk3.gtk_switch_set_state
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias Switch = CPointer<GtkSwitch>

public val Switch.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Switch.asWidget: Widget
  get() = reinterpret()

public var Switch.active: Boolean
  get() = gtk_switch_get_active(this).toBoolean
  set(`value`) {
    gtk_switch_set_active(this, value.toInt)
  }

public var Switch.state: Boolean
  get() = gtk_switch_get_state(this).toBoolean
  set(`value`) {
    gtk_switch_set_state(this, value.toInt)
  }
