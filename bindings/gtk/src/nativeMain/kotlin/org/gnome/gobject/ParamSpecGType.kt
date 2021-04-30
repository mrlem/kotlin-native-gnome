@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecGType
import interop.GType
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecGType = CPointer<GParamSpecGType>

public val ParamSpecGType.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecGType.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecGType.isAType: GType
  get() = pointed.is_a_type
