// TODO - convert_child_iter_to_iter
// TODO - convert_iter_to_child_iter
//
package org.gnome.gtk

import gtk3.GtkTreeModelSort
import gtk3.gtk_tree_model_sort_clear_cache
import gtk3.gtk_tree_model_sort_convert_child_path_to_path
import gtk3.gtk_tree_model_sort_convert_path_to_child_path
import gtk3.gtk_tree_model_sort_get_model
import gtk3.gtk_tree_model_sort_iter_is_valid
import gtk3.gtk_tree_model_sort_reset_default_sort_func
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias TreeModelSort = CPointer<GtkTreeModelSort>

public val TreeModelSort.asObject: Object
  get() = reinterpret()

public val TreeModelSort.model: TreeModel?
  get() = gtk_tree_model_sort_get_model(this)?.reinterpret()

public fun TreeModelSort.clearCache(): Unit {
  gtk_tree_model_sort_clear_cache(this)
}

public fun TreeModelSort.convertChildPathToPath(childPath: TreePath?): TreePath? =
    gtk_tree_model_sort_convert_child_path_to_path(this, childPath?.reinterpret())?.reinterpret()

public fun TreeModelSort.convertPathToChildPath(sortedPath: TreePath?): TreePath? =
    gtk_tree_model_sort_convert_path_to_child_path(this, sortedPath?.reinterpret())?.reinterpret()

public fun TreeModelSort.iterIsValid(iter: TreeIter?): Boolean =
    gtk_tree_model_sort_iter_is_valid(this, iter?.reinterpret()).toBoolean

public fun TreeModelSort.resetDefaultSortFunc(): Unit {
  gtk_tree_model_sort_reset_default_sort_func(this)
}
