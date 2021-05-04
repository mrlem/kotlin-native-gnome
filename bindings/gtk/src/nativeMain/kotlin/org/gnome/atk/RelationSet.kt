// TODO - constructor: new
// TODO - field: relations
// TODO - method: add
// TODO - method: add_relation_by_type
// TODO - method: contains
// TODO - method: contains_target
// TODO - method: get_relation
// TODO - method: get_relation_by_type
// TODO - method: remove
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkRelationSet
import interop.atk_relation_set_get_n_relations
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias RelationSet = CPointer<AtkRelationSet>

public val RelationSet.asObject: Object
  get() = reinterpret()

public object RelationSetFactory

public val RelationSet.parent: Object
  get() = pointed.parent.ptr

public val RelationSet.nRelations: Int
  get() = atk_relation_set_get_n_relations(this)
