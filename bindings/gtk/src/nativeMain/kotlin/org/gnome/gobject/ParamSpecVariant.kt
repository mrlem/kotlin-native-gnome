@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecVariant
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecVariant = CPointer<GParamSpecVariant>

public val ParamSpecVariant.asParamSpec: ParamSpec
  get() = reinterpret()
