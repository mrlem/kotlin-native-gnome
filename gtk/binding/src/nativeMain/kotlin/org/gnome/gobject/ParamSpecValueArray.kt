@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecValueArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias ParamSpecValueArray = CPointer<GParamSpecValueArray>

public val ParamSpecValueArray.asParamSpec: ParamSpec
  get() = reinterpret()
