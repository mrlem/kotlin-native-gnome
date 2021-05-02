// TODO - method: get_pointing_to
// TODO - method: get_transitions_enabled
// TODO - method: set_pointing_to
// TODO - method: set_transitions_enabled
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPopover
import interop.gtk_popover_bind_model
import interop.gtk_popover_get_constrain_to
import interop.gtk_popover_get_default_widget
import interop.gtk_popover_get_modal
import interop.gtk_popover_get_position
import interop.gtk_popover_get_relative_to
import interop.gtk_popover_new
import interop.gtk_popover_new_from_model
import interop.gtk_popover_popdown
import interop.gtk_popover_popup
import interop.gtk_popover_set_constrain_to
import interop.gtk_popover_set_default_widget
import interop.gtk_popover_set_modal
import interop.gtk_popover_set_position
import interop.gtk_popover_set_relative_to
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.MenuModel
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public object PopoverFactory {
  public fun new(relativeTo: Widget?): Popover =
      gtk_popover_new(relativeTo?.reinterpret())!!.reinterpret()

  public fun newFromModel(relativeTo: Widget?, model: MenuModel?): Popover =
      gtk_popover_new_from_model(relativeTo?.reinterpret(), model?.reinterpret())!!.reinterpret()
}

public val Popover.parentInstance: Bin
  get() = pointed.parent_instance.ptr

public var Popover.constrainTo: PopoverConstraint
  get() = gtk_popover_get_constrain_to(this)
  set(`value`) {
    gtk_popover_set_constrain_to(this, `value`)
  }

public var Popover.defaultWidget: Widget?
  get() = gtk_popover_get_default_widget(this)?.reinterpret()
  set(`value`) {
    gtk_popover_set_default_widget(this, `value`)
  }

public var Popover.modal: Boolean
  get() = gtk_popover_get_modal(this).toBoolean
  set(`value`) {
    gtk_popover_set_modal(this, `value`.toInt)
  }

public var Popover.position: PositionType
  get() = gtk_popover_get_position(this)
  set(`value`) {
    gtk_popover_set_position(this, `value`)
  }

public var Popover.relativeTo: Widget?
  get() = gtk_popover_get_relative_to(this)?.reinterpret()
  set(`value`) {
    gtk_popover_set_relative_to(this, `value`)
  }

public fun Popover.bindModel(model: MenuModel?, actionNamespace: String): Unit {
  gtk_popover_bind_model(this, model?.reinterpret(), actionNamespace)
}

public fun Popover.popdown(): Unit {
  gtk_popover_popdown(this)
}

public fun Popover.popup(): Unit {
  gtk_popover_popup(this)
}

public fun Popover.onClosed(callback: (Popover) -> Unit): Popover {
  // TODO - handle callback data

  asObject.connect("closed") { callback(this) }
  return this
}
