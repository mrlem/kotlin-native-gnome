// TODO - implement:
//   attach
//   attach_next_to
//   get_child_at
//   get_row_baseline_position
//   insert_column
//   insert_next_to
//   insert_row
//   remove_column
//   remove_row
//   set_row_baseline_position
package org.gnome.gtk

import gtk3.GtkGrid
import gtk3.gtk_grid_get_baseline_row
import gtk3.gtk_grid_get_column_homogeneous
import gtk3.gtk_grid_get_column_spacing
import gtk3.gtk_grid_get_row_homogeneous
import gtk3.gtk_grid_get_row_spacing
import gtk3.gtk_grid_set_baseline_row
import gtk3.gtk_grid_set_column_homogeneous
import gtk3.gtk_grid_set_column_spacing
import gtk3.gtk_grid_set_row_homogeneous
import gtk3.gtk_grid_set_row_spacing
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias Grid = CPointer<GtkGrid>

public val Grid.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Grid.asWidget: Widget
  get() = reinterpret()

public val Grid.asContainer: Container
  get() = reinterpret()

public var Grid.baselineRow: Int
  get() = gtk_grid_get_baseline_row(this)
  set(`value`) {
    gtk_grid_set_baseline_row(this, value)
  }

public var Grid.columnHomogeneous: Boolean
  get() = gtk_grid_get_column_homogeneous(this).toBoolean
  set(`value`) {
    gtk_grid_set_column_homogeneous(this, value.toInt)
  }

public var Grid.columnSpacing: UInt
  get() = gtk_grid_get_column_spacing(this)
  set(`value`) {
    gtk_grid_set_column_spacing(this, value)
  }

public var Grid.rowHomogeneous: Boolean
  get() = gtk_grid_get_row_homogeneous(this).toBoolean
  set(`value`) {
    gtk_grid_set_row_homogeneous(this, value.toInt)
  }

public var Grid.rowSpacing: UInt
  get() = gtk_grid_get_row_spacing(this)
  set(`value`) {
    gtk_grid_set_row_spacing(this, value)
  }
