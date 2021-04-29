@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusMenuModel
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DBusMenuModel = CPointer<GDBusMenuModel>

public val DBusMenuModel.asObject: Object
  get() = reinterpret()

public val DBusMenuModel.asMenuModel: MenuModel
  get() = reinterpret()
