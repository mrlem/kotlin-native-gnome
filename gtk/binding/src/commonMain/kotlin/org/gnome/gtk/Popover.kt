// TODO - method: bind_model
// TODO - method: get_pointing_to
// TODO - method: get_transitions_enabled
// TODO - method: set_pointing_to
// TODO - method: set_transitions_enabled
// TODO - signal: closed
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkPopover
import gtk3.gtk_popover_get_constrain_to
import gtk3.gtk_popover_get_default_widget
import gtk3.gtk_popover_get_modal
import gtk3.gtk_popover_get_position
import gtk3.gtk_popover_get_relative_to
import gtk3.gtk_popover_popdown
import gtk3.gtk_popover_popup
import gtk3.gtk_popover_set_constrain_to
import gtk3.gtk_popover_set_default_widget
import gtk3.gtk_popover_set_modal
import gtk3.gtk_popover_set_position
import gtk3.gtk_popover_set_relative_to
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Popover = CPointer<GtkPopover>

public val Popover.asObject: Object
  get() = reinterpret()

public val Popover.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Popover.asWidget: Widget
  get() = reinterpret()

public val Popover.asContainer: Container
  get() = reinterpret()

public val Popover.asBin: Bin
  get() = reinterpret()

public var Popover.constrainTo: PopoverConstraint
  get() = gtk_popover_get_constrain_to(this)
  set(`value`) {
    gtk_popover_set_constrain_to(this, value)
  }

public var Popover.defaultWidget: Widget?
  get() = gtk_popover_get_default_widget(this)?.reinterpret()
  set(`value`) {
    gtk_popover_set_default_widget(this, value)
  }

public var Popover.modal: Boolean
  get() = gtk_popover_get_modal(this).toBoolean
  set(`value`) {
    gtk_popover_set_modal(this, value.toInt)
  }

public var Popover.position: PositionType
  get() = gtk_popover_get_position(this)
  set(`value`) {
    gtk_popover_set_position(this, value)
  }

public var Popover.relativeTo: Widget?
  get() = gtk_popover_get_relative_to(this)?.reinterpret()
  set(`value`) {
    gtk_popover_set_relative_to(this, value)
  }

public fun Popover.popdown(): Unit {
  gtk_popover_popdown(this)
}

public fun Popover.popup(): Unit {
  gtk_popover_popup(this)
}
