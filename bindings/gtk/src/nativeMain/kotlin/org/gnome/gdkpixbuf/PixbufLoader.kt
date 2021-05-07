// TODO - constructor: new_with_mime_type
// TODO - constructor: new_with_type
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GError
import interop.GdkPixbufLoader
import interop.gdk_pixbuf_loader_close
import interop.gdk_pixbuf_loader_get_animation
import interop.gdk_pixbuf_loader_get_format
import interop.gdk_pixbuf_loader_get_pixbuf
import interop.gdk_pixbuf_loader_new
import interop.gdk_pixbuf_loader_set_size
import interop.gdk_pixbuf_loader_write
import interop.gdk_pixbuf_loader_write_bytes
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Throws
import kotlin.UByte
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Bytes
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray

public typealias PixbufLoader = CPointer<GdkPixbufLoader>

public val PixbufLoader.asObject: Object
  get() = reinterpret()

public object PixbufLoaderFactory {
  public fun new(): PixbufLoader = gdk_pixbuf_loader_new()!!.reinterpret()
}

public val PixbufLoader.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val PixbufLoader.animation: PixbufAnimation?
  get() = gdk_pixbuf_loader_get_animation(this)?.reinterpret()

public val PixbufLoader.format: PixbufFormat?
  get() = gdk_pixbuf_loader_get_format(this)?.reinterpret()

public val PixbufLoader.pixbuf: Pixbuf?
  get() = gdk_pixbuf_loader_get_pixbuf(this)?.reinterpret()

@Throws(Error::class)
public fun PixbufLoader.close(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gdk_pixbuf_loader_close(this@close, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PixbufLoader.setSize(width: Int, height: Int): Unit {
  gdk_pixbuf_loader_set_size(this@setSize, width, height)
}

@Throws(Error::class)
public fun PixbufLoader.write(buf: Array<UByte>?, count: ULong): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = memScoped { gdk_pixbuf_loader_write(this@write, buf?.toCArray(memScope),
      count, errors).toBoolean() }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun PixbufLoader.writeBytes(buffer: Bytes?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gdk_pixbuf_loader_write_bytes(this@writeBytes, buffer?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PixbufLoader.onAreaPrepared(callback: (PixbufLoader) -> Unit): PixbufLoader {
  // TODO - handle callback data

  asObject.connect("area-prepared") { callback(this) }
  return this
}

public fun PixbufLoader.onAreaUpdated(callback: (PixbufLoader) -> Unit): PixbufLoader {
  // TODO - handle callback data

  asObject.connect("area-updated") { callback(this) }
  return this
}

public fun PixbufLoader.onClosed(callback: (PixbufLoader) -> Unit): PixbufLoader {
  // TODO - handle callback data

  asObject.connect("closed") { callback(this) }
  return this
}

public fun PixbufLoader.onSizePrepared(callback: (PixbufLoader) -> Unit): PixbufLoader {
  // TODO - handle callback data

  asObject.connect("size-prepared") { callback(this) }
  return this
}
