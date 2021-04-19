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
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

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

public fun AppChooserWidget.getDefaultText(): String =
    gtk_app_chooser_widget_get_default_text(this).toKString

public fun AppChooserWidget.getShowAll(): Boolean =
    gtk_app_chooser_widget_get_show_all(this).toBoolean

public fun AppChooserWidget.getShowDefault(): Boolean =
    gtk_app_chooser_widget_get_show_default(this).toBoolean

public fun AppChooserWidget.getShowFallback(): Boolean =
    gtk_app_chooser_widget_get_show_fallback(this).toBoolean

public fun AppChooserWidget.getShowOther(): Boolean =
    gtk_app_chooser_widget_get_show_other(this).toBoolean

public fun AppChooserWidget.getShowRecommended(): Boolean =
    gtk_app_chooser_widget_get_show_recommended(this).toBoolean

public fun AppChooserWidget.setDefaultText(text: String?): Unit {
  gtk_app_chooser_widget_set_default_text(this, text)
}

public fun AppChooserWidget.setShowAll(setting: Boolean): Unit {
  gtk_app_chooser_widget_set_show_all(this, setting.toInt)
}

public fun AppChooserWidget.setShowDefault(setting: Boolean): Unit {
  gtk_app_chooser_widget_set_show_default(this, setting.toInt)
}

public fun AppChooserWidget.setShowFallback(setting: Boolean): Unit {
  gtk_app_chooser_widget_set_show_fallback(this, setting.toInt)
}

public fun AppChooserWidget.setShowOther(setting: Boolean): Unit {
  gtk_app_chooser_widget_set_show_other(this, setting.toInt)
}

public fun AppChooserWidget.setShowRecommended(setting: Boolean): Unit {
  gtk_app_chooser_widget_set_show_recommended(this, setting.toInt)
}
