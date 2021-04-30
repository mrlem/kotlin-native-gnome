@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecValueArray
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ParamSpecValueArray = CPointer<GParamSpecValueArray>

public val ParamSpecValueArray.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecValueArray.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecValueArray.fixedNElements: UInt
  get() = pointed.fixed_n_elements
