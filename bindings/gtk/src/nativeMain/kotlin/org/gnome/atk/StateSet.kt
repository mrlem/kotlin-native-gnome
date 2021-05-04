// TODO - constructor: new
// TODO - method: add_state
// TODO - method: add_states
// TODO - method: and_sets
// TODO - method: contains_state
// TODO - method: contains_states
// TODO - method: or_sets
// TODO - method: remove_state
// TODO - method: xor_sets
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkStateSet
import interop.atk_state_set_clear_states
import interop.atk_state_set_is_empty
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias StateSet = CPointer<AtkStateSet>

public val StateSet.asObject: Object
  get() = reinterpret()

public object StateSetFactory

public val StateSet.parent: Object
  get() = pointed.parent.ptr

public fun StateSet.clearStates(): Unit {
  atk_state_set_clear_states(this@clearStates)
}

public fun StateSet.isEmpty(): Boolean = atk_state_set_is_empty(this@isEmpty).toBoolean()
