// TODO - method: get_cairo_context
// TODO - method: get_clip
// TODO - method: get_window
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDrawingContext
import interop.gdk_drawing_context_is_valid
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias DrawingContext = CPointer<GdkDrawingContext>

public val DrawingContext.asObject: Object
  get() = reinterpret()

public fun DrawingContext.isValid(): Boolean =
    gdk_drawing_context_is_valid(this@isValid).toBoolean()
