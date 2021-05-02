// TODO - method: receive_credentials_async
// TODO - method: send_credentials_async
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GUnixConnection
import interop.g_unix_connection_receive_credentials
import interop.g_unix_connection_receive_credentials_finish
import interop.g_unix_connection_receive_fd
import interop.g_unix_connection_send_credentials
import interop.g_unix_connection_send_credentials_finish
import interop.g_unix_connection_send_fd
import kotlin.Boolean
import kotlin.Int
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias UnixConnection = CPointer<GUnixConnection>

public val UnixConnection.asObject: Object
  get() = reinterpret()

public val UnixConnection.asIOStream: IOStream
  get() = reinterpret()

public val UnixConnection.asSocketConnection: SocketConnection
  get() = reinterpret()

public val UnixConnection.parentInstance: SocketConnection
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun UnixConnection.receiveCredentials(cancellable: Cancellable?): Credentials? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Credentials? = g_unix_connection_receive_credentials(this@receiveCredentials,
      cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun UnixConnection.receiveCredentialsFinish(result: AsyncResult?): Credentials? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Credentials? =
      g_unix_connection_receive_credentials_finish(this@receiveCredentialsFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun UnixConnection.receiveFd(cancellable: Cancellable?): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = g_unix_connection_receive_fd(this@receiveFd, cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun UnixConnection.sendCredentials(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_unix_connection_send_credentials(this@sendCredentials,
      cancellable?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun UnixConnection.sendCredentialsFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_unix_connection_send_credentials_finish(this@sendCredentialsFinish,
      result?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun UnixConnection.sendFd(fd: Int, cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_unix_connection_send_fd(this@sendFd, fd, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
