// TODO - field: qdata
// TODO - method: get_qdata
// TODO - method: set_qdata
// TODO - method: steal_qdata
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GParamSpec
import interop.GType
import interop.g_param_spec_get_blurb
import interop.g_param_spec_get_default_value
import interop.g_param_spec_get_name
import interop.g_param_spec_get_name_quark
import interop.g_param_spec_get_nick
import interop.g_param_spec_get_redirect_target
import interop.g_param_spec_sink
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.toKString

public typealias ParamSpec = CPointer<GParamSpec>

public val ParamSpec.valueType: GType
  get() = pointed.value_type

public val ParamSpec.ownerType: GType
  get() = pointed.owner_type

public val ParamSpec.refCount: UInt
  get() = pointed.ref_count

public val ParamSpec.paramId: UInt
  get() = pointed.param_id

public val ParamSpec.blurb: String
  get() = g_param_spec_get_blurb(this).toKString

public val ParamSpec.defaultValue: Value?
  get() = g_param_spec_get_default_value(this)?.reinterpret()

public val ParamSpec.name: String
  get() = g_param_spec_get_name(this).toKString

public val ParamSpec.nameQuark: UInt
  get() = g_param_spec_get_name_quark(this)

public val ParamSpec.nick: String
  get() = g_param_spec_get_nick(this).toKString

public val ParamSpec.redirectTarget: ParamSpec?
  get() = g_param_spec_get_redirect_target(this)?.reinterpret()

public fun ParamSpec.sink(): Unit {
  g_param_spec_sink(this)
}
