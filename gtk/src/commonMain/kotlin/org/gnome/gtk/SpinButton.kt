// TODO - implement:
//   configure
//   get_adjustment
//   get_digits
//   get_increments
//   get_numeric
//   get_range
//   get_snap_to_ticks
//   get_update_policy
//   get_value
//   get_value_as_int
//   get_wrap
//   set_adjustment
//   set_digits
//   set_increments
//   set_numeric
//   set_range
//   set_snap_to_ticks
//   set_update_policy
//   set_value
//   set_wrap
//   spin
//   update
package org.gnome.gtk

import gtk3.GtkSpinButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias SpinButton = CPointer<GtkSpinButton>

public val SpinButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SpinButton.asWidget: Widget
  get() = reinterpret()

public val SpinButton.asEntry: Entry
  get() = reinterpret()
