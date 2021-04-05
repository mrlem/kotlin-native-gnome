// TODO - implement:
//   get_spacing
//   pack_end
//   pack_start
//   set_spacing
package org.gnome.gtk

import gtk3.GtkCellAreaBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellAreaBox = CPointer<GtkCellAreaBox>

public val CellAreaBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellAreaBox.asCellArea: CellArea
  get() = reinterpret()
