// TODO - implement:
//   activate
//   get_aligned_area
//   get_alignment
//   get_fixed_size
//   get_padding
//   get_preferred_height
//   get_preferred_height_for_width
//   get_preferred_size
//   get_preferred_width
//   get_preferred_width_for_height
//   get_request_mode
//   get_sensitive
//   get_size
//   get_state
//   get_visible
//   is_activatable
//   render
//   set_alignment
//   set_fixed_size
//   set_padding
//   set_sensitive
//   set_visible
//   start_editing
//   stop_editing
package org.gnome.gtk

import gtk3.GtkCellRenderer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRenderer = CPointer<GtkCellRenderer>

public val CellRenderer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
