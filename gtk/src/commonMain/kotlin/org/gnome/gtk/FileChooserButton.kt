// TODO - implement:
//   get_focus_on_click
//   get_title
//   get_width_chars
//   set_focus_on_click
//   set_title
//   set_width_chars
package org.gnome.gtk

import gtk3.GtkFileChooserButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FileChooserButton = CPointer<GtkFileChooserButton>

public val FileChooserButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FileChooserButton.asWidget: Widget
  get() = reinterpret()

public val FileChooserButton.asContainer: Container
  get() = reinterpret()

public val FileChooserButton.asBox: Box
  get() = reinterpret()
