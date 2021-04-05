package org.gnome.gtk

import gtk3.GtkComboBoxText
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ComboBoxText = CPointer<GtkComboBoxText>

public val ComboBoxText.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ComboBoxText.asWidget: Widget
  get() = reinterpret()

public val ComboBoxText.asContainer: Container
  get() = reinterpret()

public val ComboBoxText.asBin: Bin
  get() = reinterpret()

public val ComboBoxText.asComboBox: ComboBox
  get() = reinterpret()
