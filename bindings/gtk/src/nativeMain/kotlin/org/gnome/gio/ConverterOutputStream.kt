// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GConverterOutputStream
import interop.g_converter_output_stream_get_converter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ConverterOutputStream = CPointer<GConverterOutputStream>

public val ConverterOutputStream.asObject: Object
  get() = reinterpret()

public val ConverterOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val ConverterOutputStream.asFilterOutputStream: FilterOutputStream
  get() = reinterpret()

public object ConverterOutputStreamFactory

public val ConverterOutputStream.converter: Converter?
  get() = g_converter_output_stream_get_converter(this)?.reinterpret()
