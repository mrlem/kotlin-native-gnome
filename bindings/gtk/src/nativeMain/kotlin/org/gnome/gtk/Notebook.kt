// TODO - method: get_tab_hborder
// TODO - method: get_tab_vborder
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkNotebook
import interop.gtk_notebook_append_page
import interop.gtk_notebook_append_page_menu
import interop.gtk_notebook_detach_tab
import interop.gtk_notebook_get_action_widget
import interop.gtk_notebook_get_current_page
import interop.gtk_notebook_get_group_name
import interop.gtk_notebook_get_menu_label
import interop.gtk_notebook_get_menu_label_text
import interop.gtk_notebook_get_n_pages
import interop.gtk_notebook_get_nth_page
import interop.gtk_notebook_get_scrollable
import interop.gtk_notebook_get_show_border
import interop.gtk_notebook_get_show_tabs
import interop.gtk_notebook_get_tab_detachable
import interop.gtk_notebook_get_tab_label
import interop.gtk_notebook_get_tab_label_text
import interop.gtk_notebook_get_tab_pos
import interop.gtk_notebook_get_tab_reorderable
import interop.gtk_notebook_insert_page
import interop.gtk_notebook_insert_page_menu
import interop.gtk_notebook_new
import interop.gtk_notebook_next_page
import interop.gtk_notebook_page_num
import interop.gtk_notebook_popup_disable
import interop.gtk_notebook_popup_enable
import interop.gtk_notebook_prepend_page
import interop.gtk_notebook_prepend_page_menu
import interop.gtk_notebook_prev_page
import interop.gtk_notebook_remove_page
import interop.gtk_notebook_reorder_child
import interop.gtk_notebook_set_action_widget
import interop.gtk_notebook_set_current_page
import interop.gtk_notebook_set_group_name
import interop.gtk_notebook_set_menu_label
import interop.gtk_notebook_set_menu_label_text
import interop.gtk_notebook_set_scrollable
import interop.gtk_notebook_set_show_border
import interop.gtk_notebook_set_show_tabs
import interop.gtk_notebook_set_tab_detachable
import interop.gtk_notebook_set_tab_label
import interop.gtk_notebook_set_tab_label_text
import interop.gtk_notebook_set_tab_pos
import interop.gtk_notebook_set_tab_reorderable
import kotlin.Boolean
import kotlin.Int
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

public typealias Notebook = CPointer<GtkNotebook>

public val Notebook.asObject: Object
  get() = reinterpret()

public val Notebook.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Notebook.asWidget: Widget
  get() = reinterpret()

public val Notebook.asContainer: Container
  get() = reinterpret()

public object NotebookFactory {
  public fun new(): Notebook = gtk_notebook_new()!!.reinterpret()
}

public var Notebook.currentPage: Int
  get() = gtk_notebook_get_current_page(this)
  set(`value`) {
    gtk_notebook_set_current_page(this, value)
  }

public var Notebook.groupName: String
  get() = gtk_notebook_get_group_name(this).toKString
  set(`value`) {
    gtk_notebook_set_group_name(this, value)
  }

public val Notebook.nPages: Int
  get() = gtk_notebook_get_n_pages(this)

public var Notebook.scrollable: Boolean
  get() = gtk_notebook_get_scrollable(this).toBoolean
  set(`value`) {
    gtk_notebook_set_scrollable(this, value.toInt)
  }

public var Notebook.showBorder: Boolean
  get() = gtk_notebook_get_show_border(this).toBoolean
  set(`value`) {
    gtk_notebook_set_show_border(this, value.toInt)
  }

public var Notebook.showTabs: Boolean
  get() = gtk_notebook_get_show_tabs(this).toBoolean
  set(`value`) {
    gtk_notebook_set_show_tabs(this, value.toInt)
  }

public var Notebook.tabPos: PositionType
  get() = gtk_notebook_get_tab_pos(this)
  set(`value`) {
    gtk_notebook_set_tab_pos(this, value)
  }

public fun Notebook.appendPage(child: Widget?, tabLabel: Widget?): Int =
    gtk_notebook_append_page(this, child?.reinterpret(), tabLabel?.reinterpret())

public fun Notebook.appendPageMenu(
  child: Widget?,
  tabLabel: Widget?,
  menuLabel: Widget?
): Int = gtk_notebook_append_page_menu(this, child?.reinterpret(), tabLabel?.reinterpret(),
    menuLabel?.reinterpret())

public fun Notebook.detachTab(child: Widget?): Unit {
  gtk_notebook_detach_tab(this, child?.reinterpret())
}

public fun Notebook.getActionWidget(packType: PackType): Widget? =
    gtk_notebook_get_action_widget(this, packType)?.reinterpret()

public fun Notebook.getMenuLabel(child: Widget?): Widget? = gtk_notebook_get_menu_label(this,
    child?.reinterpret())?.reinterpret()

public fun Notebook.getMenuLabelText(child: Widget?): String =
    gtk_notebook_get_menu_label_text(this, child?.reinterpret()).toKString

