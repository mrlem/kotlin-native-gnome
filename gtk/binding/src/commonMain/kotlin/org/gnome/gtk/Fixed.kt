package org.gnome.gtk

import gtk3.GtkFixed
import gtk3.gtk_fixed_move
import gtk3.gtk_fixed_put
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
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
