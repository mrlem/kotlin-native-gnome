// TODO - implement:
//   get_date
//   get_day_is_marked
//   mark_day
//   select_day
//   select_month
//   set_detail_func
//   set_display_options
//   unmark_day
package org.gnome.gtk

import gtk3.GtkCalendar
import gtk3.gtk_calendar_clear_marks
import gtk3.gtk_calendar_get_detail_height_rows
import gtk3.gtk_calendar_get_detail_width_chars
import gtk3.gtk_calendar_get_display_options
import gtk3.gtk_calendar_set_detail_height_rows
import gtk3.gtk_calendar_set_detail_width_chars
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Calendar = CPointer<GtkCalendar>

public val Calendar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Calendar.asWidget: Widget
  get() = reinterpret()

public fun Calendar.clearMarks(): Unit {
  gtk_calendar_clear_marks(this)
}

public fun Calendar.getDisplayOptions(): Unit {
  gtk_calendar_get_display_options(this)
}

public var Calendar.detailHeightRows: Int
  get() = gtk_calendar_get_detail_height_rows(this)
  set(`value`) {
    gtk_calendar_set_detail_height_rows(this, value)
  }

public var Calendar.detailWidthChars: Int
  get() = gtk_calendar_get_detail_width_chars(this)
  set(`value`) {
    gtk_calendar_set_detail_width_chars(this, value)
  }
