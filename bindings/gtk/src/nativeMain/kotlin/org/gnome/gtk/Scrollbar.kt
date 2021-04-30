@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScrollbar
import interop.gtk_scrollbar_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val Scrollbar.range: Range
  get() = pointed.range.ptr
