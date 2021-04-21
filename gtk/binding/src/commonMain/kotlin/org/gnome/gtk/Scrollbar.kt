@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkScrollbar
import gtk3.gtk_scrollbar_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Scrollbar = CPointer<GtkScrollbar>

public val Scrollbar.asObject: Object
  get() = reinterpret()

public val Scrollbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Scrollbar.asWidget: Widget
  get() = reinterpret()

public val Scrollbar.asRange: Range
  get() = reinterpret()

public object ScrollbarFactory {
  public fun new(orientation: Orientation, adjustment: Adjustment?): Scrollbar =
      gtk_scrollbar_new(orientation, adjustment?.reinterpret())!!.reinterpret()
}
