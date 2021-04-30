@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpecString
import kotlin.Byte
import kotlin.String
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.toKString

public typealias ParamSpecString = CPointer<GParamSpecString>

public val ParamSpecString.asParamSpec: ParamSpec
  get() = reinterpret()

public val ParamSpecString.parentInstance: ParamSpec
  get() = pointed.parent_instance.ptr

public val ParamSpecString.defaultValue: String
  get() = pointed.default_value.toKString

public val ParamSpecString.csetFirst: String
  get() = pointed.cset_first.toKString

public val ParamSpecString.csetNth: String
  get() = pointed.cset_nth.toKString

public val ParamSpecString.substitutor: Byte
  get() = pointed.substitutor

public val ParamSpecString.nullFoldIfEmpty: UInt
  get() = pointed.null_fold_if_empty

public val ParamSpecString.ensureNonNull: UInt
  get() = pointed.ensure_non_null
