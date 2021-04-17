// TODO - implement:
//   append
//   insert
//   insert_after
//   insert_before
//   insert_with_values
//   insert_with_valuesv
//   iter_is_valid
//   move_after
//   move_before
//   prepend
//   remove
//   reorder
//   set
//   set_column_types
//   set_valist
//   set_value
//   set_valuesv
//   swap
package org.gnome.gtk

import gtk3.GtkListStore
import gtk3.gtk_list_store_clear
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias ListStore = CPointer<GtkListStore>

public val ListStore.asObject: Object
  get() = reinterpret()

public fun ListStore.clear(): Unit {
  gtk_list_store_clear(this)
}
