@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GtkToplevelAccessible
import interop.gtk_toplevel_accessible_get_children
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toKList

public typealias ToplevelAccessible = CPointer<GtkToplevelAccessible>

public val ToplevelAccessible.asObject: Object
  get() = reinterpret()

public val ToplevelAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ToplevelAccessible.parent: org.gnome.atk.Object
  get() = pointed.parent.ptr

public val ToplevelAccessible.children: List<Window>?
  get() = gtk_toplevel_accessible_get_children(this)?.reinterpret<GList>()?.toKList()
