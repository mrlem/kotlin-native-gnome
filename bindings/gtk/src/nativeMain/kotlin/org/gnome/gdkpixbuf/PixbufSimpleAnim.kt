// TODO - constructor: new
// TODO - method: add_frame
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GdkPixbufSimpleAnim
import interop.gdk_pixbuf_simple_anim_get_loop
import interop.gdk_pixbuf_simple_anim_set_loop
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias PixbufSimpleAnim = CPointer<GdkPixbufSimpleAnim>

public val PixbufSimpleAnim.asObject: Object
  get() = reinterpret()

public val PixbufSimpleAnim.asPixbufAnimation: PixbufAnimation
  get() = reinterpret()

public object PixbufSimpleAnimFactory

public var PixbufSimpleAnim.loop: Boolean
  get() = gdk_pixbuf_simple_anim_get_loop(this).toBoolean()
  set(`value`) {
    gdk_pixbuf_simple_anim_set_loop(this@loop, `value`.toInt())
  }
