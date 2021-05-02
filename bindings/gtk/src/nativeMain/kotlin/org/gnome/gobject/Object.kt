// TODO - constructor: newv
// TODO - field: qdata
// TODO - method: get_data
// TODO - method: get_qdata
// TODO - method: getv
// TODO - method: set_data
// TODO - method: steal_data
// TODO - method: steal_qdata
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GObject
import interop.g_object_bind_property
import interop.g_object_bind_property_with_closures
import interop.g_object_force_floating
import interop.g_object_freeze_notify
import interop.g_object_get_property
import interop.g_object_is_floating
import interop.g_object_notify
import interop.g_object_notify_by_pspec
import interop.g_object_ref
import interop.g_object_ref_sink
import interop.g_object_run_dispose
import interop.g_object_set_property
import interop.g_object_thaw_notify
import interop.g_object_unref
import interop.g_object_watch_closure
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Object = CPointer<GObject>

public object ObjectFactory

public val Object.refCount: UInt
  get() = pointed.ref_count

public fun Object.bindProperty(
  sourceProperty: String,
  target: Object?,
  targetProperty: String,
  flags: BindingFlags
): Binding? = g_object_bind_property(this, sourceProperty, target?.reinterpret(), targetProperty,
    flags)?.reinterpret()

public fun Object.bindPropertyFull(
  sourceProperty: String,
  target: Object?,
  targetProperty: String,
  flags: BindingFlags,
  transformTo: Closure?,
  transformFrom: Closure?
): Binding? = g_object_bind_property_with_closures(this, sourceProperty, target?.reinterpret(),
    targetProperty, flags, transformTo?.reinterpret(), transformFrom?.reinterpret())?.reinterpret()

public fun Object.forceFloating(): Unit {
  g_object_force_floating(this)
}

public fun Object.freezeNotify(): Unit {
  g_object_freeze_notify(this)
}

public fun Object.getProperty(propertyName: String, `value`: Value?): Unit {
  g_object_get_property(this, propertyName, `value`?.reinterpret())
}

public fun Object.isFloating(): Boolean = g_object_is_floating(this).toBoolean

public fun Object.notify(propertyName: String): Unit {
  g_object_notify(this, propertyName)
}

public fun Object.notifyByPspec(pspec: ParamSpec?): Unit {
  g_object_notify_by_pspec(this, pspec?.reinterpret())
}

public fun Object.ref(): Object? = g_object_ref(this)?.reinterpret()

public fun Object.refSink(): Object? = g_object_ref_sink(this)?.reinterpret()

public fun Object.runDispose(): Unit {
  g_object_run_dispose(this)
}

public fun Object.setProperty(propertyName: String, `value`: Value?): Unit {
  g_object_set_property(this, propertyName, `value`?.reinterpret())
}

public fun Object.thawNotify(): Unit {
  g_object_thaw_notify(this)
}

public fun Object.unref(): Unit {
  g_object_unref(this)
}

public fun Object.watchClosure(closure: Closure?): Unit {
  g_object_watch_closure(this, closure?.reinterpret())
}

public fun Object.onNotify(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("notify") { callback(this) }
  return this
}
