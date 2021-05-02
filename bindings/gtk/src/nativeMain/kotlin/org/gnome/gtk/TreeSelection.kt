// TODO - method: get_selected
// TODO - method: get_selected_rows
// TODO - method: get_user_data
// TODO - method: selected_foreach
// TODO - method: set_select_function
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTreeSelection
import interop.gtk_tree_selection_count_selected_rows
import interop.gtk_tree_selection_get_mode
import interop.gtk_tree_selection_get_select_function
import interop.gtk_tree_selection_get_tree_view
import interop.gtk_tree_selection_iter_is_selected
import interop.gtk_tree_selection_path_is_selected
import interop.gtk_tree_selection_select_all
import interop.gtk_tree_selection_select_iter
import interop.gtk_tree_selection_select_path
import interop.gtk_tree_selection_select_range
import interop.gtk_tree_selection_set_mode
import interop.gtk_tree_selection_unselect_all
import interop.gtk_tree_selection_unselect_iter
import interop.gtk_tree_selection_unselect_path
import interop.gtk_tree_selection_unselect_range
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias TreeSelection = CPointer<GtkTreeSelection>

public val TreeSelection.asObject: Object
  get() = reinterpret()

public var TreeSelection.mode: SelectionMode
  get() = gtk_tree_selection_get_mode(this)
  set(`value`) {
    gtk_tree_selection_set_mode(this, `value`)
  }

public val TreeSelection.selectFunction: TreeSelectionFunc?
  get() = gtk_tree_selection_get_select_function(this)?.reinterpret()

public val TreeSelection.treeView: TreeView?
  get() = gtk_tree_selection_get_tree_view(this)?.reinterpret()

public fun TreeSelection.countSelectedRows(): Int = gtk_tree_selection_count_selected_rows(this)

public fun TreeSelection.iterIsSelected(iter: TreeIter?): Boolean =
    gtk_tree_selection_iter_is_selected(this, iter?.reinterpret()).toBoolean

public fun TreeSelection.pathIsSelected(path: TreePath?): Boolean =
    gtk_tree_selection_path_is_selected(this, path?.reinterpret()).toBoolean

public fun TreeSelection.selectAll(): Unit {
  gtk_tree_selection_select_all(this)
}

public fun TreeSelection.selectIter(iter: TreeIter?): Unit {
  gtk_tree_selection_select_iter(this, iter?.reinterpret())
}

public fun TreeSelection.selectPath(path: TreePath?): Unit {
  gtk_tree_selection_select_path(this, path?.reinterpret())
}

public fun TreeSelection.selectRange(startPath: TreePath?, endPath: TreePath?): Unit {
  gtk_tree_selection_select_range(this, startPath?.reinterpret(), endPath?.reinterpret())
}

public fun TreeSelection.unselectAll(): Unit {
  gtk_tree_selection_unselect_all(this)
}

public fun TreeSelection.unselectIter(iter: TreeIter?): Unit {
  gtk_tree_selection_unselect_iter(this, iter?.reinterpret())
}

public fun TreeSelection.unselectPath(path: TreePath?): Unit {
  gtk_tree_selection_unselect_path(this, path?.reinterpret())
}

public fun TreeSelection.unselectRange(startPath: TreePath?, endPath: TreePath?): Unit {
  gtk_tree_selection_unselect_range(this, startPath?.reinterpret(), endPath?.reinterpret())
}

public fun TreeSelection.onChanged(callback: (TreeSelection) -> Unit): TreeSelection {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
