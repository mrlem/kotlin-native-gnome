// TODO - method: get_supported_uri_schemes
// TODO - method: register_uri_scheme
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GVfs
import interop.g_vfs_get_file_for_path
import interop.g_vfs_get_file_for_uri
import interop.g_vfs_is_active
import interop.g_vfs_parse_name
import interop.g_vfs_unregister_uri_scheme
import kotlin.Boolean
import kotlin.String
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

public fun Vfs.getFileForPath(path: String): File? = g_vfs_get_file_for_path(this,
    path)?.reinterpret()

public fun Vfs.getFileForUri(uri: String): File? = g_vfs_get_file_for_uri(this, uri)?.reinterpret()

public fun Vfs.isActive(): Boolean = g_vfs_is_active(this).toBoolean()

public fun Vfs.parseName(parseName: String): File? = g_vfs_parse_name(this,
    parseName)?.reinterpret()

public fun Vfs.unregisterUriScheme(scheme: String): Boolean = g_vfs_unregister_uri_scheme(this,
    scheme).toBoolean()
