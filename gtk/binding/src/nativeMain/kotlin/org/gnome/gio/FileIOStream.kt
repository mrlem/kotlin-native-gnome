// TODO - method: query_info
// TODO - method: query_info_async
// TODO - method: query_info_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileIOStream
import interop.g_file_io_stream_get_etag
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias FileIOStream = CPointer<GFileIOStream>

public val FileIOStream.asObject: Object
  get() = reinterpret()

public val FileIOStream.asIOStream: IOStream
  get() = reinterpret()

public val FileIOStream.etag: String
  get() = g_file_io_stream_get_etag(this).toKString
