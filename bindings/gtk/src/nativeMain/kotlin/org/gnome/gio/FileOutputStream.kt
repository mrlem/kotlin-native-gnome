// TODO - method: query_info
// TODO - method: query_info_async
// TODO - method: query_info_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileOutputStream
import interop.g_file_output_stream_get_etag
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias FileOutputStream = CPointer<GFileOutputStream>

public val FileOutputStream.asObject: Object
  get() = reinterpret()

public val FileOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val FileOutputStream.parentInstance: OutputStream
  get() = pointed.parent_instance.ptr

public val FileOutputStream.etag: String
  get() = g_file_output_stream_get_etag(this).toKString
