// TODO - method: lookup_certificate_for_handle_async (param type)
// TODO - method: lookup_certificate_issuer_async (param type)
// TODO - method: lookup_certificates_issued_by (return type)
// TODO - method: lookup_certificates_issued_by_async (param type)
// TODO - method: lookup_certificates_issued_by_finish (return type)
// TODO - method: verify_chain_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GTlsDatabase
import interop.g_tls_database_create_certificate_handle
import interop.g_tls_database_lookup_certificate_for_handle
import interop.g_tls_database_lookup_certificate_for_handle_finish
import interop.g_tls_database_lookup_certificate_issuer
import interop.g_tls_database_lookup_certificate_issuer_finish
import interop.g_tls_database_verify_chain
import interop.g_tls_database_verify_chain_finish
import kotlin.String
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString
import org.mrlem.gnome.glib.Error

public typealias TlsDatabase = CPointer<GTlsDatabase>

public val TlsDatabase.asObject: Object
  get() = reinterpret()

public val TlsDatabase.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun TlsDatabase.createCertificateHandle(certificate: TlsCertificate?): String? =
    g_tls_database_create_certificate_handle(this@createCertificateHandle,
    certificate?.reinterpret()).toKString()

@Throws(Error::class)
public fun TlsDatabase.lookupCertificateForHandle(
  handle: String?,
  interaction: TlsInteraction?,
  flags: TlsDatabaseLookupFlags,
  cancellable: Cancellable?
): TlsCertificate? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsCertificate? =
      g_tls_database_lookup_certificate_for_handle(this@lookupCertificateForHandle, handle,
      interaction?.reinterpret(), flags, cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsDatabase.lookupCertificateForHandleFinish(result: AsyncResult?): TlsCertificate? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsCertificate? =
      g_tls_database_lookup_certificate_for_handle_finish(this@lookupCertificateForHandleFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsDatabase.lookupCertificateIssuer(
  certificate: TlsCertificate?,
  interaction: TlsInteraction?,
  flags: TlsDatabaseLookupFlags,
  cancellable: Cancellable?
): TlsCertificate? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsCertificate? =
      g_tls_database_lookup_certificate_issuer(this@lookupCertificateIssuer,
      certificate?.reinterpret(), interaction?.reinterpret(), flags, cancellable?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsDatabase.lookupCertificateIssuerFinish(result: AsyncResult?): TlsCertificate? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsCertificate? =
      g_tls_database_lookup_certificate_issuer_finish(this@lookupCertificateIssuerFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsDatabase.verifyChain(
  chain: TlsCertificate?,
  purpose: String?,
  identity: SocketConnectable?,
  interaction: TlsInteraction?,
  flags: TlsDatabaseVerifyFlags,
  cancellable: Cancellable?
): TlsCertificateFlags = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsCertificateFlags = g_tls_database_verify_chain(this@verifyChain,
      chain?.reinterpret(), purpose, identity?.reinterpret(), interaction?.reinterpret(), flags,
      cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsDatabase.verifyChainFinish(result: AsyncResult?): TlsCertificateFlags = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsCertificateFlags = g_tls_database_verify_chain_finish(this@verifyChainFinish,
      result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
