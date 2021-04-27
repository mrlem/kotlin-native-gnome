// TODO - method: get_item_attribute_value
// TODO - method: get_item_link
// TODO - method: items_changed
// TODO - method: iterate_item_attributes
// TODO - method: iterate_item_links
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuModel
import interop.g_menu_model_get_n_items
import interop.g_menu_model_is_mutable
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias MenuModel = CPointer<GMenuModel>

public val MenuModel.asObject: Object
  get() = reinterpret()

public val MenuModel.nItems: Int
  get() = g_menu_model_get_n_items(this)

public fun MenuModel.isMutable(): Boolean = g_menu_model_is_mutable(this).toBoolean

public fun MenuModel.onItemsChanged(callback: (MenuModel) -> Unit): MenuModel {
  // TODO - handle callback data

  asObject.connect("items-changed") { callback(this) }
  return this
}
