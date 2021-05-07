// TODO - method: get_data (return type)
// TODO - method: steal_data (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMemoryOutputStream
import interop.g_memory_output_stream_get_data_size
import interop.g_memory_output_stream_get_size
import interop.g_memory_output_stream_new_resizable
import interop.g_memory_output_stream_steal_as_bytes
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Bytes
import org.gnome.gobject.Object

public typealias MemoryOutputStream = CPointer<GMemoryOutputStream>

public val MemoryOutputStream.asObject: Object
  get() = reinterpret()

public val MemoryOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public object MemoryOutputStreamFactory {
  public fun newResizable(): MemoryOutputStream =
      g_memory_output_stream_new_resizable()!!.reinterpret()
}

public val MemoryOutputStream.parentInstance: OutputStream
  get() = pointed.parent_instance.ptr

public val MemoryOutputStream.dataSize: ULong
  get() = g_memory_output_stream_get_data_size(this)

public val MemoryOutputStream.size: ULong
  get() = g_memory_output_stream_get_size(this)

public fun MemoryOutputStream.stealAsBytes(): Bytes? =
    g_memory_output_stream_steal_as_bytes(this@stealAsBytes)?.reinterpret()
