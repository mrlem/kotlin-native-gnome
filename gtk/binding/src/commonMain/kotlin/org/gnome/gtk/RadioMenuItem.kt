// TODO - constructor: new
// TODO - constructor: new_with_label
// TODO - constructor: new_with_mnemonic
// TODO - method: get_group
// TODO - method: set_group
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkRadioMenuItem
import gtk3.gtk_radio_menu_item_join_group
import gtk3.gtk_radio_menu_item_new_from_widget
import gtk3.gtk_radio_menu_item_new_with_label_from_widget
import gtk3.gtk_radio_menu_item_new_with_mnemonic_from_widget
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias RadioMenuItem = CPointer<GtkRadioMenuItem>

public val RadioMenuItem.asObject: Object
  get() = reinterpret()

public val RadioMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioMenuItem.asWidget: Widget
  get() = reinterpret()

public val RadioMenuItem.asContainer: Container
  get() = reinterpret()

public val RadioMenuItem.asBin: Bin
  get() = reinterpret()

public val RadioMenuItem.asMenuItem: MenuItem
  get() = reinterpret()

public val RadioMenuItem.asCheckMenuItem: CheckMenuItem
  get() = reinterpret()

public object RadioMenuItemFactory {
  public fun newFromWidget(group: RadioMenuItem?): RadioMenuItem =
      gtk_radio_menu_item_new_from_widget(group?.reinterpret())!!.reinterpret()

  public fun newWithLabelFromWidget(group: RadioMenuItem?, label: String): RadioMenuItem =
      gtk_radio_menu_item_new_with_label_from_widget(group?.reinterpret(), label)!!.reinterpret()

  public fun newWithMnemonicFromWidget(group: RadioMenuItem?, label: String): RadioMenuItem =
      gtk_radio_menu_item_new_with_mnemonic_from_widget(group?.reinterpret(), label)!!.reinterpret()
}

public fun RadioMenuItem.joinGroup(groupSource: RadioMenuItem?): Unit {
  gtk_radio_menu_item_join_group(this, groupSource?.reinterpret())
}

public fun RadioMenuItem.onGroupChanged(callback: (RadioMenuItem) -> Unit): RadioMenuItem {
  // TODO - handle callback data

  asObject.connect("group-changed") { callback(this) }
  return this
}
