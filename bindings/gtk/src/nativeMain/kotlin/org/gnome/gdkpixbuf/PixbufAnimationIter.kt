// TODO - method: advance
// TODO - method: get_pixbuf
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GdkPixbufAnimationIter
import interop.gdk_pixbuf_animation_iter_get_delay_time
import interop.gdk_pixbuf_animation_iter_on_currently_loading_frame
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias PixbufAnimationIter = CPointer<GdkPixbufAnimationIter>

public val PixbufAnimationIter.asObject: Object
  get() = reinterpret()

public val PixbufAnimationIter.delayTime: Int
  get() = gdk_pixbuf_animation_iter_get_delay_time(this)

public fun PixbufAnimationIter.onCurrentlyLoadingFrame(): Boolean =
    gdk_pixbuf_animation_iter_on_currently_loading_frame(this@onCurrentlyLoadingFrame).toBoolean()
