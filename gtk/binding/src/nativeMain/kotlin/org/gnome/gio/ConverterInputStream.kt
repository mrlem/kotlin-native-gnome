// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GConverterInputStream
import interop.g_converter_input_stream_get_converter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ConverterInputStream = CPointer<GConverterInputStream>

public val ConverterInputStream.asObject: Object
  get() = reinterpret()

public val ConverterInputStream.asInputStream: InputStream
  get() = reinterpret()

public val ConverterInputStream.asFilterInputStream: FilterInputStream
  get() = reinterpret()

public object ConverterInputStreamFactory

public val ConverterInputStream.converter: Converter?
  get() = g_converter_input_stream_get_converter(this)?.reinterpret()