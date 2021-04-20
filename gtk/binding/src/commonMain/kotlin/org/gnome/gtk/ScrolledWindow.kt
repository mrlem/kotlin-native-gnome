// TODO - add_with_viewport
// TODO - get_placement
// TODO - get_policy
// TODO - get_shadow_type
// TODO - set_placement
// TODO - set_policy
// TODO - set_shadow_type
//
package org.gnome.gtk

import gtk3.GtkScrolledWindow
import gtk3.gtk_scrolled_window_get_capture_button_press
import gtk3.gtk_scrolled_window_get_hadjustment
import gtk3.gtk_scrolled_window_get_hscrollbar
import gtk3.gtk_scrolled_window_get_kinetic_scrolling
import gtk3.gtk_scrolled_window_get_max_content_height
import gtk3.gtk_scrolled_window_get_max_content_width
import gtk3.gtk_scrolled_window_get_min_content_height
import gtk3.gtk_scrolled_window_get_min_content_width
import gtk3.gtk_scrolled_window_get_overlay_scrolling
import gtk3.gtk_scrolled_window_get_propagate_natural_height
import gtk3.gtk_scrolled_window_get_propagate_natural_width
import gtk3.gtk_scrolled_window_get_vadjustment
import gtk3.gtk_scrolled_window_get_vscrollbar
import gtk3.gtk_scrolled_window_set_capture_button_press
import gtk3.gtk_scrolled_window_set_hadjustment
import gtk3.gtk_scrolled_window_set_kinetic_scrolling
import gtk3.gtk_scrolled_window_set_max_content_height
import gtk3.gtk_scrolled_window_set_max_content_width
import gtk3.gtk_scrolled_window_set_min_content_height
import gtk3.gtk_scrolled_window_set_min_content_width
import gtk3.gtk_scrolled_window_set_overlay_scrolling
import gtk3.gtk_scrolled_window_set_propagate_natural_height
import gtk3.gtk_scrolled_window_set_propagate_natural_width
import gtk3.gtk_scrolled_window_set_vadjustment
import gtk3.gtk_scrolled_window_unset_placement
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias ScrolledWindow = CPointer<GtkScrolledWindow>

public val ScrolledWindow.asObject: Object
  get() = reinterpret()

public val ScrolledWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ScrolledWindow.asWidget: Widget
  get() = reinterpret()

public val ScrolledWindow.asContainer: Container
  get() = reinterpret()

public val ScrolledWindow.asBin: Bin
  get() = reinterpret()

public var ScrolledWindow.captureButtonPress: Boolean
  get() = gtk_scrolled_window_get_capture_button_press(this).toBoolean
  set(`value`) {
    gtk_scrolled_window_set_capture_button_press(this, value.toInt)
  }

public var ScrolledWindow.hadjustment: Adjustment?
  get() = gtk_scrolled_window_get_hadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scrolled_window_set_hadjustment(this, value)
  }

public val ScrolledWindow.hscrollbar: Widget?
  get() = gtk_scrolled_window_get_hscrollbar(this)?.reinterpret()

public var ScrolledWindow.kineticScrolling: Boolean
  get() = gtk_scrolled_window_get_kinetic_scrolling(this).toBoolean
  set(`value`) {
    gtk_scrolled_window_set_kinetic_scrolling(this, value.toInt)
  }

public var ScrolledWindow.maxContentHeight: Int
  get() = gtk_scrolled_window_get_max_content_height(this)
  set(`value`) {
    gtk_scrolled_window_set_max_content_height(this, value)
  }

public var ScrolledWindow.maxContentWidth: Int
  get() = gtk_scrolled_window_get_max_content_width(this)
  set(`value`) {
    gtk_scrolled_window_set_max_content_width(this, value)
  }

public var ScrolledWindow.minContentHeight: Int
  get() = gtk_scrolled_window_get_min_content_height(this)
  set(`value`) {
    gtk_scrolled_window_set_min_content_height(this, value)
  }

public var ScrolledWindow.minContentWidth: Int
  get() = gtk_scrolled_window_get_min_content_width(this)
  set(`value`) {
    gtk_scrolled_window_set_min_content_width(this, value)
  }

public var ScrolledWindow.overlayScrolling: Boolean
  get() = gtk_scrolled_window_get_overlay_scrolling(this).toBoolean
  set(`value`) {
    gtk_scrolled_window_set_overlay_scrolling(this, value.toInt)
  }

public var ScrolledWindow.propagateNaturalHeight: Boolean
  get() = gtk_scrolled_window_get_propagate_natural_height(this).toBoolean
  set(`value`) {
    gtk_scrolled_window_set_propagate_natural_height(this, value.toInt)
  }

public var ScrolledWindow.propagateNaturalWidth: Boolean
  get() = gtk_scrolled_window_get_propagate_natural_width(this).toBoolean
  set(`value`) {
    gtk_scrolled_window_set_propagate_natural_width(this, value.toInt)
  }

public var ScrolledWindow.vadjustment: Adjustment?
  get() = gtk_scrolled_window_get_vadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scrolled_window_set_vadjustment(this, value)
  }

public val ScrolledWindow.vscrollbar: Widget?
  get() = gtk_scrolled_window_get_vscrollbar(this)?.reinterpret()

public fun ScrolledWindow.unsetPlacement(): Unit {
  gtk_scrolled_window_unset_placement(this)
}
