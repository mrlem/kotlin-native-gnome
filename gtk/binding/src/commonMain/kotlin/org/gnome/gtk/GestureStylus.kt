// TODO - get_axes
// TODO - get_axis
// TODO - get_device_tool
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGestureStylus
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias GestureStylus = CPointer<GtkGestureStylus>

public val GestureStylus.asObject: Object
  get() = reinterpret()

public val GestureStylus.asEventController: EventController
  get() = reinterpret()

public val GestureStylus.asGesture: Gesture
  get() = reinterpret()

public val GestureStylus.asGestureSingle: GestureSingle
  get() = reinterpret()
