package org.gnome.gtk

import gtk3.GtkAppChooserWidget
import gtk3.gtk_app_chooser_widget_get_default_text
import gtk3.gtk_app_chooser_widget_get_show_all
import gtk3.gtk_app_chooser_widget_get_show_default
import gtk3.gtk_app_chooser_widget_get_show_fallback
import gtk3.gtk_app_chooser_widget_get_show_other
import gtk3.gtk_app_chooser_widget_get_show_recommended
import gtk3.gtk_app_chooser_widget_set_default_text
import gtk3.gtk_app_chooser_widget_set_show_all
import gtk3.gtk_app_chooser_widget_set_show_default
import gtk3.gtk_app_chooser_widget_set_show_fallback
import gtk3.gtk_app_chooser_widget_set_show_other
import gtk3.gtk_app_chooser_widget_set_show_recommended
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

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

public var AppChooserWidget.defaultText: String?
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
