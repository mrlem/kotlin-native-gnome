@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecBoolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecBoolean = CPointer<GParamSpecBoolean>

public val ParamSpecBoolean.asParamSpec: ParamSpec
  get() = reinterpret()
