@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkHeaderBar
import interop.gtk_header_bar_get_custom_title
import interop.gtk_header_bar_get_decoration_layout
import interop.gtk_header_bar_get_has_subtitle
import interop.gtk_header_bar_get_show_close_button
import interop.gtk_header_bar_get_subtitle
import interop.gtk_header_bar_get_title
import interop.gtk_header_bar_new
import interop.gtk_header_bar_pack_end
import interop.gtk_header_bar_pack_start
import interop.gtk_header_bar_set_custom_title
import interop.gtk_header_bar_set_decoration_layout
import interop.gtk_header_bar_set_has_subtitle
import interop.gtk_header_bar_set_show_close_button
import interop.gtk_header_bar_set_subtitle
import interop.gtk_header_bar_set_title
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public object HeaderBarFactory {
  public fun new(): HeaderBar = gtk_header_bar_new()!!.reinterpret()
}

public val HeaderBar.container: Container
  get() = pointed.container.ptr

public var HeaderBar.customTitle: Widget?
  get() = gtk_header_bar_get_custom_title(this)?.reinterpret()
  set(`value`) {
    gtk_header_bar_set_custom_title(this, `value`)
  }

public var HeaderBar.decorationLayout: String
  get() = gtk_header_bar_get_decoration_layout(this).toKString()
  set(`value`) {
    gtk_header_bar_set_decoration_layout(this, `value`)
  }

public var HeaderBar.hasSubtitle: Boolean
  get() = gtk_header_bar_get_has_subtitle(this).toBoolean()
  set(`value`) {
    gtk_header_bar_set_has_subtitle(this, `value`.toInt())
  }

public var HeaderBar.showCloseButton: Boolean
  get() = gtk_header_bar_get_show_close_button(this).toBoolean()
  set(`value`) {
    gtk_header_bar_set_show_close_button(this, `value`.toInt())
  }

public var HeaderBar.subtitle: String
  get() = gtk_header_bar_get_subtitle(this).toKString()
  set(`value`) {
    gtk_header_bar_set_subtitle(this, `value`)
  }

public var HeaderBar.title: String
  get() = gtk_header_bar_get_title(this).toKString()
  set(`value`) {
    gtk_header_bar_set_title(this, `value`)
  }

public fun HeaderBar.packEnd(child: Widget?): Unit {
  gtk_header_bar_pack_end(this, child?.reinterpret())
}

public fun HeaderBar.packStart(child: Widget?): Unit {
  gtk_header_bar_pack_start(this, child?.reinterpret())
}
