// TODO - constructor: new
// TODO - method: find
// TODO - method: find_with_equal_func
// TODO - method: insert_sorted
// TODO - method: sort
// TODO - method: splice
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GListStore
import interop.g_list_store_append
import interop.g_list_store_insert
import interop.g_list_store_remove
import interop.g_list_store_remove_all
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ListStore = CPointer<GListStore>

public val ListStore.asObject: Object
  get() = reinterpret()

public object ListStoreFactory

public fun ListStore.append(item: Object?): Unit {
  g_list_store_append(this, item?.reinterpret())
}

public fun ListStore.insert(position: UInt, item: Object?): Unit {
  g_list_store_insert(this, position, item?.reinterpret())
}

public fun ListStore.remove(position: UInt): Unit {
  g_list_store_remove(this, position)
}

public fun ListStore.removeAll(): Unit {
  g_list_store_remove_all(this)
}
