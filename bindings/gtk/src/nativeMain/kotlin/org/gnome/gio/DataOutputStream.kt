// TODO - constructor: new
// TODO - method: put_byte
// TODO - method: put_int16
// TODO - method: put_int32
// TODO - method: put_int64
// TODO - method: put_string
// TODO - method: put_uint16
// TODO - method: put_uint32
// TODO - method: put_uint64
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDataOutputStream
import interop.g_data_output_stream_get_byte_order
import interop.g_data_output_stream_set_byte_order
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DataOutputStream = CPointer<GDataOutputStream>

public val DataOutputStream.asObject: Object
  get() = reinterpret()

public val DataOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val DataOutputStream.asFilterOutputStream: FilterOutputStream
  get() = reinterpret()

public object DataOutputStreamFactory

public var DataOutputStream.byteOrder: DataStreamByteOrder
  get() = g_data_output_stream_get_byte_order(this)
  set(`value`) {
    g_data_output_stream_set_byte_order(this, value)
  }
