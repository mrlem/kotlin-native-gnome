// TODO - constructor: new
// TODO - constructor: new_from_pixbuf
// TODO - constructor: new_from_surface
// TODO - method: get_image (return type)
// TODO - method: get_surface (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkCursor
import interop.gdk_cursor_get_cursor_type
import interop.gdk_cursor_get_display
import interop.gdk_cursor_new_for_display
import interop.gdk_cursor_new_from_name
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Cursor = CPointer<GdkCursor>

public val Cursor.asObject: Object
  get() = reinterpret()

public object CursorFactory {
  public fun newForDisplay(display: Display?, cursorType: CursorType): Cursor =
      gdk_cursor_new_for_display(display?.reinterpret(), cursorType)!!.reinterpret()

  public fun newFromName(display: Display?, name: String?): Cursor =
      gdk_cursor_new_from_name(display?.reinterpret(), name)!!.reinterpret()
}

public val Cursor.cursorType: CursorType
  get() = gdk_cursor_get_cursor_type(this)

public val Cursor.display: Display?
  get() = gdk_cursor_get_display(this)?.reinterpret()
