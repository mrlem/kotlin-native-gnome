@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkComboBoxText
import interop.gtk_combo_box_text_append
import interop.gtk_combo_box_text_append_text
import interop.gtk_combo_box_text_get_active_text
import interop.gtk_combo_box_text_insert
import interop.gtk_combo_box_text_insert_text
import interop.gtk_combo_box_text_new
import interop.gtk_combo_box_text_new_with_entry
import interop.gtk_combo_box_text_prepend
import interop.gtk_combo_box_text_prepend_text
import interop.gtk_combo_box_text_remove
import interop.gtk_combo_box_text_remove_all
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toKString

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

public val ComboBoxText.activeText: String?
  get() = gtk_combo_box_text_get_active_text(this).toKString()

public fun ComboBoxText.append(id: String?, text: String?): Unit {
  gtk_combo_box_text_append(this@append, id, text)
}

public fun ComboBoxText.appendText(text: String?): Unit {
  gtk_combo_box_text_append_text(this@appendText, text)
}

public fun ComboBoxText.insert(
  position: Int,
  id: String?,
  text: String?
): Unit {
  gtk_combo_box_text_insert(this@insert, position, id, text)
}

public fun ComboBoxText.insertText(position: Int, text: String?): Unit {
  gtk_combo_box_text_insert_text(this@insertText, position, text)
}

public fun ComboBoxText.prepend(id: String?, text: String?): Unit {
  gtk_combo_box_text_prepend(this@prepend, id, text)
}

public fun ComboBoxText.prependText(text: String?): Unit {
  gtk_combo_box_text_prepend_text(this@prependText, text)
}

public fun ComboBoxText.remove(position: Int): Unit {
  gtk_combo_box_text_remove(this@remove, position)
}

public fun ComboBoxText.removeAll(): Unit {
  gtk_combo_box_text_remove_all(this@removeAll)
}
