// TODO - method: emit_accept_certificate
// TODO - method: get_rehandshake_mode
// TODO - method: get_use_system_certdb
// TODO - method: handshake
// TODO - method: handshake_async
// TODO - method: handshake_finish
// TODO - method: set_advertised_protocols
// TODO - method: set_rehandshake_mode
// TODO - method: set_use_system_certdb
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsConnection
import interop.g_tls_connection_get_certificate
import interop.g_tls_connection_get_database
import interop.g_tls_connection_get_interaction
import interop.g_tls_connection_get_negotiated_protocol
import interop.g_tls_connection_get_peer_certificate
import interop.g_tls_connection_get_peer_certificate_errors
import interop.g_tls_connection_get_require_close_notify
import interop.g_tls_connection_set_certificate
import interop.g_tls_connection_set_database
import interop.g_tls_connection_set_interaction
import interop.g_tls_connection_set_require_close_notify
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias TlsConnection = CPointer<GTlsConnection>

public val TlsConnection.asObject: Object
  get() = reinterpret()

public val TlsConnection.asIOStream: IOStream
  get() = reinterpret()

public var TlsConnection.certificate: TlsCertificate?
  get() = g_tls_connection_get_certificate(this)?.reinterpret()
  set(`value`) {
    g_tls_connection_set_certificate(this, value)
  }

public var TlsConnection.database: TlsDatabase?
  get() = g_tls_connection_get_database(this)?.reinterpret()
  set(`value`) {
    g_tls_connection_set_database(this, value)
  }

public var TlsConnection.interaction: TlsInteraction?
  get() = g_tls_connection_get_interaction(this)?.reinterpret()
  set(`value`) {
    g_tls_connection_set_interaction(this, value)
  }

public val TlsConnection.negotiatedProtocol: String
  get() = g_tls_connection_get_negotiated_protocol(this).toKString

public val TlsConnection.peerCertificate: TlsCertificate?
  get() = g_tls_connection_get_peer_certificate(this)?.reinterpret()

public val TlsConnection.peerCertificateErrors: TlsCertificateFlags
  get() = g_tls_connection_get_peer_certificate_errors(this)

public var TlsConnection.requireCloseNotify: Boolean
  get() = g_tls_connection_get_require_close_notify(this).toBoolean
  set(`value`) {
    g_tls_connection_set_require_close_notify(this, value.toInt)
  }

public fun TlsConnection.onAcceptCertificate(callback: (TlsConnection) -> Unit): TlsConnection {
  // TODO - handle callback data

  asObject.connect("accept-certificate") { callback(this) }
  return this
}
