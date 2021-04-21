// TODO - constructor: new
// TODO - constructor: newv
// TODO - method: append
// TODO - method: insert
// TODO - method: insert_after
// TODO - method: insert_before
// TODO - method: insert_with_values
// TODO - method: insert_with_valuesv
// TODO - method: prepend
// TODO - method: reorder
// TODO - method: set
// TODO - method: set_column_types
// TODO - method: set_valist
// TODO - method: set_value
// TODO - method: set_valuesv
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkListStore
import gtk3.gtk_list_store_clear
import gtk3.gtk_list_store_iter_is_valid
import gtk3.gtk_list_store_move_after
import gtk3.gtk_list_store_move_before
import gtk3.gtk_list_store_remove
import gtk3.gtk_list_store_swap
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias ListStore = CPointer<GtkListStore>

public val ListStore.asObject: Object
  get() = reinterpret()

public object ListStoreFactory

public fun ListStore.clear(): Unit {
  gtk_list_store_clear(this)
}

public fun ListStore.iterIsValid(iter: TreeIter?): Boolean = gtk_list_store_iter_is_valid(this,
    iter?.reinterpret()).toBoolean

public fun ListStore.moveAfter(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_list_store_move_after(this, iter?.reinterpret(), position?.reinterpret())
}

public fun ListStore.moveBefore(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_list_store_move_before(this, iter?.reinterpret(), position?.reinterpret())
}

public fun ListStore.remove(iter: TreeIter?): Boolean = gtk_list_store_remove(this,
    iter?.reinterpret()).toBoolean

public fun ListStore.swap(a: TreeIter?, b: TreeIter?): Unit {
  gtk_list_store_swap(this, a?.reinterpret(), b?.reinterpret())
}
