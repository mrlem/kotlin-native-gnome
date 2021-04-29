@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUChar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUChar = CPointer<GParamSpecUChar>

public val ParamSpecUChar.asParamSpec: ParamSpec
  get() = reinterpret()
