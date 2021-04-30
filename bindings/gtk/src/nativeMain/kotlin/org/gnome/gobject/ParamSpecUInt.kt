@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUInt
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUInt = CPointer<GParamSpecUInt>

public val ParamSpecUInt.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecUInt.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecUInt.minimum: UInt
  get() = pointed.minimum

public val ParamSpecUInt.maximum: UInt
  get() = pointed.maximum

public val ParamSpecUInt.defaultValue: UInt
  get() = pointed.default_value
