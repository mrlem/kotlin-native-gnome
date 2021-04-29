// TODO - constructor: new_with_credentials
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixCredentialsMessage
import interop.g_unix_credentials_message_get_credentials
import interop.g_unix_credentials_message_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias UnixCredentialsMessage = CPointer<GUnixCredentialsMessage>

public val UnixCredentialsMessage.asObject: Object
  get() = reinterpret()

public val UnixCredentialsMessage.asSocketControlMessage: SocketControlMessage
  get() = reinterpret()

public object UnixCredentialsMessageFactory {
  public fun new(): UnixCredentialsMessage = g_unix_credentials_message_new()!!.reinterpret()
}

public val UnixCredentialsMessage.credentials: Credentials?
  get() = g_unix_credentials_message_get_credentials(this)?.reinterpret()
