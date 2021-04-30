// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GThreadedSocketService
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias ThreadedSocketService = CPointer<GThreadedSocketService>

public val ThreadedSocketService.asObject: Object
  get() = reinterpret()

public val ThreadedSocketService.asSocketListener: SocketListener
  get() = reinterpret()

public val ThreadedSocketService.asSocketService: SocketService
  get() = reinterpret()

public object ThreadedSocketServiceFactory

public val ThreadedSocketService.parentInstance: SocketService
  get() = pointed.parent_instance.ptr

public fun ThreadedSocketService.onRun(callback: (ThreadedSocketService) -> Unit):
    ThreadedSocketService {
  // TODO - handle callback data

  asObject.connect("run") { callback(this) }
  return this
}
