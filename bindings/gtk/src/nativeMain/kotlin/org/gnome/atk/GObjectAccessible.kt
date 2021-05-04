// TODO - field: parent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkGObjectAccessible
import interop.atk_gobject_accessible_get_object
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias GObjectAccessible = CPointer<AtkGObjectAccessible>

public val GObjectAccessible.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val GObjectAccessible.asAtkObject: Object
  get() = reinterpret()

public val GObjectAccessible.`object`: org.gnome.gobject.Object?
  get() = atk_gobject_accessible_get_object(this)?.reinterpret()
