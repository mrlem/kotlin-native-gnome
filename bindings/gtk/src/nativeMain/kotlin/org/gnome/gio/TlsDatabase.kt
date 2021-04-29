// TODO - method: create_certificate_handle
// TODO - method: lookup_certificate_for_handle
// TODO - method: lookup_certificate_for_handle_async
// TODO - method: lookup_certificate_for_handle_finish
// TODO - method: lookup_certificate_issuer
// TODO - method: lookup_certificate_issuer_async
// TODO - method: lookup_certificate_issuer_finish
// TODO - method: lookup_certificates_issued_by
// TODO - method: lookup_certificates_issued_by_async
// TODO - method: lookup_certificates_issued_by_finish
// TODO - method: verify_chain
// TODO - method: verify_chain_async
// TODO - method: verify_chain_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsDatabase
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TlsDatabase = CPointer<GTlsDatabase>

public val TlsDatabase.asObject: Object
  get() = reinterpret()
