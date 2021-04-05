// TODO - implement:
//   activate
//   activate_cell
//   add
//   add_focus_sibling
//   add_with_properties
//   apply_attributes
//   attribute_connect
//   attribute_disconnect
//   attribute_get_column
//   cell_get
//   cell_get_property
//   cell_get_valist
//   cell_set
//   cell_set_property
//   cell_set_valist
//   copy_context
//   create_context
//   event
//   focus
//   foreach
//   foreach_alloc
//   get_cell_allocation
//   get_cell_at_position
//   get_current_path_string
//   get_edit_widget
//   get_edited_cell
//   get_focus_cell
//   get_focus_from_sibling
//   get_focus_siblings
//   get_preferred_height
//   get_preferred_height_for_width
//   get_preferred_width
//   get_preferred_width_for_height
//   get_request_mode
//   has_renderer
//   inner_cell_area
//   is_activatable
//   is_focus_sibling
//   remove
//   remove_focus_sibling
//   render
//   request_renderer
//   set_focus_cell
//   stop_editing
package org.gnome.gtk

import gtk3.GtkCellArea
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellArea = CPointer<GtkCellArea>

public val CellArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
