// TODO - method: convert_child_iter_to_iter (param type)
// TODO - method: convert_iter_to_child_iter (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTreeModelSort
import interop.gtk_tree_model_sort_clear_cache
import interop.gtk_tree_model_sort_convert_child_path_to_path
import interop.gtk_tree_model_sort_convert_path_to_child_path
import interop.gtk_tree_model_sort_get_model
import interop.gtk_tree_model_sort_iter_is_valid
import interop.gtk_tree_model_sort_new_with_model
import interop.gtk_tree_model_sort_reset_default_sort_func
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias TreeModelSort = CPointer<GtkTreeModelSort>

public val TreeModelSort.asObject: Object
  get() = reinterpret()

public object TreeModelSortFactory {
  public fun newWithModel(childModel: TreeModel?): TreeModelSort =
      gtk_tree_model_sort_new_with_model(childModel?.reinterpret())!!.reinterpret()
}

public val TreeModelSort.parent: Object
  get() = pointed.parent.ptr

public val TreeModelSort.model: TreeModel?
  get() = gtk_tree_model_sort_get_model(this)?.reinterpret()

public fun TreeModelSort.clearCache(): Unit {
  gtk_tree_model_sort_clear_cache(this@clearCache)
}

public fun TreeModelSort.convertChildPathToPath(childPath: TreePath?): TreePath? =
    gtk_tree_model_sort_convert_child_path_to_path(this@convertChildPathToPath,
    childPath?.reinterpret())?.reinterpret()

public fun TreeModelSort.convertPathToChildPath(sortedPath: TreePath?): TreePath? =
    gtk_tree_model_sort_convert_path_to_child_path(this@convertPathToChildPath,
    sortedPath?.reinterpret())?.reinterpret()

public fun TreeModelSort.iterIsValid(iter: TreeIter?): Boolean =
    gtk_tree_model_sort_iter_is_valid(this@iterIsValid, iter?.reinterpret()).toBoolean()

public fun TreeModelSort.resetDefaultSortFunc(): Unit {
  gtk_tree_model_sort_reset_default_sort_func(this@resetDefaultSortFunc)
}
