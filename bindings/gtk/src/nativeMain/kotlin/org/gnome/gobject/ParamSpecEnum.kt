@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecEnum
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecEnum = CPointer<GParamSpecEnum>

public val ParamSpecEnum.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecEnum.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecEnum.defaultValue: Int
  get() = pointed.default_value
