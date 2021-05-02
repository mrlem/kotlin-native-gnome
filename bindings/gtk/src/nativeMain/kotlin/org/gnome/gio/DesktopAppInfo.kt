// TODO - constructor: new
// TODO - constructor: new_from_filename
// TODO - constructor: new_from_keyfile
// TODO - method: get_keywords
// TODO - method: get_string_list
// TODO - method: launch_uris_as_manager
// TODO - method: launch_uris_as_manager_with_fds
// TODO - method: list_actions
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDesktopAppInfo
import interop.g_desktop_app_info_get_action_name
import interop.g_desktop_app_info_get_boolean
import interop.g_desktop_app_info_get_categories
import interop.g_desktop_app_info_get_filename
import interop.g_desktop_app_info_get_generic_name
import interop.g_desktop_app_info_get_is_hidden
import interop.g_desktop_app_info_get_locale_string
import interop.g_desktop_app_info_get_nodisplay
import interop.g_desktop_app_info_get_show_in
import interop.g_desktop_app_info_get_startup_wm_class
import interop.g_desktop_app_info_get_string
import interop.g_desktop_app_info_has_key
import interop.g_desktop_app_info_launch_action
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias DesktopAppInfo = CPointer<GDesktopAppInfo>

public val DesktopAppInfo.asObject: Object
  get() = reinterpret()

public object DesktopAppInfoFactory

public val DesktopAppInfo.categories: String
  get() = g_desktop_app_info_get_categories(this).toKString

public val DesktopAppInfo.filename: String
  get() = g_desktop_app_info_get_filename(this).toKString

public val DesktopAppInfo.genericName: String
  get() = g_desktop_app_info_get_generic_name(this).toKString

public val DesktopAppInfo.isHidden: Boolean
  get() = g_desktop_app_info_get_is_hidden(this).toBoolean

public val DesktopAppInfo.nodisplay: Boolean
  get() = g_desktop_app_info_get_nodisplay(this).toBoolean

public val DesktopAppInfo.startupWmClass: String
  get() = g_desktop_app_info_get_startup_wm_class(this).toKString

public fun DesktopAppInfo.getActionName(actionName: String): String =
    g_desktop_app_info_get_action_name(this, actionName).toKString

public fun DesktopAppInfo.getBoolean(key: String): Boolean = g_desktop_app_info_get_boolean(this,
    key).toBoolean

public fun DesktopAppInfo.getLocaleString(key: String): String =
    g_desktop_app_info_get_locale_string(this, key).toKString

public fun DesktopAppInfo.getShowIn(desktopEnv: String): Boolean =
    g_desktop_app_info_get_show_in(this, desktopEnv).toBoolean

public fun DesktopAppInfo.getString(key: String): String = g_desktop_app_info_get_string(this,
    key).toKString

public fun DesktopAppInfo.hasKey(key: String): Boolean = g_desktop_app_info_has_key(this,
    key).toBoolean

public fun DesktopAppInfo.launchAction(actionName: String, launchContext: AppLaunchContext?): Unit {
  g_desktop_app_info_launch_action(this, actionName, launchContext?.reinterpret())
}
