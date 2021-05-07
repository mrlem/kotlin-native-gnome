@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPadController
import interop.gtk_pad_controller_new
import interop.gtk_pad_controller_set_action
import interop.gtk_pad_controller_set_action_entries
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Device
import org.gnome.gio.ActionGroup
import org.gnome.gobject.Object
import org.mrlem.gnome.toCArray

public typealias PadController = CPointer<GtkPadController>

public val PadController.asObject: Object
  get() = reinterpret()

public val PadController.asEventController: EventController
  get() = reinterpret()

public object PadControllerFactory {
  public fun new(
    window: Window?,
    group: ActionGroup?,
    pad: Device?
  ): PadController = gtk_pad_controller_new(window?.reinterpret(), group?.reinterpret(),
      pad?.reinterpret())!!.reinterpret()
}

public fun PadController.setAction(
  type: PadActionType,
  index: Int,
  mode: Int,
  label: String?,
  actionName: String?
): Unit {
  gtk_pad_controller_set_action(this@setAction, type, index, mode, label, actionName)
}

public fun PadController.setActionEntries(entries: Array<PadActionEntry>?, nEntries: Int): Unit {
  memScoped { gtk_pad_controller_set_action_entries(this@setActionEntries, entries?.map { it.pointed
      }?.toTypedArray()?.toCArray(memScope), nEntries) }
}
