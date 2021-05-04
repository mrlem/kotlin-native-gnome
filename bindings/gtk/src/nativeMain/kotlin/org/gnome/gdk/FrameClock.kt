// TODO - method: get_current_timings (return type)
// TODO - method: get_refresh_info (param type)
// TODO - method: get_timings (return type)
// TODO - method: request_phase (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkFrameClock
import interop.gdk_frame_clock_begin_updating
import interop.gdk_frame_clock_end_updating
import interop.gdk_frame_clock_get_frame_counter
import interop.gdk_frame_clock_get_frame_time
import interop.gdk_frame_clock_get_history_start
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias FrameClock = CPointer<GdkFrameClock>

public val FrameClock.asObject: Object
  get() = reinterpret()

public val FrameClock.frameCounter: Long
  get() = gdk_frame_clock_get_frame_counter(this)

public val FrameClock.frameTime: Long
  get() = gdk_frame_clock_get_frame_time(this)

public val FrameClock.historyStart: Long
  get() = gdk_frame_clock_get_history_start(this)

public fun FrameClock.beginUpdating(): Unit {
  gdk_frame_clock_begin_updating(this@beginUpdating)
}

public fun FrameClock.endUpdating(): Unit {
  gdk_frame_clock_end_updating(this@endUpdating)
}

public fun FrameClock.onAfterPaint(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("after-paint") { callback(this) }
  return this
}

public fun FrameClock.onBeforePaint(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("before-paint") { callback(this) }
  return this
}

public fun FrameClock.onFlushEvents(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("flush-events") { callback(this) }
  return this
}

public fun FrameClock.onLayout(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("layout") { callback(this) }
  return this
}

public fun FrameClock.onPaint(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("paint") { callback(this) }
  return this
}

public fun FrameClock.onResumeEvents(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("resume-events") { callback(this) }
  return this
}

public fun FrameClock.onUpdate(callback: (FrameClock) -> Unit): FrameClock {
  // TODO - handle callback data

  asObject.connect("update") { callback(this) }
  return this
}
