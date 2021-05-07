@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GdkPixbufSimpleAnim
import interop.gdk_pixbuf_simple_anim_add_frame
import interop.gdk_pixbuf_simple_anim_get_loop
import interop.gdk_pixbuf_simple_anim_new
import interop.gdk_pixbuf_simple_anim_set_loop
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias PixbufSimpleAnim = CPointer<GdkPixbufSimpleAnim>

public val PixbufSimpleAnim.asObject: Object
  get() = reinterpret()

public val PixbufSimpleAnim.asPixbufAnimation: PixbufAnimation
  get() = reinterpret()

public object PixbufSimpleAnimFactory {
  public fun new(
    width: Int,
    height: Int,
    rate: Float
  ): PixbufSimpleAnim = gdk_pixbuf_simple_anim_new(width, height, rate)!!.reinterpret()
}

public var PixbufSimpleAnim.loop: Boolean
  get() = gdk_pixbuf_simple_anim_get_loop(this).toBoolean()
  set(`value`) {
    gdk_pixbuf_simple_anim_set_loop(this@loop, `value`.toInt())
  }

public fun PixbufSimpleAnim.addFrame(pixbuf: Pixbuf?): Unit {
  gdk_pixbuf_simple_anim_add_frame(this@addFrame, pixbuf?.reinterpret())
}
