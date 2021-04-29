@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecObject
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecObject = CPointer<GParamSpecObject>

public val ParamSpecObject.asParamSpec: ParamSpec
  get() = reinterpret()
