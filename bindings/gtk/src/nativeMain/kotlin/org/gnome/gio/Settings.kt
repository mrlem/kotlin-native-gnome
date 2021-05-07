// TODO - method: get_mapped (return type)
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
import interop.g_settings_get_default_value
import interop.g_settings_get_double
import interop.g_settings_get_enum
import interop.g_settings_get_flags
import interop.g_settings_get_has_unapplied
import interop.g_settings_get_int
import interop.g_settings_get_int64
import interop.g_settings_get_string
import interop.g_settings_get_strv
import interop.g_settings_get_uint
import interop.g_settings_get_uint64
import interop.g_settings_get_user_value
import interop.g_settings_get_value
import interop.g_settings_is_writable
import interop.g_settings_list_children
import interop.g_settings_new
import interop.g_settings_new_full
import interop.g_settings_new_with_backend
import interop.g_settings_new_with_backend_and_path
import interop.g_settings_new_with_path
import interop.g_settings_reset
import interop.g_settings_revert
import interop.g_settings_set_boolean
import interop.g_settings_set_double
import interop.g_settings_set_enum
import interop.g_settings_set_flags
import interop.g_settings_set_int
import interop.g_settings_set_int64
import interop.g_settings_set_string
import interop.g_settings_set_strv
import interop.g_settings_set_uint
import interop.g_settings_set_uint64
import interop.g_settings_set_value
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKArray
import org.mrlem.gnome.toKString

public typealias Settings = CPointer<GSettings>

public val Settings.asObject: Object
  get() = reinterpret()

public object SettingsFactory {
  public fun new(schemaId: String?): Settings = g_settings_new(schemaId)!!.reinterpret()

  public fun newFull(
    schema: SettingsSchema?,
    backend: SettingsBackend?,
    path: String?
  ): Settings = g_settings_new_full(schema?.reinterpret(), backend?.reinterpret(),
      path)!!.reinterpret()

  public fun newWithBackend(schemaId: String?, backend: SettingsBackend?): Settings =
      g_settings_new_with_backend(schemaId, backend?.reinterpret())!!.reinterpret()

  public fun newWithBackendAndPath(
    schemaId: String?,
    backend: SettingsBackend?,
    path: String?
  ): Settings = g_settings_new_with_backend_and_path(schemaId, backend?.reinterpret(),
      path)!!.reinterpret()

  public fun newWithPath(schemaId: String?, path: String?): Settings =
      g_settings_new_with_path(schemaId, path)!!.reinterpret()
}

public val Settings.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Settings.hasUnapplied: Boolean
  get() = g_settings_get_has_unapplied(this).toBoolean()

public fun Settings.apply(): Unit {
  g_settings_apply(this@apply)
}

public fun Settings.bind(
  key: String?,
  `object`: Object?,
  `property`: String?,
  flags: SettingsBindFlags
): Unit {
  g_settings_bind(this@bind, key, `object`?.reinterpret(), `property`, flags)
}

public fun Settings.bindWritable(
  key: String?,
  `object`: Object?,
  `property`: String?,
  inverted: Boolean
): Unit {
  g_settings_bind_writable(this@bindWritable, key, `object`?.reinterpret(), `property`,
      inverted.toInt())
}

public fun Settings.createAction(key: String?): Action? =
    g_settings_create_action(this@createAction, key)?.reinterpret()

public fun Settings.delay(): Unit {
  g_settings_delay(this@delay)
}

public fun Settings.getBoolean(key: String?): Boolean = g_settings_get_boolean(this@getBoolean,
    key).toBoolean()

public fun Settings.getChild(name: String?): Settings? = g_settings_get_child(this@getChild,
    name)?.reinterpret()

public fun Settings.getDefaultValue(key: String?): Variant? =
    g_settings_get_default_value(this@getDefaultValue, key)?.reinterpret()

public fun Settings.getDouble(key: String?): Double = g_settings_get_double(this@getDouble, key)

public fun Settings.getEnum(key: String?): Int = g_settings_get_enum(this@getEnum, key)

public fun Settings.getFlags(key: String?): UInt = g_settings_get_flags(this@getFlags, key)

public fun Settings.getInt(key: String?): Int = g_settings_get_int(this@getInt, key)

public fun Settings.getInt64(key: String?): Long = g_settings_get_int64(this@getInt64, key)

public fun Settings.getString(key: String?): String? = g_settings_get_string(this@getString,
    key).toKString()

public fun Settings.getStrv(key: String?): Array<String>? = g_settings_get_strv(this@getStrv,
    key)?.toKArray { it.toKString()!! }

public fun Settings.getUint(key: String?): UInt = g_settings_get_uint(this@getUint, key)

public fun Settings.getUint64(key: String?): ULong = g_settings_get_uint64(this@getUint64, key)

public fun Settings.getUserValue(key: String?): Variant? =
    g_settings_get_user_value(this@getUserValue, key)?.reinterpret()

public fun Settings.getValue(key: String?): Variant? = g_settings_get_value(this@getValue,
    key)?.reinterpret()

public fun Settings.isWritable(name: String?): Boolean = g_settings_is_writable(this@isWritable,
    name).toBoolean()

public fun Settings.listChildren(): Array<String>? =
    g_settings_list_children(this@listChildren)?.toKArray { it.toKString()!! }

public fun Settings.reset(key: String?): Unit {
  g_settings_reset(this@reset, key)
}

public fun Settings.revert(): Unit {
  g_settings_revert(this@revert)
}

public fun Settings.setBoolean(key: String?, `value`: Boolean): Boolean =
    g_settings_set_boolean(this@setBoolean, key, `value`.toInt()).toBoolean()

public fun Settings.setDouble(key: String?, `value`: Double): Boolean =
    g_settings_set_double(this@setDouble, key, `value`).toBoolean()

public fun Settings.setEnum(key: String?, `value`: Int): Boolean = g_settings_set_enum(this@setEnum,
    key, `value`).toBoolean()

public fun Settings.setFlags(key: String?, `value`: UInt): Boolean =
    g_settings_set_flags(this@setFlags, key, `value`).toBoolean()

public fun Settings.setInt(key: String?, `value`: Int): Boolean = g_settings_set_int(this@setInt,
    key, `value`).toBoolean()

public fun Settings.setInt64(key: String?, `value`: Long): Boolean =
    g_settings_set_int64(this@setInt64, key, `value`).toBoolean()

public fun Settings.setString(key: String?, `value`: String?): Boolean =
    g_settings_set_string(this@setString, key, `value`).toBoolean()

public fun Settings.setStrv(key: String?, `value`: Array<String>?): Boolean = memScoped {
    g_settings_set_strv(this@setStrv, key, `value`?.toCArray(memScope)).toBoolean() }

public fun Settings.setUint(key: String?, `value`: UInt): Boolean =
    g_settings_set_uint(this@setUint, key, `value`).toBoolean()

public fun Settings.setUint64(key: String?, `value`: ULong): Boolean =
    g_settings_set_uint64(this@setUint64, key, `value`).toBoolean()

public fun Settings.setValue(key: String?, `value`: Variant?): Boolean =
    g_settings_set_value(this@setValue, key, `value`?.reinterpret()).toBoolean()

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
