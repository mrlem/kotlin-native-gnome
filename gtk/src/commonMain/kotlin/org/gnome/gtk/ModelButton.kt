package org.gnome.gtk

import gtk3.GtkModelButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ModelButton = CPointer<GtkModelButton>

public val ModelButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ModelButton.asWidget: Widget
  get() = reinterpret()

public val ModelButton.asContainer: Container
  get() = reinterpret()

public val ModelButton.asBin: Bin
  get() = reinterpret()

public val ModelButton.asButton: Button
  get() = reinterpret()
