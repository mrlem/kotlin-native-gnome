// TODO - constructor: new
// TODO - field: relationship
// TODO - method: add_target (param type)
// TODO - method: get_relation_type (return type)
// TODO - method: get_target (return type)
// TODO - method: remove_target (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkRelation
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Relation = CPointer<AtkRelation>

public val Relation.asObject: Object
  get() = reinterpret()

public object RelationFactory

public val Relation.parent: Object
  get() = pointed.parent.ptr
