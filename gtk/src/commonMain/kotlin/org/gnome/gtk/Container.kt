// TODO - implement:
//   add
//   add_with_properties
//   child_get
//   child_get_property
//   child_get_valist
//   child_notify
//   child_notify_by_pspec
//   child_set
//   child_set_property
//   child_set_valist
//   forall
//   foreach
//   get_focus_chain
//   get_path_for_child
//   propagate_draw
//   remove
//   set_focus_chain
//   set_focus_child
//   set_focus_hadjustment
//   set_focus_vadjustment
//   set_resize_mode
//   set_reallocate_redraws
package org.gnome.gtk

import gtk3.GtkContainer
import gtk3.gtk_container_check_resize
import gtk3.gtk_container_child_type
import gtk3.gtk_container_get_border_width
import gtk3.gtk_container_get_children
import gtk3.gtk_container_get_focus_child
import gtk3.gtk_container_get_focus_hadjustment
import gtk3.gtk_container_get_focus_vadjustment
import gtk3.gtk_container_set_border_width
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Container = CPointer<GtkContainer>

public val Container.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Container.asWidget: Widget
  get() = reinterpret()

public fun Container.checkResize(): Unit {
  gtk_container_check_resize(this)
}

public fun Container.childType(): Unit {
  gtk_container_child_type(this)
}

public fun Container.getChildren(): Unit {
  gtk_container_get_children(this)
}

public fun Container.getFocusChild(): Unit {
  gtk_container_get_focus_child(this)
}

public fun Container.getFocusHadjustment(): Unit {
  gtk_container_get_focus_hadjustment(this)
}

public fun Container.getFocusVadjustment(): Unit {
  gtk_container_get_focus_vadjustment(this)
}

public var Container.borderWidth: UInt
  get() = gtk_container_get_border_width(this)
  set(`value`) {
    gtk_container_set_border_width(this, value)
  }
