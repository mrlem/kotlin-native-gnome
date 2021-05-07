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
// TODO - method: get_pixels_with_length (param type)
// TODO - method: save (param type)
// TODO - method: save_to_buffer (param type)
// TODO - method: save_to_bufferv (param type)
// TODO - method: save_to_callback (param type)
// TODO - method: save_to_callbackv (param type)
// TODO - method: save_to_stream (param type)
// TODO - method: save_to_stream_async (param type)
// TODO - method: save_to_streamv_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GError
import interop.GdkPixbuf
import interop.gdk_pixbuf_add_alpha
import interop.gdk_pixbuf_apply_embedded_orientation
import interop.gdk_pixbuf_composite
import interop.gdk_pixbuf_composite_color
import interop.gdk_pixbuf_composite_color_simple
import interop.gdk_pixbuf_copy
import interop.gdk_pixbuf_copy_area
import interop.gdk_pixbuf_copy_options
import interop.gdk_pixbuf_fill
import interop.gdk_pixbuf_flip
import interop.gdk_pixbuf_get_bits_per_sample
import interop.gdk_pixbuf_get_byte_length
import interop.gdk_pixbuf_get_colorspace
import interop.gdk_pixbuf_get_has_alpha
import interop.gdk_pixbuf_get_height
import interop.gdk_pixbuf_get_n_channels
import interop.gdk_pixbuf_get_option
import interop.gdk_pixbuf_get_options
import interop.gdk_pixbuf_get_pixels
import interop.gdk_pixbuf_get_rowstride
import interop.gdk_pixbuf_get_width
import interop.gdk_pixbuf_new
import interop.gdk_pixbuf_new_from_bytes
import interop.gdk_pixbuf_new_from_xpm_data
import interop.gdk_pixbuf_new_subpixbuf
import interop.gdk_pixbuf_read_pixel_bytes
import interop.gdk_pixbuf_remove_option
import interop.gdk_pixbuf_rotate_simple
import interop.gdk_pixbuf_saturate_and_pixelate
import interop.gdk_pixbuf_save_to_streamv
import interop.gdk_pixbuf_savev
import interop.gdk_pixbuf_scale
import interop.gdk_pixbuf_scale_simple
import interop.gdk_pixbuf_set_option
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
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
import org.gnome.glib.Bytes
import org.gnome.glib.HashTable
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toInt
import org.gnome.toKArray
import org.gnome.toKString
import org.mrlem.gnome.glib.Error

public typealias Pixbuf = CPointer<GdkPixbuf>

public val Pixbuf.asObject: Object
  get() = reinterpret()

public object PixbufFactory {
  public fun new(
    colorspace: Colorspace,
    hasAlpha: Boolean,
    bitsPerSample: Int,
    width: Int,
    height: Int
  ): Pixbuf = gdk_pixbuf_new(colorspace, hasAlpha.toInt(), bitsPerSample, width,
      height)!!.reinterpret()

  public fun newFromBytes(
    `data`: Bytes?,
    colorspace: Colorspace,
    hasAlpha: Boolean,
    bitsPerSample: Int,
    width: Int,
    height: Int,
    rowstride: Int
  ): Pixbuf = gdk_pixbuf_new_from_bytes(`data`?.reinterpret(), colorspace, hasAlpha.toInt(),
      bitsPerSample, width, height, rowstride)!!.reinterpret()

  public fun newFromXpmData(`data`: Array<String>?): Pixbuf = memScoped {
      gdk_pixbuf_new_from_xpm_data(`data`?.toCArray(memScope))!!.reinterpret() }
}

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

public val Pixbuf.options: HashTable?
  get() = gdk_pixbuf_get_options(this)?.reinterpret()

public val Pixbuf.pixels: Array<UByte>?
  get() = gdk_pixbuf_get_pixels(this)?.toKArray { it!!.`value` }

public val Pixbuf.rowstride: Int
  get() = gdk_pixbuf_get_rowstride(this)

public val Pixbuf.width: Int
  get() = gdk_pixbuf_get_width(this)

public fun Pixbuf.addAlpha(
  substituteColor: Boolean,
  r: UByte,
  g: UByte,
  b: UByte
): Pixbuf? = gdk_pixbuf_add_alpha(this@addAlpha, substituteColor.toInt(), r, g, b)?.reinterpret()

public fun Pixbuf.applyEmbeddedOrientation(): Pixbuf? =
    gdk_pixbuf_apply_embedded_orientation(this@applyEmbeddedOrientation)?.reinterpret()

