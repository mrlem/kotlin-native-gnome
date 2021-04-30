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
// TODO - method: set_valuesv
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkListStore
import interop.gtk_list_store_clear
import interop.gtk_list_store_iter_is_valid
import interop.gtk_list_store_move_after
import interop.gtk_list_store_move_before
import interop.gtk_list_store_remove
import interop.gtk_list_store_set_value
import interop.gtk_list_store_swap
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.toBoolean

public typealias ListStore = CPointer<GtkListStore>

public val ListStore.asObject: Object
  get() = reinterpret()

public object ListStoreFactory

public val ListStore.parent: Object
  get() = pointed.parent.ptr

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

public fun ListStore.setValue(
  iter: TreeIter?,
  column: Int,
  `value`: Value?
): Unit {
  gtk_list_store_set_value(this, iter?.reinterpret(), column, value?.reinterpret())
}

public fun ListStore.swap(a: TreeIter?, b: TreeIter?): Unit {
  gtk_list_store_swap(this, a?.reinterpret(), b?.reinterpret())
}
