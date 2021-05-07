@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleAction
import interop.g_simple_action_new
import interop.g_simple_action_new_stateful
import interop.g_simple_action_set_enabled
import interop.g_simple_action_set_state
import interop.g_simple_action_set_state_hint
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.glib.VariantType
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toInt

public typealias SimpleAction = CPointer<GSimpleAction>

public val SimpleAction.asObject: Object
  get() = reinterpret()

public object SimpleActionFactory {
  public fun new(name: String?, parameterType: VariantType?): SimpleAction =
      g_simple_action_new(name, parameterType?.reinterpret())!!.reinterpret()

  public fun newStateful(
    name: String?,
    parameterType: VariantType?,
    state: Variant?
  ): SimpleAction = g_simple_action_new_stateful(name, parameterType?.reinterpret(),
      state?.reinterpret())!!.reinterpret()
}

public fun SimpleAction.setEnabled(enabled: Boolean): Unit {
  g_simple_action_set_enabled(this@setEnabled, enabled.toInt())
}

public fun SimpleAction.setState(`value`: Variant?): Unit {
  g_simple_action_set_state(this@setState, `value`?.reinterpret())
}

public fun SimpleAction.setStateHint(stateHint: Variant?): Unit {
  g_simple_action_set_state_hint(this@setStateHint, stateHint?.reinterpret())
}

public fun SimpleAction.onActivate(callback: (SimpleAction) -> Unit): SimpleAction {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}

public fun SimpleAction.onChangeState(callback: (SimpleAction) -> Unit): SimpleAction {
  // TODO - handle callback data

  asObject.connect("change-state") { callback(this) }
  return this
}
