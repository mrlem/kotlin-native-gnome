@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusActionGroup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DBusActionGroup = CPointer<GDBusActionGroup>

public val DBusActionGroup.asObject: Object
  get() = reinterpret()
