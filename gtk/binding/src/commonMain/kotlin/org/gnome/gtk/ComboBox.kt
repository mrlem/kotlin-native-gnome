// TODO - get_active_iter
// TODO - get_button_sensitivity
// TODO - get_popup_accessible
// TODO - popup_for_device
// TODO - set_button_sensitivity
// TODO - set_row_separator_func
//
package org.gnome.gtk

import gtk3.GtkComboBox
import gtk3.gtk_combo_box_get_active
import gtk3.gtk_combo_box_get_active_id
import gtk3.gtk_combo_box_get_column_span_column
import gtk3.gtk_combo_box_get_entry_text_column
import gtk3.gtk_combo_box_get_has_entry
import gtk3.gtk_combo_box_get_id_column
import gtk3.gtk_combo_box_get_model
import gtk3.gtk_combo_box_get_popup_fixed_width
import gtk3.gtk_combo_box_get_row_separator_func
import gtk3.gtk_combo_box_get_row_span_column
import gtk3.gtk_combo_box_get_wrap_width
import gtk3.gtk_combo_box_popdown
import gtk3.gtk_combo_box_popup
import gtk3.gtk_combo_box_set_active
import gtk3.gtk_combo_box_set_active_id
import gtk3.gtk_combo_box_set_active_iter
import gtk3.gtk_combo_box_set_column_span_column
import gtk3.gtk_combo_box_set_entry_text_column
import gtk3.gtk_combo_box_set_id_column
import gtk3.gtk_combo_box_set_model
import gtk3.gtk_combo_box_set_popup_fixed_width
import gtk3.gtk_combo_box_set_row_span_column
import gtk3.gtk_combo_box_set_wrap_width
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

public typealias ComboBox = CPointer<GtkComboBox>

public val ComboBox.asObject: Object
  get() = reinterpret()

public val ComboBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ComboBox.asWidget: Widget
  get() = reinterpret()

public val ComboBox.asContainer: Container
  get() = reinterpret()

public val ComboBox.asBin: Bin
  get() = reinterpret()

public fun ComboBox.getActive(): Int = gtk_combo_box_get_active(this)

public fun ComboBox.getActiveId(): String = gtk_combo_box_get_active_id(this).toKString

public fun ComboBox.getColumnSpanColumn(): Int = gtk_combo_box_get_column_span_column(this)

public fun ComboBox.getEntryTextColumn(): Int = gtk_combo_box_get_entry_text_column(this)

public fun ComboBox.getHasEntry(): Boolean = gtk_combo_box_get_has_entry(this).toBoolean

public fun ComboBox.getIdColumn(): Int = gtk_combo_box_get_id_column(this)

public fun ComboBox.getModel(): TreeModel? = gtk_combo_box_get_model(this)?.reinterpret()

public fun ComboBox.getPopupFixedWidth(): Boolean =
    gtk_combo_box_get_popup_fixed_width(this).toBoolean

public fun ComboBox.getRowSeparatorFunc(): TreeViewRowSeparatorFunc? =
    gtk_combo_box_get_row_separator_func(this)?.reinterpret()

public fun ComboBox.getRowSpanColumn(): Int = gtk_combo_box_get_row_span_column(this)

public fun ComboBox.getWrapWidth(): Int = gtk_combo_box_get_wrap_width(this)

public fun ComboBox.popdown(): Unit {
  gtk_combo_box_popdown(this)
}

public fun ComboBox.popup(): Unit {
  gtk_combo_box_popup(this)
}

public fun ComboBox.setActive(index: Int): Unit {
  gtk_combo_box_set_active(this, index)
}

public fun ComboBox.setActiveId(activeId: String?): Boolean = gtk_combo_box_set_active_id(this,
    activeId).toBoolean

public fun ComboBox.setActiveIter(iter: TreeIter): Unit {
  gtk_combo_box_set_active_iter(this, iter.reinterpret())
}

public fun ComboBox.setColumnSpanColumn(columnSpan: Int): Unit {
  gtk_combo_box_set_column_span_column(this, columnSpan)
}

public fun ComboBox.setEntryTextColumn(textColumn: Int): Unit {
  gtk_combo_box_set_entry_text_column(this, textColumn)
}

public fun ComboBox.setIdColumn(idColumn: Int): Unit {
  gtk_combo_box_set_id_column(this, idColumn)
}

public fun ComboBox.setModel(model: TreeModel): Unit {
  gtk_combo_box_set_model(this, model.reinterpret())
}

public fun ComboBox.setPopupFixedWidth(fixed: Boolean): Unit {
  gtk_combo_box_set_popup_fixed_width(this, fixed.toInt)
}

public fun ComboBox.setRowSpanColumn(rowSpan: Int): Unit {
  gtk_combo_box_set_row_span_column(this, rowSpan)
}

public fun ComboBox.setWrapWidth(width: Int): Unit {
  gtk_combo_box_set_wrap_width(this, width)
}
