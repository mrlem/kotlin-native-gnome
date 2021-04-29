@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUInt = CPointer<GParamSpecUInt>

public val ParamSpecUInt.asParamSpec: ParamSpec
  get() = reinterpret()
