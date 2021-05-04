// TODO - constructor: new
// TODO - method: begin_draw_frame (return type)
// TODO - method: begin_move_drag_for_device (param type)
// TODO - method: begin_resize_drag (param type)
// TODO - method: begin_resize_drag_for_device (param type)
// TODO - method: coords_from_parent (param type)
// TODO - method: coords_to_parent (param type)
// TODO - method: create_gl_context (return type)
// TODO - method: create_similar_image_surface (return type)
// TODO - method: create_similar_surface (return type)
// TODO - method: end_draw_frame (param type)
// TODO - method: get_children (return type)
// TODO - method: get_children_with_user_data (return type)
// TODO - method: get_clip_region (return type)
// TODO - method: get_cursor (return type)
// TODO - method: get_decorations (param type)
// TODO - method: get_device_cursor (return type)
// TODO - method: get_device_events (return type)
// TODO - method: get_device_position (return type)
// TODO - method: get_device_position_double (return type)
// TODO - method: get_display (return type)
// TODO - method: get_drag_protocol (return type)
// TODO - method: get_effective_parent (return type)
// TODO - method: get_effective_toplevel (return type)
// TODO - method: get_events (return type)
// TODO - method: get_frame_clock (return type)
// TODO - method: get_frame_extents (param type)
// TODO - method: get_fullscreen_mode (return type)
// TODO - method: get_geometry (param type)
// TODO - method: get_group (return type)
// TODO - method: get_origin (param type)
// TODO - method: get_parent (return type)
// TODO - method: get_position (param type)
// TODO - method: get_root_coords (param type)
// TODO - method: get_root_origin (param type)
// TODO - method: get_screen (return type)
// TODO - method: get_source_events (return type)
// TODO - method: get_state (return type)
// TODO - method: get_toplevel (return type)
// TODO - method: get_type_hint (return type)
// TODO - method: get_update_area (return type)
// TODO - method: get_user_data (param type)
// TODO - method: get_visible_region (return type)
// TODO - method: get_visual (return type)
// TODO - method: get_window_type (return type)
// TODO - method: input_shape_combine_region (param type)
// TODO - method: invalidate_maybe_recurse (param type)
// TODO - method: invalidate_rect (param type)
// TODO - method: invalidate_region (param type)
// TODO - method: mark_paint_from_clip (param type)
// TODO - method: move_region (param type)
// TODO - method: move_to_rect (param type)
// TODO - method: peek_children (return type)
// TODO - method: reparent (param type)
// TODO - method: restack (param type)
// TODO - method: set_cursor (param type)
// TODO - method: set_decorations (param type)
// TODO - method: set_device_cursor (param type)
// TODO - method: set_device_events (param type)
// TODO - method: set_events (param type)
// TODO - method: set_fullscreen_mode (param type)
// TODO - method: set_functions (param type)
// TODO - method: set_geometry_hints (param type)
// TODO - method: set_group (param type)
// TODO - method: set_icon_list (param type)
// TODO - method: set_opaque_region (param type)
// TODO - method: set_source_events (param type)
// TODO - method: set_transient_for (param type)
// TODO - method: set_type_hint (param type)
// TODO - method: shape_combine_region (param type)
// TODO - method: show_window_menu (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkWindow
import interop.gdk_window_beep
import interop.gdk_window_begin_move_drag
import interop.gdk_window_deiconify
import interop.gdk_window_destroy
import interop.gdk_window_end_paint
import interop.gdk_window_ensure_native
import interop.gdk_window_focus
import interop.gdk_window_freeze_updates
import interop.gdk_window_fullscreen
import interop.gdk_window_fullscreen_on_monitor
import interop.gdk_window_geometry_changed
import interop.gdk_window_get_accept_focus
import interop.gdk_window_get_event_compression
import interop.gdk_window_get_focus_on_map
import interop.gdk_window_get_height
import interop.gdk_window_get_modal_hint
import interop.gdk_window_get_pass_through
import interop.gdk_window_get_scale_factor
import interop.gdk_window_get_support_multidevice
import interop.gdk_window_get_width
import interop.gdk_window_has_native
import interop.gdk_window_hide
import interop.gdk_window_iconify
import interop.gdk_window_is_destroyed
import interop.gdk_window_is_input_only
import interop.gdk_window_is_shaped
import interop.gdk_window_is_viewable
import interop.gdk_window_is_visible
import interop.gdk_window_lower
import interop.gdk_window_maximize
import interop.gdk_window_merge_child_input_shapes
import interop.gdk_window_merge_child_shapes
import interop.gdk_window_move
import interop.gdk_window_move_resize
import interop.gdk_window_raise
import interop.gdk_window_register_dnd
import interop.gdk_window_resize
import interop.gdk_window_scroll
import interop.gdk_window_set_accept_focus
import interop.gdk_window_set_child_input_shapes
import interop.gdk_window_set_child_shapes
import interop.gdk_window_set_event_compression
import interop.gdk_window_set_focus_on_map
import interop.gdk_window_set_icon_name
import interop.gdk_window_set_keep_above
import interop.gdk_window_set_keep_below
import interop.gdk_window_set_modal_hint
import interop.gdk_window_set_opacity
import interop.gdk_window_set_override_redirect
import interop.gdk_window_set_pass_through
import interop.gdk_window_set_role
import interop.gdk_window_set_shadow_width
import interop.gdk_window_set_skip_pager_hint
import interop.gdk_window_set_skip_taskbar_hint
import interop.gdk_window_set_startup_id
import interop.gdk_window_set_support_multidevice
import interop.gdk_window_set_title
import interop.gdk_window_set_urgency_hint
import interop.gdk_window_set_user_data
import interop.gdk_window_show
import interop.gdk_window_show_unraised
import interop.gdk_window_stick
import interop.gdk_window_thaw_updates
import interop.gdk_window_unfullscreen
import interop.gdk_window_unmaximize
import interop.gdk_window_unstick
import interop.gdk_window_withdraw
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias Window = CPointer<GdkWindow>

