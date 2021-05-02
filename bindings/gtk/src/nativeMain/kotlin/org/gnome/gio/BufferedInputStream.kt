// TODO - constructor: new
// TODO - constructor: new_sized
// TODO - method: fill
// TODO - method: fill_async
// TODO - method: fill_finish
// TODO - method: peek
// TODO - method: peek_buffer
// TODO - method: read_byte
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GBufferedInputStream
import interop.g_buffered_input_stream_get_available
import interop.g_buffered_input_stream_get_buffer_size
import interop.g_buffered_input_stream_set_buffer_size
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias BufferedInputStream = CPointer<GBufferedInputStream>

public val BufferedInputStream.asObject: Object
  get() = reinterpret()

public val BufferedInputStream.asInputStream: InputStream
  get() = reinterpret()

public val BufferedInputStream.asFilterInputStream: FilterInputStream
  get() = reinterpret()

public object BufferedInputStreamFactory

public val BufferedInputStream.parentInstance: FilterInputStream
  get() = pointed.parent_instance.ptr

public val BufferedInputStream.available: ULong
  get() = g_buffered_input_stream_get_available(this)

public var BufferedInputStream.bufferSize: ULong
  get() = g_buffered_input_stream_get_buffer_size(this)
  set(`value`) {
    g_buffered_input_stream_set_buffer_size(this, `value`)
  }
