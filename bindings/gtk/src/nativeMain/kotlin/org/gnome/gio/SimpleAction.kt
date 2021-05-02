// TODO - constructor: new
// TODO - constructor: new_stateful
// TODO - method: set_state
// TODO - method: set_state_hint
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleAction
import interop.g_simple_action_set_enabled
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias SimpleAction = CPointer<GSimpleAction>

public val SimpleAction.asObject: Object
  get() = reinterpret()

public object SimpleActionFactory

public fun SimpleAction.setEnabled(enabled: Boolean): Unit {
  g_simple_action_set_enabled(this, enabled.toInt)
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
