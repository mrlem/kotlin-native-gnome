// TODO - get_active_iter
// TODO - get_add_tearoffs
// TODO - get_focus_on_click
// TODO - get_popup_accessible
// TODO - get_title
// TODO - popup_for_device
// TODO - set_add_tearoffs
// TODO - set_focus_on_click
// TODO - set_row_separator_func
// TODO - set_title
//
package org.gnome.gtk

import gtk3.GtkComboBox
import gtk3.gtk_combo_box_get_active
import gtk3.gtk_combo_box_get_active_id
import gtk3.gtk_combo_box_get_button_sensitivity
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
import gtk3.gtk_combo_box_set_button_sensitivity
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

public var ComboBox.active: Int
  get() = gtk_combo_box_get_active(this)
  set(`value`) {
    gtk_combo_box_set_active(this, value)
  }

public var ComboBox.activeId: String
  get() = gtk_combo_box_get_active_id(this).toKString
  set(`value`) {
    gtk_combo_box_set_active_id(this, value)
  }

public var ComboBox.buttonSensitivity: SensitivityType
  get() = gtk_combo_box_get_button_sensitivity(this)
  set(`value`) {
    gtk_combo_box_set_button_sensitivity(this, value)
  }

public var ComboBox.columnSpanColumn: Int
  get() = gtk_combo_box_get_column_span_column(this)
  set(`value`) {
    gtk_combo_box_set_column_span_column(this, value)
  }

public var ComboBox.entryTextColumn: Int
  get() = gtk_combo_box_get_entry_text_column(this)
  set(`value`) {
    gtk_combo_box_set_entry_text_column(this, value)
  }

public val ComboBox.hasEntry: Boolean
  get() = gtk_combo_box_get_has_entry(this).toBoolean

public var ComboBox.idColumn: Int
  get() = gtk_combo_box_get_id_column(this)
  set(`value`) {
    gtk_combo_box_set_id_column(this, value)
  }

public var ComboBox.model: TreeModel?
  get() = gtk_combo_box_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_combo_box_set_model(this, value)
  }

public var ComboBox.popupFixedWidth: Boolean
  get() = gtk_combo_box_get_popup_fixed_width(this).toBoolean
  set(`value`) {
    gtk_combo_box_set_popup_fixed_width(this, value.toInt)
  }

public val ComboBox.rowSeparatorFunc: TreeViewRowSeparatorFunc?
  get() = gtk_combo_box_get_row_separator_func(this)?.reinterpret()

public var ComboBox.rowSpanColumn: Int
  get() = gtk_combo_box_get_row_span_column(this)
  set(`value`) {
    gtk_combo_box_set_row_span_column(this, value)
  }

public var ComboBox.wrapWidth: Int
  get() = gtk_combo_box_get_wrap_width(this)
  set(`value`) {
    gtk_combo_box_set_wrap_width(this, value)
  }

public fun ComboBox.popdown(): Unit {
  gtk_combo_box_popdown(this)
}

public fun ComboBox.popup(): Unit {
  gtk_combo_box_popup(this)
}

public fun ComboBox.setActiveIter(iter: TreeIter?): Unit {
  gtk_combo_box_set_active_iter(this, iter?.reinterpret())
}
