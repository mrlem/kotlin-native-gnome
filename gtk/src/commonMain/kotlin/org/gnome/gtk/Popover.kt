// TODO - implement:
//   bind_model
//   get_constrain_to
//   get_default_widget
//   get_pointing_to
//   get_position
//   get_relative_to
//   popdown
//   popup
//   set_constrain_to
//   set_default_widget
//   set_pointing_to
//   set_position
//   set_relative_to
package org.gnome.gtk

import gtk3.GtkPopover
import gtk3.gtk_popover_get_modal
import gtk3.gtk_popover_get_transitions_enabled
import gtk3.gtk_popover_set_modal
import gtk3.gtk_popover_set_transitions_enabled
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias Popover = CPointer<GtkPopover>

public val Popover.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Popover.asWidget: Widget
  get() = reinterpret()

public val Popover.asContainer: Container
  get() = reinterpret()

public val Popover.asBin: Bin
  get() = reinterpret()

public var Popover.modal: Boolean
  get() = gtk_popover_get_modal(this).toBoolean
  set(`value`) {
    gtk_popover_set_modal(this, value.toInt)
  }

public var Popover.transitionsEnabled: Boolean
  get() = gtk_popover_get_transitions_enabled(this).toBoolean
  set(`value`) {
    gtk_popover_set_transitions_enabled(this, value.toInt)
  }
