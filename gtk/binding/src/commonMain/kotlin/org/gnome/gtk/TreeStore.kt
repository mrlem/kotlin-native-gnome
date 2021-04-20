// TODO - append
// TODO - insert
// TODO - insert_after
// TODO - insert_before
// TODO - insert_with_values
// TODO - insert_with_valuesv
// TODO - prepend
// TODO - reorder
// TODO - set
// TODO - set_column_types
// TODO - set_valist
// TODO - set_value
// TODO - set_valuesv
//
package org.gnome.gtk

import gtk3.GtkTreeStore
import gtk3.gtk_tree_store_clear
import gtk3.gtk_tree_store_is_ancestor
import gtk3.gtk_tree_store_iter_depth
import gtk3.gtk_tree_store_iter_is_valid
import gtk3.gtk_tree_store_move_after
import gtk3.gtk_tree_store_move_before
import gtk3.gtk_tree_store_remove
import gtk3.gtk_tree_store_swap
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias TreeStore = CPointer<GtkTreeStore>

public val TreeStore.asObject: Object
  get() = reinterpret()

public fun TreeStore.clear(): Unit {
  gtk_tree_store_clear(this)
}

public fun TreeStore.isAncestor(iter: TreeIter?, descendant: TreeIter?): Boolean =
    gtk_tree_store_is_ancestor(this, iter?.reinterpret(), descendant?.reinterpret()).toBoolean

public fun TreeStore.iterDepth(iter: TreeIter?): Int = gtk_tree_store_iter_depth(this,
    iter?.reinterpret())

public fun TreeStore.iterIsValid(iter: TreeIter?): Boolean = gtk_tree_store_iter_is_valid(this,
    iter?.reinterpret()).toBoolean

public fun TreeStore.moveAfter(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_tree_store_move_after(this, iter?.reinterpret(), position?.reinterpret())
}

public fun TreeStore.moveBefore(iter: TreeIter?, position: TreeIter?): Unit {
  gtk_tree_store_move_before(this, iter?.reinterpret(), position?.reinterpret())
}

public fun TreeStore.remove(iter: TreeIter?): Boolean = gtk_tree_store_remove(this,
    iter?.reinterpret()).toBoolean

public fun TreeStore.swap(a: TreeIter?, b: TreeIter?): Unit {
  gtk_tree_store_swap(this, a?.reinterpret(), b?.reinterpret())
}
