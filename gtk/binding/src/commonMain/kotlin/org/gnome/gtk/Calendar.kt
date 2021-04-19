// TODO - get_date
// TODO - set_detail_func
//
package org.gnome.gtk

import gtk3.GtkCalendar
import gtk3.gtk_calendar_clear_marks
import gtk3.gtk_calendar_get_day_is_marked
import gtk3.gtk_calendar_get_detail_height_rows
import gtk3.gtk_calendar_get_detail_width_chars
import gtk3.gtk_calendar_get_display_options
import gtk3.gtk_calendar_mark_day
import gtk3.gtk_calendar_select_day
import gtk3.gtk_calendar_select_month
import gtk3.gtk_calendar_set_detail_height_rows
import gtk3.gtk_calendar_set_detail_width_chars
import gtk3.gtk_calendar_set_display_options
import gtk3.gtk_calendar_unmark_day
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias Calendar = CPointer<GtkCalendar>

public val Calendar.asObject: Object
  get() = reinterpret()

public val Calendar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Calendar.asWidget: Widget
  get() = reinterpret()

public fun Calendar.clearMarks(): Unit {
  gtk_calendar_clear_marks(this)
}

public fun Calendar.getDayIsMarked(day: UInt): Boolean = gtk_calendar_get_day_is_marked(this,
    day).toBoolean

public fun Calendar.getDetailHeightRows(): Int = gtk_calendar_get_detail_height_rows(this)

public fun Calendar.getDetailWidthChars(): Int = gtk_calendar_get_detail_width_chars(this)

public fun Calendar.getDisplayOptions(): CalendarDisplayOptions =
    gtk_calendar_get_display_options(this)

public fun Calendar.markDay(day: UInt): Unit {
  gtk_calendar_mark_day(this, day)
}

public fun Calendar.selectDay(day: UInt): Unit {
  gtk_calendar_select_day(this, day)
}

public fun Calendar.selectMonth(month: UInt, year: UInt): Unit {
  gtk_calendar_select_month(this, month, year)
}

public fun Calendar.setDetailHeightRows(rows: Int): Unit {
  gtk_calendar_set_detail_height_rows(this, rows)
}

public fun Calendar.setDetailWidthChars(chars: Int): Unit {
  gtk_calendar_set_detail_width_chars(this, chars)
}

public fun Calendar.setDisplayOptions(flags: CalendarDisplayOptions): Unit {
  gtk_calendar_set_display_options(this, flags)
}

public fun Calendar.unmarkDay(day: UInt): Unit {
  gtk_calendar_unmark_day(this, day)
}
