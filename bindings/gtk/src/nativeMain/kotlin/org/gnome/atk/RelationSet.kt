// TODO - constructor: new
// TODO - field: relations
// TODO - method: add (param type)
// TODO - method: add_relation_by_type (param type)
// TODO - method: contains (param type)
// TODO - method: contains_target (param type)
// TODO - method: get_relation (return type)
// TODO - method: get_relation_by_type (return type)
// TODO - method: remove (param type)
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
