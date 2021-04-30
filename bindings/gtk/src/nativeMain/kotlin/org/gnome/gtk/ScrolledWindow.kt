// TODO - method: add_with_viewport
// TODO - method: get_policy
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScrolledWindow
import interop.gtk_scrolled_window_get_capture_button_press
import interop.gtk_scrolled_window_get_hadjustment
import interop.gtk_scrolled_window_get_hscrollbar
import interop.gtk_scrolled_window_get_kinetic_scrolling
import interop.gtk_scrolled_window_get_max_content_height
import interop.gtk_scrolled_window_get_max_content_width
import interop.gtk_scrolled_window_get_min_content_height
import interop.gtk_scrolled_window_get_min_content_width
import interop.gtk_scrolled_window_get_overlay_scrolling
import interop.gtk_scrolled_window_get_placement
import interop.gtk_scrolled_window_get_propagate_natural_height
import interop.gtk_scrolled_window_get_propagate_natural_width
import interop.gtk_scrolled_window_get_shadow_type
import interop.gtk_scrolled_window_get_vadjustment
import interop.gtk_scrolled_window_get_vscrollbar
import interop.gtk_scrolled_window_new
import interop.gtk_scrolled_window_set_capture_button_press
import interop.gtk_scrolled_window_set_hadjustment
import interop.gtk_scrolled_window_set_kinetic_scrolling
import interop.gtk_scrolled_window_set_max_content_height
import interop.gtk_scrolled_window_set_max_content_width
import interop.gtk_scrolled_window_set_min_content_height
import interop.gtk_scrolled_window_set_min_content_width
import interop.gtk_scrolled_window_set_overlay_scrolling
import interop.gtk_scrolled_window_set_placement
import interop.gtk_scrolled_window_set_policy
import interop.gtk_scrolled_window_set_propagate_natural_height
import interop.gtk_scrolled_window_set_propagate_natural_width
import interop.gtk_scrolled_window_set_shadow_type
import interop.gtk_scrolled_window_set_vadjustment
import interop.gtk_scrolled_window_unset_placement
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public object ScrolledWindowFactory {
  public fun new(hadjustment: Adjustment?, vadjustment: Adjustment?): ScrolledWindow =
      gtk_scrolled_window_new(hadjustment?.reinterpret(),
      vadjustment?.reinterpret())!!.reinterpret()
}

public val ScrolledWindow.container: Bin
  get() = pointed.container.ptr

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

public var ScrolledWindow.placement: CornerType
  get() = gtk_scrolled_window_get_placement(this)
  set(`value`) {
    gtk_scrolled_window_set_placement(this, value)
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

public var ScrolledWindow.shadowType: ShadowType
  get() = gtk_scrolled_window_get_shadow_type(this)
  set(`value`) {
    gtk_scrolled_window_set_shadow_type(this, value)
  }

public var ScrolledWindow.vadjustment: Adjustment?
  get() = gtk_scrolled_window_get_vadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scrolled_window_set_vadjustment(this, value)
  }

public val ScrolledWindow.vscrollbar: Widget?
  get() = gtk_scrolled_window_get_vscrollbar(this)?.reinterpret()

public fun ScrolledWindow.setPolicy(hscrollbarPolicy: PolicyType, vscrollbarPolicy: PolicyType):
    Unit {
  gtk_scrolled_window_set_policy(this, hscrollbarPolicy, vscrollbarPolicy)
}

public fun ScrolledWindow.unsetPlacement(): Unit {
  gtk_scrolled_window_unset_placement(this)
}

public fun ScrolledWindow.onEdgeOvershot(callback: (ScrolledWindow) -> Unit): ScrolledWindow {
  // TODO - handle callback data

  asObject.connect("edge-overshot") { callback(this) }
  return this
}

public fun ScrolledWindow.onEdgeReached(callback: (ScrolledWindow) -> Unit): ScrolledWindow {
  // TODO - handle callback data

  asObject.connect("edge-reached") { callback(this) }
  return this
}

public fun ScrolledWindow.onMoveFocusOut(callback: (ScrolledWindow) -> Unit): ScrolledWindow {
  // TODO - handle callback data

  asObject.connect("move-focus-out") { callback(this) }
  return this
}

public fun ScrolledWindow.onScrollChild(callback: (ScrolledWindow) -> Unit): ScrolledWindow {
  // TODO - handle callback data

  asObject.connect("scroll-child") { callback(this) }
  return this
}
