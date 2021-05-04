@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkGrid
import interop.gtk_grid_attach
import interop.gtk_grid_attach_next_to
import interop.gtk_grid_get_baseline_row
import interop.gtk_grid_get_child_at
import interop.gtk_grid_get_column_homogeneous
import interop.gtk_grid_get_column_spacing
import interop.gtk_grid_get_row_baseline_position
import interop.gtk_grid_get_row_homogeneous
import interop.gtk_grid_get_row_spacing
import interop.gtk_grid_insert_column
import interop.gtk_grid_insert_next_to
import interop.gtk_grid_insert_row
import interop.gtk_grid_new
import interop.gtk_grid_remove_column
import interop.gtk_grid_remove_row
import interop.gtk_grid_set_baseline_row
import interop.gtk_grid_set_column_homogeneous
import interop.gtk_grid_set_column_spacing
import interop.gtk_grid_set_row_baseline_position
import interop.gtk_grid_set_row_homogeneous
import interop.gtk_grid_set_row_spacing
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

public object GridFactory {
  public fun new(): Grid = gtk_grid_new()!!.reinterpret()
}

public var Grid.baselineRow: Int
  get() = gtk_grid_get_baseline_row(this)
  set(`value`) {
    gtk_grid_set_baseline_row(this@baselineRow, `value`)
  }

public var Grid.columnHomogeneous: Boolean
  get() = gtk_grid_get_column_homogeneous(this).toBoolean()
  set(`value`) {
    gtk_grid_set_column_homogeneous(this@columnHomogeneous, `value`.toInt())
  }

public var Grid.columnSpacing: UInt
  get() = gtk_grid_get_column_spacing(this)
  set(`value`) {
    gtk_grid_set_column_spacing(this@columnSpacing, `value`)
  }

public var Grid.rowHomogeneous: Boolean
  get() = gtk_grid_get_row_homogeneous(this).toBoolean()
  set(`value`) {
    gtk_grid_set_row_homogeneous(this@rowHomogeneous, `value`.toInt())
  }

public var Grid.rowSpacing: UInt
  get() = gtk_grid_get_row_spacing(this)
  set(`value`) {
    gtk_grid_set_row_spacing(this@rowSpacing, `value`)
  }

public fun Grid.attach(
  child: Widget?,
  left: Int,
  top: Int,
  width: Int,
  height: Int
): Unit {
  gtk_grid_attach(this@attach, child?.reinterpret(), left, top, width, height)
}

public fun Grid.attachNextTo(
  child: Widget?,
  sibling: Widget?,
  side: PositionType,
  width: Int,
  height: Int
): Unit {
  gtk_grid_attach_next_to(this@attachNextTo, child?.reinterpret(), sibling?.reinterpret(), side,
      width, height)
}

public fun Grid.getChildAt(left: Int, top: Int): Widget? = gtk_grid_get_child_at(this@getChildAt,
    left, top)?.reinterpret()

public fun Grid.getRowBaselinePosition(row: Int): BaselinePosition =
    gtk_grid_get_row_baseline_position(this@getRowBaselinePosition, row)

public fun Grid.insertColumn(position: Int): Unit {
  gtk_grid_insert_column(this@insertColumn, position)
}

public fun Grid.insertNextTo(sibling: Widget?, side: PositionType): Unit {
  gtk_grid_insert_next_to(this@insertNextTo, sibling?.reinterpret(), side)
}

public fun Grid.insertRow(position: Int): Unit {
  gtk_grid_insert_row(this@insertRow, position)
}

public fun Grid.removeColumn(position: Int): Unit {
  gtk_grid_remove_column(this@removeColumn, position)
}

public fun Grid.removeRow(position: Int): Unit {
  gtk_grid_remove_row(this@removeRow, position)
}

public fun Grid.setRowBaselinePosition(row: Int, pos: BaselinePosition): Unit {
  gtk_grid_set_row_baseline_position(this@setRowBaselinePosition, row, pos)
}
