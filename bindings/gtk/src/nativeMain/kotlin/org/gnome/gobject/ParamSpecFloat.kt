@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecFloat
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecFloat = CPointer<GParamSpecFloat>

public val ParamSpecFloat.asParamSpec: ParamSpec
  get() = reinterpret()
