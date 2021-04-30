@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecLong
import kotlin.Long
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecLong = CPointer<GParamSpecLong>

public val ParamSpecLong.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecLong.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecLong.minimum: Long
  get() = pointed.minimum

public val ParamSpecLong.maximum: Long
  get() = pointed.maximum

public val ParamSpecLong.defaultValue: Long
  get() = pointed.default_value
