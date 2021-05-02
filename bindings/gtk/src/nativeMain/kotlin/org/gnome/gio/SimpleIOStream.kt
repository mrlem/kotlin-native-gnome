@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleIOStream
import interop.g_simple_io_stream_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SimpleIOStream = CPointer<GSimpleIOStream>

public val SimpleIOStream.asObject: Object
  get() = reinterpret()

public val SimpleIOStream.asIOStream: IOStream
  get() = reinterpret()

public object SimpleIOStreamFactory {
  public fun new(inputStream: InputStream?, outputStream: OutputStream?): SimpleIOStream =
      g_simple_io_stream_new(inputStream?.reinterpret(),
      outputStream?.reinterpret())!!.reinterpret()
}
