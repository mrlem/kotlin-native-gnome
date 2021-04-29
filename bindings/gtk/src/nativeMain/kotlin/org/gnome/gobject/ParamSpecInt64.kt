@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecInt64
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecInt64 = CPointer<GParamSpecInt64>

public val ParamSpecInt64.asParamSpec: ParamSpec
  get() = reinterpret()
