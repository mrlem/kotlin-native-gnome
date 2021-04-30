@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecInt
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecInt = CPointer<GParamSpecInt>

public val ParamSpecInt.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecInt.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecInt.minimum: Int
  get() = pointed.minimum

public val ParamSpecInt.maximum: Int
  get() = pointed.maximum

public val ParamSpecInt.defaultValue: Int
  get() = pointed.default_value
