@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRecentChooserWidget
import interop.gtk_recent_chooser_widget_new
import interop.gtk_recent_chooser_widget_new_for_manager
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias RecentChooserWidget = CPointer<GtkRecentChooserWidget>

public val RecentChooserWidget.asObject: Object
  get() = reinterpret()

public val RecentChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RecentChooserWidget.asWidget: Widget
  get() = reinterpret()

public val RecentChooserWidget.asContainer: Container
  get() = reinterpret()

public val RecentChooserWidget.asBox: Box
  get() = reinterpret()

public object RecentChooserWidgetFactory {
  public fun new(): RecentChooserWidget = gtk_recent_chooser_widget_new()!!.reinterpret()

  public fun newForManager(manager: RecentManager?): RecentChooserWidget =
      gtk_recent_chooser_widget_new_for_manager(manager?.reinterpret())!!.reinterpret()
}

public val RecentChooserWidget.parentInstance: Box
  get() = pointed.parent_instance.ptr
