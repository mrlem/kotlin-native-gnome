// TODO - implement:
//   convert_child_iter_to_iter
//   convert_child_path_to_path
//   convert_iter_to_child_iter
//   convert_path_to_child_path
//   iter_is_valid
package org.gnome.gtk

import gtk3.GtkTreeModelSort
import gtk3.gtk_tree_model_sort_clear_cache
import gtk3.gtk_tree_model_sort_get_model
import gtk3.gtk_tree_model_sort_reset_default_sort_func
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeModelSort = CPointer<GtkTreeModelSort>

public val TreeModelSort.asObject: Object
  get() = reinterpret()

public fun TreeModelSort.clearCache(): Unit {
  gtk_tree_model_sort_clear_cache(this)
}

public fun TreeModelSort.getModel(): Unit {
  gtk_tree_model_sort_get_model(this)
}

public fun TreeModelSort.resetDefaultSortFunc(): Unit {
  gtk_tree_model_sort_reset_default_sort_func(this)
}
