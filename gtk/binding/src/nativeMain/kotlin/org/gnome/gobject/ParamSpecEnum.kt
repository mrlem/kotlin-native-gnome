@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecEnum
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecEnum = CPointer<GParamSpecEnum>

public val ParamSpecEnum.asParamSpec: ParamSpec
  get() = reinterpret()
