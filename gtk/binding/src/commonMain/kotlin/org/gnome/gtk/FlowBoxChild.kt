package org.gnome.gtk

import gtk3.GtkFlowBoxChild
import gtk3.gtk_flow_box_child_changed
import gtk3.gtk_flow_box_child_get_index
import gtk3.gtk_flow_box_child_is_selected
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias FlowBoxChild = CPointer<GtkFlowBoxChild>

public val FlowBoxChild.asObject: Object
  get() = reinterpret()

public val FlowBoxChild.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FlowBoxChild.asWidget: Widget
  get() = reinterpret()

public val FlowBoxChild.asContainer: Container
  get() = reinterpret()

public val FlowBoxChild.asBin: Bin
  get() = reinterpret()

public val FlowBoxChild.index: Int
  get() = gtk_flow_box_child_get_index(this)

public fun FlowBoxChild.changed(): Unit {
  gtk_flow_box_child_changed(this)
}

public fun FlowBoxChild.isSelected(): Boolean = gtk_flow_box_child_is_selected(this).toBoolean
