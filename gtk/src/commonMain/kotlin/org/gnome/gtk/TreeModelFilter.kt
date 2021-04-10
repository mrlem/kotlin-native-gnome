// TODO - implement:
//   convert_child_iter_to_iter
//   convert_child_path_to_path
//   convert_iter_to_child_iter
//   convert_path_to_child_path
//   set_modify_func
//   set_visible_func
//   set_visible_column
package org.gnome.gtk

import gtk3.GtkTreeModelFilter
import gtk3.gtk_tree_model_filter_clear_cache
import gtk3.gtk_tree_model_filter_get_model
import gtk3.gtk_tree_model_filter_refilter
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeModelFilter = CPointer<GtkTreeModelFilter>

public val TreeModelFilter.asObject: Object
  get() = reinterpret()

public fun TreeModelFilter.clearCache(): Unit {
  gtk_tree_model_filter_clear_cache(this)
}

public fun TreeModelFilter.getModel(): Unit {
  gtk_tree_model_filter_get_model(this)
}

public fun TreeModelFilter.refilter(): Unit {
  gtk_tree_model_filter_refilter(this)
}
