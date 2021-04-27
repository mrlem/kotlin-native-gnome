// TODO - constructor: new
// TODO - constructor: new_from_model
// TODO - constructor: new_section
// TODO - constructor: new_submenu
// TODO - method: get_attribute_value
// TODO - method: get_link
// TODO - method: set_action_and_target_value
// TODO - method: set_attribute_value
// TODO - method: set_detailed_action
// TODO - method: set_icon
// TODO - method: set_label
// TODO - method: set_link
// TODO - method: set_section
// TODO - method: set_submenu
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuItem = CPointer<GMenuItem>

public val MenuItem.asObject: Object
  get() = reinterpret()

public object MenuItemFactory
