// TODO - implement:
//   attach
//   attach_next_to
//   get_baseline_row
//   get_child_at
//   get_column_homogeneous
//   get_column_spacing
//   get_row_baseline_position
//   get_row_homogeneous
//   get_row_spacing
//   insert_column
//   insert_next_to
//   insert_row
//   remove_column
//   remove_row
//   set_baseline_row
//   set_column_homogeneous
//   set_column_spacing
//   set_row_baseline_position
//   set_row_homogeneous
//   set_row_spacing
package org.gnome.gtk

import gtk3.GtkGrid
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Grid = CPointer<GtkGrid>

public val Grid.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Grid.asWidget: Widget
  get() = reinterpret()

public val Grid.asContainer: Container
  get() = reinterpret()
