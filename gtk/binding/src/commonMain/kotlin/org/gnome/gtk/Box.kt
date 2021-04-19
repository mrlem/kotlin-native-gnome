// TODO - get_baseline_position
// TODO - get_baseline_position
// TODO - query_child_packing
// TODO - set_baseline_position
// TODO - set_child_packing
//
package org.gnome.gtk

import gtk3.GtkBox
import gtk3.gtk_box_get_center_widget
import gtk3.gtk_box_get_homogeneous
import gtk3.gtk_box_get_spacing
import gtk3.gtk_box_pack_end
import gtk3.gtk_box_pack_start
import gtk3.gtk_box_reorder_child
import gtk3.gtk_box_set_center_widget
import gtk3.gtk_box_set_homogeneous
import gtk3.gtk_box_set_spacing
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Box = CPointer<GtkBox>

public val Box.asObject: Object
  get() = reinterpret()

public val Box.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Box.asWidget: Widget
  get() = reinterpret()

public val Box.asContainer: Container
  get() = reinterpret()

public var Box.centerWidget: Widget?
  get() = gtk_box_get_center_widget(this)?.reinterpret()
  set(`value`) {
    gtk_box_set_center_widget(this, value)
  }

public var Box.homogeneous: Boolean
  get() = gtk_box_get_homogeneous(this).toBoolean
  set(`value`) {
    gtk_box_set_homogeneous(this, value.toInt)
  }

public var Box.spacing: Int
  get() = gtk_box_get_spacing(this)
  set(`value`) {
    gtk_box_set_spacing(this, value)
  }

public fun Box.packEnd(
  child: Widget,
  expand: Boolean,
  fill: Boolean,
  padding: UInt
): Unit {
  gtk_box_pack_end(this, child.reinterpret(), expand.toInt, fill.toInt, padding)
}

public fun Box.packStart(
  child: Widget,
  expand: Boolean,
  fill: Boolean,
  padding: UInt
): Unit {
  gtk_box_pack_start(this, child.reinterpret(), expand.toInt, fill.toInt, padding)
}

public fun Box.reorderChild(child: Widget, position: Int): Unit {
  gtk_box_reorder_child(this, child.reinterpret(), position)
}
