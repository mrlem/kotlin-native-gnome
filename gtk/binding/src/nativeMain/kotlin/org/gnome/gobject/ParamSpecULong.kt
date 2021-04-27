@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecULong = CPointer<GParamSpecULong>

public val ParamSpecULong.asParamSpec: ParamSpec
  get() = reinterpret()
