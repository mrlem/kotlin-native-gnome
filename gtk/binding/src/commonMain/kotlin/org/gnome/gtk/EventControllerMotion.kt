@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkEventControllerMotion
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias EventControllerMotion = CPointer<GtkEventControllerMotion>

public val EventControllerMotion.asObject: Object
  get() = reinterpret()

public val EventControllerMotion.asEventController: EventController
  get() = reinterpret()