public val Window.asObject: Object
  get() = reinterpret()

public object WindowFactory

public var Window.acceptFocus: Boolean
  get() = gdk_window_get_accept_focus(this).toBoolean()
  set(`value`) {
    gdk_window_set_accept_focus(this@acceptFocus, `value`.toInt())
  }

public var Window.eventCompression: Boolean
  get() = gdk_window_get_event_compression(this).toBoolean()
  set(`value`) {
    gdk_window_set_event_compression(this@eventCompression, `value`.toInt())
  }

public var Window.focusOnMap: Boolean
  get() = gdk_window_get_focus_on_map(this).toBoolean()
  set(`value`) {
    gdk_window_set_focus_on_map(this@focusOnMap, `value`.toInt())
  }

public val Window.height: Int
  get() = gdk_window_get_height(this)

public var Window.modalHint: Boolean
  get() = gdk_window_get_modal_hint(this).toBoolean()
  set(`value`) {
    gdk_window_set_modal_hint(this@modalHint, `value`.toInt())
  }

public var Window.passThrough: Boolean
  get() = gdk_window_get_pass_through(this).toBoolean()
  set(`value`) {
    gdk_window_set_pass_through(this@passThrough, `value`.toInt())
  }

public val Window.scaleFactor: Int
  get() = gdk_window_get_scale_factor(this)

public var Window.supportMultidevice: Boolean
  get() = gdk_window_get_support_multidevice(this).toBoolean()
  set(`value`) {
    gdk_window_set_support_multidevice(this@supportMultidevice, `value`.toInt())
  }

public val Window.width: Int
  get() = gdk_window_get_width(this)

public fun Window.beep(): Unit {
  gdk_window_beep(this@beep)
}

public fun Window.beginMoveDrag(
  button: Int,
  rootX: Int,
  rootY: Int,
  timestamp: UInt
): Unit {
  gdk_window_begin_move_drag(this@beginMoveDrag, button, rootX, rootY, timestamp)
}

public fun Window.deiconify(): Unit {
  gdk_window_deiconify(this@deiconify)
}

public fun Window.destroy(): Unit {
  gdk_window_destroy(this@destroy)
}

public fun Window.endPaint(): Unit {
  gdk_window_end_paint(this@endPaint)
}

public fun Window.ensureNative(): Boolean = gdk_window_ensure_native(this@ensureNative).toBoolean()

public fun Window.focus(timestamp: UInt): Unit {
  gdk_window_focus(this@focus, timestamp)
}

public fun Window.freezeUpdates(): Unit {
  gdk_window_freeze_updates(this@freezeUpdates)
}

public fun Window.fullscreen(): Unit {
  gdk_window_fullscreen(this@fullscreen)
}

public fun Window.fullscreenOnMonitor(monitor: Int): Unit {
  gdk_window_fullscreen_on_monitor(this@fullscreenOnMonitor, monitor)
}

public fun Window.geometryChanged(): Unit {
  gdk_window_geometry_changed(this@geometryChanged)
}

public fun Window.hasNative(): Boolean = gdk_window_has_native(this@hasNative).toBoolean()

public fun Window.hide(): Unit {
  gdk_window_hide(this@hide)
}

public fun Window.iconify(): Unit {
  gdk_window_iconify(this@iconify)
}

public fun Window.isDestroyed(): Boolean = gdk_window_is_destroyed(this@isDestroyed).toBoolean()

public fun Window.isInputOnly(): Boolean = gdk_window_is_input_only(this@isInputOnly).toBoolean()

public fun Window.isShaped(): Boolean = gdk_window_is_shaped(this@isShaped).toBoolean()

public fun Window.isViewable(): Boolean = gdk_window_is_viewable(this@isViewable).toBoolean()

public fun Window.isVisible(): Boolean = gdk_window_is_visible(this@isVisible).toBoolean()

public fun Window.lower(): Unit {
  gdk_window_lower(this@lower)
}

public fun Window.maximize(): Unit {
  gdk_window_maximize(this@maximize)
}

public fun Window.mergeChildInputShapes(): Unit {
  gdk_window_merge_child_input_shapes(this@mergeChildInputShapes)
}

public fun Window.mergeChildShapes(): Unit {
  gdk_window_merge_child_shapes(this@mergeChildShapes)
}

public fun Window.move(x: Int, y: Int): Unit {
  gdk_window_move(this@move, x, y)
}

public fun Window.moveResize(
  x: Int,
  y: Int,
  width: Int,
  height: Int
): Unit {
  gdk_window_move_resize(this@moveResize, x, y, width, height)
}

public fun Window.raise(): Unit {
  gdk_window_raise(this@raise)
}

public fun Window.registerDnd(): Unit {
  gdk_window_register_dnd(this@registerDnd)
}

public fun Window.resize(width: Int, height: Int): Unit {
  gdk_window_resize(this@resize, width, height)
}

public fun Window.scroll(dx: Int, dy: Int): Unit {
  gdk_window_scroll(this@scroll, dx, dy)
}

public fun Window.setChildInputShapes(): Unit {
  gdk_window_set_child_input_shapes(this@setChildInputShapes)
}

public fun Window.setChildShapes(): Unit {
  gdk_window_set_child_shapes(this@setChildShapes)
}

public fun Window.setIconName(name: String?): Unit {
  gdk_window_set_icon_name(this@setIconName, name)
}

public fun Window.setKeepAbove(setting: Boolean): Unit {
  gdk_window_set_keep_above(this@setKeepAbove, setting.toInt())
}

public fun Window.setKeepBelow(setting: Boolean): Unit {
  gdk_window_set_keep_below(this@setKeepBelow, setting.toInt())
}

public fun Window.setOpacity(opacity: Double): Unit {
  gdk_window_set_opacity(this@setOpacity, opacity)
}

public fun Window.setOverrideRedirect(overrideRedirect: Boolean): Unit {
  gdk_window_set_override_redirect(this@setOverrideRedirect, overrideRedirect.toInt())
}

public fun Window.setRole(role: String?): Unit {
  gdk_window_set_role(this@setRole, role)
}

public fun Window.setShadowWidth(
  left: Int,
  right: Int,
  top: Int,
  bottom: Int
): Unit {
  gdk_window_set_shadow_width(this@setShadowWidth, left, right, top, bottom)
}

public fun Window.setSkipPagerHint(skipsPager: Boolean): Unit {
  gdk_window_set_skip_pager_hint(this@setSkipPagerHint, skipsPager.toInt())
}

public fun Window.setSkipTaskbarHint(skipsTaskbar: Boolean): Unit {
  gdk_window_set_skip_taskbar_hint(this@setSkipTaskbarHint, skipsTaskbar.toInt())
}

public fun Window.setStartupId(startupId: String?): Unit {
  gdk_window_set_startup_id(this@setStartupId, startupId)
}

public fun Window.setTitle(title: String?): Unit {
  gdk_window_set_title(this@setTitle, title)
}

public fun Window.setUrgencyHint(urgent: Boolean): Unit {
  gdk_window_set_urgency_hint(this@setUrgencyHint, urgent.toInt())
}

public fun Window.setUserData(userData: Object?): Unit {
  gdk_window_set_user_data(this@setUserData, userData?.reinterpret())
}

public fun Window.show(): Unit {
  gdk_window_show(this@show)
}

public fun Window.showUnraised(): Unit {
  gdk_window_show_unraised(this@showUnraised)
}

public fun Window.stick(): Unit {
  gdk_window_stick(this@stick)
}

public fun Window.thawUpdates(): Unit {
  gdk_window_thaw_updates(this@thawUpdates)
}

public fun Window.unfullscreen(): Unit {
  gdk_window_unfullscreen(this@unfullscreen)
}

public fun Window.unmaximize(): Unit {
  gdk_window_unmaximize(this@unmaximize)
}

public fun Window.unstick(): Unit {
  gdk_window_unstick(this@unstick)
}

public fun Window.withdraw(): Unit {
  gdk_window_withdraw(this@withdraw)
}

public fun Window.onCreateSurface(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("create-surface") { callback(this) }
  return this
}

public fun Window.onFromEmbedder(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("from-embedder") { callback(this) }
  return this
}

public fun Window.onMovedToRect(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("moved-to-rect") { callback(this) }
  return this
}

public fun Window.onPickEmbeddedChild(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("pick-embedded-child") { callback(this) }
  return this
}

public fun Window.onToEmbedder(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("to-embedder") { callback(this) }
  return this
}
