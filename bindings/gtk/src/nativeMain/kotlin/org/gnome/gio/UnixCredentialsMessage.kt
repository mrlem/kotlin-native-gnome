@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixCredentialsMessage
import interop.g_unix_credentials_message_get_credentials
import interop.g_unix_credentials_message_new
import interop.g_unix_credentials_message_new_with_credentials
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias UnixCredentialsMessage = CPointer<GUnixCredentialsMessage>

public val UnixCredentialsMessage.asObject: Object
  get() = reinterpret()

public val UnixCredentialsMessage.asSocketControlMessage: SocketControlMessage
  get() = reinterpret()

public object UnixCredentialsMessageFactory {
  public fun new(): UnixCredentialsMessage = g_unix_credentials_message_new()!!.reinterpret()

  public fun newWithCredentials(credentials: Credentials?): UnixCredentialsMessage =
      g_unix_credentials_message_new_with_credentials(credentials?.reinterpret())!!.reinterpret()
}

public val UnixCredentialsMessage.parentInstance: SocketControlMessage
  get() = pointed.parent_instance.ptr

public val UnixCredentialsMessage.credentials: Credentials?
  get() = g_unix_credentials_message_get_credentials(this)?.reinterpret()
