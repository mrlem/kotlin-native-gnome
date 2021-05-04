// TODO - method: query_info_async
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GFileIOStream
import interop.g_file_io_stream_get_etag
import interop.g_file_io_stream_query_info
import interop.g_file_io_stream_query_info_finish
import kotlin.String
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias FileIOStream = CPointer<GFileIOStream>

public val FileIOStream.asObject: Object
  get() = reinterpret()

public val FileIOStream.asIOStream: IOStream
  get() = reinterpret()

public val FileIOStream.parentInstance: IOStream
  get() = pointed.parent_instance.ptr

public val FileIOStream.etag: String?
  get() = g_file_io_stream_get_etag(this).toKString()

@Throws(Error::class)
public fun FileIOStream.queryInfo(attributes: String?, cancellable: Cancellable?): FileInfo? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_io_stream_query_info(this@queryInfo, attributes,
      cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun FileIOStream.queryInfoFinish(result: AsyncResult?): FileInfo? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_io_stream_query_info_finish(this@queryInfoFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
