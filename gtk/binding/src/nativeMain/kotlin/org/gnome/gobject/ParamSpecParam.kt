@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecParam
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecParam = CPointer<GParamSpecParam>

public val ParamSpecParam.asParamSpec: ParamSpec
  get() = reinterpret()
