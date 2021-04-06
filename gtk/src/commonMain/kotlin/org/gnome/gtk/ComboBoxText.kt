// TODO - implement:
//   append
//   append_text
//   insert
//   insert_text
//   prepend
//   prepend_text
//   remove
//   remove_all
package org.gnome.gtk

import gtk3.GtkComboBoxText
import gtk3.gtk_combo_box_text_get_active_text
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toKString

public typealias ComboBoxText = CPointer<GtkComboBoxText>

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

public val ComboBoxText.activeText: String?
  get() = gtk_combo_box_text_get_active_text(this).toKString
