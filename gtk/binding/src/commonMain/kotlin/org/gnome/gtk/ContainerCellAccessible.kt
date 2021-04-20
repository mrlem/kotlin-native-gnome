// TODO - get_children
//
package org.gnome.gtk

import gtk3.GtkContainerCellAccessible
import gtk3.gtk_container_cell_accessible_add_child
import gtk3.gtk_container_cell_accessible_remove_child
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
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

public fun ContainerCellAccessible.addChild(child: CellAccessible?): Unit {
  gtk_container_cell_accessible_add_child(this, child?.reinterpret())
}

public fun ContainerCellAccessible.removeChild(child: CellAccessible?): Unit {
  gtk_container_cell_accessible_remove_child(this, child?.reinterpret())
}
