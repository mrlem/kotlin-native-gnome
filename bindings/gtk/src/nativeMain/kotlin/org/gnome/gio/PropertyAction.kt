// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GPropertyAction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PropertyAction = CPointer<GPropertyAction>

public val PropertyAction.asObject: Object
  get() = reinterpret()

public object PropertyActionFactory
