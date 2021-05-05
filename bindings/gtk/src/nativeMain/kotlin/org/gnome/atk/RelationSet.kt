// TODO - field: relations
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkRelationSet
import interop.atk_relation_set_add
import interop.atk_relation_set_add_relation_by_type
import interop.atk_relation_set_contains
import interop.atk_relation_set_contains_target
import interop.atk_relation_set_get_n_relations
import interop.atk_relation_set_get_relation
import interop.atk_relation_set_get_relation_by_type
import interop.atk_relation_set_new
import interop.atk_relation_set_remove
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean

public typealias RelationSet = CPointer<AtkRelationSet>

public val RelationSet.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public object RelationSetFactory {
  public fun new(): RelationSet = atk_relation_set_new()!!.reinterpret()
}

public val RelationSet.parent: org.gnome.gobject.Object
  get() = pointed.parent.ptr

public val RelationSet.nRelations: Int
  get() = atk_relation_set_get_n_relations(this)

public fun RelationSet.add(relation: Relation?): Unit {
  atk_relation_set_add(this@add, relation?.reinterpret())
}

public fun RelationSet.addRelationByType(relationship: RelationType, target: Object?): Unit {
  atk_relation_set_add_relation_by_type(this@addRelationByType, relationship, target?.reinterpret())
}

public fun RelationSet.contains(relationship: RelationType): Boolean =
    atk_relation_set_contains(this@contains, relationship).toBoolean()

public fun RelationSet.containsTarget(relationship: RelationType, target: Object?): Boolean =
    atk_relation_set_contains_target(this@containsTarget, relationship,
    target?.reinterpret()).toBoolean()

public fun RelationSet.getRelation(i: Int): Relation? =
    atk_relation_set_get_relation(this@getRelation, i)?.reinterpret()

public fun RelationSet.getRelationByType(relationship: RelationType): Relation? =
    atk_relation_set_get_relation_by_type(this@getRelationByType, relationship)?.reinterpret()

public fun RelationSet.remove(relation: Relation?): Unit {
  atk_relation_set_remove(this@remove, relation?.reinterpret())
}
