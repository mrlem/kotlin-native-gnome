@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFontChooserWidget
import interop.gtk_font_chooser_widget_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val FontChooserWidget.parentInstance: Box
  get() = pointed.parent_instance.ptr
