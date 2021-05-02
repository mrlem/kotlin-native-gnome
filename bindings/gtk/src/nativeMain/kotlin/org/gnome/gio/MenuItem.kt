// TODO - constructor: new
// TODO - constructor: new_from_model
// TODO - constructor: new_section
// TODO - constructor: new_submenu
// TODO - method: get_attribute_value
// TODO - method: set_action_and_target_value
// TODO - method: set_attribute_value
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuItem
import interop.g_menu_item_get_link
import interop.g_menu_item_set_detailed_action
import interop.g_menu_item_set_icon
import interop.g_menu_item_set_label
import interop.g_menu_item_set_link
import interop.g_menu_item_set_section
import interop.g_menu_item_set_submenu
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuItem = CPointer<GMenuItem>

public val MenuItem.asObject: Object
  get() = reinterpret()

public object MenuItemFactory

public fun MenuItem.getLink(link: String): MenuModel? = g_menu_item_get_link(this,
    link)?.reinterpret()

public fun MenuItem.setDetailedAction(detailedAction: String): Unit {
  g_menu_item_set_detailed_action(this, detailedAction)
}

public fun MenuItem.setIcon(icon: Icon?): Unit {
  g_menu_item_set_icon(this, icon?.reinterpret())
}

public fun MenuItem.setLabel(label: String): Unit {
  g_menu_item_set_label(this, label)
}

public fun MenuItem.setLink(link: String, model: MenuModel?): Unit {
  g_menu_item_set_link(this, link, model?.reinterpret())
}

public fun MenuItem.setSection(section: MenuModel?): Unit {
  g_menu_item_set_section(this, section?.reinterpret())
}

public fun MenuItem.setSubmenu(submenu: MenuModel?): Unit {
  g_menu_item_set_submenu(this, submenu?.reinterpret())
}
