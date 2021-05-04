// TODO - method: get_item_attribute_value (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuModel
import interop.g_menu_model_get_item_link
import interop.g_menu_model_get_n_items
import interop.g_menu_model_is_mutable
import interop.g_menu_model_items_changed
import interop.g_menu_model_iterate_item_attributes
import interop.g_menu_model_iterate_item_links
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias MenuModel = CPointer<GMenuModel>

public val MenuModel.asObject: Object
  get() = reinterpret()

public val MenuModel.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val MenuModel.nItems: Int
  get() = g_menu_model_get_n_items(this)

public fun MenuModel.getItemLink(itemIndex: Int, link: String?): MenuModel? =
    g_menu_model_get_item_link(this@getItemLink, itemIndex, link)?.reinterpret()

public fun MenuModel.isMutable(): Boolean = g_menu_model_is_mutable(this@isMutable).toBoolean()

public fun MenuModel.itemsChanged(
  position: Int,
  removed: Int,
  added: Int
): Unit {
  g_menu_model_items_changed(this@itemsChanged, position, removed, added)
}

public fun MenuModel.iterateItemAttributes(itemIndex: Int): MenuAttributeIter? =
    g_menu_model_iterate_item_attributes(this@iterateItemAttributes, itemIndex)?.reinterpret()

public fun MenuModel.iterateItemLinks(itemIndex: Int): MenuLinkIter? =
    g_menu_model_iterate_item_links(this@iterateItemLinks, itemIndex)?.reinterpret()

public fun MenuModel.onItemsChanged(callback: (MenuModel) -> Unit): MenuModel {
  // TODO - handle callback data

  asObject.connect("items-changed") { callback(this) }
  return this
}
