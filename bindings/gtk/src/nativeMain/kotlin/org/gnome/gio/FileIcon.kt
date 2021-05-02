@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileIcon
import interop.g_file_icon_get_file
import interop.g_file_icon_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FileIcon = CPointer<GFileIcon>

public val FileIcon.asObject: Object
  get() = reinterpret()

public object FileIconFactory {
  public fun new(`file`: File?): FileIcon = g_file_icon_new(`file`?.reinterpret())!!.reinterpret()
}

public val FileIcon.`file`: File?
  get() = g_file_icon_get_file(this)?.reinterpret()
