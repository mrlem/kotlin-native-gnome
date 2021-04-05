// TODO - implement:
//   get_group
//   join_group
//   set_group
package org.gnome.gtk

import gtk3.GtkRadioButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RadioButton = CPointer<GtkRadioButton>

public val RadioButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioButton.asWidget: Widget
  get() = reinterpret()

public val RadioButton.asContainer: Container
  get() = reinterpret()

public val RadioButton.asBin: Bin
  get() = reinterpret()

public val RadioButton.asButton: Button
  get() = reinterpret()

public val RadioButton.asToggleButton: ToggleButton
  get() = reinterpret()

public val RadioButton.asCheckButton: CheckButton
  get() = reinterpret()
