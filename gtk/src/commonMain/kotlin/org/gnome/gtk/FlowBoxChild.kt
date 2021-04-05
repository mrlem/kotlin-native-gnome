package org.gnome.gtk

import gtk3.GtkFlowBoxChild
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FlowBoxChild = CPointer<GtkFlowBoxChild>

public val FlowBoxChild.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FlowBoxChild.asWidget: Widget
  get() = reinterpret()

public val FlowBoxChild.asContainer: Container
  get() = reinterpret()

public val FlowBoxChild.asBin: Bin
  get() = reinterpret()
