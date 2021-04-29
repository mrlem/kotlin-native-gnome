@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecPointer = CPointer<GParamSpecPointer>

public val ParamSpecPointer.asParamSpec: ParamSpec
  get() = reinterpret()
