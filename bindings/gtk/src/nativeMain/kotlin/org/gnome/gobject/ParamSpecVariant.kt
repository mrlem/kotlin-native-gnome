// TODO - field: padding
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecVariant
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.glib.VariantType

public typealias ParamSpecVariant = CPointer<GParamSpecVariant>

public val ParamSpecVariant.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecVariant.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecVariant.type: VariantType?
  get() = pointed.type

public val ParamSpecVariant.defaultValue: Variant?
  get() = pointed.default_value
