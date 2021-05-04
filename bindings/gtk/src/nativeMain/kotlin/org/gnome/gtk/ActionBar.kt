@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkActionBar
import interop.gtk_action_bar_get_center_widget
import interop.gtk_action_bar_new
import interop.gtk_action_bar_pack_end
import interop.gtk_action_bar_pack_start
import interop.gtk_action_bar_set_center_widget
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

public object ActionBarFactory {
  public fun new(): ActionBar = gtk_action_bar_new()!!.reinterpret()
}

public var ActionBar.centerWidget: Widget?
  get() = gtk_action_bar_get_center_widget(this)?.reinterpret()
  set(`value`) {
    gtk_action_bar_set_center_widget(this@centerWidget, `value`)
  }

public fun ActionBar.packEnd(child: Widget?): Unit {
  gtk_action_bar_pack_end(this@packEnd, child?.reinterpret())
}

public fun ActionBar.packStart(child: Widget?): Unit {
  gtk_action_bar_pack_start(this@packStart, child?.reinterpret())
}
