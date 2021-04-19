// TODO - get_handle_window
//
package org.gnome.gtk

import gtk3.GtkPaned
import gtk3.gtk_paned_add1
import gtk3.gtk_paned_add2
import gtk3.gtk_paned_get_child1
import gtk3.gtk_paned_get_child2
import gtk3.gtk_paned_get_position
import gtk3.gtk_paned_get_wide_handle
import gtk3.gtk_paned_pack1
import gtk3.gtk_paned_pack2
import gtk3.gtk_paned_set_position
import gtk3.gtk_paned_set_wide_handle
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Paned = CPointer<GtkPaned>

public val Paned.asObject: Object
  get() = reinterpret()

public val Paned.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Paned.asWidget: Widget
  get() = reinterpret()

public val Paned.asContainer: Container
  get() = reinterpret()

public fun Paned.add1(child: Widget): Unit {
  gtk_paned_add1(this, child.reinterpret())
}

public fun Paned.add2(child: Widget): Unit {
  gtk_paned_add2(this, child.reinterpret())
}

public fun Paned.getChild1(): Widget? = gtk_paned_get_child1(this)?.reinterpret()

public fun Paned.getChild2(): Widget? = gtk_paned_get_child2(this)?.reinterpret()

public fun Paned.getPosition(): Int = gtk_paned_get_position(this)

public fun Paned.getWideHandle(): Boolean = gtk_paned_get_wide_handle(this).toBoolean

public fun Paned.pack1(
  child: Widget,
  resize: Boolean,
  shrink: Boolean
): Unit {
  gtk_paned_pack1(this, child.reinterpret(), resize.toInt, shrink.toInt)
}

public fun Paned.pack2(
  child: Widget,
  resize: Boolean,
  shrink: Boolean
): Unit {
  gtk_paned_pack2(this, child.reinterpret(), resize.toInt, shrink.toInt)
}

public fun Paned.setPosition(position: Int): Unit {
  gtk_paned_set_position(this, position)
}

public fun Paned.setWideHandle(wide: Boolean): Unit {
  gtk_paned_set_wide_handle(this, wide.toInt)
}
