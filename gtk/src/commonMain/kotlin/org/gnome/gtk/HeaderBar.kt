// TODO - implement:
//   get_custom_title
//   pack_end
//   pack_start
//   set_custom_title
package org.gnome.gtk

import gtk3.GtkHeaderBar
import gtk3.gtk_header_bar_get_decoration_layout
import gtk3.gtk_header_bar_get_has_subtitle
import gtk3.gtk_header_bar_get_show_close_button
import gtk3.gtk_header_bar_get_subtitle
import gtk3.gtk_header_bar_get_title
import gtk3.gtk_header_bar_set_decoration_layout
import gtk3.gtk_header_bar_set_has_subtitle
import gtk3.gtk_header_bar_set_show_close_button
import gtk3.gtk_header_bar_set_subtitle
import gtk3.gtk_header_bar_set_title
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias HeaderBar = CPointer<GtkHeaderBar>

public val HeaderBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val HeaderBar.asWidget: Widget
  get() = reinterpret()

public val HeaderBar.asContainer: Container
  get() = reinterpret()

public var HeaderBar.decorationLayout: String?
  get() = gtk_header_bar_get_decoration_layout(this).toKString
  set(`value`) {
    gtk_header_bar_set_decoration_layout(this, value)
  }

public var HeaderBar.hasSubtitle: Boolean
  get() = gtk_header_bar_get_has_subtitle(this).toBoolean
  set(`value`) {
    gtk_header_bar_set_has_subtitle(this, value.toInt)
  }

public var HeaderBar.showCloseButton: Boolean
  get() = gtk_header_bar_get_show_close_button(this).toBoolean
  set(`value`) {
    gtk_header_bar_set_show_close_button(this, value.toInt)
  }

public var HeaderBar.subtitle: String?
  get() = gtk_header_bar_get_subtitle(this).toKString
  set(`value`) {
    gtk_header_bar_set_subtitle(this, value)
  }

public var HeaderBar.title: String?
  get() = gtk_header_bar_get_title(this).toKString
  set(`value`) {
    gtk_header_bar_set_title(this, value)
  }
