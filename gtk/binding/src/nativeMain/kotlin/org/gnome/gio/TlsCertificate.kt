// TODO - constructor: new_from_file
// TODO - constructor: new_from_files
// TODO - constructor: new_from_pem
// TODO - method: is_same
// TODO - method: verify
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsCertificate
import interop.g_tls_certificate_get_issuer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TlsCertificate = CPointer<GTlsCertificate>

public val TlsCertificate.asObject: Object
  get() = reinterpret()

public object TlsCertificateFactory

public val TlsCertificate.issuer: TlsCertificate?
  get() = g_tls_certificate_get_issuer(this)?.reinterpret()
