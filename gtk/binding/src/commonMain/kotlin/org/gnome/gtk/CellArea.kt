// TODO - activate
// TODO - activate_cell
// TODO - add_with_properties
// TODO - cell_get
// TODO - cell_get_property
// TODO - cell_get_valist
// TODO - cell_set
// TODO - cell_set_property
// TODO - cell_set_valist
// TODO - event
// TODO - foreach
// TODO - foreach_alloc
// TODO - get_cell_allocation
// TODO - get_cell_at_position
// TODO - get_focus_siblings
// TODO - get_preferred_height
// TODO - get_preferred_height_for_width
// TODO - get_preferred_width
// TODO - get_preferred_width_for_height
// TODO - inner_cell_area
// TODO - render
// TODO - request_renderer
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCellArea
import gtk3.gtk_cell_area_add
import gtk3.gtk_cell_area_add_focus_sibling
import gtk3.gtk_cell_area_apply_attributes
import gtk3.gtk_cell_area_attribute_connect
import gtk3.gtk_cell_area_attribute_disconnect
import gtk3.gtk_cell_area_attribute_get_column
import gtk3.gtk_cell_area_copy_context
import gtk3.gtk_cell_area_create_context
import gtk3.gtk_cell_area_focus
import gtk3.gtk_cell_area_get_current_path_string
import gtk3.gtk_cell_area_get_edit_widget
import gtk3.gtk_cell_area_get_edited_cell
import gtk3.gtk_cell_area_get_focus_cell
import gtk3.gtk_cell_area_get_focus_from_sibling
import gtk3.gtk_cell_area_get_request_mode
import gtk3.gtk_cell_area_has_renderer
import gtk3.gtk_cell_area_is_activatable
import gtk3.gtk_cell_area_is_focus_sibling
import gtk3.gtk_cell_area_remove
import gtk3.gtk_cell_area_remove_focus_sibling
import gtk3.gtk_cell_area_set_focus_cell
import gtk3.gtk_cell_area_stop_editing
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias CellArea = CPointer<GtkCellArea>

public val CellArea.asObject: Object
  get() = reinterpret()

public val CellArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellArea.currentPathString: String
  get() = gtk_cell_area_get_current_path_string(this).toKString

public val CellArea.editWidget: CellEditable?
  get() = gtk_cell_area_get_edit_widget(this)?.reinterpret()

public val CellArea.editedCell: CellRenderer?
  get() = gtk_cell_area_get_edited_cell(this)?.reinterpret()

public var CellArea.focusCell: CellRenderer?
  get() = gtk_cell_area_get_focus_cell(this)?.reinterpret()
  set(`value`) {
    gtk_cell_area_set_focus_cell(this, value)
  }

public val CellArea.requestMode: SizeRequestMode
  get() = gtk_cell_area_get_request_mode(this)

public fun CellArea.add(renderer: CellRenderer?): Unit {
  gtk_cell_area_add(this, renderer?.reinterpret())
}

public fun CellArea.addFocusSibling(renderer: CellRenderer?, sibling: CellRenderer?): Unit {
  gtk_cell_area_add_focus_sibling(this, renderer?.reinterpret(), sibling?.reinterpret())
}

public fun CellArea.applyAttributes(
  treeModel: TreeModel?,
  iter: TreeIter?,
  isExpander: Boolean,
  isExpanded: Boolean
): Unit {
  gtk_cell_area_apply_attributes(this, treeModel?.reinterpret(), iter?.reinterpret(),
      isExpander.toInt, isExpanded.toInt)
}

public fun CellArea.attributeConnect(
  renderer: CellRenderer?,
  attribute: String,
  column: Int
): Unit {
  gtk_cell_area_attribute_connect(this, renderer?.reinterpret(), attribute, column)
}

public fun CellArea.attributeDisconnect(renderer: CellRenderer?, attribute: String): Unit {
  gtk_cell_area_attribute_disconnect(this, renderer?.reinterpret(), attribute)
}

public fun CellArea.attributeGetColumn(renderer: CellRenderer?, attribute: String): Int =
    gtk_cell_area_attribute_get_column(this, renderer?.reinterpret(), attribute)

public fun CellArea.copyContext(context: CellAreaContext?): CellAreaContext? =
    gtk_cell_area_copy_context(this, context?.reinterpret())?.reinterpret()

public fun CellArea.createContext(): CellAreaContext? =
    gtk_cell_area_create_context(this)?.reinterpret()

public fun CellArea.focus(direction: DirectionType): Boolean = gtk_cell_area_focus(this,
    direction).toBoolean

public fun CellArea.getFocusFromSibling(renderer: CellRenderer?): CellRenderer? =
    gtk_cell_area_get_focus_from_sibling(this, renderer?.reinterpret())?.reinterpret()

public fun CellArea.hasRenderer(renderer: CellRenderer?): Boolean = gtk_cell_area_has_renderer(this,
    renderer?.reinterpret()).toBoolean

public fun CellArea.isActivatable(): Boolean = gtk_cell_area_is_activatable(this).toBoolean

public fun CellArea.isFocusSibling(renderer: CellRenderer?, sibling: CellRenderer?): Boolean =
    gtk_cell_area_is_focus_sibling(this, renderer?.reinterpret(), sibling?.reinterpret()).toBoolean

public fun CellArea.remove(renderer: CellRenderer?): Unit {
  gtk_cell_area_remove(this, renderer?.reinterpret())
}

public fun CellArea.removeFocusSibling(renderer: CellRenderer?, sibling: CellRenderer?): Unit {
  gtk_cell_area_remove_focus_sibling(this, renderer?.reinterpret(), sibling?.reinterpret())
}

public fun CellArea.stopEditing(canceled: Boolean): Unit {
  gtk_cell_area_stop_editing(this, canceled.toInt)
}
