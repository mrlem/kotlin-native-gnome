@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusAuthObserver
import interop.g_dbus_auth_observer_allow_mechanism
import interop.g_dbus_auth_observer_authorize_authenticated_peer
import interop.g_dbus_auth_observer_new
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias DBusAuthObserver = CPointer<GDBusAuthObserver>

public val DBusAuthObserver.asObject: Object
  get() = reinterpret()

public object DBusAuthObserverFactory {
  public fun new(): DBusAuthObserver = g_dbus_auth_observer_new()!!.reinterpret()
}

public fun DBusAuthObserver.allowMechanism(mechanism: String): Boolean =
    g_dbus_auth_observer_allow_mechanism(this, mechanism).toBoolean()

public fun DBusAuthObserver.authorizeAuthenticatedPeer(stream: IOStream?,
    credentials: Credentials?): Boolean = g_dbus_auth_observer_authorize_authenticated_peer(this,
    stream?.reinterpret(), credentials?.reinterpret()).toBoolean()

public fun DBusAuthObserver.onAllowMechanism(callback: (DBusAuthObserver) -> Unit):
    DBusAuthObserver {
  // TODO - handle callback data

  asObject.connect("allow-mechanism") { callback(this) }
  return this
}

public fun DBusAuthObserver.onAuthorizeAuthenticatedPeer(callback: (DBusAuthObserver) -> Unit):
    DBusAuthObserver {
  // TODO - handle callback data

  asObject.connect("authorize-authenticated-peer") { callback(this) }
  return this
}
