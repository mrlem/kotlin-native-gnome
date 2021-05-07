@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRadioButton
import interop.gtk_radio_button_get_group
import interop.gtk_radio_button_join_group
import interop.gtk_radio_button_new
import interop.gtk_radio_button_new_from_widget
import interop.gtk_radio_button_new_with_label
import interop.gtk_radio_button_new_with_label_from_widget
import interop.gtk_radio_button_new_with_mnemonic
import interop.gtk_radio_button_new_with_mnemonic_from_widget
import interop.gtk_radio_button_set_group
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
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
  public fun new(group: SList?): RadioButton =
      gtk_radio_button_new(group?.reinterpret())!!.reinterpret()

  public fun newFromWidget(radioGroupMember: RadioButton?): RadioButton =
      gtk_radio_button_new_from_widget(radioGroupMember?.reinterpret())!!.reinterpret()

  public fun newWithLabel(group: SList?, label: String?): RadioButton =
      gtk_radio_button_new_with_label(group?.reinterpret(), label)!!.reinterpret()

  public fun newWithLabelFromWidget(radioGroupMember: RadioButton?, label: String?): RadioButton =
      gtk_radio_button_new_with_label_from_widget(radioGroupMember?.reinterpret(),
      label)!!.reinterpret()

  public fun newWithMnemonic(group: SList?, label: String?): RadioButton =
      gtk_radio_button_new_with_mnemonic(group?.reinterpret(), label)!!.reinterpret()

  public fun newWithMnemonicFromWidget(radioGroupMember: RadioButton?, label: String?): RadioButton
      = gtk_radio_button_new_with_mnemonic_from_widget(radioGroupMember?.reinterpret(),
      label)!!.reinterpret()
}

public val RadioButton.checkButton: CheckButton
  get() = pointed.check_button.ptr

public var RadioButton.group: SList?
  get() = gtk_radio_button_get_group(this)?.reinterpret()
  set(`value`) {
    gtk_radio_button_set_group(this@group, `value`)
  }

public fun RadioButton.joinGroup(groupSource: RadioButton?): Unit {
  gtk_radio_button_join_group(this@joinGroup, groupSource?.reinterpret())
}

public fun RadioButton.onGroupChanged(callback: (RadioButton) -> Unit): RadioButton {
  // TODO - handle callback data

  asObject.connect("group-changed") { callback(this) }
  return this
}
