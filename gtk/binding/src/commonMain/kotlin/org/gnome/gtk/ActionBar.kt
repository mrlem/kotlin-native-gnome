package org.gnome.gtk

import gtk3.GtkActionBar
import gtk3.gtk_action_bar_get_center_widget
import gtk3.gtk_action_bar_pack_end
import gtk3.gtk_action_bar_pack_start
import gtk3.gtk_action_bar_set_center_widget
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ActionBar = CPointer<GtkActionBar>

public val ActionBar.asObject: Object
  get() = reinterpret()

public val ActionBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ActionBar.asWidget: Widget
  get() = reinterpret()

public val ActionBar.asContainer: Container
  get() = reinterpret()

public val ActionBar.asBin: Bin
  get() = reinterpret()

public fun ActionBar.getCenterWidget(): Widget? =
    gtk_action_bar_get_center_widget(this)?.reinterpret()

public fun ActionBar.packEnd(child: Widget): Unit {
  gtk_action_bar_pack_end(this, child.reinterpret())
}

public fun ActionBar.packStart(child: Widget): Unit {
  gtk_action_bar_pack_start(this, child.reinterpret())
}

public fun ActionBar.setCenterWidget(centerWidget: Widget): Unit {
  gtk_action_bar_set_center_widget(this, centerWidget.reinterpret())
}
