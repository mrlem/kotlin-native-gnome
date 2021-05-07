@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecUnichar
import kotlin.Char
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.mrlem.gnome.toChar

public typealias ParamSpecUnichar = CPointer<GParamSpecUnichar>

public val ParamSpecUnichar.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecUnichar.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecUnichar.defaultValue: Char
  get() = pointed.default_value.toChar()
