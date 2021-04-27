// TODO - constructor: new
// TODO - constructor: new_full
// TODO - constructor: new_with_backend
// TODO - constructor: new_with_backend_and_path
// TODO - constructor: new_with_path
// TODO - method: bind
// TODO - method: bind_writable
// TODO - method: create_action
// TODO - method: get_boolean
// TODO - method: get_child
// TODO - method: get_default_value
// TODO - method: get_double
// TODO - method: get_enum
// TODO - method: get_flags
// TODO - method: get_int
// TODO - method: get_int64
// TODO - method: get_mapped
// TODO - method: get_range
// TODO - method: get_string
// TODO - method: get_strv
// TODO - method: get_uint
// TODO - method: get_uint64
// TODO - method: get_user_value
// TODO - method: get_value
// TODO - method: is_writable
// TODO - method: list_children
// TODO - method: list_keys
// TODO - method: range_check
// TODO - method: reset
// TODO - method: set_boolean
// TODO - method: set_double
// TODO - method: set_enum
// TODO - method: set_flags
// TODO - method: set_int
// TODO - method: set_int64
// TODO - method: set_string
// TODO - method: set_strv
// TODO - method: set_uint
// TODO - method: set_uint64
// TODO - method: set_value
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSettings
import interop.g_settings_apply
import interop.g_settings_delay
import interop.g_settings_get_has_unapplied
import interop.g_settings_revert
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Settings = CPointer<GSettings>

public val Settings.asObject: Object
  get() = reinterpret()

public object SettingsFactory

public val Settings.hasUnapplied: Boolean
  get() = g_settings_get_has_unapplied(this).toBoolean

public fun Settings.apply(): Unit {
  g_settings_apply(this)
}

public fun Settings.delay(): Unit {
  g_settings_delay(this)
}

public fun Settings.revert(): Unit {
  g_settings_revert(this)
}

public fun Settings.onChangeEvent(callback: (Settings) -> Unit): Settings {
  // TODO - handle callback data

  asObject.connect("change-event") { callback(this) }
  return this
}

public fun Settings.onChanged(callback: (Settings) -> Unit): Settings {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}

public fun Settings.onWritableChangeEvent(callback: (Settings) -> Unit): Settings {
  // TODO - handle callback data

  asObject.connect("writable-change-event") { callback(this) }
  return this
}

public fun Settings.onWritableChanged(callback: (Settings) -> Unit): Settings {
  // TODO - handle callback data

  asObject.connect("writable-changed") { callback(this) }
  return this
}
