// TODO - constructor: new
// TODO - field: parent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkNoOpObject
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias NoOpObject = CPointer<AtkNoOpObject>

public val NoOpObject.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val NoOpObject.asAtkObject: Object
  get() = reinterpret()

public object NoOpObjectFactory
