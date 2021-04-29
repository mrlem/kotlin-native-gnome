@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToolbar
import interop.gtk_toolbar_get_drop_index
import interop.gtk_toolbar_get_icon_size
import interop.gtk_toolbar_get_item_index
import interop.gtk_toolbar_get_n_items
import interop.gtk_toolbar_get_nth_item
import interop.gtk_toolbar_get_relief_style
import interop.gtk_toolbar_get_show_arrow
import interop.gtk_toolbar_get_style
import interop.gtk_toolbar_insert
import interop.gtk_toolbar_new
import interop.gtk_toolbar_set_drop_highlight_item
import interop.gtk_toolbar_set_icon_size
import interop.gtk_toolbar_set_show_arrow
import interop.gtk_toolbar_set_style
import interop.gtk_toolbar_unset_icon_size
import interop.gtk_toolbar_unset_style
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias Toolbar = CPointer<GtkToolbar>

public val Toolbar.asObject: Object
  get() = reinterpret()

public val Toolbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Toolbar.asWidget: Widget
  get() = reinterpret()

public val Toolbar.asContainer: Container
  get() = reinterpret()

public object ToolbarFactory {
  public fun new(): Toolbar = gtk_toolbar_new()!!.reinterpret()
}

public var Toolbar.iconSize: IconSize
  get() = gtk_toolbar_get_icon_size(this)
  set(`value`) {
    gtk_toolbar_set_icon_size(this, value)
  }

public val Toolbar.nItems: Int
  get() = gtk_toolbar_get_n_items(this)

public val Toolbar.reliefStyle: ReliefStyle
  get() = gtk_toolbar_get_relief_style(this)

public var Toolbar.showArrow: Boolean
  get() = gtk_toolbar_get_show_arrow(this).toBoolean
  set(`value`) {
    gtk_toolbar_set_show_arrow(this, value.toInt)
  }

public var Toolbar.style: ToolbarStyle
  get() = gtk_toolbar_get_style(this)
  set(`value`) {
    gtk_toolbar_set_style(this, value)
  }

public fun Toolbar.getDropIndex(x: Int, y: Int): Int = gtk_toolbar_get_drop_index(this, x, y)

public fun Toolbar.getItemIndex(item: ToolItem?): Int = gtk_toolbar_get_item_index(this,
    item?.reinterpret())

public fun Toolbar.getNthItem(n: Int): ToolItem? = gtk_toolbar_get_nth_item(this, n)?.reinterpret()

public fun Toolbar.insert(item: ToolItem?, pos: Int): Unit {
  gtk_toolbar_insert(this, item?.reinterpret(), pos)
}

public fun Toolbar.setDropHighlightItem(toolItem: ToolItem?, index: Int): Unit {
  gtk_toolbar_set_drop_highlight_item(this, toolItem?.reinterpret(), index)
}

public fun Toolbar.unsetIconSize(): Unit {
  gtk_toolbar_unset_icon_size(this)
}

public fun Toolbar.unsetStyle(): Unit {
  gtk_toolbar_unset_style(this)
}

public fun Toolbar.onFocusHomeOrEnd(callback: (Toolbar) -> Unit): Toolbar {
  // TODO - handle callback data

  asObject.connect("focus-home-or-end") { callback(this) }
  return this
}

public fun Toolbar.onOrientationChanged(callback: (Toolbar) -> Unit): Toolbar {
  // TODO - handle callback data

  asObject.connect("orientation-changed") { callback(this) }
  return this
}

public fun Toolbar.onPopupContextMenu(callback: (Toolbar) -> Unit): Toolbar {
  // TODO - handle callback data

  asObject.connect("popup-context-menu") { callback(this) }
  return this
}

public fun Toolbar.onStyleChanged(callback: (Toolbar) -> Unit): Toolbar {
  // TODO - handle callback data

  asObject.connect("style-changed") { callback(this) }
  return this
}
