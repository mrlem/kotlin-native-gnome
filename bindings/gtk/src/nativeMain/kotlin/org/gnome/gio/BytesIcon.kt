@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GBytesIcon
import interop.g_bytes_icon_get_bytes
import interop.g_bytes_icon_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Bytes
import org.gnome.gobject.Object

public typealias BytesIcon = CPointer<GBytesIcon>

public val BytesIcon.asObject: Object
  get() = reinterpret()

public object BytesIconFactory {
  public fun new(bytes: Bytes?): BytesIcon = g_bytes_icon_new(bytes?.reinterpret())!!.reinterpret()
}

public val BytesIcon.bytes: Bytes?
  get() = g_bytes_icon_get_bytes(this)?.reinterpret()
