// TODO - method: threads_enter
// TODO - method: threads_leave
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkMisc
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Misc = CPointer<AtkMisc>

public val Misc.asObject: Object
  get() = reinterpret()

public val Misc.parent: Object
  get() = pointed.parent.ptr
