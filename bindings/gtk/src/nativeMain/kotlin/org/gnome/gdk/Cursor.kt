// TODO - constructor: new
// TODO - constructor: new_for_display
// TODO - constructor: new_from_name
// TODO - constructor: new_from_pixbuf
// TODO - constructor: new_from_surface
// TODO - method: get_cursor_type
// TODO - method: get_display
// TODO - method: get_image
// TODO - method: get_surface
// TODO - method: ref
// TODO - method: unref
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
