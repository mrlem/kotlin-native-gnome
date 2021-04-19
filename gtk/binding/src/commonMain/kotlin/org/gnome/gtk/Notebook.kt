// TODO - get_action_widget
// TODO - get_tab_pos
// TODO - set_action_widget
// TODO - set_tab_pos
//
package org.gnome.gtk

import gtk3.GtkNotebook
import gtk3.gtk_notebook_append_page
import gtk3.gtk_notebook_append_page_menu
import gtk3.gtk_notebook_detach_tab
import gtk3.gtk_notebook_get_current_page
import gtk3.gtk_notebook_get_group_name
import gtk3.gtk_notebook_get_menu_label
import gtk3.gtk_notebook_get_menu_label_text
import gtk3.gtk_notebook_get_n_pages
import gtk3.gtk_notebook_get_nth_page
import gtk3.gtk_notebook_get_scrollable
import gtk3.gtk_notebook_get_show_border
import gtk3.gtk_notebook_get_show_tabs
import gtk3.gtk_notebook_get_tab_detachable
import gtk3.gtk_notebook_get_tab_label
import gtk3.gtk_notebook_get_tab_label_text
import gtk3.gtk_notebook_get_tab_reorderable
import gtk3.gtk_notebook_insert_page
import gtk3.gtk_notebook_insert_page_menu
import gtk3.gtk_notebook_next_page
import gtk3.gtk_notebook_page_num
import gtk3.gtk_notebook_popup_disable
import gtk3.gtk_notebook_popup_enable
import gtk3.gtk_notebook_prepend_page
import gtk3.gtk_notebook_prepend_page_menu
import gtk3.gtk_notebook_prev_page
import gtk3.gtk_notebook_remove_page
import gtk3.gtk_notebook_reorder_child
import gtk3.gtk_notebook_set_current_page
import gtk3.gtk_notebook_set_group_name
import gtk3.gtk_notebook_set_menu_label
import gtk3.gtk_notebook_set_menu_label_text
import gtk3.gtk_notebook_set_scrollable
import gtk3.gtk_notebook_set_show_border
import gtk3.gtk_notebook_set_show_tabs
import gtk3.gtk_notebook_set_tab_detachable
import gtk3.gtk_notebook_set_tab_label
import gtk3.gtk_notebook_set_tab_label_text
import gtk3.gtk_notebook_set_tab_reorderable
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

public typealias Notebook = CPointer<GtkNotebook>

public val Notebook.asObject: Object
  get() = reinterpret()

public val Notebook.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Notebook.asWidget: Widget
  get() = reinterpret()

public val Notebook.asContainer: Container
  get() = reinterpret()

public fun Notebook.appendPage(child: Widget, tabLabel: Widget): Int =
    gtk_notebook_append_page(this, child.reinterpret(), tabLabel.reinterpret())

public fun Notebook.appendPageMenu(
  child: Widget,
  tabLabel: Widget,
  menuLabel: Widget
): Int = gtk_notebook_append_page_menu(this, child.reinterpret(), tabLabel.reinterpret(),
    menuLabel.reinterpret())

public fun Notebook.detachTab(child: Widget): Unit {
  gtk_notebook_detach_tab(this, child.reinterpret())
}

public fun Notebook.getCurrentPage(): Int = gtk_notebook_get_current_page(this)

public fun Notebook.getGroupName(): String = gtk_notebook_get_group_name(this).toKString

public fun Notebook.getMenuLabel(child: Widget): Widget? = gtk_notebook_get_menu_label(this,
    child.reinterpret())?.reinterpret()

public fun Notebook.getMenuLabelText(child: Widget): String = gtk_notebook_get_menu_label_text(this,
    child.reinterpret()).toKString

public fun Notebook.getNPages(): Int = gtk_notebook_get_n_pages(this)

public fun Notebook.getNthPage(pageNum: Int): Widget? = gtk_notebook_get_nth_page(this,
    pageNum)?.reinterpret()

public fun Notebook.getScrollable(): Boolean = gtk_notebook_get_scrollable(this).toBoolean

public fun Notebook.getShowBorder(): Boolean = gtk_notebook_get_show_border(this).toBoolean

public fun Notebook.getShowTabs(): Boolean = gtk_notebook_get_show_tabs(this).toBoolean

