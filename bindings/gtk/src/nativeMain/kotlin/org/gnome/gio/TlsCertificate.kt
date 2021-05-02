// TODO - constructor: new_from_file
// TODO - constructor: new_from_files
// TODO - constructor: new_from_pem
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsCertificate
import interop.g_tls_certificate_get_issuer
import interop.g_tls_certificate_is_same
import interop.g_tls_certificate_verify
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias TlsCertificate = CPointer<GTlsCertificate>

public val TlsCertificate.asObject: Object
  get() = reinterpret()

public object TlsCertificateFactory

public val TlsCertificate.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TlsCertificate.issuer: TlsCertificate?
  get() = g_tls_certificate_get_issuer(this)?.reinterpret()

public fun TlsCertificate.isSame(certTwo: TlsCertificate?): Boolean =
    g_tls_certificate_is_same(this, certTwo?.reinterpret()).toBoolean()

public fun TlsCertificate.verify(identity: SocketConnectable?, trustedCa: TlsCertificate?):
    TlsCertificateFlags = g_tls_certificate_verify(this, identity?.reinterpret(),
    trustedCa?.reinterpret())
