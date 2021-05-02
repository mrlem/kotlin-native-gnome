// TODO - constructor: new
// TODO - constructor: new_from_names
// TODO - constructor: new_with_default_fallbacks
// TODO - method: get_names
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GThemedIcon
import interop.g_themed_icon_append_name
import interop.g_themed_icon_prepend_name
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ThemedIcon = CPointer<GThemedIcon>

public val ThemedIcon.asObject: Object
  get() = reinterpret()

public object ThemedIconFactory

public fun ThemedIcon.appendName(iconname: String): Unit {
  g_themed_icon_append_name(this, iconname)
}

public fun ThemedIcon.prependName(iconname: String): Unit {
  g_themed_icon_prepend_name(this, iconname)
}
