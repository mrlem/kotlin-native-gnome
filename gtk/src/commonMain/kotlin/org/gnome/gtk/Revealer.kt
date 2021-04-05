// TODO - implement:
//   get_child_revealed
//   get_reveal_child
//   get_transition_duration
//   get_transition_type
//   set_reveal_child
//   set_transition_duration
//   set_transition_type
package org.gnome.gtk

import gtk3.GtkRevealer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Revealer = CPointer<GtkRevealer>

public val Revealer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Revealer.asWidget: Widget
  get() = reinterpret()

public val Revealer.asContainer: Container
  get() = reinterpret()

public val Revealer.asBin: Bin
  get() = reinterpret()
