// TODO - method: get_search_path
// TODO - method: list_contexts
// TODO - method: list_icons
// TODO - method: load_icon
// TODO - method: load_icon_for_scale
// TODO - method: load_surface
// TODO - method: set_screen
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIconTheme
import interop.gtk_icon_theme_add_resource_path
import interop.gtk_icon_theme_append_search_path
import interop.gtk_icon_theme_choose_icon
import interop.gtk_icon_theme_choose_icon_for_scale
import interop.gtk_icon_theme_get_example_icon_name
import interop.gtk_icon_theme_get_icon_sizes
import interop.gtk_icon_theme_has_icon
import interop.gtk_icon_theme_lookup_by_gicon
import interop.gtk_icon_theme_lookup_by_gicon_for_scale
import interop.gtk_icon_theme_lookup_icon
import interop.gtk_icon_theme_lookup_icon_for_scale
import interop.gtk_icon_theme_new
import interop.gtk_icon_theme_prepend_search_path
import interop.gtk_icon_theme_rescan_if_needed
import interop.gtk_icon_theme_set_custom_theme
import interop.gtk_icon_theme_set_search_path
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.`value`
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gnome.gio.Icon
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toKArray
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias IconTheme = CPointer<GtkIconTheme>

public val IconTheme.asObject: Object
  get() = reinterpret()

public object IconThemeFactory {
  public fun new(): IconTheme = gtk_icon_theme_new()!!.reinterpret()
}

public val IconTheme.exampleIconName: String?
  get() = gtk_icon_theme_get_example_icon_name(this).toKString()

public fun IconTheme.addResourcePath(path: String?): Unit {
  gtk_icon_theme_add_resource_path(this@addResourcePath, path)
}

public fun IconTheme.appendSearchPath(path: String?): Unit {
  gtk_icon_theme_append_search_path(this@appendSearchPath, path)
}

public fun IconTheme.chooseIcon(
  iconNames: Array<String>?,
  size: Int,
  flags: IconLookupFlags
): IconInfo? = memScoped { gtk_icon_theme_choose_icon(this@chooseIcon,
    iconNames?.toCArray(memScope), size, flags)?.reinterpret() }

public fun IconTheme.chooseIconForScale(
  iconNames: Array<String>?,
  size: Int,
  scale: Int,
  flags: IconLookupFlags
): IconInfo? = memScoped { gtk_icon_theme_choose_icon_for_scale(this@chooseIconForScale,
    iconNames?.toCArray(memScope), size, scale, flags)?.reinterpret() }

public fun IconTheme.getIconSizes(iconName: String?): Array<Int>? =
    gtk_icon_theme_get_icon_sizes(this@getIconSizes, iconName)?.toKArray { it!!.`value` }

public fun IconTheme.hasIcon(iconName: String?): Boolean = gtk_icon_theme_has_icon(this@hasIcon,
    iconName).toBoolean()

public fun IconTheme.lookupByGicon(
  icon: Icon?,
  size: Int,
  flags: IconLookupFlags
): IconInfo? = gtk_icon_theme_lookup_by_gicon(this@lookupByGicon, icon?.reinterpret(), size,
    flags)?.reinterpret()

public fun IconTheme.lookupByGiconForScale(
  icon: Icon?,
  size: Int,
  scale: Int,
  flags: IconLookupFlags
): IconInfo? = gtk_icon_theme_lookup_by_gicon_for_scale(this@lookupByGiconForScale,
    icon?.reinterpret(), size, scale, flags)?.reinterpret()

public fun IconTheme.lookupIcon(
  iconName: String?,
  size: Int,
  flags: IconLookupFlags
): IconInfo? = gtk_icon_theme_lookup_icon(this@lookupIcon, iconName, size, flags)?.reinterpret()

public fun IconTheme.lookupIconForScale(
  iconName: String?,
  size: Int,
  scale: Int,
  flags: IconLookupFlags
): IconInfo? = gtk_icon_theme_lookup_icon_for_scale(this@lookupIconForScale, iconName, size, scale,
    flags)?.reinterpret()

public fun IconTheme.prependSearchPath(path: String?): Unit {
  gtk_icon_theme_prepend_search_path(this@prependSearchPath, path)
}

public fun IconTheme.rescanIfNeeded(): Boolean =
    gtk_icon_theme_rescan_if_needed(this@rescanIfNeeded).toBoolean()

public fun IconTheme.setCustomTheme(themeName: String?): Unit {
  gtk_icon_theme_set_custom_theme(this@setCustomTheme, themeName)
}

public fun IconTheme.setSearchPath(path: Array<String>?, nElements: Int): Unit {
  memScoped { gtk_icon_theme_set_search_path(this@setSearchPath, path?.toCArray(memScope),
      nElements) }
}

public fun IconTheme.onChanged(callback: (IconTheme) -> Unit): IconTheme {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
