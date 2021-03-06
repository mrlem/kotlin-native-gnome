// TODO - method: get_date (param type)
// TODO - method: set_detail_func (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCalendar
import interop.gtk_calendar_clear_marks
import interop.gtk_calendar_get_day_is_marked
import interop.gtk_calendar_get_detail_height_rows
import interop.gtk_calendar_get_detail_width_chars
import interop.gtk_calendar_get_display_options
import interop.gtk_calendar_mark_day
import interop.gtk_calendar_new
import interop.gtk_calendar_select_day
import interop.gtk_calendar_select_month
import interop.gtk_calendar_set_detail_height_rows
import interop.gtk_calendar_set_detail_width_chars
import interop.gtk_calendar_set_display_options
import interop.gtk_calendar_unmark_day
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean

public typealias Calendar = CPointer<GtkCalendar>

public val Calendar.asObject: Object
  get() = reinterpret()

public val Calendar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Calendar.asWidget: Widget
  get() = reinterpret()

public object CalendarFactory {
  public fun new(): Calendar = gtk_calendar_new()!!.reinterpret()
}

public val Calendar.widget: Widget
  get() = pointed.widget.ptr

public var Calendar.detailHeightRows: Int
  get() = gtk_calendar_get_detail_height_rows(this)
  set(`value`) {
    gtk_calendar_set_detail_height_rows(this@detailHeightRows, `value`)
  }

public var Calendar.detailWidthChars: Int
  get() = gtk_calendar_get_detail_width_chars(this)
  set(`value`) {
    gtk_calendar_set_detail_width_chars(this@detailWidthChars, `value`)
  }

public var Calendar.displayOptions: CalendarDisplayOptions
  get() = gtk_calendar_get_display_options(this)
  set(`value`) {
    gtk_calendar_set_display_options(this@displayOptions, `value`)
  }

public fun Calendar.clearMarks(): Unit {
  gtk_calendar_clear_marks(this@clearMarks)
}

public fun Calendar.getDayIsMarked(day: UInt): Boolean =
    gtk_calendar_get_day_is_marked(this@getDayIsMarked, day).toBoolean()

public fun Calendar.markDay(day: UInt): Unit {
  gtk_calendar_mark_day(this@markDay, day)
}

public fun Calendar.selectDay(day: UInt): Unit {
  gtk_calendar_select_day(this@selectDay, day)
}

public fun Calendar.selectMonth(month: UInt, year: UInt): Unit {
  gtk_calendar_select_month(this@selectMonth, month, year)
}

public fun Calendar.unmarkDay(day: UInt): Unit {
  gtk_calendar_unmark_day(this@unmarkDay, day)
}

public fun Calendar.onDaySelected(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("day-selected") { callback(this) }
  return this
}

public fun Calendar.onDaySelectedDoubleClick(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("day-selected-double-click") { callback(this) }
  return this
}

public fun Calendar.onMonthChanged(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("month-changed") { callback(this) }
  return this
}

public fun Calendar.onNextMonth(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("next-month") { callback(this) }
  return this
}

public fun Calendar.onNextYear(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("next-year") { callback(this) }
  return this
}

public fun Calendar.onPrevMonth(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("prev-month") { callback(this) }
  return this
}

public fun Calendar.onPrevYear(callback: (Calendar) -> Unit): Calendar {
  // TODO - handle callback data

  asObject.connect("prev-year") { callback(this) }
  return this
}
