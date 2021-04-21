// TODO - method: get_offset
// TODO - method: get_start_point
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGestureDrag
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias GestureDrag = CPointer<GtkGestureDrag>

public val GestureDrag.asObject: Object
  get() = reinterpret()

public val GestureDrag.asEventController: EventController
  get() = reinterpret()

public val GestureDrag.asGesture: Gesture
  get() = reinterpret()

public val GestureDrag.asGestureSingle: GestureSingle
  get() = reinterpret()
