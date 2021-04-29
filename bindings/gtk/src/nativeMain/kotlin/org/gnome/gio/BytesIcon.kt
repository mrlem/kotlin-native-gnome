// TODO - constructor: new
// TODO - method: get_bytes
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GBytesIcon
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias BytesIcon = CPointer<GBytesIcon>

public val BytesIcon.asObject: Object
  get() = reinterpret()

public object BytesIconFactory
