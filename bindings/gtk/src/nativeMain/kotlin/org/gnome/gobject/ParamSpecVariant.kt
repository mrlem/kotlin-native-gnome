// TODO - field: type
// TODO - field: default_value
// TODO - field: padding
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecVariant
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecVariant = CPointer<GParamSpecVariant>

public val ParamSpecVariant.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecVariant.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr
