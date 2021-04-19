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

public fun ScrolledWindow.getCaptureButtonPress(): Boolean =
    gtk_scrolled_window_get_capture_button_press(this).toBoolean

public fun ScrolledWindow.getHadjustment(): Adjustment? =
    gtk_scrolled_window_get_hadjustment(this)?.reinterpret()

public fun ScrolledWindow.getHscrollbar(): Widget? =
    gtk_scrolled_window_get_hscrollbar(this)?.reinterpret()

public fun ScrolledWindow.getKineticScrolling(): Boolean =
    gtk_scrolled_window_get_kinetic_scrolling(this).toBoolean

public fun ScrolledWindow.getMaxContentHeight(): Int =
    gtk_scrolled_window_get_max_content_height(this)

public fun ScrolledWindow.getMaxContentWidth(): Int =
    gtk_scrolled_window_get_max_content_width(this)

public fun ScrolledWindow.getMinContentHeight(): Int =
    gtk_scrolled_window_get_min_content_height(this)

public fun ScrolledWindow.getMinContentWidth(): Int =
    gtk_scrolled_window_get_min_content_width(this)

public fun ScrolledWindow.getOverlayScrolling(): Boolean =
    gtk_scrolled_window_get_overlay_scrolling(this).toBoolean

public fun ScrolledWindow.getPropagateNaturalHeight(): Boolean =
    gtk_scrolled_window_get_propagate_natural_height(this).toBoolean

public fun ScrolledWindow.getPropagateNaturalWidth(): Boolean =
    gtk_scrolled_window_get_propagate_natural_width(this).toBoolean

public fun ScrolledWindow.getVadjustment(): Adjustment? =
    gtk_scrolled_window_get_vadjustment(this)?.reinterpret()

public fun ScrolledWindow.getVscrollbar(): Widget? =
    gtk_scrolled_window_get_vscrollbar(this)?.reinterpret()

public fun ScrolledWindow.setCaptureButtonPress(captureButtonPress: Boolean): Unit {
  gtk_scrolled_window_set_capture_button_press(this, captureButtonPress.toInt)
}

public fun ScrolledWindow.setHadjustment(hadjustment: Adjustment): Unit {
  gtk_scrolled_window_set_hadjustment(this, hadjustment.reinterpret())
}

public fun ScrolledWindow.setKineticScrolling(kineticScrolling: Boolean): Unit {
  gtk_scrolled_window_set_kinetic_scrolling(this, kineticScrolling.toInt)
}

public fun ScrolledWindow.setMaxContentHeight(height: Int): Unit {
  gtk_scrolled_window_set_max_content_height(this, height)
}

public fun ScrolledWindow.setMaxContentWidth(width: Int): Unit {
  gtk_scrolled_window_set_max_content_width(this, width)
}

public fun ScrolledWindow.setMinContentHeight(height: Int): Unit {
  gtk_scrolled_window_set_min_content_height(this, height)
}

public fun ScrolledWindow.setMinContentWidth(width: Int): Unit {
  gtk_scrolled_window_set_min_content_width(this, width)
}

public fun ScrolledWindow.setOverlayScrolling(overlayScrolling: Boolean): Unit {
  gtk_scrolled_window_set_overlay_scrolling(this, overlayScrolling.toInt)
}

public fun ScrolledWindow.setPropagateNaturalHeight(propagate: Boolean): Unit {
  gtk_scrolled_window_set_propagate_natural_height(this, propagate.toInt)
}

public fun ScrolledWindow.setPropagateNaturalWidth(propagate: Boolean): Unit {
  gtk_scrolled_window_set_propagate_natural_width(this, propagate.toInt)
}

public fun ScrolledWindow.setVadjustment(vadjustment: Adjustment): Unit {
  gtk_scrolled_window_set_vadjustment(this, vadjustment.reinterpret())
}

public fun ScrolledWindow.unsetPlacement(): Unit {
  gtk_scrolled_window_unset_placement(this)
}
