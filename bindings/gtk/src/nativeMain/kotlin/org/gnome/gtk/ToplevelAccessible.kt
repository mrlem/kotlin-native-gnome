@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToplevelAccessible
import interop.gtk_toplevel_accessible_get_children
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.List
import org.gnome.gobject.Object

public typealias ToplevelAccessible = CPointer<GtkToplevelAccessible>

public val ToplevelAccessible.asObject: Object
  get() = reinterpret()

public val ToplevelAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ToplevelAccessible.parent: org.gnome.atk.Object
  get() = pointed.parent.ptr

public val ToplevelAccessible.children: List?
  get() = gtk_toplevel_accessible_get_children(this)?.reinterpret()
