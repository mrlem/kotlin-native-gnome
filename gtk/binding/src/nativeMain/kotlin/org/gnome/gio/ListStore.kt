// TODO - constructor: new
// TODO - method: append
// TODO - method: find
// TODO - method: find_with_equal_func
// TODO - method: insert
// TODO - method: insert_sorted
// TODO - method: remove
// TODO - method: sort
// TODO - method: splice
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GListStore
import interop.g_list_store_remove_all
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ListStore = CPointer<GListStore>

public val ListStore.asObject: Object
  get() = reinterpret()

public object ListStoreFactory

public fun ListStore.removeAll(): Unit {
  g_list_store_remove_all(this)
}
