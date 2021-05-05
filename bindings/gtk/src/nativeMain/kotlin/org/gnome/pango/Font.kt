// TODO - method: get_glyph_extents (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoFont
import interop.pango_font_describe
import interop.pango_font_describe_with_absolute_size
import interop.pango_font_get_coverage
import interop.pango_font_get_font_map
import interop.pango_font_get_metrics
import interop.pango_font_has_char
import kotlin.Boolean
import kotlin.Char
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toUInt

public typealias Font = CPointer<PangoFont>

public val Font.asObject: Object
  get() = reinterpret()

public val Font.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Font.fontMap: FontMap?
  get() = pango_font_get_font_map(this)?.reinterpret()

public fun Font.describe(): FontDescription? = pango_font_describe(this@describe)?.reinterpret()

public fun Font.describeWithAbsoluteSize(): FontDescription? =
    pango_font_describe_with_absolute_size(this@describeWithAbsoluteSize)?.reinterpret()

public fun Font.getCoverage(language: Language?): Coverage? =
    pango_font_get_coverage(this@getCoverage, language?.reinterpret())?.reinterpret()

public fun Font.getMetrics(language: Language?): FontMetrics? =
    pango_font_get_metrics(this@getMetrics, language?.reinterpret())?.reinterpret()

public fun Font.hasChar(wc: Char): Boolean = pango_font_has_char(this@hasChar,
    wc.toUInt()).toBoolean()
