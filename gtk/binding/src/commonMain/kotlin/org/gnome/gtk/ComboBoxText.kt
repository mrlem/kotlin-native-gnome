// TODO - implement:
//   append
//   append_text
//   insert
//   insert_text
//   prepend
//   prepend_text
//   remove
package org.gnome.gtk

import gtk3.GtkComboBoxText
import gtk3.gtk_combo_box_text_get_active_text
import gtk3.gtk_combo_box_text_remove_all
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

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

public fun ComboBoxText.removeAll(): Unit {
  gtk_combo_box_text_remove_all(this)
}

public val ComboBoxText.activeText: String?
  get() = gtk_combo_box_text_get_active_text(this).toKString
