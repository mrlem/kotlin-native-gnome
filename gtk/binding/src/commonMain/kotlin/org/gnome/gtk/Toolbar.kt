// TODO - implement:
//   get_drop_index
//   get_item_index
//   get_nth_item
//   insert
//   set_drop_highlight_item
//   set_icon_size
//   set_style
package org.gnome.gtk

import gtk3.GtkToolbar
import gtk3.gtk_toolbar_get_icon_size
import gtk3.gtk_toolbar_get_n_items
import gtk3.gtk_toolbar_get_relief_style
import gtk3.gtk_toolbar_get_show_arrow
import gtk3.gtk_toolbar_get_style
import gtk3.gtk_toolbar_set_show_arrow
import gtk3.gtk_toolbar_unset_icon_size
import gtk3.gtk_toolbar_unset_style
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias Toolbar = CPointer<GtkToolbar>

public val Toolbar.asObject: Object
  get() = reinterpret()

public val Toolbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Toolbar.asWidget: Widget
  get() = reinterpret()

public val Toolbar.asContainer: Container
  get() = reinterpret()

public fun Toolbar.getIconSize(): Unit {
  gtk_toolbar_get_icon_size(this)
}

public fun Toolbar.getReliefStyle(): Unit {
  gtk_toolbar_get_relief_style(this)
}

public fun Toolbar.getStyle(): Unit {
  gtk_toolbar_get_style(this)
}

public fun Toolbar.unsetIconSize(): Unit {
  gtk_toolbar_unset_icon_size(this)
}

public fun Toolbar.unsetStyle(): Unit {
  gtk_toolbar_unset_style(this)
}

public var Toolbar.showArrow: Boolean
  get() = gtk_toolbar_get_show_arrow(this).toBoolean
  set(`value`) {
    gtk_toolbar_set_show_arrow(this, value.toInt)
  }

public val Toolbar.nItems: Int
  get() = gtk_toolbar_get_n_items(this)