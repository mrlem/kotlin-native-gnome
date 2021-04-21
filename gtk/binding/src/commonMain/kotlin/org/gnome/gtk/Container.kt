// TODO - method: add_with_properties
// TODO - method: child_get
// TODO - method: child_get_property
// TODO - method: child_get_valist
// TODO - method: child_notify_by_pspec
// TODO - method: child_set
// TODO - method: child_set_property
// TODO - method: child_set_valist
// TODO - method: forall
// TODO - method: foreach
// TODO - method: get_children
// TODO - method: get_focus_chain
// TODO - method: get_resize_mode
// TODO - method: propagate_draw
// TODO - method: resize_children
// TODO - method: set_focus_chain
// TODO - method: set_reallocate_redraws
// TODO - method: set_resize_mode
// TODO - method: unset_focus_chain
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GType
import gtk3.GtkContainer
import gtk3.gtk_container_add
import gtk3.gtk_container_check_resize
import gtk3.gtk_container_child_notify
import gtk3.gtk_container_child_type
import gtk3.gtk_container_get_border_width
import gtk3.gtk_container_get_focus_child
import gtk3.gtk_container_get_focus_hadjustment
import gtk3.gtk_container_get_focus_vadjustment
import gtk3.gtk_container_get_path_for_child
import gtk3.gtk_container_remove
import gtk3.gtk_container_set_border_width
import gtk3.gtk_container_set_focus_child
import gtk3.gtk_container_set_focus_hadjustment
import gtk3.gtk_container_set_focus_vadjustment
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Container = CPointer<GtkContainer>

public val Container.asObject: Object
  get() = reinterpret()

public val Container.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Container.asWidget: Widget
  get() = reinterpret()

public var Container.borderWidth: UInt
  get() = gtk_container_get_border_width(this)
  set(`value`) {
    gtk_container_set_border_width(this, value)
  }

public var Container.focusChild: Widget?
  get() = gtk_container_get_focus_child(this)?.reinterpret()
  set(`value`) {
    gtk_container_set_focus_child(this, value)
  }

public var Container.focusHadjustment: Adjustment?
  get() = gtk_container_get_focus_hadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_container_set_focus_hadjustment(this, value)
  }

public var Container.focusVadjustment: Adjustment?
  get() = gtk_container_get_focus_vadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_container_set_focus_vadjustment(this, value)
  }

public fun Container.add(widget: Widget?): Unit {
  gtk_container_add(this, widget?.reinterpret())
}

public fun Container.checkResize(): Unit {
  gtk_container_check_resize(this)
}

public fun Container.childNotify(child: Widget?, childProperty: String): Unit {
  gtk_container_child_notify(this, child?.reinterpret(), childProperty)
}

public fun Container.childType(): GType = gtk_container_child_type(this)

public fun Container.getPathForChild(child: Widget?): WidgetPath? =
    gtk_container_get_path_for_child(this, child?.reinterpret())?.reinterpret()

public fun Container.remove(widget: Widget?): Unit {
  gtk_container_remove(this, widget?.reinterpret())
}
