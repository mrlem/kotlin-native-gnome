// TODO - method: get_children
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToplevelAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ToplevelAccessible = CPointer<GtkToplevelAccessible>

public val ToplevelAccessible.asObject: Object
  get() = reinterpret()

public val ToplevelAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()
