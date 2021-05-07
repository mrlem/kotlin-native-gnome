// TODO - method: initialize (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkObject
import interop.atk_object_add_relationship
import interop.atk_object_get_accessible_id
import interop.atk_object_get_attributes
import interop.atk_object_get_description
import interop.atk_object_get_index_in_parent
import interop.atk_object_get_n_accessible_children
import interop.atk_object_get_name
import interop.atk_object_get_object_locale
import interop.atk_object_get_parent
import interop.atk_object_get_role
import interop.atk_object_notify_state_change
import interop.atk_object_peek_parent
import interop.atk_object_ref_accessible_child
import interop.atk_object_ref_relation_set
import interop.atk_object_ref_state_set
import interop.atk_object_remove_relationship
import interop.atk_object_set_accessible_id
import interop.atk_object_set_description
import interop.atk_object_set_name
import interop.atk_object_set_parent
import interop.atk_object_set_role
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Object = CPointer<AtkObject>

public val Object.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val Object.accessibleParent: Object?
  get() = pointed.accessible_parent

public val Object.relationSet: RelationSet?
  get() = pointed.relation_set

public var Object.accessibleId: String?
  get() = atk_object_get_accessible_id(this).toKString()
  set(`value`) {
    atk_object_set_accessible_id(this@accessibleId, `value`)
  }

public val Object.attributes: SList?
  get() = atk_object_get_attributes(this)?.reinterpret()

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

public var Object.parent: Object?
  get() = atk_object_get_parent(this)?.reinterpret()
  set(`value`) {
    atk_object_set_parent(this@parent, `value`)
  }

public var Object.role: Role
  get() = atk_object_get_role(this)
  set(`value`) {
    atk_object_set_role(this@role, `value`)
  }

public fun Object.addRelationship(relationship: RelationType, target: Object?): Boolean =
    atk_object_add_relationship(this@addRelationship, relationship,
    target?.reinterpret()).toBoolean()

public fun Object.notifyStateChange(state: ULong, `value`: Boolean): Unit {
  atk_object_notify_state_change(this@notifyStateChange, state, `value`.toInt())
}

public fun Object.peekParent(): Object? = atk_object_peek_parent(this@peekParent)?.reinterpret()

public fun Object.refAccessibleChild(i: Int): Object? =
    atk_object_ref_accessible_child(this@refAccessibleChild, i)?.reinterpret()

public fun Object.refRelationSet(): RelationSet? =
    atk_object_ref_relation_set(this@refRelationSet)?.reinterpret()

public fun Object.refStateSet(): StateSet? =
    atk_object_ref_state_set(this@refStateSet)?.reinterpret()

public fun Object.removeRelationship(relationship: RelationType, target: Object?): Boolean =
    atk_object_remove_relationship(this@removeRelationship, relationship,
    target?.reinterpret()).toBoolean()

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
