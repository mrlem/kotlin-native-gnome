@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecLong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecLong = CPointer<GParamSpecLong>

public val ParamSpecLong.asParamSpec: ParamSpec
  get() = reinterpret()
