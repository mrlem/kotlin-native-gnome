@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellAreaBox
import interop.gtk_cell_area_box_get_spacing
import interop.gtk_cell_area_box_new
import interop.gtk_cell_area_box_pack_end
import interop.gtk_cell_area_box_pack_start
import interop.gtk_cell_area_box_set_spacing
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toInt

public typealias CellAreaBox = CPointer<GtkCellAreaBox>

public val CellAreaBox.asObject: Object
  get() = reinterpret()

public val CellAreaBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellAreaBox.asCellArea: CellArea
  get() = reinterpret()

public object CellAreaBoxFactory {
  public fun new(): CellAreaBox = gtk_cell_area_box_new()!!.reinterpret()
}

public var CellAreaBox.spacing: Int
  get() = gtk_cell_area_box_get_spacing(this)
  set(`value`) {
    gtk_cell_area_box_set_spacing(this, value)
  }

public fun CellAreaBox.packEnd(
  renderer: CellRenderer?,
  expand: Boolean,
  align: Boolean,
  fixed: Boolean
): Unit {
  gtk_cell_area_box_pack_end(this, renderer?.reinterpret(), expand.toInt, align.toInt, fixed.toInt)
}

public fun CellAreaBox.packStart(
  renderer: CellRenderer?,
  expand: Boolean,
  align: Boolean,
  fixed: Boolean
): Unit {
  gtk_cell_area_box_pack_start(this, renderer?.reinterpret(), expand.toInt, align.toInt,
      fixed.toInt)
}
