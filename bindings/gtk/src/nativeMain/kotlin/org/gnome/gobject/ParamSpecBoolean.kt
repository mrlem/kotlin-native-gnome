@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecBoolean
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.mrlem.gnome.toBoolean

public typealias ParamSpecBoolean = CPointer<GParamSpecBoolean>

public val ParamSpecBoolean.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecBoolean.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecBoolean.defaultValue: Boolean
  get() = pointed.default_value.toBoolean()