public fun Notebook.getNthPage(pageNum: Int): Widget? = gtk_notebook_get_nth_page(this,
    pageNum)?.reinterpret()

public fun Notebook.getTabDetachable(child: Widget?): Boolean =
    gtk_notebook_get_tab_detachable(this, child?.reinterpret()).toBoolean

public fun Notebook.getTabLabel(child: Widget?): Widget? = gtk_notebook_get_tab_label(this,
    child?.reinterpret())?.reinterpret()

public fun Notebook.getTabLabelText(child: Widget?): String = gtk_notebook_get_tab_label_text(this,
    child?.reinterpret()).toKString

public fun Notebook.getTabReorderable(child: Widget?): Boolean =
    gtk_notebook_get_tab_reorderable(this, child?.reinterpret()).toBoolean

public fun Notebook.insertPage(
  child: Widget?,
  tabLabel: Widget?,
  position: Int
): Int = gtk_notebook_insert_page(this, child?.reinterpret(), tabLabel?.reinterpret(), position)

public fun Notebook.insertPageMenu(
  child: Widget?,
  tabLabel: Widget?,
  menuLabel: Widget?,
  position: Int
): Int = gtk_notebook_insert_page_menu(this, child?.reinterpret(), tabLabel?.reinterpret(),
    menuLabel?.reinterpret(), position)

public fun Notebook.nextPage(): Unit {
  gtk_notebook_next_page(this)
}

public fun Notebook.pageNum(child: Widget?): Int = gtk_notebook_page_num(this, child?.reinterpret())

public fun Notebook.popupDisable(): Unit {
  gtk_notebook_popup_disable(this)
}

public fun Notebook.popupEnable(): Unit {
  gtk_notebook_popup_enable(this)
}

public fun Notebook.prependPage(child: Widget?, tabLabel: Widget?): Int =
    gtk_notebook_prepend_page(this, child?.reinterpret(), tabLabel?.reinterpret())

public fun Notebook.prependPageMenu(
  child: Widget?,
  tabLabel: Widget?,
  menuLabel: Widget?
): Int = gtk_notebook_prepend_page_menu(this, child?.reinterpret(), tabLabel?.reinterpret(),
    menuLabel?.reinterpret())

public fun Notebook.prevPage(): Unit {
  gtk_notebook_prev_page(this)
}

public fun Notebook.removePage(pageNum: Int): Unit {
  gtk_notebook_remove_page(this, pageNum)
}

public fun Notebook.reorderChild(child: Widget?, position: Int): Unit {
  gtk_notebook_reorder_child(this, child?.reinterpret(), position)
}

public fun Notebook.setActionWidget(widget: Widget?, packType: PackType): Unit {
  gtk_notebook_set_action_widget(this, widget?.reinterpret(), packType)
}

public fun Notebook.setMenuLabel(child: Widget?, menuLabel: Widget?): Unit {
  gtk_notebook_set_menu_label(this, child?.reinterpret(), menuLabel?.reinterpret())
}

public fun Notebook.setMenuLabelText(child: Widget?, menuText: String): Unit {
  gtk_notebook_set_menu_label_text(this, child?.reinterpret(), menuText)
}

public fun Notebook.setTabDetachable(child: Widget?, detachable: Boolean): Unit {
  gtk_notebook_set_tab_detachable(this, child?.reinterpret(), detachable.toInt)
}

public fun Notebook.setTabLabel(child: Widget?, tabLabel: Widget?): Unit {
  gtk_notebook_set_tab_label(this, child?.reinterpret(), tabLabel?.reinterpret())
}

public fun Notebook.setTabLabelText(child: Widget?, tabText: String): Unit {
  gtk_notebook_set_tab_label_text(this, child?.reinterpret(), tabText)
}

public fun Notebook.setTabReorderable(child: Widget?, reorderable: Boolean): Unit {
  gtk_notebook_set_tab_reorderable(this, child?.reinterpret(), reorderable.toInt)
}

public fun Notebook.onChangeCurrentPage(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("change-current-page") { callback(this) }
  return this
}

public fun Notebook.onCreateWindow(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("create-window") { callback(this) }
  return this
}

public fun Notebook.onFocusTab(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("focus-tab") { callback(this) }
  return this
}

public fun Notebook.onMoveFocusOut(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("move-focus-out") { callback(this) }
  return this
}

public fun Notebook.onPageAdded(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("page-added") { callback(this) }
  return this
}

public fun Notebook.onPageRemoved(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("page-removed") { callback(this) }
  return this
}

public fun Notebook.onPageReordered(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("page-reordered") { callback(this) }
  return this
}

public fun Notebook.onReorderTab(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("reorder-tab") { callback(this) }
  return this
}

public fun Notebook.onSelectPage(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("select-page") { callback(this) }
  return this
}

public fun Notebook.onSwitchPage(callback: (Notebook) -> Unit): Notebook {
  // TODO - handle callback data

  asObject.connect("switch-page") { callback(this) }
  return this
}