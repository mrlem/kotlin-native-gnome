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

public fun Grid.attach(
  child: Widget,
  left: Int,
  top: Int,
  width: Int,
  height: Int
): Unit {
  gtk_grid_attach(this, child.reinterpret(), left, top, width, height)
}

public fun Grid.getChildAt(left: Int, top: Int): Widget? = gtk_grid_get_child_at(this, left,
    top)?.reinterpret()

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
