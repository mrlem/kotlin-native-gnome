@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRadioMenuItem
import interop.gtk_radio_menu_item_get_group
import interop.gtk_radio_menu_item_join_group
import interop.gtk_radio_menu_item_new
import interop.gtk_radio_menu_item_new_from_widget
import interop.gtk_radio_menu_item_new_with_label
import interop.gtk_radio_menu_item_new_with_label_from_widget
import interop.gtk_radio_menu_item_new_with_mnemonic
import interop.gtk_radio_menu_item_new_with_mnemonic_from_widget
import interop.gtk_radio_menu_item_set_group
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
  public fun new(group: SList?): RadioMenuItem =
      gtk_radio_menu_item_new(group?.reinterpret())!!.reinterpret()

  public fun newFromWidget(group: RadioMenuItem?): RadioMenuItem =
      gtk_radio_menu_item_new_from_widget(group?.reinterpret())!!.reinterpret()

  public fun newWithLabel(group: SList?, label: String?): RadioMenuItem =
      gtk_radio_menu_item_new_with_label(group?.reinterpret(), label)!!.reinterpret()

  public fun newWithLabelFromWidget(group: RadioMenuItem?, label: String?): RadioMenuItem =
      gtk_radio_menu_item_new_with_label_from_widget(group?.reinterpret(), label)!!.reinterpret()

  public fun newWithMnemonic(group: SList?, label: String?): RadioMenuItem =
      gtk_radio_menu_item_new_with_mnemonic(group?.reinterpret(), label)!!.reinterpret()

  public fun newWithMnemonicFromWidget(group: RadioMenuItem?, label: String?): RadioMenuItem =
      gtk_radio_menu_item_new_with_mnemonic_from_widget(group?.reinterpret(), label)!!.reinterpret()
}

public val RadioMenuItem.checkMenuItem: CheckMenuItem
  get() = pointed.check_menu_item.ptr

public var RadioMenuItem.group: SList?
  get() = gtk_radio_menu_item_get_group(this)?.reinterpret()
  set(`value`) {
    gtk_radio_menu_item_set_group(this@group, `value`)
  }

public fun RadioMenuItem.joinGroup(groupSource: RadioMenuItem?): Unit {
  gtk_radio_menu_item_join_group(this@joinGroup, groupSource?.reinterpret())
}

public fun RadioMenuItem.onGroupChanged(callback: (RadioMenuItem) -> Unit): RadioMenuItem {
  // TODO - handle callback data

  asObject.connect("group-changed") { callback(this) }
  return this
}
