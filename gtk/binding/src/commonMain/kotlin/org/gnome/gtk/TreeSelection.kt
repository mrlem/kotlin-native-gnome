// TODO - implement:
//   get_selected
//   get_selected_rows
//   iter_is_selected
//   path_is_selected
//   select_iter
//   select_path
//   select_range
//   selected_foreach
//   set_mode
//   set_select_function
//   unselect_iter
//   unselect_path
//   unselect_range
package org.gnome.gtk

import gtk3.GtkTreeSelection
import gtk3.gtk_tree_selection_count_selected_rows
import gtk3.gtk_tree_selection_get_mode
import gtk3.gtk_tree_selection_get_select_function
import gtk3.gtk_tree_selection_get_tree_view
import gtk3.gtk_tree_selection_get_user_data
import gtk3.gtk_tree_selection_select_all
import gtk3.gtk_tree_selection_unselect_all
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeSelection = CPointer<GtkTreeSelection>

public val TreeSelection.asObject: Object
  get() = reinterpret()

public fun TreeSelection.countSelectedRows(): Int = gtk_tree_selection_count_selected_rows(this)

public fun TreeSelection.getMode(): Unit {
  gtk_tree_selection_get_mode(this)
}

public fun TreeSelection.getSelectFunction(): Unit {
  gtk_tree_selection_get_select_function(this)
}

public fun TreeSelection.getTreeView(): Unit {
  gtk_tree_selection_get_tree_view(this)
}

public fun TreeSelection.getUserData(): Unit {
  gtk_tree_selection_get_user_data(this)
}

public fun TreeSelection.selectAll(): Unit {
  gtk_tree_selection_select_all(this)
}

public fun TreeSelection.unselectAll(): Unit {
  gtk_tree_selection_unselect_all(this)
}
