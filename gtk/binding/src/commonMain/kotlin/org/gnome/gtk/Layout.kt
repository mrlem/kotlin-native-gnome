// TODO - method: get_bin_window
// TODO - method: get_hadjustment
// TODO - method: get_size
// TODO - method: get_vadjustment
// TODO - method: set_hadjustment
// TODO - method: set_vadjustment
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkLayout
import gtk3.gtk_layout_move
import gtk3.gtk_layout_new
import gtk3.gtk_layout_put
import gtk3.gtk_layout_set_size
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Layout = CPointer<GtkLayout>

public val Layout.asObject: Object
  get() = reinterpret()

public val Layout.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Layout.asWidget: Widget
  get() = reinterpret()

public val Layout.asContainer: Container
  get() = reinterpret()

public object LayoutFactory {
  public fun new(hadjustment: Adjustment?, vadjustment: Adjustment?): Layout =
      gtk_layout_new(hadjustment?.reinterpret(), vadjustment?.reinterpret())!!.reinterpret()
}

public fun Layout.move(
  childWidget: Widget?,
  x: Int,
  y: Int
): Unit {
  gtk_layout_move(this, childWidget?.reinterpret(), x, y)
}

public fun Layout.put(
  childWidget: Widget?,
  x: Int,
  y: Int
): Unit {
  gtk_layout_put(this, childWidget?.reinterpret(), x, y)
}

public fun Layout.setSize(width: UInt, height: UInt): Unit {
  gtk_layout_set_size(this, width, height)
}
