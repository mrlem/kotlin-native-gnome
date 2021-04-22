@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkDrawingArea
import interop.gtk_drawing_area_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias DrawingArea = CPointer<GtkDrawingArea>

public val DrawingArea.asObject: Object
  get() = reinterpret()

public val DrawingArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val DrawingArea.asWidget: Widget
  get() = reinterpret()

public object DrawingAreaFactory {
  public fun new(): DrawingArea = gtk_drawing_area_new()!!.reinterpret()
}
