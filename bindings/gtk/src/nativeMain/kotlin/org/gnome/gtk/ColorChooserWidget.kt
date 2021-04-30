@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkColorChooserWidget
import interop.gtk_color_chooser_widget_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val ColorChooserWidget.parentInstance: Box
  get() = pointed.parent_instance.ptr
