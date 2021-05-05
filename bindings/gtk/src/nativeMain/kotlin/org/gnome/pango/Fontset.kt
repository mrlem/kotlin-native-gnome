// TODO - method: foreach (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoFontset
import interop.pango_fontset_get_font
import interop.pango_fontset_get_metrics
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Fontset = CPointer<PangoFontset>

public val Fontset.asObject: Object
  get() = reinterpret()

public val Fontset.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Fontset.metrics: FontMetrics?
  get() = pango_fontset_get_metrics(this)?.reinterpret()

public fun Fontset.getFont(wc: UInt): Font? = pango_fontset_get_font(this@getFont,
    wc)?.reinterpret()
