@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkRelation
import interop.atk_relation_add_target
import interop.atk_relation_get_relation_type
import interop.atk_relation_new
import interop.atk_relation_remove_target
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.gnome.toCArray

public typealias Relation = CPointer<AtkRelation>

public val Relation.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public object RelationFactory {
  public fun new(
    targets: Array<Object>?,
    nTargets: Int,
    relationship: RelationType
  ): Relation = memScoped { atk_relation_new(targets?.toCArray(memScope), nTargets,
      relationship)!!.reinterpret() }
}

public val Relation.parent: org.gnome.gobject.Object
  get() = pointed.parent.ptr

public val Relation.relationship: RelationType
  get() = pointed.relationship

public val Relation.relationType: RelationType
  get() = atk_relation_get_relation_type(this)

public fun Relation.addTarget(target: Object?): Unit {
  atk_relation_add_target(this@addTarget, target?.reinterpret())
}

public fun Relation.removeTarget(target: Object?): Boolean =
    atk_relation_remove_target(this@removeTarget, target?.reinterpret()).toBoolean()
