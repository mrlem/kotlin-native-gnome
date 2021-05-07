@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkContainerCellAccessible
import interop.gtk_container_cell_accessible_add_child
import interop.gtk_container_cell_accessible_get_children
import interop.gtk_container_cell_accessible_new
import interop.gtk_container_cell_accessible_remove_child
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.List
import org.gnome.gobject.Object

public typealias ContainerCellAccessible = CPointer<GtkContainerCellAccessible>

public val ContainerCellAccessible.asObject: Object
  get() = reinterpret()

public val ContainerCellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ContainerCellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ContainerCellAccessible.asCellAccessible: CellAccessible
  get() = reinterpret()

public object ContainerCellAccessibleFactory {
  public fun new(): ContainerCellAccessible = gtk_container_cell_accessible_new()!!.reinterpret()
}

public val ContainerCellAccessible.parent: CellAccessible
  get() = pointed.parent.ptr

public val ContainerCellAccessible.children: List?
  get() = gtk_container_cell_accessible_get_children(this)?.reinterpret()

public fun ContainerCellAccessible.addChild(child: CellAccessible?): Unit {
  gtk_container_cell_accessible_add_child(this@addChild, child?.reinterpret())
}

public fun ContainerCellAccessible.removeChild(child: CellAccessible?): Unit {
  gtk_container_cell_accessible_remove_child(this@removeChild, child?.reinterpret())
}
