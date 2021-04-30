// TODO - constructor: new
// TODO - constructor: new_with_label
// TODO - constructor: new_with_mnemonic
// TODO - method: get_group
// TODO - method: set_group
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRadioButton
import interop.gtk_radio_button_join_group
import interop.gtk_radio_button_new_from_widget
import interop.gtk_radio_button_new_with_label_from_widget
import interop.gtk_radio_button_new_with_mnemonic_from_widget
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

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

public object RadioButtonFactory {
  public fun newFromWidget(radioGroupMember: RadioButton?): RadioButton =
      gtk_radio_button_new_from_widget(radioGroupMember?.reinterpret())!!.reinterpret()

  public fun newWithLabelFromWidget(radioGroupMember: RadioButton?, label: String): RadioButton =
      gtk_radio_button_new_with_label_from_widget(radioGroupMember?.reinterpret(),
      label)!!.reinterpret()

  public fun newWithMnemonicFromWidget(radioGroupMember: RadioButton?, label: String): RadioButton =
      gtk_radio_button_new_with_mnemonic_from_widget(radioGroupMember?.reinterpret(),
      label)!!.reinterpret()
}

public val RadioButton.checkButton: CheckButton
  get() = pointed.check_button.ptr

public fun RadioButton.joinGroup(groupSource: RadioButton?): Unit {
  gtk_radio_button_join_group(this, groupSource?.reinterpret())
}

public fun RadioButton.onGroupChanged(callback: (RadioButton) -> Unit): RadioButton {
  // TODO - handle callback data

  asObject.connect("group-changed") { callback(this) }
  return this
}
