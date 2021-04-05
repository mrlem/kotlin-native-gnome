// TODO - implement:
//   clear
//   get_display
//   get_owner
//   get_selection
//   request_contents
//   request_image
//   request_rich_text
//   request_targets
//   request_text
//   request_uris
//   set_can_store
//   set_image
//   set_text
//   set_with_data
//   set_with_owner
//   store
//   wait_for_contents
//   wait_for_image
//   wait_for_rich_text
//   wait_for_targets
//   wait_for_text
//   wait_for_uris
//   wait_is_image_available
//   wait_is_rich_text_available
//   wait_is_target_available
//   wait_is_text_available
//   wait_is_uris_available
package org.gnome.gtk

import gtk3.GtkClipboard
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Clipboard = CPointer<GtkClipboard>

public val Clipboard.asObject: Object
  get() = reinterpret()
