// TODO - implement:
//   append_custom_item
//   append_separator
//   get_heading
//   get_show_default_item
//   get_show_dialog_item
//   set_active_custom_item
//   set_heading
//   set_show_default_item
//   set_show_dialog_item
package org.gnome.gtk

import gtk3.GtkAppChooserButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias AppChooserButton = CPointer<GtkAppChooserButton>

public val AppChooserButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AppChooserButton.asWidget: Widget
  get() = reinterpret()

public val AppChooserButton.asContainer: Container
  get() = reinterpret()

public val AppChooserButton.asBin: Bin
  get() = reinterpret()

public val AppChooserButton.asComboBox: ComboBox
  get() = reinterpret()
