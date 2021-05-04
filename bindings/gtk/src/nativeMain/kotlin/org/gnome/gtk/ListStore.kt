// TODO - constructor: new
// TODO - method: append
// TODO - method: insert
// TODO - method: insert_after
// TODO - method: insert_before
// TODO - method: insert_with_values
// TODO - method: insert_with_valuesv
// TODO - method: prepend
// TODO - method: set
// TODO - method: set_valist
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GType
import interop.GtkListStore
import interop.gtk_list_store_clear
import interop.gtk_list_store_iter_is_valid
import interop.gtk_list_store_move_after
import interop.gtk_list_store_move_before
import interop.gtk_list_store_newv
import interop.gtk_list_store_remove
import interop.gtk_list_store_reorder
import interop.gtk_list_store_set_column_types
import interop.gtk_list_store_set_value
import interop.gtk_list_store_set_valuesv
import interop.gtk_list_store_swap
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.toBoolean
import org.gnome.toCArray

public typealias ListStore = CPointer<GtkListStore>

public val ListStore.asObject: Object
  get() = reinterpret()

public object ListStoreFactory {
  public fun newv(nColumns: Int, types: Array<GType>?): ListStore = memScoped {
      gtk_list_store_newv(nColumns, types?.toCArray(memScope))!!.reinterpret() }
}

public val ListStore.parent: Object
  get() = pointed.parent.ptr

public fun ListStore.clear(): Unit {
  gtk_list_store_clear(this@clear)
}

public fun ListStore.iterIsValid(iter: TreeIter?): Boolean =
    gtk_list_store_iter_is_valid(this@iterIsValid, iter?.reinterpret()).toBoolean()

public fun ListStore.moveAfter(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_list_store_move_after(this@moveAfter, iter?.reinterpret(), position?.reinterpret())
}

public fun ListStore.moveBefore(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_list_store_move_before(this@moveBefore, iter?.reinterpret(), position?.reinterpret())
}

public fun ListStore.remove(iter: TreeIter?): Boolean = gtk_list_store_remove(this@remove,
    iter?.reinterpret()).toBoolean()

public fun ListStore.reorder(newOrder: Array<Int>?): Unit {
  memScoped { gtk_list_store_reorder(this@reorder, newOrder?.toCArray(memScope)) }
}

public fun ListStore.setColumnTypes(nColumns: Int, types: Array<GType>?): Unit {
  memScoped { gtk_list_store_set_column_types(this@setColumnTypes, nColumns,
      types?.toCArray(memScope)) }
}

public fun ListStore.setValue(
  iter: TreeIter?,
  column: Int,
  `value`: Value?
): Unit {
  gtk_list_store_set_value(this@setValue, iter?.reinterpret(), column, `value`?.reinterpret())
}

public fun ListStore.setValuesv(
  iter: TreeIter?,
  columns: Array<Int>?,
  values: Array<Value>?,
  nValues: Int
): Unit {
  memScoped { gtk_list_store_set_valuesv(this@setValuesv, iter?.reinterpret(),
      columns?.toCArray(memScope), values?.map { it.pointed }?.toTypedArray()?.toCArray(memScope),
      nValues) }
}

public fun ListStore.swap(a: TreeIter?, b: TreeIter?): Unit {
  gtk_list_store_swap(this@swap, a?.reinterpret(), b?.reinterpret())
}
