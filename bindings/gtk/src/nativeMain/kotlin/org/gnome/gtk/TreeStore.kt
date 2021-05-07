// TODO - constructor: new
// TODO - method: append (param type)
// TODO - method: insert (param type)
// TODO - method: insert_after (param type)
// TODO - method: insert_before (param type)
// TODO - method: insert_with_values (param type)
// TODO - method: insert_with_valuesv (param type)
// TODO - method: prepend (param type)
// TODO - method: set (param type)
// TODO - method: set_valist (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GType
import interop.GtkTreeStore
import interop.gtk_tree_store_clear
import interop.gtk_tree_store_is_ancestor
import interop.gtk_tree_store_iter_depth
import interop.gtk_tree_store_iter_is_valid
import interop.gtk_tree_store_move_after
import interop.gtk_tree_store_move_before
import interop.gtk_tree_store_newv
import interop.gtk_tree_store_remove
import interop.gtk_tree_store_reorder
import interop.gtk_tree_store_set_column_types
import interop.gtk_tree_store_set_value
import interop.gtk_tree_store_set_valuesv
import interop.gtk_tree_store_swap
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
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray

public typealias TreeStore = CPointer<GtkTreeStore>

public val TreeStore.asObject: Object
  get() = reinterpret()

public object TreeStoreFactory {
  public fun newv(nColumns: Int, types: Array<GType>?): TreeStore = memScoped {
      gtk_tree_store_newv(nColumns, types?.toCArray(memScope))!!.reinterpret() }
}

public val TreeStore.parent: Object
  get() = pointed.parent.ptr

public fun TreeStore.clear(): Unit {
  gtk_tree_store_clear(this@clear)
}

public fun TreeStore.isAncestor(iter: TreeIter?, descendant: TreeIter?): Boolean =
    gtk_tree_store_is_ancestor(this@isAncestor, iter?.reinterpret(),
    descendant?.reinterpret()).toBoolean()

public fun TreeStore.iterDepth(iter: TreeIter?): Int = gtk_tree_store_iter_depth(this@iterDepth,
    iter?.reinterpret())

public fun TreeStore.iterIsValid(iter: TreeIter?): Boolean =
    gtk_tree_store_iter_is_valid(this@iterIsValid, iter?.reinterpret()).toBoolean()

public fun TreeStore.moveAfter(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_tree_store_move_after(this@moveAfter, iter?.reinterpret(), position?.reinterpret())
}

public fun TreeStore.moveBefore(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_tree_store_move_before(this@moveBefore, iter?.reinterpret(), position?.reinterpret())
}

public fun TreeStore.remove(iter: TreeIter?): Boolean = gtk_tree_store_remove(this@remove,
    iter?.reinterpret()).toBoolean()

public fun TreeStore.reorder(parent: TreeIter?, newOrder: Array<Int>?): Unit {
  memScoped { gtk_tree_store_reorder(this@reorder, parent?.reinterpret(),
      newOrder?.toCArray(memScope)) }
}

public fun TreeStore.setColumnTypes(nColumns: Int, types: Array<GType>?): Unit {
  memScoped { gtk_tree_store_set_column_types(this@setColumnTypes, nColumns,
      types?.toCArray(memScope)) }
}

public fun TreeStore.setValue(
  iter: TreeIter?,
  column: Int,
  `value`: Value?
): Unit {
  gtk_tree_store_set_value(this@setValue, iter?.reinterpret(), column, `value`?.reinterpret())
}

public fun TreeStore.setValuesv(
  iter: TreeIter?,
  columns: Array<Int>?,
  values: Array<Value>?,
  nValues: Int
): Unit {
  memScoped { gtk_tree_store_set_valuesv(this@setValuesv, iter?.reinterpret(),
      columns?.toCArray(memScope), values?.map { it.pointed }?.toTypedArray()?.toCArray(memScope),
      nValues) }
}

public fun TreeStore.swap(a: TreeIter?, b: TreeIter?): Unit {
  gtk_tree_store_swap(this@swap, a?.reinterpret(), b?.reinterpret())
}
