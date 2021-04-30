@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecInt64
import kotlin.Long
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecInt64 = CPointer<GParamSpecInt64>

public val ParamSpecInt64.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecInt64.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecInt64.minimum: Long
  get() = pointed.minimum

public val ParamSpecInt64.maximum: Long
  get() = pointed.maximum

public val ParamSpecInt64.defaultValue: Long
  get() = pointed.default_value
