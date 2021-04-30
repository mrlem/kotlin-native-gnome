// TODO - method: get_file_for_path
// TODO - method: get_file_for_uri
// TODO - method: get_supported_uri_schemes
// TODO - method: parse_name
// TODO - method: register_uri_scheme
// TODO - method: unregister_uri_scheme
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GVfs
import interop.g_vfs_is_active
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias Vfs = CPointer<GVfs>

public val Vfs.asObject: Object
  get() = reinterpret()

public val Vfs.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun Vfs.isActive(): Boolean = g_vfs_is_active(this).toBoolean
