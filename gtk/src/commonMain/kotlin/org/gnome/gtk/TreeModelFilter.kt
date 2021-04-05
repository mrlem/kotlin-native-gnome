// TODO - implement:
//   clear_cache
//   convert_child_iter_to_iter
//   convert_child_path_to_path
//   convert_iter_to_child_iter
//   convert_path_to_child_path
//   get_model
//   refilter
//   set_modify_func
//   set_visible_column
//   set_visible_func
package org.gnome.gtk

import gtk3.GtkTreeModelFilter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeModelFilter = CPointer<GtkTreeModelFilter>

public val TreeModelFilter.asObject: Object
  get() = reinterpret()
