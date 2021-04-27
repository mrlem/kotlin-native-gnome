@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUnichar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUnichar = CPointer<GParamSpecUnichar>

public val ParamSpecUnichar.asParamSpec: ParamSpec
  get() = reinterpret()
