@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGestureLongPress
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias GestureLongPress = CPointer<GtkGestureLongPress>

public val GestureLongPress.asObject: Object
  get() = reinterpret()

public val GestureLongPress.asEventController: EventController
  get() = reinterpret()

public val GestureLongPress.asGesture: Gesture
  get() = reinterpret()

public val GestureLongPress.asGestureSingle: GestureSingle
  get() = reinterpret()
