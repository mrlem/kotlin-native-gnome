@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkStateSet
import interop.atk_state_set_add_state
import interop.atk_state_set_and_sets
import interop.atk_state_set_clear_states
import interop.atk_state_set_contains_state
import interop.atk_state_set_is_empty
import interop.atk_state_set_new
import interop.atk_state_set_or_sets
import interop.atk_state_set_remove_state
import interop.atk_state_set_xor_sets
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray

public typealias StateSet = CPointer<AtkStateSet>

public val StateSet.asObject: Object
  get() = reinterpret()

public object StateSetFactory {
  public fun new(): StateSet = atk_state_set_new()!!.reinterpret()
}

public val StateSet.parent: Object
  get() = pointed.parent.ptr

public fun StateSet.addState(type: StateType): Boolean = atk_state_set_add_state(this@addState,
    type).toBoolean()

public fun StateSet.andSets(compareSet: StateSet?): StateSet? = atk_state_set_and_sets(this@andSets,
    compareSet?.reinterpret())?.reinterpret()

public fun StateSet.clearStates(): Unit {
  atk_state_set_clear_states(this@clearStates)
}

public fun StateSet.containsState(type: StateType): Boolean =
    atk_state_set_contains_state(this@containsState, type).toBoolean()

public fun StateSet.isEmpty(): Boolean = atk_state_set_is_empty(this@isEmpty).toBoolean()

public fun StateSet.orSets(compareSet: StateSet?): StateSet? = atk_state_set_or_sets(this@orSets,
    compareSet?.reinterpret())?.reinterpret()

public fun StateSet.removeState(type: StateType): Boolean =
    atk_state_set_remove_state(this@removeState, type).toBoolean()

public fun StateSet.xorSets(compareSet: StateSet?): StateSet? = atk_state_set_xor_sets(this@xorSets,
    compareSet?.reinterpret())?.reinterpret()
