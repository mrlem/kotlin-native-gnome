@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFixed
import interop.gtk_fixed_move
import interop.gtk_fixed_new
import interop.gtk_fixed_put
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Fixed = CPointer<GtkFixed>

public val Fixed.asObject: Object
  get() = reinterpret()

public val Fixed.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Fixed.asWidget: Widget
  get() = reinterpret()

public val Fixed.asContainer: Container
  get() = reinterpret()

public object FixedFactory {
  public fun new(): Fixed = gtk_fixed_new()!!.reinterpret()
}

public val Fixed.container: Container
  get() = pointed.container.ptr

public fun Fixed.move(
  widget: Widget?,
  x: Int,
  y: Int
): Unit {
  gtk_fixed_move(this, widget?.reinterpret(), x, y)
}

public fun Fixed.put(
  widget: Widget?,
  x: Int,
  y: Int
): Unit {
  gtk_fixed_put(this, widget?.reinterpret(), x, y)
}