public fun Notebook.getTabDetachable(child: Widget): Boolean = gtk_notebook_get_tab_detachable(this,
    child.reinterpret()).toBoolean

public fun Notebook.getTabLabel(child: Widget): Widget? = gtk_notebook_get_tab_label(this,
    child.reinterpret())?.reinterpret()

public fun Notebook.getTabLabelText(child: Widget): String = gtk_notebook_get_tab_label_text(this,
    child.reinterpret()).toKString

public fun Notebook.getTabReorderable(child: Widget): Boolean =
    gtk_notebook_get_tab_reorderable(this, child.reinterpret()).toBoolean

public fun Notebook.insertPage(
  child: Widget,
  tabLabel: Widget,
  position: Int
): Int = gtk_notebook_insert_page(this, child.reinterpret(), tabLabel.reinterpret(), position)

public fun Notebook.insertPageMenu(
  child: Widget,
  tabLabel: Widget,
  menuLabel: Widget,
  position: Int
): Int = gtk_notebook_insert_page_menu(this, child.reinterpret(), tabLabel.reinterpret(),
    menuLabel.reinterpret(), position)

public fun Notebook.nextPage(): Unit {
  gtk_notebook_next_page(this)
}

public fun Notebook.pageNum(child: Widget): Int = gtk_notebook_page_num(this, child.reinterpret())

public fun Notebook.popupDisable(): Unit {
  gtk_notebook_popup_disable(this)
}

public fun Notebook.popupEnable(): Unit {
  gtk_notebook_popup_enable(this)
}

public fun Notebook.prependPage(child: Widget, tabLabel: Widget): Int =
    gtk_notebook_prepend_page(this, child.reinterpret(), tabLabel.reinterpret())

public fun Notebook.prependPageMenu(
  child: Widget,
  tabLabel: Widget,
  menuLabel: Widget
): Int = gtk_notebook_prepend_page_menu(this, child.reinterpret(), tabLabel.reinterpret(),
    menuLabel.reinterpret())

public fun Notebook.prevPage(): Unit {
  gtk_notebook_prev_page(this)
}

public fun Notebook.removePage(pageNum: Int): Unit {
  gtk_notebook_remove_page(this, pageNum)
}

public fun Notebook.reorderChild(child: Widget, position: Int): Unit {
  gtk_notebook_reorder_child(this, child.reinterpret(), position)
}

public fun Notebook.setCurrentPage(pageNum: Int): Unit {
  gtk_notebook_set_current_page(this, pageNum)
}

public fun Notebook.setGroupName(groupName: String?): Unit {
  gtk_notebook_set_group_name(this, groupName)
}

public fun Notebook.setMenuLabel(child: Widget, menuLabel: Widget): Unit {
  gtk_notebook_set_menu_label(this, child.reinterpret(), menuLabel.reinterpret())
}

public fun Notebook.setMenuLabelText(child: Widget, menuText: String?): Unit {
  gtk_notebook_set_menu_label_text(this, child.reinterpret(), menuText)
}

public fun Notebook.setScrollable(scrollable: Boolean): Unit {
  gtk_notebook_set_scrollable(this, scrollable.toInt)
}

public fun Notebook.setShowBorder(showBorder: Boolean): Unit {
  gtk_notebook_set_show_border(this, showBorder.toInt)
}

public fun Notebook.setShowTabs(showTabs: Boolean): Unit {
  gtk_notebook_set_show_tabs(this, showTabs.toInt)
}

public fun Notebook.setTabDetachable(child: Widget, detachable: Boolean): Unit {
  gtk_notebook_set_tab_detachable(this, child.reinterpret(), detachable.toInt)
}

public fun Notebook.setTabLabel(child: Widget, tabLabel: Widget): Unit {
  gtk_notebook_set_tab_label(this, child.reinterpret(), tabLabel.reinterpret())
}

public fun Notebook.setTabLabelText(child: Widget, tabText: String?): Unit {
  gtk_notebook_set_tab_label_text(this, child.reinterpret(), tabText)
}

public fun Notebook.setTabReorderable(child: Widget, reorderable: Boolean): Unit {
  gtk_notebook_set_tab_reorderable(this, child.reinterpret(), reorderable.toInt)
}
