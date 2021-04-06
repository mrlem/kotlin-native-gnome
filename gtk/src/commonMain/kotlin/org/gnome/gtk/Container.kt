// TODO - implement:
//   add
//   add_with_properties
//   check_resize
//   child_get
//   child_get_property
//   child_get_valist
//   child_notify
//   child_notify_by_pspec
//   child_set
//   child_set_property
//   child_set_valist
//   child_type
//   forall
//   foreach
//   get_children
//   get_focus_chain
//   get_focus_child
//   get_focus_hadjustment
//   get_focus_vadjustment
//   get_path_for_child
//   get_resize_mode
//   propagate_draw
//   remove
//   resize_children
//   set_focus_chain
//   set_focus_child
//   set_focus_hadjustment
//   set_focus_vadjustment
//   set_resize_mode
//   unset_focus_chain
//   set_reallocate_redraws
package org.gnome.gtk

import gtk3.*
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.mrlem.gnome.glib.toKList

public typealias Container = CPointer<GtkContainer>

public val Container.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Container.asWidget: Widget
  get() = reinterpret()

public var Container.borderWidth: UInt
  get() = gtk_container_get_border_width(this)
  set(`value`) {
    gtk_container_set_border_width(this, value)
  }

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

val Container.children: List<Widget>
  get() = gtk_container_get_children(this)
    ?.toKList<GtkWidget>()
    .orEmpty()

fun Container.add(widget: Widget) {
  gtk_container_add(this, widget)
}
