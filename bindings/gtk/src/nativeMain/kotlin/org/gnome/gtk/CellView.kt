// TODO - constructor: new_with_pixbuf
// TODO - method: get_size_of_row
// TODO - method: set_background_color
// TODO - method: set_background_rgba
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellView
import interop.gtk_cell_view_get_displayed_row
import interop.gtk_cell_view_get_draw_sensitive
import interop.gtk_cell_view_get_fit_model
import interop.gtk_cell_view_get_model
import interop.gtk_cell_view_new
import interop.gtk_cell_view_new_with_context
import interop.gtk_cell_view_new_with_markup
import interop.gtk_cell_view_new_with_text
import interop.gtk_cell_view_set_displayed_row
import interop.gtk_cell_view_set_draw_sensitive
import interop.gtk_cell_view_set_fit_model
import interop.gtk_cell_view_set_model
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias CellView = CPointer<GtkCellView>

public val CellView.asObject: Object
  get() = reinterpret()

public val CellView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellView.asWidget: Widget
  get() = reinterpret()

public object CellViewFactory {
  public fun new(): CellView = gtk_cell_view_new()!!.reinterpret()

  public fun newWithContext(area: CellArea?, context: CellAreaContext?): CellView =
      gtk_cell_view_new_with_context(area?.reinterpret(), context?.reinterpret())!!.reinterpret()

  public fun newWithMarkup(markup: String): CellView =
      gtk_cell_view_new_with_markup(markup)!!.reinterpret()

  public fun newWithText(text: String): CellView = gtk_cell_view_new_with_text(text)!!.reinterpret()
}

public val CellView.parentInstance: Widget
  get() = pointed.parent_instance.ptr

public var CellView.displayedRow: TreePath?
  get() = gtk_cell_view_get_displayed_row(this)?.reinterpret()
  set(`value`) {
    gtk_cell_view_set_displayed_row(this, `value`)
  }

public var CellView.drawSensitive: Boolean
  get() = gtk_cell_view_get_draw_sensitive(this).toBoolean
  set(`value`) {
    gtk_cell_view_set_draw_sensitive(this, `value`.toInt)
  }

public var CellView.fitModel: Boolean
  get() = gtk_cell_view_get_fit_model(this).toBoolean
  set(`value`) {
    gtk_cell_view_set_fit_model(this, `value`.toInt)
  }

public var CellView.model: TreeModel?
  get() = gtk_cell_view_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_cell_view_set_model(this, `value`)
  }
