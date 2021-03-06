@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecOverride
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecOverride = CPointer<GParamSpecOverride>

public val ParamSpecOverride.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecOverride.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr
