// TODO - method: get_area
// TODO - method: set_area
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGestureMultiPress
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias GestureMultiPress = CPointer<GtkGestureMultiPress>

public val GestureMultiPress.asObject: Object
  get() = reinterpret()

public val GestureMultiPress.asEventController: EventController
  get() = reinterpret()

public val GestureMultiPress.asGesture: Gesture
  get() = reinterpret()

public val GestureMultiPress.asGestureSingle: GestureSingle
  get() = reinterpret()
