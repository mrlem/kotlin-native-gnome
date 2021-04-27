@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSocketService
import interop.g_socket_service_is_active
import interop.g_socket_service_new
import interop.g_socket_service_start
import interop.g_socket_service_stop
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias SocketService = CPointer<GSocketService>

public val SocketService.asObject: Object
  get() = reinterpret()

public val SocketService.asSocketListener: SocketListener
  get() = reinterpret()

public object SocketServiceFactory {
  public fun new(): SocketService = g_socket_service_new()!!.reinterpret()
}

public fun SocketService.isActive(): Boolean = g_socket_service_is_active(this).toBoolean

public fun SocketService.start(): Unit {
  g_socket_service_start(this)
}

public fun SocketService.stop(): Unit {
  g_socket_service_stop(this)
}

public fun SocketService.onIncoming(callback: (SocketService) -> Unit): SocketService {
  // TODO - handle callback data

  asObject.connect("incoming") { callback(this) }
  return this
}
