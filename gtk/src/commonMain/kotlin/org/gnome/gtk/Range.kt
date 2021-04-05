// TODO - implement:
//   get_adjustment
//   get_fill_level
//   get_flippable
//   get_inverted
//   get_lower_stepper_sensitivity
//   get_min_slider_size
//   get_range_rect
//   get_restrict_to_fill_level
//   get_round_digits
//   get_show_fill_level
//   get_slider_range
//   get_slider_size_fixed
//   get_upper_stepper_sensitivity
//   get_value
//   set_adjustment
//   set_fill_level
//   set_flippable
//   set_increments
//   set_inverted
//   set_lower_stepper_sensitivity
//   set_min_slider_size
//   set_range
//   set_restrict_to_fill_level
//   set_round_digits
//   set_show_fill_level
//   set_slider_size_fixed
//   set_upper_stepper_sensitivity
//   set_value
package org.gnome.gtk

import gtk3.GtkRange
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Range = CPointer<GtkRange>

public val Range.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Range.asWidget: Widget
  get() = reinterpret()
