// TODO - method: ask_password
// TODO - method: ask_password_async
// TODO - method: ask_password_finish
// TODO - method: invoke_ask_password
// TODO - method: invoke_request_certificate
// TODO - method: request_certificate
// TODO - method: request_certificate_async
// TODO - method: request_certificate_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsInteraction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TlsInteraction = CPointer<GTlsInteraction>

public val TlsInteraction.asObject: Object
  get() = reinterpret()
