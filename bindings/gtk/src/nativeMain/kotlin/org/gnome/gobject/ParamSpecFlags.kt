@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecFlags
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecFlags = CPointer<GParamSpecFlags>

public val ParamSpecFlags.asParamSpec: ParamSpec
  get() = reinterpret()
