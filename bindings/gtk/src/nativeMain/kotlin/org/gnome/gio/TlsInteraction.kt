// TODO - method: ask_password_async
// TODO - method: request_certificate_async
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GTlsInteraction
import interop.g_tls_interaction_ask_password
import interop.g_tls_interaction_ask_password_finish
import interop.g_tls_interaction_invoke_ask_password
import interop.g_tls_interaction_invoke_request_certificate
import interop.g_tls_interaction_request_certificate
import interop.g_tls_interaction_request_certificate_finish
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object

public typealias TlsInteraction = CPointer<GTlsInteraction>

public val TlsInteraction.asObject: Object
  get() = reinterpret()

public val TlsInteraction.parentInstance: Object
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun TlsInteraction.askPassword(password: TlsPassword?, cancellable: Cancellable?):
    TlsInteractionResult = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsInteractionResult = g_tls_interaction_ask_password(this@askPassword,
      password?.reinterpret(), cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsInteraction.askPasswordFinish(result: AsyncResult?): TlsInteractionResult =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsInteractionResult = g_tls_interaction_ask_password_finish(this@askPasswordFinish,
      result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsInteraction.invokeAskPassword(password: TlsPassword?, cancellable: Cancellable?):
    TlsInteractionResult = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsInteractionResult = g_tls_interaction_invoke_ask_password(this@invokeAskPassword,
      password?.reinterpret(), cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsInteraction.invokeRequestCertificate(
  connection: TlsConnection?,
  flags: TlsCertificateRequestFlags,
  cancellable: Cancellable?
): TlsInteractionResult = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsInteractionResult =
      g_tls_interaction_invoke_request_certificate(this@invokeRequestCertificate,
      connection?.reinterpret(), flags, cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsInteraction.requestCertificate(
  connection: TlsConnection?,
  flags: TlsCertificateRequestFlags,
  cancellable: Cancellable?
): TlsInteractionResult = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsInteractionResult = g_tls_interaction_request_certificate(this@requestCertificate,
      connection?.reinterpret(), flags, cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun TlsInteraction.requestCertificateFinish(result: AsyncResult?): TlsInteractionResult =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: TlsInteractionResult =
      g_tls_interaction_request_certificate_finish(this@requestCertificateFinish,
      result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
