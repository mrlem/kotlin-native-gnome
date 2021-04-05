// TODO - implement:
//   bind_model
//   get_constrain_to
//   get_default_widget
//   get_modal
//   get_pointing_to
//   get_position
//   get_relative_to
//   get_transitions_enabled
//   popdown
//   popup
//   set_constrain_to
//   set_default_widget
//   set_modal
//   set_pointing_to
//   set_position
//   set_relative_to
//   set_transitions_enabled
package org.gnome.gtk

import gtk3.GtkPopover
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Popover = CPointer<GtkPopover>

public val Popover.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Popover.asWidget: Widget
  get() = reinterpret()

public val Popover.asContainer: Container
  get() = reinterpret()

public val Popover.asBin: Bin
  get() = reinterpret()
