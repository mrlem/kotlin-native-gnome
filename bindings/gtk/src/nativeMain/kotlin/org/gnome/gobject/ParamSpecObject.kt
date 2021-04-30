@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecObject
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecObject = CPointer<GParamSpecObject>

public val ParamSpecObject.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecObject.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr
