// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GCharsetConverter
import interop.g_charset_converter_get_num_fallbacks
import interop.g_charset_converter_get_use_fallback
import interop.g_charset_converter_set_use_fallback
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias CharsetConverter = CPointer<GCharsetConverter>

public val CharsetConverter.asObject: Object
  get() = reinterpret()

public object CharsetConverterFactory

public val CharsetConverter.numFallbacks: UInt
  get() = g_charset_converter_get_num_fallbacks(this)

public var CharsetConverter.useFallback: Boolean
  get() = g_charset_converter_get_use_fallback(this).toBoolean()
  set(`value`) {
    g_charset_converter_set_use_fallback(this@useFallback, `value`.toInt())
  }
