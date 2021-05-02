@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GConverterOutputStream
import interop.g_converter_output_stream_get_converter
import interop.g_converter_output_stream_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ConverterOutputStream = CPointer<GConverterOutputStream>

public val ConverterOutputStream.asObject: Object
  get() = reinterpret()

public val ConverterOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val ConverterOutputStream.asFilterOutputStream: FilterOutputStream
  get() = reinterpret()

public object ConverterOutputStreamFactory {
  public fun new(baseStream: OutputStream?, converter: Converter?): ConverterOutputStream =
      g_converter_output_stream_new(baseStream?.reinterpret(),
      converter?.reinterpret())!!.reinterpret()
}

public val ConverterOutputStream.parentInstance: FilterOutputStream
  get() = pointed.parent_instance.ptr

public val ConverterOutputStream.converter: Converter?
  get() = g_converter_output_stream_get_converter(this)?.reinterpret()
