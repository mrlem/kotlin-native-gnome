// TODO - method: query_info_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GFileInputStream
import interop.g_file_input_stream_query_info
import interop.g_file_input_stream_query_info_finish
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

public typealias FileInputStream = CPointer<GFileInputStream>

public val FileInputStream.asObject: Object
  get() = reinterpret()

public val FileInputStream.asInputStream: InputStream
  get() = reinterpret()

public val FileInputStream.parentInstance: InputStream
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun FileInputStream.queryInfo(attributes: String?, cancellable: Cancellable?): FileInfo? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_input_stream_query_info(this@queryInfo, attributes,
      cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun FileInputStream.queryInfoFinish(result: AsyncResult?): FileInfo? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_input_stream_query_info_finish(this@queryInfoFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
