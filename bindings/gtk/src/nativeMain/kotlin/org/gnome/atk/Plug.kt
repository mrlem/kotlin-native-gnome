// TODO - constructor: new
// TODO - field: parent
// TODO - method: set_child
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkPlug
import interop.atk_plug_get_id
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.toKString

public typealias Plug = CPointer<AtkPlug>

public val Plug.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val Plug.asAtkObject: Object
  get() = reinterpret()

public object PlugFactory

public val Plug.id: String?
  get() = atk_plug_get_id(this).toKString()
