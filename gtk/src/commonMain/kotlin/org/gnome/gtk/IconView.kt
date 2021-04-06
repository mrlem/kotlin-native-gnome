// TODO - implement:
//   convert_widget_to_bin_window_coords
//   create_drag_icon
//   enable_model_drag_dest
//   enable_model_drag_source
//   get_cell_rect
//   get_cursor
//   get_dest_item_at_pos
//   get_drag_dest_item
//   get_item_at_pos
//   get_item_column
//   get_item_orientation
//   get_item_row
//   get_model
//   get_path_at_pos
//   get_selected_items
//   get_selection_mode
//   get_tooltip_context
//   get_visible_range
//   item_activated
//   path_is_selected
//   scroll_to_path
//   select_all
//   select_path
//   selected_foreach
//   set_cursor
//   set_drag_dest_item
//   set_item_orientation
//   set_model
//   set_selection_mode
//   set_tooltip_cell
//   set_tooltip_item
//   unselect_all
//   unselect_path
//   unset_model_drag_dest
//   unset_model_drag_source
package org.gnome.gtk

import gtk3.GtkIconView
import gtk3.gtk_icon_view_get_activate_on_single_click
import gtk3.gtk_icon_view_get_column_spacing
import gtk3.gtk_icon_view_get_columns
import gtk3.gtk_icon_view_get_item_padding
import gtk3.gtk_icon_view_get_item_width
import gtk3.gtk_icon_view_get_margin
import gtk3.gtk_icon_view_get_markup_column
import gtk3.gtk_icon_view_get_pixbuf_column
import gtk3.gtk_icon_view_get_reorderable
import gtk3.gtk_icon_view_get_row_spacing
import gtk3.gtk_icon_view_get_spacing
import gtk3.gtk_icon_view_get_text_column
import gtk3.gtk_icon_view_get_tooltip_column
import gtk3.gtk_icon_view_set_activate_on_single_click
import gtk3.gtk_icon_view_set_column_spacing
import gtk3.gtk_icon_view_set_columns
import gtk3.gtk_icon_view_set_item_padding
import gtk3.gtk_icon_view_set_item_width
import gtk3.gtk_icon_view_set_margin
import gtk3.gtk_icon_view_set_markup_column
import gtk3.gtk_icon_view_set_pixbuf_column
import gtk3.gtk_icon_view_set_reorderable
import gtk3.gtk_icon_view_set_row_spacing
import gtk3.gtk_icon_view_set_spacing
import gtk3.gtk_icon_view_set_text_column
import gtk3.gtk_icon_view_set_tooltip_column
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias IconView = CPointer<GtkIconView>

public val IconView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val IconView.asWidget: Widget
  get() = reinterpret()

public val IconView.asContainer: Container
  get() = reinterpret()

public var IconView.activateOnSingleClick: Boolean
  get() = gtk_icon_view_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_icon_view_set_activate_on_single_click(this, value.toInt)
  }

public var IconView.columnSpacing: Int
  get() = gtk_icon_view_get_column_spacing(this)
  set(`value`) {
    gtk_icon_view_set_column_spacing(this, value)
  }

public var IconView.columns: Int
  get() = gtk_icon_view_get_columns(this)
  set(`value`) {
    gtk_icon_view_set_columns(this, value)
  }

public var IconView.itemPadding: Int
  get() = gtk_icon_view_get_item_padding(this)
  set(`value`) {
    gtk_icon_view_set_item_padding(this, value)
  }

public var IconView.itemWidth: Int
  get() = gtk_icon_view_get_item_width(this)
  set(`value`) {
    gtk_icon_view_set_item_width(this, value)
  }

public var IconView.margin: Int
  get() = gtk_icon_view_get_margin(this)
  set(`value`) {
    gtk_icon_view_set_margin(this, value)
  }

public var IconView.markupColumn: Int
  get() = gtk_icon_view_get_markup_column(this)
  set(`value`) {
    gtk_icon_view_set_markup_column(this, value)
  }

public var IconView.pixbufColumn: Int
  get() = gtk_icon_view_get_pixbuf_column(this)
  set(`value`) {
    gtk_icon_view_set_pixbuf_column(this, value)
  }

public var IconView.reorderable: Boolean
  get() = gtk_icon_view_get_reorderable(this).toBoolean
  set(`value`) {
    gtk_icon_view_set_reorderable(this, value.toInt)
  }

public var IconView.rowSpacing: Int
  get() = gtk_icon_view_get_row_spacing(this)
  set(`value`) {
    gtk_icon_view_set_row_spacing(this, value)
  }

public var IconView.spacing: Int
  get() = gtk_icon_view_get_spacing(this)
  set(`value`) {
    gtk_icon_view_set_spacing(this, value)
  }

public var IconView.textColumn: Int
  get() = gtk_icon_view_get_text_column(this)
  set(`value`) {
    gtk_icon_view_set_text_column(this, value)
  }

public var IconView.tooltipColumn: Int
  get() = gtk_icon_view_get_tooltip_column(this)
  set(`value`) {
    gtk_icon_view_set_tooltip_column(this, value)
  }
