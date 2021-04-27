@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecChar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecChar = CPointer<GParamSpecChar>

public val ParamSpecChar.asParamSpec: ParamSpec
  get() = reinterpret()
