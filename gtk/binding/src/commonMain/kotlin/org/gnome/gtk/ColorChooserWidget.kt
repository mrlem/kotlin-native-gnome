@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkColorChooserWidget
import gtk3.gtk_color_chooser_widget_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ColorChooserWidget = CPointer<GtkColorChooserWidget>

public val ColorChooserWidget.asObject: Object
  get() = reinterpret()

public val ColorChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ColorChooserWidget.asWidget: Widget
  get() = reinterpret()

public val ColorChooserWidget.asContainer: Container
  get() = reinterpret()

public val ColorChooserWidget.asBox: Box
  get() = reinterpret()

public object ColorChooserWidgetFactory {
  public fun new(): ColorChooserWidget = gtk_color_chooser_widget_new()!!.reinterpret()
}
