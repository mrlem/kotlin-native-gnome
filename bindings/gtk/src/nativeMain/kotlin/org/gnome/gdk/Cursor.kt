// TODO - constructor: new
// TODO - constructor: new_for_display
// TODO - constructor: new_from_name
// TODO - constructor: new_from_pixbuf
// TODO - constructor: new_from_surface
// TODO - method: get_cursor_type (return type)
// TODO - method: get_display (return type)
// TODO - method: get_image (return type)
// TODO - method: get_surface (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkCursor
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Cursor = CPointer<GdkCursor>

public val Cursor.asObject: Object
  get() = reinterpret()

public object CursorFactory
