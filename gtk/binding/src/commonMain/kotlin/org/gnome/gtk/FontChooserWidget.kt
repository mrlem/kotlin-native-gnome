@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkFontChooserWidget
import gtk3.gtk_font_chooser_widget_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias FontChooserWidget = CPointer<GtkFontChooserWidget>

public val FontChooserWidget.asObject: Object
  get() = reinterpret()

public val FontChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FontChooserWidget.asWidget: Widget
  get() = reinterpret()

public val FontChooserWidget.asContainer: Container
  get() = reinterpret()

public val FontChooserWidget.asBox: Box
  get() = reinterpret()

public object FontChooserWidgetFactory {
  public fun new(): FontChooserWidget = gtk_font_chooser_widget_new()!!.reinterpret()
}
