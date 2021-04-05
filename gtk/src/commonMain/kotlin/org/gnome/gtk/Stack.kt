// TODO - implement:
//   add_named
//   add_titled
//   get_child_by_name
//   get_hhomogeneous
//   get_homogeneous
//   get_interpolate_size
//   get_transition_duration
//   get_transition_running
//   get_transition_type
//   get_vhomogeneous
//   get_visible_child
//   get_visible_child_name
//   set_hhomogeneous
//   set_homogeneous
//   set_interpolate_size
//   set_transition_duration
//   set_transition_type
//   set_vhomogeneous
//   set_visible_child
//   set_visible_child_full
//   set_visible_child_name
package org.gnome.gtk

import gtk3.GtkStack
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Stack = CPointer<GtkStack>

public val Stack.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Stack.asWidget: Widget
  get() = reinterpret()

public val Stack.asContainer: Container
  get() = reinterpret()
