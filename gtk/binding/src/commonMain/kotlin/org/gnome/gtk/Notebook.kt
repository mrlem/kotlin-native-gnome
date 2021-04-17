// TODO - implement:
//   append_page
//   append_page_menu
//   detach_tab
//   get_action_widget
//   get_menu_label
//   get_menu_label_text
//   get_nth_page
//   get_tab_detachable
//   get_tab_label
//   get_tab_label_text
//   get_tab_reorderable
//   insert_page
//   insert_page_menu
//   page_num
//   prepend_page
//   prepend_page_menu
//   remove_page
//   reorder_child
//   set_action_widget
//   set_menu_label
//   set_menu_label_text
//   set_tab_detachable
//   set_tab_label
//   set_tab_label_text
//   set_tab_pos
//   set_tab_reorderable
package org.gnome.gtk

import gtk3.GtkNotebook
import gtk3.gtk_notebook_get_current_page
import gtk3.gtk_notebook_get_group_name
import gtk3.gtk_notebook_get_n_pages
import gtk3.gtk_notebook_get_scrollable
import gtk3.gtk_notebook_get_show_border
import gtk3.gtk_notebook_get_show_tabs
import gtk3.gtk_notebook_get_tab_hborder
import gtk3.gtk_notebook_get_tab_pos
import gtk3.gtk_notebook_get_tab_vborder
import gtk3.gtk_notebook_next_page
import gtk3.gtk_notebook_popup_disable
import gtk3.gtk_notebook_popup_enable
import gtk3.gtk_notebook_prev_page
import gtk3.gtk_notebook_set_current_page
import gtk3.gtk_notebook_set_group_name
import gtk3.gtk_notebook_set_scrollable
import gtk3.gtk_notebook_set_show_border
import gtk3.gtk_notebook_set_show_tabs
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UShort
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Notebook = CPointer<GtkNotebook>

public val Notebook.asObject: Object
  get() = reinterpret()

public val Notebook.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Notebook.asWidget: Widget
  get() = reinterpret()

public val Notebook.asContainer: Container
  get() = reinterpret()

public fun Notebook.getTabPos(): Unit {
  gtk_notebook_get_tab_pos(this)
}

public fun Notebook.nextPage(): Unit {
  gtk_notebook_next_page(this)
}

public fun Notebook.popupDisable(): Unit {
  gtk_notebook_popup_disable(this)
}

public fun Notebook.popupEnable(): Unit {
  gtk_notebook_popup_enable(this)
}

public fun Notebook.prevPage(): Unit {
  gtk_notebook_prev_page(this)
}

public var Notebook.currentPage: Int
  get() = gtk_notebook_get_current_page(this)
  set(`value`) {
    gtk_notebook_set_current_page(this, value)
  }

public var Notebook.groupName: String?
  get() = gtk_notebook_get_group_name(this).toKString
  set(`value`) {
    gtk_notebook_set_group_name(this, value)
  }

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

public val Notebook.nPages: Int
  get() = gtk_notebook_get_n_pages(this)

public val Notebook.tabHborder: UShort
  get() = gtk_notebook_get_tab_hborder(this)

public val Notebook.tabVborder: UShort
  get() = gtk_notebook_get_tab_vborder(this)
