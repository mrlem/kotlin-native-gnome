@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFilterInputStream
import interop.g_filter_input_stream_get_base_stream
import interop.g_filter_input_stream_get_close_base_stream
import interop.g_filter_input_stream_set_close_base_stream
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias FilterInputStream = CPointer<GFilterInputStream>

public val FilterInputStream.asObject: Object
  get() = reinterpret()

public val FilterInputStream.asInputStream: InputStream
  get() = reinterpret()

public val FilterInputStream.baseStream: InputStream?
  get() = g_filter_input_stream_get_base_stream(this)?.reinterpret()

public var FilterInputStream.closeBaseStream: Boolean
  get() = g_filter_input_stream_get_close_base_stream(this).toBoolean
  set(`value`) {
    g_filter_input_stream_set_close_base_stream(this, value.toInt)
  }
