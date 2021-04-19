// TODO - get_icon_size
// TODO - get_relief_style
// TODO - get_style
// TODO - get_icon_size
// TODO - get_relief_style
// TODO - get_style
// TODO - set_icon_size
// TODO - set_style
//
package org.gnome.gtk

import gtk3.GtkToolbar
import gtk3.gtk_toolbar_get_drop_index
import gtk3.gtk_toolbar_get_item_index
import gtk3.gtk_toolbar_get_n_items
import gtk3.gtk_toolbar_get_nth_item
import gtk3.gtk_toolbar_get_show_arrow
import gtk3.gtk_toolbar_insert
import gtk3.gtk_toolbar_set_drop_highlight_item
import gtk3.gtk_toolbar_set_show_arrow
import gtk3.gtk_toolbar_unset_icon_size
import gtk3.gtk_toolbar_unset_style
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Toolbar = CPointer<GtkToolbar>

public val Toolbar.asObject: Object
  get() = reinterpret()

public val Toolbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Toolbar.asWidget: Widget
  get() = reinterpret()

public val Toolbar.asContainer: Container
  get() = reinterpret()

public val Toolbar.nItems: Int
  get() = gtk_toolbar_get_n_items(this)

public var Toolbar.showArrow: Boolean
  get() = gtk_toolbar_get_show_arrow(this).toBoolean
  set(`value`) {
    gtk_toolbar_set_show_arrow(this, value.toInt)
  }

public fun Toolbar.getDropIndex(x: Int, y: Int): Int = gtk_toolbar_get_drop_index(this, x, y)

public fun Toolbar.getItemIndex(item: ToolItem): Int = gtk_toolbar_get_item_index(this,
    item.reinterpret())

public fun Toolbar.getNthItem(n: Int): ToolItem? = gtk_toolbar_get_nth_item(this, n)?.reinterpret()

public fun Toolbar.insert(item: ToolItem, pos: Int): Unit {
  gtk_toolbar_insert(this, item.reinterpret(), pos)
}

public fun Toolbar.setDropHighlightItem(toolItem: ToolItem, index: Int): Unit {
  gtk_toolbar_set_drop_highlight_item(this, toolItem.reinterpret(), index)
}

public fun Toolbar.unsetIconSize(): Unit {
  gtk_toolbar_unset_icon_size(this)
}

public fun Toolbar.unsetStyle(): Unit {
  gtk_toolbar_unset_style(this)
}
