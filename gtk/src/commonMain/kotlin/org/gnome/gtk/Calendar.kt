// TODO - implement:
//   clear_marks
//   get_date
//   get_day_is_marked
//   get_detail_height_rows
//   get_detail_width_chars
//   get_display_options
//   mark_day
//   select_day
//   select_month
//   set_detail_func
//   set_detail_height_rows
//   set_detail_width_chars
//   set_display_options
//   unmark_day
package org.gnome.gtk

import gtk3.GtkCalendar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Calendar = CPointer<GtkCalendar>

public val Calendar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Calendar.asWidget: Widget
  get() = reinterpret()
