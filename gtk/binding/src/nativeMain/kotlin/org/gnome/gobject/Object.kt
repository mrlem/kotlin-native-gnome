// TODO - constructor: newv
// TODO - method: bind_property
// TODO - method: bind_property_full
// TODO - method: get_data
// TODO - method: get_property
// TODO - method: get_qdata
// TODO - method: getv
// TODO - method: notify
// TODO - method: notify_by_pspec
// TODO - method: set_data
// TODO - method: set_property
// TODO - method: steal_data
// TODO - method: steal_qdata
// TODO - method: watch_closure
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GObject
import interop.g_object_force_floating
import interop.g_object_freeze_notify
import interop.g_object_is_floating
import interop.g_object_ref
import interop.g_object_ref_sink
import interop.g_object_run_dispose
import interop.g_object_thaw_notify
import interop.g_object_unref
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Object = CPointer<GObject>

public object ObjectFactory

public fun Object.forceFloating(): Unit {
  g_object_force_floating(this)
}

public fun Object.freezeNotify(): Unit {
  g_object_freeze_notify(this)
}

public fun Object.isFloating(): Boolean = g_object_is_floating(this).toBoolean

public fun Object.ref(): Object? = g_object_ref(this)?.reinterpret()

public fun Object.refSink(): Object? = g_object_ref_sink(this)?.reinterpret()

public fun Object.runDispose(): Unit {
  g_object_run_dispose(this)
}

public fun Object.thawNotify(): Unit {
  g_object_thaw_notify(this)
}

public fun Object.unref(): Unit {
  g_object_unref(this)
}

public fun Object.onNotify(callback: (Object) -> Unit): Object {
  // TODO - handle callback data

  asObject.connect("notify") { callback(this) }
  return this
}
