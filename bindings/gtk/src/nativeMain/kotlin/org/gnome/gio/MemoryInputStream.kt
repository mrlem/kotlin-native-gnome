// TODO - constructor: new_from_bytes
// TODO - constructor: new_from_data
// TODO - method: add_bytes
// TODO - method: add_data
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMemoryInputStream
import interop.g_memory_input_stream_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MemoryInputStream = CPointer<GMemoryInputStream>

public val MemoryInputStream.asObject: Object
  get() = reinterpret()

public val MemoryInputStream.asInputStream: InputStream
  get() = reinterpret()

public object MemoryInputStreamFactory {
  public fun new(): MemoryInputStream = g_memory_input_stream_new()!!.reinterpret()
}
