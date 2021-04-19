// TODO - set_action
// TODO - set_action_entries
//
package org.gnome.gtk

import gtk3.GtkPadController
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PadController = CPointer<GtkPadController>

public val PadController.asObject: Object
  get() = reinterpret()

public val PadController.asEventController: EventController
  get() = reinterpret()