public fun Pixbuf.composite(
  dest: Pixbuf?,
  destX: Int,
  destY: Int,
  destWidth: Int,
  destHeight: Int,
  offsetX: Double,
  offsetY: Double,
  scaleX: Double,
  scaleY: Double,
  interpType: InterpType,
  overallAlpha: Int
): Unit {
  gdk_pixbuf_composite(this@composite, dest?.reinterpret(), destX, destY, destWidth, destHeight,
      offsetX, offsetY, scaleX, scaleY, interpType, overallAlpha)
}

public fun Pixbuf.compositeColor(
  dest: Pixbuf?,
  destX: Int,
  destY: Int,
  destWidth: Int,
  destHeight: Int,
  offsetX: Double,
  offsetY: Double,
  scaleX: Double,
  scaleY: Double,
  interpType: InterpType,
  overallAlpha: Int,
  checkX: Int,
  checkY: Int,
  checkSize: Int,
  color1: UInt,
  color2: UInt
): Unit {
  gdk_pixbuf_composite_color(this@compositeColor, dest?.reinterpret(), destX, destY, destWidth,
      destHeight, offsetX, offsetY, scaleX, scaleY, interpType, overallAlpha, checkX, checkY,
      checkSize, color1, color2)
}

public fun Pixbuf.compositeColorSimple(
  destWidth: Int,
  destHeight: Int,
  interpType: InterpType,
  overallAlpha: Int,
  checkSize: Int,
  color1: UInt,
  color2: UInt
): Pixbuf? = gdk_pixbuf_composite_color_simple(this@compositeColorSimple, destWidth, destHeight,
    interpType, overallAlpha, checkSize, color1, color2)?.reinterpret()

public fun Pixbuf.copy(): Pixbuf? = gdk_pixbuf_copy(this@copy)?.reinterpret()

public fun Pixbuf.copyArea(
  srcX: Int,
  srcY: Int,
  width: Int,
  height: Int,
  destPixbuf: Pixbuf?,
  destX: Int,
  destY: Int
): Unit {
  gdk_pixbuf_copy_area(this@copyArea, srcX, srcY, width, height, destPixbuf?.reinterpret(), destX,
      destY)
}

public fun Pixbuf.copyOptions(destPixbuf: Pixbuf?): Boolean =
    gdk_pixbuf_copy_options(this@copyOptions, destPixbuf?.reinterpret()).toBoolean()

public fun Pixbuf.fill(pixel: UInt): Unit {
  gdk_pixbuf_fill(this@fill, pixel)
}

public fun Pixbuf.flip(horizontal: Boolean): Pixbuf? = gdk_pixbuf_flip(this@flip,
    horizontal.toInt())?.reinterpret()

public fun Pixbuf.getOption(key: String?): String? = gdk_pixbuf_get_option(this@getOption,
    key).toKString()

public fun Pixbuf.newSubpixbuf(
  srcX: Int,
  srcY: Int,
  width: Int,
  height: Int
): Pixbuf? = gdk_pixbuf_new_subpixbuf(this@newSubpixbuf, srcX, srcY, width, height)?.reinterpret()

public fun Pixbuf.readPixelBytes(): Bytes? =
    gdk_pixbuf_read_pixel_bytes(this@readPixelBytes)?.reinterpret()

public fun Pixbuf.removeOption(key: String?): Boolean = gdk_pixbuf_remove_option(this@removeOption,
    key).toBoolean()

public fun Pixbuf.rotateSimple(angle: PixbufRotation): Pixbuf? =
    gdk_pixbuf_rotate_simple(this@rotateSimple, angle)?.reinterpret()

public fun Pixbuf.saturateAndPixelate(
  dest: Pixbuf?,
  saturation: Float,
  pixelate: Boolean
): Unit {
  gdk_pixbuf_saturate_and_pixelate(this@saturateAndPixelate, dest?.reinterpret(), saturation,
      pixelate.toInt())
}

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

public fun Pixbuf.scale(
  dest: Pixbuf?,
  destX: Int,
  destY: Int,
  destWidth: Int,
  destHeight: Int,
  offsetX: Double,
  offsetY: Double,
  scaleX: Double,
  scaleY: Double,
  interpType: InterpType
): Unit {
  gdk_pixbuf_scale(this@scale, dest?.reinterpret(), destX, destY, destWidth, destHeight, offsetX,
      offsetY, scaleX, scaleY, interpType)
}

public fun Pixbuf.scaleSimple(
  destWidth: Int,
  destHeight: Int,
  interpType: InterpType
): Pixbuf? = gdk_pixbuf_scale_simple(this@scaleSimple, destWidth, destHeight,
    interpType)?.reinterpret()

public fun Pixbuf.setOption(key: String?, `value`: String?): Boolean =
    gdk_pixbuf_set_option(this@setOption, key, `value`).toBoolean()
