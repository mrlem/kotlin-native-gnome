// TODO - implement:
//   append_page
//   append_page_menu
//   detach_tab
//   get_action_widget
//   get_current_page
//   get_group_name
//   get_menu_label
//   get_menu_label_text
//   get_n_pages
//   get_nth_page
//   get_scrollable
//   get_show_border
//   get_show_tabs
//   get_tab_detachable
//   get_tab_hborder
//   get_tab_label
//   get_tab_label_text
//   get_tab_pos
//   get_tab_reorderable
//   get_tab_vborder
//   insert_page
//   insert_page_menu
//   next_page
//   page_num
//   popup_disable
//   popup_enable
//   prepend_page
//   prepend_page_menu
//   prev_page
//   remove_page
//   reorder_child
//   set_action_widget
//   set_current_page
//   set_group_name
//   set_menu_label
//   set_menu_label_text
//   set_scrollable
//   set_show_border
//   set_show_tabs
//   set_tab_detachable
//   set_tab_label
//   set_tab_label_text
//   set_tab_pos
//   set_tab_reorderable
package org.gnome.gtk

import gtk3.GtkNotebook
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Notebook = CPointer<GtkNotebook>

public val Notebook.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Notebook.asWidget: Widget
  get() = reinterpret()

public val Notebook.asContainer: Container
  get() = reinterpret()
