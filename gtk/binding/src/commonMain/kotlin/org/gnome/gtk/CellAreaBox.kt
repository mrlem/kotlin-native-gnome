package org.gnome.gtk

import gtk3.GtkCellAreaBox
import gtk3.gtk_cell_area_box_get_spacing
import gtk3.gtk_cell_area_box_pack_end
import gtk3.gtk_cell_area_box_pack_start
import gtk3.gtk_cell_area_box_set_spacing
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

public var CellAreaBox.spacing: Int
  get() = gtk_cell_area_box_get_spacing(this)
  set(`value`) {
    gtk_cell_area_box_set_spacing(this, value)
  }

public fun CellAreaBox.packEnd(
  renderer: CellRenderer,
  expand: Boolean,
  align: Boolean,
  fixed: Boolean
): Unit {
  gtk_cell_area_box_pack_end(this, renderer.reinterpret(), expand.toInt, align.toInt, fixed.toInt)
}

public fun CellAreaBox.packStart(
  renderer: CellRenderer,
  expand: Boolean,
  align: Boolean,
  fixed: Boolean
): Unit {
  gtk_cell_area_box_pack_start(this, renderer.reinterpret(), expand.toInt, align.toInt, fixed.toInt)
}
