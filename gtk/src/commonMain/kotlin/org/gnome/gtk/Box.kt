// TODO - implement:
//   get_baseline_position
//   get_center_widget
//   get_homogeneous
//   get_spacing
//   pack_end
//   pack_start
//   query_child_packing
//   reorder_child
//   set_baseline_position
//   set_center_widget
//   set_child_packing
//   set_homogeneous
//   set_spacing
package org.gnome.gtk

import gtk3.GtkBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Box = CPointer<GtkBox>

public val Box.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Box.asWidget: Widget
  get() = reinterpret()

public val Box.asContainer: Container
  get() = reinterpret()
