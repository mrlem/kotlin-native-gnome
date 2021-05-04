// TODO - constructor: new
// TODO - constructor: new_with_mime_type
// TODO - constructor: new_with_type
// TODO - method: get_animation (return type)
// TODO - method: get_format (return type)
// TODO - method: get_pixbuf (return type)
// TODO - method: write_bytes (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdkpixbuf

import interop.GError
import interop.GdkPixbufLoader
import interop.gdk_pixbuf_loader_close
import interop.gdk_pixbuf_loader_set_size
import interop.gdk_pixbuf_loader_write
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
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.mrlem.gnome.gobject.connect

public typealias PixbufLoader = CPointer<GdkPixbufLoader>

public val PixbufLoader.asObject: Object
  get() = reinterpret()

public object PixbufLoaderFactory

public val PixbufLoader.parentInstance: Object
  get() = pointed.parent_instance.ptr

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
