// TODO - constructor: newv
// TODO - method: get_data
// TODO - method: get_qdata
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
import interop.g_object_getv
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
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.gnome.toCArray
import org.mrlem.gnome.gobject.connect

public typealias Object = CPointer<GObject>

public object ObjectFactory

public val Object.refCount: UInt
  get() = pointed.ref_count

public fun Object.bindProperty(
  sourceProperty: String?,
  target: Object?,
  targetProperty: String?,
  flags: BindingFlags
): Binding? = g_object_bind_property(this@bindProperty, sourceProperty, target?.reinterpret(),
    targetProperty, flags)?.reinterpret()

public fun Object.bindPropertyFull(
  sourceProperty: String?,
  target: Object?,
  targetProperty: String?,
  flags: BindingFlags,
  transformTo: Closure?,
  transformFrom: Closure?
): Binding? = g_object_bind_property_with_closures(this@bindPropertyFull, sourceProperty,
    target?.reinterpret(), targetProperty, flags, transformTo?.reinterpret(),
    transformFrom?.reinterpret())?.reinterpret()

public fun Object.forceFloating(): Unit {
  g_object_force_floating(this@forceFloating)
}

public fun Object.freezeNotify(): Unit {
  g_object_freeze_notify(this@freezeNotify)
}

public fun Object.getProperty(propertyName: String?, `value`: Value?): Unit {
  g_object_get_property(this@getProperty, propertyName, `value`?.reinterpret())
}

public fun Object.getv(
  nProperties: UInt,
  names: Array<String>?,
  values: Array<Value>?
): Unit {
  memScoped { g_object_getv(this@getv, nProperties, names?.toCArray(memScope), values?.map {
      it.pointed }?.toTypedArray()?.toCArray(memScope)) }
}

public fun Object.isFloating(): Boolean = g_object_is_floating(this@isFloating).toBoolean()

public fun Object.notify(propertyName: String?): Unit {
  g_object_notify(this@notify, propertyName)
}

public fun Object.notifyByPspec(pspec: ParamSpec?): Unit {
  g_object_notify_by_pspec(this@notifyByPspec, pspec?.reinterpret())
}

public fun Object.ref(): Object? = g_object_ref(this@ref)?.reinterpret()

public fun Object.refSink(): Object? = g_object_ref_sink(this@refSink)?.reinterpret()

public fun Object.runDispose(): Unit {
  g_object_run_dispose(this@runDispose)
}

public fun Object.setProperty(propertyName: String?, `value`: Value?): Unit {
  g_object_set_property(this@setProperty, propertyName, `value`?.reinterpret())
}

public fun Object.thawNotify(): Unit {
  g_object_thaw_notify(this@thawNotify)
}

public fun Object.unref(): Unit {
  g_object_unref(this@unref)
}

public fun Object.watchClosure(closure: Closure?): Unit {
  g_object_watch_closure(this@watchClosure, closure?.reinterpret())
}

public fun Object.onNotify(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("notify") { callback(this) }
  return this
}
