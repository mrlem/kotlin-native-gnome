// TODO - constructor: new
// TODO - constructor: new_from_bytes
// TODO - constructor: new_from_data
// TODO - constructor: new_from_file
// TODO - constructor: new_from_file_at_scale
// TODO - constructor: new_from_file_at_size
// TODO - constructor: new_from_inline
// TODO - constructor: new_from_resource
// TODO - constructor: new_from_resource_at_scale
// TODO - constructor: new_from_stream
// TODO - constructor: new_from_stream_at_scale
// TODO - constructor: new_from_stream_finish
// TODO - constructor: new_from_xpm_data
// TODO - method: add_alpha
// TODO - method: apply_embedded_orientation
// TODO - method: composite
// TODO - method: composite_color
// TODO - method: composite_color_simple
// TODO - method: copy
// TODO - method: copy_area
// TODO - method: copy_options
// TODO - method: flip
// TODO - method: get_options
// TODO - method: get_pixels_with_length
// TODO - method: new_subpixbuf
// TODO - method: read_pixel_bytes
// TODO - method: ref
// TODO - method: rotate_simple
// TODO - method: saturate_and_pixelate
// TODO - method: save
// TODO - method: save_to_buffer
// TODO - method: save_to_bufferv
// TODO - method: save_to_callback
// TODO - method: save_to_callbackv
// TODO - method: save_to_stream
// TODO - method: save_to_stream_async
// TODO - method: save_to_streamv_async
// TODO - method: scale
// TODO - method: scale_simple
// TODO - method: unref
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GError
import interop.GdkPixbuf
import interop.gdk_pixbuf_fill
import interop.gdk_pixbuf_get_bits_per_sample
import interop.gdk_pixbuf_get_byte_length
import interop.gdk_pixbuf_get_colorspace
import interop.gdk_pixbuf_get_has_alpha
import interop.gdk_pixbuf_get_height
import interop.gdk_pixbuf_get_n_channels
import interop.gdk_pixbuf_get_option
import interop.gdk_pixbuf_get_pixels
import interop.gdk_pixbuf_get_rowstride
import interop.gdk_pixbuf_get_width
import interop.gdk_pixbuf_remove_option
import interop.gdk_pixbuf_save_to_streamv
import interop.gdk_pixbuf_savev
import interop.gdk_pixbuf_set_option
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlin.UByte
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.`value`
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.Cancellable
import org.gnome.gio.OutputStream
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toKArray
import org.gnome.toKString

public typealias Pixbuf = CPointer<GdkPixbuf>

public val Pixbuf.asObject: Object
  get() = reinterpret()

public object PixbufFactory

public val Pixbuf.bitsPerSample: Int
  get() = gdk_pixbuf_get_bits_per_sample(this)

public val Pixbuf.byteLength: ULong
  get() = gdk_pixbuf_get_byte_length(this)

public val Pixbuf.colorspace: Colorspace
  get() = gdk_pixbuf_get_colorspace(this)

public val Pixbuf.hasAlpha: Boolean
  get() = gdk_pixbuf_get_has_alpha(this).toBoolean()

public val Pixbuf.height: Int
  get() = gdk_pixbuf_get_height(this)

public val Pixbuf.nChannels: Int
  get() = gdk_pixbuf_get_n_channels(this)

public val Pixbuf.pixels: Array<UByte>?
  get() = gdk_pixbuf_get_pixels(this)?.toKArray { it!!.`value` }

public val Pixbuf.rowstride: Int
  get() = gdk_pixbuf_get_rowstride(this)

public val Pixbuf.width: Int
  get() = gdk_pixbuf_get_width(this)

public fun Pixbuf.fill(pixel: UInt): Unit {
  gdk_pixbuf_fill(this@fill, pixel)
}

public fun Pixbuf.getOption(key: String?): String? = gdk_pixbuf_get_option(this@getOption,
    key).toKString()

public fun Pixbuf.removeOption(key: String?): Boolean = gdk_pixbuf_remove_option(this@removeOption,
    key).toBoolean()

@Throws(Error::class)
public fun Pixbuf.saveToStreamv(
  stream: OutputStream?,
  type: String?,
  optionKeys: Array<String>?,
  optionValues: Array<String>?,
  cancellable: Cancellable?
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = memScoped { gdk_pixbuf_save_to_streamv(this@saveToStreamv,
      stream?.reinterpret(), type, optionKeys?.toCArray(memScope), optionValues?.toCArray(memScope),
      cancellable?.reinterpret(), errors).toBoolean() }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Pixbuf.savev(
  filename: String?,
  type: String?,
  optionKeys: Array<String>?,
  optionValues: Array<String>?
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = memScoped { gdk_pixbuf_savev(this@savev, filename, type,
      optionKeys?.toCArray(memScope), optionValues?.toCArray(memScope), errors).toBoolean() }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Pixbuf.setOption(key: String?, `value`: String?): Boolean =
    gdk_pixbuf_set_option(this@setOption, key, `value`).toBoolean()
