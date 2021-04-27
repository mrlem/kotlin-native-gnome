// TODO - constructor: new
// TODO - constructor: new_from_filename
// TODO - constructor: new_from_keyfile
// TODO - method: get_action_name
// TODO - method: get_boolean
// TODO - method: get_keywords
// TODO - method: get_locale_string
// TODO - method: get_show_in
// TODO - method: get_string
// TODO - method: get_string_list
// TODO - method: has_key
// TODO - method: launch_action
// TODO - method: launch_uris_as_manager
// TODO - method: launch_uris_as_manager_with_fds
// TODO - method: list_actions
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDesktopAppInfo
import interop.g_desktop_app_info_get_categories
import interop.g_desktop_app_info_get_filename
import interop.g_desktop_app_info_get_generic_name
import interop.g_desktop_app_info_get_is_hidden
import interop.g_desktop_app_info_get_nodisplay
import interop.g_desktop_app_info_get_startup_wm_class
import kotlin.Boolean
import kotlin.String
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
