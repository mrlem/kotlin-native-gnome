@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoCoverage
import interop.pango_coverage_copy
import interop.pango_coverage_get
import interop.pango_coverage_new
import interop.pango_coverage_ref
import interop.pango_coverage_set
import interop.pango_coverage_unref
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Coverage = CPointer<PangoCoverage>

public val Coverage.asObject: Object
  get() = reinterpret()

public object CoverageFactory {
  public fun new(): Coverage = pango_coverage_new()!!.reinterpret()
}

public fun Coverage.copy(): Coverage? = pango_coverage_copy(this@copy)?.reinterpret()

public fun Coverage.`get`(index: Int): CoverageLevel = pango_coverage_get(this@`get`, index)

public fun Coverage.ref(): Coverage? = pango_coverage_ref(this@ref)?.reinterpret()

public fun Coverage.`set`(index: Int, level: CoverageLevel): Unit {
  pango_coverage_set(this@`set`, index, level)
}

public fun Coverage.unref(): Unit {
  pango_coverage_unref(this@unref)
}
