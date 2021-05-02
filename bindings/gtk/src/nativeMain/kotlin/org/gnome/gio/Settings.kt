// TODO - constructor: new
// TODO - constructor: new_full
// TODO - constructor: new_with_backend
// TODO - constructor: new_with_backend_and_path
// TODO - constructor: new_with_path
// TODO - method: get_default_value
// TODO - method: get_mapped
// TODO - method: get_range
// TODO - method: get_strv
// TODO - method: get_user_value
// TODO - method: get_value
// TODO - method: list_children
// TODO - method: list_keys
// TODO - method: range_check
// TODO - method: set_strv
// TODO - method: set_value
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSettings
import interop.g_settings_apply
import interop.g_settings_bind
import interop.g_settings_bind_writable
import interop.g_settings_create_action
import interop.g_settings_delay
import interop.g_settings_get_boolean
import interop.g_settings_get_child
import interop.g_settings_get_double
import interop.g_settings_get_enum
import interop.g_settings_get_flags
import interop.g_settings_get_has_unapplied
import interop.g_settings_get_int
import interop.g_settings_get_int64
import interop.g_settings_get_string
import interop.g_settings_get_uint
import interop.g_settings_get_uint64
import interop.g_settings_is_writable
import interop.g_settings_reset
import interop.g_settings_revert
import interop.g_settings_set_boolean
import interop.g_settings_set_double
import interop.g_settings_set_enum
import interop.g_settings_set_flags
import interop.g_settings_set_int
import interop.g_settings_set_int64
import interop.g_settings_set_string
import interop.g_settings_set_uint
import interop.g_settings_set_uint64
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Settings = CPointer<GSettings>

public val Settings.asObject: Object
  get() = reinterpret()

public object SettingsFactory

public val Settings.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Settings.hasUnapplied: Boolean
  get() = g_settings_get_has_unapplied(this).toBoolean()

public fun Settings.apply(): Unit {
  g_settings_apply(this)
}

public fun Settings.bind(
  key: String,
  `object`: Object?,
  `property`: String,
  flags: SettingsBindFlags
): Unit {
  g_settings_bind(this, key, `object`?.reinterpret(), `property`, flags)
}

public fun Settings.bindWritable(
  key: String,
  `object`: Object?,
  `property`: String,
  inverted: Boolean
): Unit {
  g_settings_bind_writable(this, key, `object`?.reinterpret(), `property`, inverted.toInt())
}

public fun Settings.createAction(key: String): Action? = g_settings_create_action(this,
    key)?.reinterpret()

public fun Settings.delay(): Unit {
  g_settings_delay(this)
}

public fun Settings.getBoolean(key: String): Boolean = g_settings_get_boolean(this, key).toBoolean()

public fun Settings.getChild(name: String): Settings? = g_settings_get_child(this,
    name)?.reinterpret()

public fun Settings.getDouble(key: String): Double = g_settings_get_double(this, key)

public fun Settings.getEnum(key: String): Int = g_settings_get_enum(this, key)

public fun Settings.getFlags(key: String): UInt = g_settings_get_flags(this, key)

public fun Settings.getInt(key: String): Int = g_settings_get_int(this, key)

public fun Settings.getInt64(key: String): Long = g_settings_get_int64(this, key)

public fun Settings.getString(key: String): String = g_settings_get_string(this, key).toKString()

public fun Settings.getUint(key: String): UInt = g_settings_get_uint(this, key)

public fun Settings.getUint64(key: String): ULong = g_settings_get_uint64(this, key)

public fun Settings.isWritable(name: String): Boolean = g_settings_is_writable(this,
    name).toBoolean()

public fun Settings.reset(key: String): Unit {
  g_settings_reset(this, key)
}

public fun Settings.revert(): Unit {
  g_settings_revert(this)
}

public fun Settings.setBoolean(key: String, `value`: Boolean): Boolean =
    g_settings_set_boolean(this, key, `value`.toInt()).toBoolean()

public fun Settings.setDouble(key: String, `value`: Double): Boolean = g_settings_set_double(this,
    key, `value`).toBoolean()

public fun Settings.setEnum(key: String, `value`: Int): Boolean = g_settings_set_enum(this, key,
    `value`).toBoolean()

public fun Settings.setFlags(key: String, `value`: UInt): Boolean = g_settings_set_flags(this, key,
    `value`).toBoolean()

public fun Settings.setInt(key: String, `value`: Int): Boolean = g_settings_set_int(this, key,
    `value`).toBoolean()

public fun Settings.setInt64(key: String, `value`: Long): Boolean = g_settings_set_int64(this, key,
    `value`).toBoolean()

public fun Settings.setString(key: String, `value`: String): Boolean = g_settings_set_string(this,
    key, `value`).toBoolean()

public fun Settings.setUint(key: String, `value`: UInt): Boolean = g_settings_set_uint(this, key,
    `value`).toBoolean()

public fun Settings.setUint64(key: String, `value`: ULong): Boolean = g_settings_set_uint64(this,
    key, `value`).toBoolean()

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
