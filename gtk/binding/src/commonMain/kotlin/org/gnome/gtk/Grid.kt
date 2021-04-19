// TODO - attach_next_to
// TODO - get_row_baseline_position
// TODO - insert_next_to
// TODO - set_row_baseline_position
//
package org.gnome.gtk

import gtk3.GtkGrid
import gtk3.gtk_grid_attach
import gtk3.gtk_grid_get_baseline_row
import gtk3.gtk_grid_get_child_at
import gtk3.gtk_grid_get_column_homogeneous
import gtk3.gtk_grid_get_column_spacing
import gtk3.gtk_grid_get_row_homogeneous
import gtk3.gtk_grid_get_row_spacing
import gtk3.gtk_grid_insert_column
import gtk3.gtk_grid_insert_row
import gtk3.gtk_grid_remove_column
import gtk3.gtk_grid_remove_row
import gtk3.gtk_grid_set_baseline_row
import gtk3.gtk_grid_set_column_homogeneous
import gtk3.gtk_grid_set_column_spacing
import gtk3.gtk_grid_set_row_homogeneous
import gtk3.gtk_grid_set_row_spacing
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Grid = CPointer<GtkGrid>

public val Grid.asObject: Object
  get() = reinterpret()

public val Grid.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Grid.asWidget: Widget
  get() = reinterpret()

public val Grid.asContainer: Container
  get() = reinterpret()

public fun Grid.attach(
  child: Widget,
  left: Int,
  top: Int,
  width: Int,
  height: Int
): Unit {
  gtk_grid_attach(this, child.reinterpret(), left, top, width, height)
}

public fun Grid.getBaselineRow(): Int = gtk_grid_get_baseline_row(this)

public fun Grid.getChildAt(left: Int, top: Int): Widget? = gtk_grid_get_child_at(this, left,
    top)?.reinterpret()

public fun Grid.getColumnHomogeneous(): Boolean = gtk_grid_get_column_homogeneous(this).toBoolean

public fun Grid.getColumnSpacing(): UInt = gtk_grid_get_column_spacing(this)

public fun Grid.getRowHomogeneous(): Boolean = gtk_grid_get_row_homogeneous(this).toBoolean

public fun Grid.getRowSpacing(): UInt = gtk_grid_get_row_spacing(this)

public fun Grid.insertColumn(position: Int): Unit {
  gtk_grid_insert_column(this, position)
}

public fun Grid.insertRow(position: Int): Unit {
  gtk_grid_insert_row(this, position)
}

public fun Grid.removeColumn(position: Int): Unit {
  gtk_grid_remove_column(this, position)
}

public fun Grid.removeRow(position: Int): Unit {
  gtk_grid_remove_row(this, position)
}

public fun Grid.setBaselineRow(row: Int): Unit {
  gtk_grid_set_baseline_row(this, row)
}

public fun Grid.setColumnHomogeneous(homogeneous: Boolean): Unit {
  gtk_grid_set_column_homogeneous(this, homogeneous.toInt)
}

public fun Grid.setColumnSpacing(spacing: UInt): Unit {
  gtk_grid_set_column_spacing(this, spacing)
}

public fun Grid.setRowHomogeneous(homogeneous: Boolean): Unit {
  gtk_grid_set_row_homogeneous(this, homogeneous.toInt)
}

public fun Grid.setRowSpacing(spacing: UInt): Unit {
  gtk_grid_set_row_spacing(this, spacing)
}
