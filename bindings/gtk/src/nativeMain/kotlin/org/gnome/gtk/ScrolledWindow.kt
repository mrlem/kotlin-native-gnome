// TODO - method: get_policy (param type)
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
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

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
  get() = gtk_scrolled_window_get_capture_button_press(this).toBoolean()
  set(`value`) {
    gtk_scrolled_window_set_capture_button_press(this@captureButtonPress, `value`.toInt())
  }

public var ScrolledWindow.hadjustment: Adjustment?
  get() = gtk_scrolled_window_get_hadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scrolled_window_set_hadjustment(this@hadjustment, `value`)
  }

public val ScrolledWindow.hscrollbar: Widget?
  get() = gtk_scrolled_window_get_hscrollbar(this)?.reinterpret()

public var ScrolledWindow.kineticScrolling: Boolean
  get() = gtk_scrolled_window_get_kinetic_scrolling(this).toBoolean()
  set(`value`) {
    gtk_scrolled_window_set_kinetic_scrolling(this@kineticScrolling, `value`.toInt())
  }

public var ScrolledWindow.maxContentHeight: Int
  get() = gtk_scrolled_window_get_max_content_height(this)
  set(`value`) {
    gtk_scrolled_window_set_max_content_height(this@maxContentHeight, `value`)
  }

public var ScrolledWindow.maxContentWidth: Int
  get() = gtk_scrolled_window_get_max_content_width(this)
  set(`value`) {
    gtk_scrolled_window_set_max_content_width(this@maxContentWidth, `value`)
  }

public var ScrolledWindow.minContentHeight: Int
  get() = gtk_scrolled_window_get_min_content_height(this)
  set(`value`) {
    gtk_scrolled_window_set_min_content_height(this@minContentHeight, `value`)
  }

public var ScrolledWindow.minContentWidth: Int
  get() = gtk_scrolled_window_get_min_content_width(this)
  set(`value`) {
    gtk_scrolled_window_set_min_content_width(this@minContentWidth, `value`)
  }

public var ScrolledWindow.overlayScrolling: Boolean
  get() = gtk_scrolled_window_get_overlay_scrolling(this).toBoolean()
  set(`value`) {
    gtk_scrolled_window_set_overlay_scrolling(this@overlayScrolling, `value`.toInt())
  }

public var ScrolledWindow.placement: CornerType
  get() = gtk_scrolled_window_get_placement(this)
  set(`value`) {
    gtk_scrolled_window_set_placement(this@placement, `value`)
  }

public var ScrolledWindow.propagateNaturalHeight: Boolean
  get() = gtk_scrolled_window_get_propagate_natural_height(this).toBoolean()
  set(`value`) {
    gtk_scrolled_window_set_propagate_natural_height(this@propagateNaturalHeight, `value`.toInt())
  }

public var ScrolledWindow.propagateNaturalWidth: Boolean
  get() = gtk_scrolled_window_get_propagate_natural_width(this).toBoolean()
  set(`value`) {
    gtk_scrolled_window_set_propagate_natural_width(this@propagateNaturalWidth, `value`.toInt())
  }

public var ScrolledWindow.shadowType: ShadowType
  get() = gtk_scrolled_window_get_shadow_type(this)
  set(`value`) {
    gtk_scrolled_window_set_shadow_type(this@shadowType, `value`)
  }

public var ScrolledWindow.vadjustment: Adjustment?
  get() = gtk_scrolled_window_get_vadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scrolled_window_set_vadjustment(this@vadjustment, `value`)
  }

public val ScrolledWindow.vscrollbar: Widget?
  get() = gtk_scrolled_window_get_vscrollbar(this)?.reinterpret()

public fun ScrolledWindow.setPolicy(hscrollbarPolicy: PolicyType, vscrollbarPolicy: PolicyType):
    Unit {
  gtk_scrolled_window_set_policy(this@setPolicy, hscrollbarPolicy, vscrollbarPolicy)
}

public fun ScrolledWindow.unsetPlacement(): Unit {
  gtk_scrolled_window_unset_placement(this@unsetPlacement)
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
