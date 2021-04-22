// TODO - constructor: new
// TODO - method: set_action_entries
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkPadController
import gtk3.gtk_pad_controller_set_action
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PadController = CPointer<GtkPadController>

public val PadController.asObject: Object
  get() = reinterpret()

public val PadController.asEventController: EventController
  get() = reinterpret()

public object PadControllerFactory

public fun PadController.setAction(
  type: PadActionType,
  index: Int,
  mode: Int,
  label: String,
  actionName: String
): Unit {
  gtk_pad_controller_set_action(this, type, index, mode, label, actionName)
}
