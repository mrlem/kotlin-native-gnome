@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecULong
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecULong = CPointer<GParamSpecULong>

public val ParamSpecULong.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecULong.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecULong.minimum: ULong
  get() = pointed.minimum

public val ParamSpecULong.maximum: ULong
  get() = pointed.maximum

public val ParamSpecULong.defaultValue: ULong
  get() = pointed.default_value
