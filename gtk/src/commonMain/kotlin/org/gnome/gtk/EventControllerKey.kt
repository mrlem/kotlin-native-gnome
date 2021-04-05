// TODO - implement:
//   forward
//   get_group
//   get_im_context
//   set_im_context
package org.gnome.gtk

import gtk3.GtkEventControllerKey
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EventControllerKey = CPointer<GtkEventControllerKey>

public val EventControllerKey.asObject: Object
  get() = reinterpret()

public val EventControllerKey.asEventController: EventController
  get() = reinterpret()
