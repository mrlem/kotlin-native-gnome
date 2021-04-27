@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecInt = CPointer<GParamSpecInt>

public val ParamSpecInt.asParamSpec: ParamSpec
  get() = reinterpret()
