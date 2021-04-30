// TODO - method: get_next
// TODO - method: get_value
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenuAttributeIter
import interop.g_menu_attribute_iter_get_name
import interop.g_menu_attribute_iter_next
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias MenuAttributeIter = CPointer<GMenuAttributeIter>

public val MenuAttributeIter.asObject: Object
  get() = reinterpret()

public val MenuAttributeIter.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val MenuAttributeIter.name: String
  get() = g_menu_attribute_iter_get_name(this).toKString

public fun MenuAttributeIter.next(): Boolean = g_menu_attribute_iter_next(this).toBoolean
