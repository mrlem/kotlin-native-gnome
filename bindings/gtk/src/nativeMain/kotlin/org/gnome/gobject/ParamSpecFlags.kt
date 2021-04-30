@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecFlags
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecFlags = CPointer<GParamSpecFlags>

public val ParamSpecFlags.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecFlags.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecFlags.defaultValue: UInt
  get() = pointed.default_value
