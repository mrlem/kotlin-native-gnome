// TODO - method: query_info_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GFileOutputStream
import interop.g_file_output_stream_get_etag
import interop.g_file_output_stream_query_info
import interop.g_file_output_stream_query_info_finish
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

public typealias FileOutputStream = CPointer<GFileOutputStream>

public val FileOutputStream.asObject: Object
  get() = reinterpret()

public val FileOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val FileOutputStream.parentInstance: OutputStream
  get() = pointed.parent_instance.ptr

public val FileOutputStream.etag: String?
  get() = g_file_output_stream_get_etag(this).toKString()

@Throws(Error::class)
public fun FileOutputStream.queryInfo(attributes: String?, cancellable: Cancellable?): FileInfo? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_output_stream_query_info(this@queryInfo, attributes,
      cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun FileOutputStream.queryInfoFinish(result: AsyncResult?): FileInfo? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_output_stream_query_info_finish(this@queryInfoFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
