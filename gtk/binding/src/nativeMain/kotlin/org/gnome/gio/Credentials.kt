// TODO - method: is_same_user
// TODO - method: set_native
// TODO - method: set_unix_user
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GCredentials
import interop.GError
import interop.g_credentials_get_unix_pid
import interop.g_credentials_get_unix_user
import interop.g_credentials_new
import interop.g_credentials_to_string
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias Credentials = CPointer<GCredentials>

public val Credentials.asObject: Object
  get() = reinterpret()

public object CredentialsFactory {
  public fun new(): Credentials = g_credentials_new()!!.reinterpret()
}

@Throws(Error::class)
public fun Credentials.getUnixPid(): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = g_credentials_get_unix_pid(this@getUnixPid, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Credentials.getUnixUser(): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = g_credentials_get_unix_user(this@getUnixUser, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Credentials.toString(): String = g_credentials_to_string(this).toKString
