@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUInt64
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUInt64 = CPointer<GParamSpecUInt64>

public val ParamSpecUInt64.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecUInt64.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecUInt64.minimum: ULong
  get() = pointed.minimum

public val ParamSpecUInt64.maximum: ULong
  get() = pointed.maximum

public val ParamSpecUInt64.defaultValue: ULong
  get() = pointed.default_value
