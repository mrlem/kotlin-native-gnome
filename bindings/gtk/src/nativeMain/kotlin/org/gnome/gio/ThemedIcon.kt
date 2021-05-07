@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GThemedIcon
import interop.g_themed_icon_append_name
import interop.g_themed_icon_get_names
import interop.g_themed_icon_new
import interop.g_themed_icon_new_from_names
import interop.g_themed_icon_new_with_default_fallbacks
import interop.g_themed_icon_prepend_name
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toCArray
import org.mrlem.gnome.toKArray
import org.mrlem.gnome.toKString

public typealias ThemedIcon = CPointer<GThemedIcon>

public val ThemedIcon.asObject: Object
  get() = reinterpret()

public object ThemedIconFactory {
  public fun new(iconname: String?): ThemedIcon = g_themed_icon_new(iconname)!!.reinterpret()

  public fun newFromNames(iconnames: Array<String>?, len: Int): ThemedIcon = memScoped {
      g_themed_icon_new_from_names(iconnames?.toCArray(memScope), len)!!.reinterpret() }

  public fun newWithDefaultFallbacks(iconname: String?): ThemedIcon =
      g_themed_icon_new_with_default_fallbacks(iconname)!!.reinterpret()
}

public val ThemedIcon.names: Array<String>?
  get() = g_themed_icon_get_names(this)?.toKArray { it.toKString()!! }

public fun ThemedIcon.appendName(iconname: String?): Unit {
  g_themed_icon_append_name(this@appendName, iconname)
}

public fun ThemedIcon.prependName(iconname: String?): Unit {
  g_themed_icon_prepend_name(this@prependName, iconname)
}
