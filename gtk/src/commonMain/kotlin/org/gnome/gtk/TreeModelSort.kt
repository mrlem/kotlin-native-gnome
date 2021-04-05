// TODO - implement:
//   clear_cache
//   convert_child_iter_to_iter
//   convert_child_path_to_path
//   convert_iter_to_child_iter
//   convert_path_to_child_path
//   get_model
//   iter_is_valid
//   reset_default_sort_func
package org.gnome.gtk

import gtk3.GtkTreeModelSort
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeModelSort = CPointer<GtkTreeModelSort>

public val TreeModelSort.asObject: Object
  get() = reinterpret()
