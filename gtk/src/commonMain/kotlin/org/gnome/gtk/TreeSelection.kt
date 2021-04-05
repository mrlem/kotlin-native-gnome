// TODO - implement:
//   count_selected_rows
//   get_mode
//   get_select_function
//   get_selected
//   get_selected_rows
//   get_tree_view
//   get_user_data
//   iter_is_selected
//   path_is_selected
//   select_all
//   select_iter
//   select_path
//   select_range
//   selected_foreach
//   set_mode
//   set_select_function
//   unselect_all
//   unselect_iter
//   unselect_path
//   unselect_range
package org.gnome.gtk

import gtk3.GtkTreeSelection
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeSelection = CPointer<GtkTreeSelection>

public val TreeSelection.asObject: Object
  get() = reinterpret()
