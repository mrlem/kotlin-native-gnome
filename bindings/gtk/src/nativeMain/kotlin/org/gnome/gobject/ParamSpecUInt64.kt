@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUInt64
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUInt64 = CPointer<GParamSpecUInt64>

public val ParamSpecUInt64.asParamSpec: ParamSpec
  get() = reinterpret()
