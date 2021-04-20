// TODO - get_children
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkToplevelAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ToplevelAccessible = CPointer<GtkToplevelAccessible>

public val ToplevelAccessible.asObject: Object
  get() = reinterpret()

public val ToplevelAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()
