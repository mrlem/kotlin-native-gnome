@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GBufferedOutputStream
import interop.g_buffered_output_stream_get_auto_grow
import interop.g_buffered_output_stream_get_buffer_size
import interop.g_buffered_output_stream_new
import interop.g_buffered_output_stream_new_sized
import interop.g_buffered_output_stream_set_auto_grow
import interop.g_buffered_output_stream_set_buffer_size
import kotlin.Boolean
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias BufferedOutputStream = CPointer<GBufferedOutputStream>

public val BufferedOutputStream.asObject: Object
  get() = reinterpret()

public val BufferedOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val BufferedOutputStream.asFilterOutputStream: FilterOutputStream
  get() = reinterpret()

public object BufferedOutputStreamFactory {
  public fun new(baseStream: OutputStream?): BufferedOutputStream =
      g_buffered_output_stream_new(baseStream?.reinterpret())!!.reinterpret()

  public fun newSized(baseStream: OutputStream?, size: ULong): BufferedOutputStream =
      g_buffered_output_stream_new_sized(baseStream?.reinterpret(), size)!!.reinterpret()
}

public val BufferedOutputStream.parentInstance: FilterOutputStream
  get() = pointed.parent_instance.ptr

public var BufferedOutputStream.autoGrow: Boolean
  get() = g_buffered_output_stream_get_auto_grow(this).toBoolean()
  set(`value`) {
    g_buffered_output_stream_set_auto_grow(this@autoGrow, `value`.toInt())
  }

public var BufferedOutputStream.bufferSize: ULong
  get() = g_buffered_output_stream_get_buffer_size(this)
  set(`value`) {
    g_buffered_output_stream_set_buffer_size(this@bufferSize, `value`)
  }
