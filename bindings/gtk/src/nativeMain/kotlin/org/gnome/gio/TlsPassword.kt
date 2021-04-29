// TODO - constructor: new
// TODO - method: get_value
// TODO - method: set_value
// TODO - method: set_value_full
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsPassword
import interop.g_tls_password_get_description
import interop.g_tls_password_get_flags
import interop.g_tls_password_get_warning
import interop.g_tls_password_set_description
import interop.g_tls_password_set_flags
import interop.g_tls_password_set_warning
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias TlsPassword = CPointer<GTlsPassword>

public val TlsPassword.asObject: Object
  get() = reinterpret()

public object TlsPasswordFactory

public var TlsPassword.description: String
  get() = g_tls_password_get_description(this).toKString
  set(`value`) {
    g_tls_password_set_description(this, value)
  }

public var TlsPassword.flags: TlsPasswordFlags
  get() = g_tls_password_get_flags(this)
  set(`value`) {
    g_tls_password_set_flags(this, value)
  }

public var TlsPassword.warning: String
  get() = g_tls_password_get_warning(this).toKString
  set(`value`) {
    g_tls_password_set_warning(this, value)
  }
