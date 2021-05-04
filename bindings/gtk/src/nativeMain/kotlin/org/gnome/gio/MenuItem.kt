// TODO - method: get_attribute_value
// TODO - method: set_action_and_target_value
// TODO - method: set_attribute_value
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuItem
import interop.g_menu_item_get_link
import interop.g_menu_item_new
import interop.g_menu_item_new_from_model
import interop.g_menu_item_new_section
import interop.g_menu_item_new_submenu
import interop.g_menu_item_set_detailed_action
import interop.g_menu_item_set_icon
import interop.g_menu_item_set_label
import interop.g_menu_item_set_link
import interop.g_menu_item_set_section
import interop.g_menu_item_set_submenu
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuItem = CPointer<GMenuItem>

public val MenuItem.asObject: Object
  get() = reinterpret()

public object MenuItemFactory {
  public fun new(label: String?, detailedAction: String?): MenuItem = g_menu_item_new(label,
      detailedAction)!!.reinterpret()

  public fun newFromModel(model: MenuModel?, itemIndex: Int): MenuItem =
      g_menu_item_new_from_model(model?.reinterpret(), itemIndex)!!.reinterpret()

  public fun newSection(label: String?, section: MenuModel?): MenuItem =
      g_menu_item_new_section(label, section?.reinterpret())!!.reinterpret()

  public fun newSubmenu(label: String?, submenu: MenuModel?): MenuItem =
      g_menu_item_new_submenu(label, submenu?.reinterpret())!!.reinterpret()
}

public fun MenuItem.getLink(link: String?): MenuModel? = g_menu_item_get_link(this@getLink,
    link)?.reinterpret()

public fun MenuItem.setDetailedAction(detailedAction: String?): Unit {
  g_menu_item_set_detailed_action(this@setDetailedAction, detailedAction)
}

public fun MenuItem.setIcon(icon: Icon?): Unit {
  g_menu_item_set_icon(this@setIcon, icon?.reinterpret())
}

public fun MenuItem.setLabel(label: String?): Unit {
  g_menu_item_set_label(this@setLabel, label)
}

public fun MenuItem.setLink(link: String?, model: MenuModel?): Unit {
  g_menu_item_set_link(this@setLink, link, model?.reinterpret())
}

public fun MenuItem.setSection(section: MenuModel?): Unit {
  g_menu_item_set_section(this@setSection, section?.reinterpret())
}

public fun MenuItem.setSubmenu(submenu: MenuModel?): Unit {
  g_menu_item_set_submenu(this@setSubmenu, submenu?.reinterpret())
}
