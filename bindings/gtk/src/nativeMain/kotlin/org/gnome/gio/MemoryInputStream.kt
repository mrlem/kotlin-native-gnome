// TODO - constructor: new_from_data
// TODO - method: add_data (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMemoryInputStream
import interop.g_memory_input_stream_add_bytes
import interop.g_memory_input_stream_new
import interop.g_memory_input_stream_new_from_bytes
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Bytes
import org.gnome.gobject.Object

public typealias MemoryInputStream = CPointer<GMemoryInputStream>

public val MemoryInputStream.asObject: Object
  get() = reinterpret()

public val MemoryInputStream.asInputStream: InputStream
  get() = reinterpret()

public object MemoryInputStreamFactory {
  public fun new(): MemoryInputStream = g_memory_input_stream_new()!!.reinterpret()

  public fun newFromBytes(bytes: Bytes?): MemoryInputStream =
      g_memory_input_stream_new_from_bytes(bytes?.reinterpret())!!.reinterpret()
}

public val MemoryInputStream.parentInstance: InputStream
  get() = pointed.parent_instance.ptr

public fun MemoryInputStream.addBytes(bytes: Bytes?): Unit {
  g_memory_input_stream_add_bytes(this@addBytes, bytes?.reinterpret())
}
