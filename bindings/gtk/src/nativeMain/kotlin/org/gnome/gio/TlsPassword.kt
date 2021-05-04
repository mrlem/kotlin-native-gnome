// TODO - method: set_value_full (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTlsPassword
import interop.g_tls_password_get_description
import interop.g_tls_password_get_flags
import interop.g_tls_password_get_warning
import interop.g_tls_password_new
import interop.g_tls_password_set_description
import interop.g_tls_password_set_flags
import interop.g_tls_password_set_value
import interop.g_tls_password_set_warning
import kotlin.Array
import kotlin.Long
import kotlin.String
import kotlin.UByte
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toCArray
import org.gnome.toKString

public typealias TlsPassword = CPointer<GTlsPassword>

public val TlsPassword.asObject: Object
  get() = reinterpret()

public object TlsPasswordFactory {
  public fun new(flags: TlsPasswordFlags, description: String?): TlsPassword =
      g_tls_password_new(flags, description)!!.reinterpret()
}

public val TlsPassword.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var TlsPassword.description: String?
  get() = g_tls_password_get_description(this).toKString()
  set(`value`) {
    g_tls_password_set_description(this@description, `value`)
  }

public var TlsPassword.flags: TlsPasswordFlags
  get() = g_tls_password_get_flags(this)
  set(`value`) {
    g_tls_password_set_flags(this@flags, `value`)
  }

public var TlsPassword.warning: String?
  get() = g_tls_password_get_warning(this).toKString()
  set(`value`) {
    g_tls_password_set_warning(this@warning, `value`)
  }

public fun TlsPassword.setValue(`value`: Array<UByte>?, length: Long): Unit {
  memScoped { g_tls_password_set_value(this@setValue, `value`?.toCArray(memScope), length) }
}
