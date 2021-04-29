@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecString
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecString = CPointer<GParamSpecString>

public val ParamSpecString.asParamSpec: ParamSpec
  get() = reinterpret()
