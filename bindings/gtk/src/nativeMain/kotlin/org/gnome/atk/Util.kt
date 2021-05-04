@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkUtil
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Util = CPointer<AtkUtil>

public val Util.asObject: Object
  get() = reinterpret()

public val Util.parent: Object
  get() = pointed.parent.ptr
