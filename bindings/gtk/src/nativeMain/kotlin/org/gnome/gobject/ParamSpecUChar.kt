@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUChar
import kotlin.UByte
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecUChar = CPointer<GParamSpecUChar>

public val ParamSpecUChar.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecUChar.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecUChar.minimum: UByte
  get() = pointed.minimum

public val ParamSpecUChar.maximum: UByte
  get() = pointed.maximum

public val ParamSpecUChar.defaultValue: UByte
  get() = pointed.default_value
