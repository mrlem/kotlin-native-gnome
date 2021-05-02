@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFilterOutputStream
import interop.g_filter_output_stream_get_base_stream
import interop.g_filter_output_stream_get_close_base_stream
import interop.g_filter_output_stream_set_close_base_stream
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias FilterOutputStream = CPointer<GFilterOutputStream>

public val FilterOutputStream.asObject: Object
  get() = reinterpret()

public val FilterOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val FilterOutputStream.parentInstance: OutputStream
  get() = pointed.parent_instance.ptr

public val FilterOutputStream.baseStream: OutputStream?
  get() = g_filter_output_stream_get_base_stream(this)?.reinterpret()

public var FilterOutputStream.closeBaseStream: Boolean
  get() = g_filter_output_stream_get_close_base_stream(this).toBoolean
  set(`value`) {
    g_filter_output_stream_set_close_base_stream(this, `value`.toInt)
  }
