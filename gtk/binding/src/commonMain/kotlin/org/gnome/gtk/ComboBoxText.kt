@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkComboBoxText
import gtk3.gtk_combo_box_text_append
import gtk3.gtk_combo_box_text_append_text
import gtk3.gtk_combo_box_text_get_active_text
import gtk3.gtk_combo_box_text_insert
import gtk3.gtk_combo_box_text_insert_text
import gtk3.gtk_combo_box_text_new
import gtk3.gtk_combo_box_text_new_with_entry
import gtk3.gtk_combo_box_text_prepend
import gtk3.gtk_combo_box_text_prepend_text
import gtk3.gtk_combo_box_text_remove
import gtk3.gtk_combo_box_text_remove_all
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias ComboBoxText = CPointer<GtkComboBoxText>

public val ComboBoxText.asObject: Object
  get() = reinterpret()

public val ComboBoxText.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ComboBoxText.asWidget: Widget
  get() = reinterpret()

public val ComboBoxText.asContainer: Container
  get() = reinterpret()

public val ComboBoxText.asBin: Bin
  get() = reinterpret()

public val ComboBoxText.asComboBox: ComboBox
  get() = reinterpret()

public object ComboBoxTextFactory {
  public fun new(): ComboBoxText = gtk_combo_box_text_new()!!.reinterpret()

  public fun newWithEntry(): ComboBoxText = gtk_combo_box_text_new_with_entry()!!.reinterpret()
}

public val ComboBoxText.activeText: String
  get() = gtk_combo_box_text_get_active_text(this).toKString

public fun ComboBoxText.append(id: String, text: String): Unit {
  gtk_combo_box_text_append(this, id, text)
}

public fun ComboBoxText.appendText(text: String): Unit {
  gtk_combo_box_text_append_text(this, text)
}

public fun ComboBoxText.insert(
  position: Int,
  id: String,
  text: String
): Unit {
  gtk_combo_box_text_insert(this, position, id, text)
}

public fun ComboBoxText.insertText(position: Int, text: String): Unit {
  gtk_combo_box_text_insert_text(this, position, text)
}

public fun ComboBoxText.prepend(id: String, text: String): Unit {
  gtk_combo_box_text_prepend(this, id, text)
}

public fun ComboBoxText.prependText(text: String): Unit {
  gtk_combo_box_text_prepend_text(this, text)
}

public fun ComboBoxText.remove(position: Int): Unit {
  gtk_combo_box_text_remove(this, position)
}

public fun ComboBoxText.removeAll(): Unit {
  gtk_combo_box_text_remove_all(this)
}
