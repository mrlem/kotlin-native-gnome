// TODO - method: convert_child_iter_to_iter
// TODO - method: convert_iter_to_child_iter
// TODO - method: set_modify_func
// TODO - method: set_visible_func
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTreeModelFilter
import interop.gtk_tree_model_filter_clear_cache
import interop.gtk_tree_model_filter_convert_child_path_to_path
import interop.gtk_tree_model_filter_convert_path_to_child_path
import interop.gtk_tree_model_filter_get_model
import interop.gtk_tree_model_filter_refilter
import interop.gtk_tree_model_filter_set_visible_column
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TreeModelFilter = CPointer<GtkTreeModelFilter>

public val TreeModelFilter.asObject: Object
  get() = reinterpret()

public val TreeModelFilter.parent: Object
  get() = pointed.parent.ptr

public val TreeModelFilter.model: TreeModel?
  get() = gtk_tree_model_filter_get_model(this)?.reinterpret()

public fun TreeModelFilter.clearCache(): Unit {
  gtk_tree_model_filter_clear_cache(this)
}

public fun TreeModelFilter.convertChildPathToPath(childPath: TreePath?): TreePath? =
    gtk_tree_model_filter_convert_child_path_to_path(this, childPath?.reinterpret())?.reinterpret()

public fun TreeModelFilter.convertPathToChildPath(filterPath: TreePath?): TreePath? =
    gtk_tree_model_filter_convert_path_to_child_path(this, filterPath?.reinterpret())?.reinterpret()

public fun TreeModelFilter.refilter(): Unit {
  gtk_tree_model_filter_refilter(this)
}

public fun TreeModelFilter.setVisibleColumn(column: Int): Unit {
  gtk_tree_model_filter_set_visible_column(this, column)
}
