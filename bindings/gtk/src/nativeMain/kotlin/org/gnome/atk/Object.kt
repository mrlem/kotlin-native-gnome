// TODO - field: accessible_parent
// TODO - field: relation_set
// TODO - method: add_relationship
// TODO - method: get_attributes
// TODO - method: get_layer
// TODO - method: get_mdi_zorder
// TODO - method: get_parent
// TODO - method: get_role
// TODO - method: initialize
// TODO - method: peek_parent
// TODO - method: ref_accessible_child
// TODO - method: ref_relation_set
// TODO - method: ref_state_set
// TODO - method: remove_property_change_handler
// TODO - method: remove_relationship
// TODO - method: set_parent
// TODO - method: set_role
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkObject
import interop.atk_object_get_accessible_id
import interop.atk_object_get_description
import interop.atk_object_get_index_in_parent
import interop.atk_object_get_n_accessible_children
import interop.atk_object_get_name
import interop.atk_object_get_object_locale
import interop.atk_object_notify_state_change
import interop.atk_object_set_accessible_id
import interop.atk_object_set_description
import interop.atk_object_set_name
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Object = CPointer<AtkObject>

public val Object.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public var Object.accessibleId: String?
  get() = atk_object_get_accessible_id(this).toKString()
  set(`value`) {
    atk_object_set_accessible_id(this@accessibleId, `value`)
  }

public var Object.description: String?
  get() = atk_object_get_description(this).toKString()
  set(`value`) {
    atk_object_set_description(this@description, `value`)
  }

public val Object.indexInParent: Int
  get() = atk_object_get_index_in_parent(this)

public val Object.nAccessibleChildren: Int
  get() = atk_object_get_n_accessible_children(this)

public var Object.name: String?
  get() = atk_object_get_name(this).toKString()
  set(`value`) {
    atk_object_set_name(this@name, `value`)
  }

public val Object.objectLocale: String?
  get() = atk_object_get_object_locale(this).toKString()

public fun Object.notifyStateChange(state: ULong, `value`: Boolean): Unit {
  atk_object_notify_state_change(this@notifyStateChange, state, `value`.toInt())
}

public fun Object.onActiveDescendantChanged(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("active-descendant-changed") { callback(this) }
  return this
}

public fun Object.onChildrenChanged(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("children-changed") { callback(this) }
  return this
}

public fun Object.onFocusEvent(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("focus-event") { callback(this) }
  return this
}

public fun Object.onPropertyChange(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("property-change") { callback(this) }
  return this
}

public fun Object.onStateChange(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("state-change") { callback(this) }
  return this
}

public fun Object.onVisibleDataChanged(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("visible-data-changed") { callback(this) }
  return this
}
