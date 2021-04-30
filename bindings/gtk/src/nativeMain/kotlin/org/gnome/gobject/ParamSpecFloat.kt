@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecFloat
import kotlin.Float
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecFloat = CPointer<GParamSpecFloat>

public val ParamSpecFloat.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecFloat.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecFloat.minimum: Float
  get() = pointed.minimum

public val ParamSpecFloat.maximum: Float
  get() = pointed.maximum

public val ParamSpecFloat.defaultValue: Float
  get() = pointed.default_value

public val ParamSpecFloat.epsilon: Float
  get() = pointed.epsilon
