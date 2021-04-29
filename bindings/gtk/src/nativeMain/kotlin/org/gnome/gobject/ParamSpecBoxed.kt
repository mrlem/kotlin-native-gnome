@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecBoxed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecBoxed = CPointer<GParamSpecBoxed>

public val ParamSpecBoxed.asParamSpec: ParamSpec
  get() = reinterpret()
