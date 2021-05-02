// TODO - method: get_next
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuLinkIter
import interop.g_menu_link_iter_get_name
import interop.g_menu_link_iter_get_value
import interop.g_menu_link_iter_next
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias MenuLinkIter = CPointer<GMenuLinkIter>

public val MenuLinkIter.asObject: Object
  get() = reinterpret()

public val MenuLinkIter.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val MenuLinkIter.name: String
  get() = g_menu_link_iter_get_name(this).toKString()

public val MenuLinkIter.`value`: MenuModel?
  get() = g_menu_link_iter_get_value(this)?.reinterpret()

public fun MenuLinkIter.next(): Boolean = g_menu_link_iter_next(this).toBoolean()
