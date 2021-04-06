// TODO - implement:
//   pack_end
//   pack_start
package org.gnome.gtk

import gtk3.GtkCellAreaBox
import gtk3.gtk_cell_area_box_get_spacing
import gtk3.gtk_cell_area_box_set_spacing
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellAreaBox = CPointer<GtkCellAreaBox>

public val CellAreaBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellAreaBox.asCellArea: CellArea
  get() = reinterpret()

public var CellAreaBox.spacing: Int
  get() = gtk_cell_area_box_get_spacing(this)
  set(`value`) {
    gtk_cell_area_box_set_spacing(this, value)
  }
