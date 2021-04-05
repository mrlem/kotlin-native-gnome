// TODO - implement:
//   changed
//   clamp_page
//   configure
//   get_lower
//   get_minimum_increment
//   get_page_increment
//   get_page_size
//   get_step_increment
//   get_upper
//   get_value
//   set_lower
//   set_page_increment
//   set_page_size
//   set_step_increment
//   set_upper
//   set_value
//   value_changed
package org.gnome.gtk

import gtk3.GtkAdjustment
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Adjustment = CPointer<GtkAdjustment>

public val Adjustment.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
