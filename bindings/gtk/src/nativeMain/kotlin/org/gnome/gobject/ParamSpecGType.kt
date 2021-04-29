@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecGType
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecGType = CPointer<GParamSpecGType>

public val ParamSpecGType.asParamSpec: ParamSpec
  get() = reinterpret()
