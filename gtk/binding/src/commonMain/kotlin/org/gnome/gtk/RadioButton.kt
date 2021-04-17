// TODO - implement:
//   join_group
//   set_group
package org.gnome.gtk

import gtk3.GtkRadioButton
import gtk3.gtk_radio_button_get_group
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias RadioButton = CPointer<GtkRadioButton>

public val RadioButton.asObject: Object
  get() = reinterpret()

public val RadioButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioButton.asWidget: Widget
  get() = reinterpret()

public val RadioButton.asContainer: Container
  get() = reinterpret()

public val RadioButton.asBin: Bin
  get() = reinterpret()

public val RadioButton.asButton: Button
  get() = reinterpret()

public val RadioButton.asToggleButton: ToggleButton
  get() = reinterpret()

public val RadioButton.asCheckButton: CheckButton
  get() = reinterpret()

public fun RadioButton.getGroup(): Unit {
  gtk_radio_button_get_group(this)
}
