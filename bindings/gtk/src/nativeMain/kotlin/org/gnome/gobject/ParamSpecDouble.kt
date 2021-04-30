@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecDouble
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecDouble = CPointer<GParamSpecDouble>

public val ParamSpecDouble.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecDouble.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecDouble.minimum: Double
  get() = pointed.minimum

public val ParamSpecDouble.maximum: Double
  get() = pointed.maximum

public val ParamSpecDouble.defaultValue: Double
  get() = pointed.default_value

public val ParamSpecDouble.epsilon: Double
  get() = pointed.epsilon
