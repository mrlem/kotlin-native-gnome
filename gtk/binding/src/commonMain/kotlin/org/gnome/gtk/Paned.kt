// TODO - method: get_handle_window
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

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
import org.gnome.gobject.connect
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

public val Paned.child1: Widget?
  get() = gtk_paned_get_child1(this)?.reinterpret()

public val Paned.child2: Widget?
  get() = gtk_paned_get_child2(this)?.reinterpret()

public var Paned.position: Int
  get() = gtk_paned_get_position(this)
  set(`value`) {
    gtk_paned_set_position(this, value)
  }

public var Paned.wideHandle: Boolean
  get() = gtk_paned_get_wide_handle(this).toBoolean
  set(`value`) {
    gtk_paned_set_wide_handle(this, value.toInt)
  }

public fun Paned.add1(child: Widget?): Unit {
  gtk_paned_add1(this, child?.reinterpret())
}

public fun Paned.add2(child: Widget?): Unit {
  gtk_paned_add2(this, child?.reinterpret())
}

public fun Paned.pack1(
  child: Widget?,
  resize: Boolean,
  shrink: Boolean
): Unit {
  gtk_paned_pack1(this, child?.reinterpret(), resize.toInt, shrink.toInt)
}

public fun Paned.pack2(
  child: Widget?,
  resize: Boolean,
  shrink: Boolean
): Unit {
  gtk_paned_pack2(this, child?.reinterpret(), resize.toInt, shrink.toInt)
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
