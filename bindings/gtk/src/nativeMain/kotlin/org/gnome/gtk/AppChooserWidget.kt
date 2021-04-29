@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAppChooserWidget
import interop.gtk_app_chooser_widget_get_default_text
import interop.gtk_app_chooser_widget_get_show_all
import interop.gtk_app_chooser_widget_get_show_default
import interop.gtk_app_chooser_widget_get_show_fallback
import interop.gtk_app_chooser_widget_get_show_other
import interop.gtk_app_chooser_widget_get_show_recommended
import interop.gtk_app_chooser_widget_new
import interop.gtk_app_chooser_widget_set_default_text
import interop.gtk_app_chooser_widget_set_show_all
import interop.gtk_app_chooser_widget_set_show_default
import interop.gtk_app_chooser_widget_set_show_fallback
import interop.gtk_app_chooser_widget_set_show_other
import interop.gtk_app_chooser_widget_set_show_recommended
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias AppChooserWidget = CPointer<GtkAppChooserWidget>

public val AppChooserWidget.asObject: Object
  get() = reinterpret()

public val AppChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AppChooserWidget.asWidget: Widget
  get() = reinterpret()

public val AppChooserWidget.asContainer: Container
  get() = reinterpret()

public val AppChooserWidget.asBox: Box
  get() = reinterpret()

public object AppChooserWidgetFactory {
  public fun new(contentType: String): AppChooserWidget =
      gtk_app_chooser_widget_new(contentType)!!.reinterpret()
}

public var AppChooserWidget.defaultText: String
  get() = gtk_app_chooser_widget_get_default_text(this).toKString
  set(`value`) {
    gtk_app_chooser_widget_set_default_text(this, value)
  }

public var AppChooserWidget.showAll: Boolean
  get() = gtk_app_chooser_widget_get_show_all(this).toBoolean
  set(`value`) {
    gtk_app_chooser_widget_set_show_all(this, value.toInt)
  }

public var AppChooserWidget.showDefault: Boolean
  get() = gtk_app_chooser_widget_get_show_default(this).toBoolean
  set(`value`) {
    gtk_app_chooser_widget_set_show_default(this, value.toInt)
  }

public var AppChooserWidget.showFallback: Boolean
  get() = gtk_app_chooser_widget_get_show_fallback(this).toBoolean
  set(`value`) {
    gtk_app_chooser_widget_set_show_fallback(this, value.toInt)
  }

public var AppChooserWidget.showOther: Boolean
  get() = gtk_app_chooser_widget_get_show_other(this).toBoolean
  set(`value`) {
    gtk_app_chooser_widget_set_show_other(this, value.toInt)
  }

public var AppChooserWidget.showRecommended: Boolean
  get() = gtk_app_chooser_widget_get_show_recommended(this).toBoolean
  set(`value`) {
    gtk_app_chooser_widget_set_show_recommended(this, value.toInt)
  }

public fun AppChooserWidget.onApplicationActivated(callback: (AppChooserWidget) -> Unit):
    AppChooserWidget {
  // TODO - handle callback data

  asObject.connect("application-activated") { callback(this) }
  return this
}

public fun AppChooserWidget.onApplicationSelected(callback: (AppChooserWidget) -> Unit):
    AppChooserWidget {
  // TODO - handle callback data

  asObject.connect("application-selected") { callback(this) }
  return this
}

public fun AppChooserWidget.onPopulatePopup(callback: (AppChooserWidget) -> Unit):
    AppChooserWidget {
  // TODO - handle callback data

  asObject.connect("populate-popup") { callback(this) }
  return this
}
