// TODO - constructor: new
// TODO - method: read_byte
// TODO - method: read_int16
// TODO - method: read_int32
// TODO - method: read_int64
// TODO - method: read_line
// TODO - method: read_line_async
// TODO - method: read_line_finish
// TODO - method: read_line_finish_utf8
// TODO - method: read_line_utf8
// TODO - method: read_uint16
// TODO - method: read_uint32
// TODO - method: read_uint64
// TODO - method: read_until
// TODO - method: read_until_async
// TODO - method: read_until_finish
// TODO - method: read_upto
// TODO - method: read_upto_async
// TODO - method: read_upto_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDataInputStream
import interop.g_data_input_stream_get_byte_order
import interop.g_data_input_stream_get_newline_type
import interop.g_data_input_stream_set_byte_order
import interop.g_data_input_stream_set_newline_type
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DataInputStream = CPointer<GDataInputStream>

public val DataInputStream.asObject: Object
  get() = reinterpret()

public val DataInputStream.asInputStream: InputStream
  get() = reinterpret()

public val DataInputStream.asFilterInputStream: FilterInputStream
  get() = reinterpret()

public val DataInputStream.asBufferedInputStream: BufferedInputStream
  get() = reinterpret()

public object DataInputStreamFactory

public val DataInputStream.parentInstance: BufferedInputStream
  get() = pointed.parent_instance.ptr

public var DataInputStream.byteOrder: DataStreamByteOrder
  get() = g_data_input_stream_get_byte_order(this)
  set(`value`) {
    g_data_input_stream_set_byte_order(this, value)
  }

public var DataInputStream.newlineType: DataStreamNewlineType
  get() = g_data_input_stream_get_newline_type(this)
  set(`value`) {
    g_data_input_stream_set_newline_type(this, value)
  }
