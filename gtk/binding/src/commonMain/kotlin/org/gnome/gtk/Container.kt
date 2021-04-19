// TODO - add_with_properties
// TODO - child_get
// TODO - child_get_property
// TODO - child_get_valist
// TODO - child_notify_by_pspec
// TODO - child_set
// TODO - child_set_property
// TODO - child_set_valist
// TODO - forall
// TODO - foreach
// TODO - get_children
// TODO - propagate_draw
//
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

public fun Container.add(widget: Widget): Unit {
  gtk_container_add(this, widget.reinterpret())
}

public fun Container.checkResize(): Unit {
  gtk_container_check_resize(this)
}

public fun Container.childNotify(child: Widget, childProperty: String?): Unit {
  gtk_container_child_notify(this, child.reinterpret(), childProperty)
}

public fun Container.childType(): GType = gtk_container_child_type(this)

public fun Container.getBorderWidth(): UInt = gtk_container_get_border_width(this)

public fun Container.getFocusChild(): Widget? = gtk_container_get_focus_child(this)?.reinterpret()

public fun Container.getFocusHadjustment(): Adjustment? =
    gtk_container_get_focus_hadjustment(this)?.reinterpret()

public fun Container.getFocusVadjustment(): Adjustment? =
    gtk_container_get_focus_vadjustment(this)?.reinterpret()

public fun Container.getPathForChild(child: Widget): WidgetPath? =
    gtk_container_get_path_for_child(this, child.reinterpret())?.reinterpret()

public fun Container.remove(widget: Widget): Unit {
  gtk_container_remove(this, widget.reinterpret())
}

public fun Container.setBorderWidth(borderWidth: UInt): Unit {
  gtk_container_set_border_width(this, borderWidth)
}

public fun Container.setFocusChild(child: Widget): Unit {
  gtk_container_set_focus_child(this, child.reinterpret())
}

public fun Container.setFocusHadjustment(adjustment: Adjustment): Unit {
  gtk_container_set_focus_hadjustment(this, adjustment.reinterpret())
}

public fun Container.setFocusVadjustment(adjustment: Adjustment): Unit {
  gtk_container_set_focus_vadjustment(this, adjustment.reinterpret())
}
