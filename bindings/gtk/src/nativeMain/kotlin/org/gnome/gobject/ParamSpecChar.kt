@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecChar
import kotlin.Byte
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecChar = CPointer<GParamSpecChar>

public val ParamSpecChar.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecChar.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecChar.minimum: Byte
  get() = pointed.minimum

public val ParamSpecChar.maximum: Byte
  get() = pointed.maximum

public val ParamSpecChar.defaultValue: Byte
  get() = pointed.default_value
