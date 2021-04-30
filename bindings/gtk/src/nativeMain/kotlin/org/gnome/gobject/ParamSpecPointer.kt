@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecPointer = CPointer<GParamSpecPointer>

public val ParamSpecPointer.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecPointer.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr
