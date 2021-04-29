@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecDouble
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecDouble = CPointer<GParamSpecDouble>

public val ParamSpecDouble.asParamSpec: ParamSpec
  get() = reinterpret()
