// TODO - method: handshake_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GTlsConnection
import interop.g_tls_connection_emit_accept_certificate
import interop.g_tls_connection_get_certificate
import interop.g_tls_connection_get_database
import interop.g_tls_connection_get_interaction
import interop.g_tls_connection_get_negotiated_protocol
import interop.g_tls_connection_get_peer_certificate
import interop.g_tls_connection_get_peer_certificate_errors
import interop.g_tls_connection_get_require_close_notify
import interop.g_tls_connection_handshake
import interop.g_tls_connection_handshake_finish
import interop.g_tls_connection_set_advertised_protocols
import interop.g_tls_connection_set_certificate
import interop.g_tls_connection_set_database
import interop.g_tls_connection_set_interaction
import interop.g_tls_connection_set_require_close_notify
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias TlsConnection = CPointer<GTlsConnection>

public val TlsConnection.asObject: Object
  get() = reinterpret()

public val TlsConnection.asIOStream: IOStream
  get() = reinterpret()

public val TlsConnection.parentInstance: IOStream
  get() = pointed.parent_instance.ptr

public var TlsConnection.certificate: TlsCertificate?
  get() = g_tls_connection_get_certificate(this)?.reinterpret()
  set(`value`) {
    g_tls_connection_set_certificate(this@certificate, `value`)
  }

public var TlsConnection.database: TlsDatabase?
  get() = g_tls_connection_get_database(this)?.reinterpret()
  set(`value`) {
    g_tls_connection_set_database(this@database, `value`)
  }

public var TlsConnection.interaction: TlsInteraction?
  get() = g_tls_connection_get_interaction(this)?.reinterpret()
  set(`value`) {
    g_tls_connection_set_interaction(this@interaction, `value`)
  }

public val TlsConnection.negotiatedProtocol: String?
  get() = g_tls_connection_get_negotiated_protocol(this).toKString()

public val TlsConnection.peerCertificate: TlsCertificate?
  get() = g_tls_connection_get_peer_certificate(this)?.reinterpret()

public val TlsConnection.peerCertificateErrors: TlsCertificateFlags
  get() = g_tls_connection_get_peer_certificate_errors(this)

public var TlsConnection.requireCloseNotify: Boolean
  get() = g_tls_connection_get_require_close_notify(this).toBoolean()
  set(`value`) {
    g_tls_connection_set_require_close_notify(this@requireCloseNotify, `value`.toInt())
  }

public fun TlsConnection.emitAcceptCertificate(peerCert: TlsCertificate?,
    errors: TlsCertificateFlags): Boolean =
    g_tls_connection_emit_accept_certificate(this@emitAcceptCertificate, peerCert?.reinterpret(),
    errors).toBoolean()

@Throws(Error::class)
public fun TlsConnection.handshake(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_tls_connection_handshake(this@handshake, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsConnection.handshakeFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_tls_connection_handshake_finish(this@handshakeFinish,
      result?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun TlsConnection.setAdvertisedProtocols(protocols: Array<String>?): Unit {
  memScoped { g_tls_connection_set_advertised_protocols(this@setAdvertisedProtocols,
      protocols?.toCArray(memScope)) }
}

public fun TlsConnection.onAcceptCertificate(callback: (TlsConnection) -> Unit): TlsConnection {
  // TODO - handle callback data

  asObject.connect("accept-certificate") { callback(this) }
  return this
}
