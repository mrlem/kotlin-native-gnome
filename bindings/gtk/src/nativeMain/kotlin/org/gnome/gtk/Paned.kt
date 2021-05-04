// TODO - method: get_handle_window
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPaned
import interop.gtk_paned_add1
import interop.gtk_paned_add2
import interop.gtk_paned_get_child1
import interop.gtk_paned_get_child2
import interop.gtk_paned_get_position
import interop.gtk_paned_get_wide_handle
import interop.gtk_paned_new
import interop.gtk_paned_pack1
import interop.gtk_paned_pack2
import interop.gtk_paned_set_position
import interop.gtk_paned_set_wide_handle
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias Paned = CPointer<GtkPaned>

public val Paned.asObject: Object
  get() = reinterpret()

public val Paned.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Paned.asWidget: Widget
  get() = reinterpret()

public val Paned.asContainer: Container
  get() = reinterpret()

public object PanedFactory {
  public fun new(orientation: Orientation): Paned = gtk_paned_new(orientation)!!.reinterpret()
}

public val Paned.container: Container
  get() = pointed.container.ptr

public val Paned.child1: Widget?
  get() = gtk_paned_get_child1(this)?.reinterpret()

public val Paned.child2: Widget?
  get() = gtk_paned_get_child2(this)?.reinterpret()

public var Paned.position: Int
  get() = gtk_paned_get_position(this)
  set(`value`) {
    gtk_paned_set_position(this@position, `value`)
  }

public var Paned.wideHandle: Boolean
  get() = gtk_paned_get_wide_handle(this).toBoolean()
  set(`value`) {
    gtk_paned_set_wide_handle(this@wideHandle, `value`.toInt())
  }

public fun Paned.add1(child: Widget?): Unit {
  gtk_paned_add1(this@add1, child?.reinterpret())
}

public fun Paned.add2(child: Widget?): Unit {
  gtk_paned_add2(this@add2, child?.reinterpret())
}

public fun Paned.pack1(
  child: Widget?,
  resize: Boolean,
  shrink: Boolean
): Unit {
  gtk_paned_pack1(this@pack1, child?.reinterpret(), resize.toInt(), shrink.toInt())
}

public fun Paned.pack2(
  child: Widget?,
  resize: Boolean,
  shrink: Boolean
): Unit {
  gtk_paned_pack2(this@pack2, child?.reinterpret(), resize.toInt(), shrink.toInt())
}

public fun Paned.onAcceptPosition(callback: (Paned) -> Unit): Paned {
  // TODO - handle callback data

  asObject.connect("accept-position") { callback(this) }
  return this
}

public fun Paned.onCancelPosition(callback: (Paned) -> Unit): Paned {
  // TODO - handle callback data

  asObject.connect("cancel-position") { callback(this) }
  return this
}

public fun Paned.onCycleChildFocus(callback: (Paned) -> Unit): Paned {
  // TODO - handle callback data

  asObject.connect("cycle-child-focus") { callback(this) }
  return this
}

public fun Paned.onCycleHandleFocus(callback: (Paned) -> Unit): Paned {
  // TODO - handle callback data

  asObject.connect("cycle-handle-focus") { callback(this) }
  return this
}

public fun Paned.onMoveHandle(callback: (Paned) -> Unit): Paned {
  // TODO - handle callback data

  asObject.connect("move-handle") { callback(this) }
  return this
}

public fun Paned.onToggleHandleFocus(callback: (Paned) -> Unit): Paned {
  // TODO - handle callback data

  asObject.connect("toggle-handle-focus") { callback(this) }
  return this
}
