// TODO - method: get_allocation (param type)
// TODO - method: get_preferred_height (param type)
// TODO - method: get_preferred_height_for_width (param type)
// TODO - method: get_preferred_width (param type)
// TODO - method: get_preferred_width_for_height (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellAreaContext
import interop.gtk_cell_area_context_allocate
import interop.gtk_cell_area_context_get_area
import interop.gtk_cell_area_context_push_preferred_height
import interop.gtk_cell_area_context_push_preferred_width
import interop.gtk_cell_area_context_reset
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias CellAreaContext = CPointer<GtkCellAreaContext>

public val CellAreaContext.asObject: Object
  get() = reinterpret()

public val CellAreaContext.area: CellArea?
  get() = gtk_cell_area_context_get_area(this)?.reinterpret()

public fun CellAreaContext.allocate(width: Int, height: Int): Unit {
  gtk_cell_area_context_allocate(this@allocate, width, height)
}

public fun CellAreaContext.pushPreferredHeight(minimumHeight: Int, naturalHeight: Int): Unit {
  gtk_cell_area_context_push_preferred_height(this@pushPreferredHeight, minimumHeight,
      naturalHeight)
}

public fun CellAreaContext.pushPreferredWidth(minimumWidth: Int, naturalWidth: Int): Unit {
  gtk_cell_area_context_push_preferred_width(this@pushPreferredWidth, minimumWidth, naturalWidth)
}

public fun CellAreaContext.reset(): Unit {
  gtk_cell_area_context_reset(this@reset)
}
