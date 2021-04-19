package org.gnome.gtk

import gtk3.GtkHeaderBar
import gtk3.gtk_header_bar_get_custom_title
import gtk3.gtk_header_bar_get_decoration_layout
import gtk3.gtk_header_bar_get_has_subtitle
import gtk3.gtk_header_bar_get_show_close_button
import gtk3.gtk_header_bar_get_subtitle
import gtk3.gtk_header_bar_get_title
import gtk3.gtk_header_bar_pack_end
import gtk3.gtk_header_bar_pack_start
import gtk3.gtk_header_bar_set_custom_title
import gtk3.gtk_header_bar_set_decoration_layout
import gtk3.gtk_header_bar_set_has_subtitle
import gtk3.gtk_header_bar_set_show_close_button
import gtk3.gtk_header_bar_set_subtitle
import gtk3.gtk_header_bar_set_title
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

public typealias HeaderBar = CPointer<GtkHeaderBar>

public val HeaderBar.asObject: Object
  get() = reinterpret()

public val HeaderBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val HeaderBar.asWidget: Widget
  get() = reinterpret()

public val HeaderBar.asContainer: Container
  get() = reinterpret()

public fun HeaderBar.getCustomTitle(): Widget? =
    gtk_header_bar_get_custom_title(this)?.reinterpret()

public fun HeaderBar.getDecorationLayout(): String =
    gtk_header_bar_get_decoration_layout(this).toKString

public fun HeaderBar.getHasSubtitle(): Boolean = gtk_header_bar_get_has_subtitle(this).toBoolean

public fun HeaderBar.getShowCloseButton(): Boolean =
    gtk_header_bar_get_show_close_button(this).toBoolean

public fun HeaderBar.getSubtitle(): String = gtk_header_bar_get_subtitle(this).toKString

public fun HeaderBar.getTitle(): String = gtk_header_bar_get_title(this).toKString

public fun HeaderBar.packEnd(child: Widget): Unit {
  gtk_header_bar_pack_end(this, child.reinterpret())
}

public fun HeaderBar.packStart(child: Widget): Unit {
  gtk_header_bar_pack_start(this, child.reinterpret())
}

public fun HeaderBar.setCustomTitle(titleWidget: Widget): Unit {
  gtk_header_bar_set_custom_title(this, titleWidget.reinterpret())
}

public fun HeaderBar.setDecorationLayout(layout: String?): Unit {
  gtk_header_bar_set_decoration_layout(this, layout)
}

public fun HeaderBar.setHasSubtitle(setting: Boolean): Unit {
  gtk_header_bar_set_has_subtitle(this, setting.toInt)
}

public fun HeaderBar.setShowCloseButton(setting: Boolean): Unit {
  gtk_header_bar_set_show_close_button(this, setting.toInt)
}

public fun HeaderBar.setSubtitle(subtitle: String?): Unit {
  gtk_header_bar_set_subtitle(this, subtitle)
}

public fun HeaderBar.setTitle(title: String?): Unit {
  gtk_header_bar_set_title(this, title)
}
