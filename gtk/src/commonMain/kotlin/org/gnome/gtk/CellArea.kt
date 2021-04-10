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
//   event
//   focus
//   foreach
//   foreach_alloc
//   get_cell_allocation
//   get_cell_at_position
//   get_focus_from_sibling
//   get_focus_siblings
//   get_preferred_height
//   get_preferred_height_for_width
//   get_preferred_width
//   get_preferred_width_for_height
//   has_renderer
//   inner_cell_area
//   is_focus_sibling
//   remove
//   remove_focus_sibling
//   render
//   request_renderer
//   set_focus_cell
//   stop_editing
package org.gnome.gtk

import gtk3.GtkCellArea
import gtk3.gtk_cell_area_create_context
import gtk3.gtk_cell_area_get_current_path_string
import gtk3.gtk_cell_area_get_edit_widget
import gtk3.gtk_cell_area_get_edited_cell
import gtk3.gtk_cell_area_get_focus_cell
import gtk3.gtk_cell_area_get_request_mode
import gtk3.gtk_cell_area_is_activatable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toKString

public typealias CellArea = CPointer<GtkCellArea>

public val CellArea.asObject: Object
  get() = reinterpret()

public val CellArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun CellArea.createContext(): Unit {
  gtk_cell_area_create_context(this)
}

public fun CellArea.getEditWidget(): Unit {
  gtk_cell_area_get_edit_widget(this)
}

public fun CellArea.getEditedCell(): Unit {
  gtk_cell_area_get_edited_cell(this)
}

public fun CellArea.getFocusCell(): Unit {
  gtk_cell_area_get_focus_cell(this)
}

public fun CellArea.getRequestMode(): Unit {
  gtk_cell_area_get_request_mode(this)
}

public fun CellArea.isActivatable(): Boolean = gtk_cell_area_is_activatable(this).toBoolean

public val CellArea.currentPathString: String?
  get() = gtk_cell_area_get_current_path_string(this).toKString
