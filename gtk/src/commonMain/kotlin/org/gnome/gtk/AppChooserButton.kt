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
