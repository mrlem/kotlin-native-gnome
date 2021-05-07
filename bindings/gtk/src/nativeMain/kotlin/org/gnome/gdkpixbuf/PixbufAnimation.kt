// TODO - constructor: new_from_file
// TODO - constructor: new_from_resource
// TODO - constructor: new_from_stream
// TODO - constructor: new_from_stream_finish
// TODO - method: get_iter (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GdkPixbufAnimation
import interop.gdk_pixbuf_animation_get_height
import interop.gdk_pixbuf_animation_get_static_image
import interop.gdk_pixbuf_animation_get_width
import interop.gdk_pixbuf_animation_is_static_image
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean

public typealias PixbufAnimation = CPointer<GdkPixbufAnimation>

public val PixbufAnimation.asObject: Object
  get() = reinterpret()

public object PixbufAnimationFactory

public val PixbufAnimation.height: Int
  get() = gdk_pixbuf_animation_get_height(this)

public val PixbufAnimation.staticImage: Pixbuf?
  get() = gdk_pixbuf_animation_get_static_image(this)?.reinterpret()

public val PixbufAnimation.width: Int
  get() = gdk_pixbuf_animation_get_width(this)

public fun PixbufAnimation.isStaticImage(): Boolean =
    gdk_pixbuf_animation_is_static_image(this@isStaticImage).toBoolean()
