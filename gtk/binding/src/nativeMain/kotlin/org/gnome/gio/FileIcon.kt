// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileIcon
import interop.g_file_icon_get_file
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FileIcon = CPointer<GFileIcon>

public val FileIcon.asObject: Object
  get() = reinterpret()

public object FileIconFactory

public val FileIcon.`file`: File?
  get() = g_file_icon_get_file(this)?.reinterpret()
