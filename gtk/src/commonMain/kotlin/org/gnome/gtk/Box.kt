// TODO - implement:
//   get_baseline_position
//   get_center_widget
//   pack_end
//   pack_start
//   query_child_packing
//   reorder_child
//   set_baseline_position
//   set_center_widget
//   set_child_packing
package org.gnome.gtk

import gtk3.GtkBox
import gtk3.gtk_box_get_homogeneous
import gtk3.gtk_box_get_spacing
import gtk3.gtk_box_set_homogeneous
import gtk3.gtk_box_set_spacing
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias Box = CPointer<GtkBox>

public val Box.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Box.asWidget: Widget
  get() = reinterpret()

public val Box.asContainer: Container
  get() = reinterpret()

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
