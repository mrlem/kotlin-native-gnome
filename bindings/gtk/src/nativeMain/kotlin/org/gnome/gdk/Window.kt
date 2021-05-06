// TODO - method: begin_draw_frame (param type)
// TODO - method: coords_from_parent (param type)
// TODO - method: coords_to_parent (param type)
// TODO - method: create_similar_image_surface (return type)
// TODO - method: create_similar_surface (return type)
// TODO - method: get_children (return type)
// TODO - method: get_children_with_user_data (return type)
// TODO - method: get_clip_region (return type)
// TODO - method: get_decorations (param type)
// TODO - method: get_device_position (param type)
// TODO - method: get_device_position_double (param type)
// TODO - method: get_drag_protocol (param type)
// TODO - method: get_frame_extents (param type)
// TODO - method: get_geometry (param type)
// TODO - method: get_origin (param type)
// TODO - method: get_position (param type)
// TODO - method: get_root_coords (param type)
// TODO - method: get_root_origin (param type)
// TODO - method: get_update_area (return type)
// TODO - method: get_user_data (param type)
// TODO - method: get_visible_region (return type)
// TODO - method: input_shape_combine_region (param type)
// TODO - method: invalidate_maybe_recurse (param type)
// TODO - method: invalidate_region (param type)
// TODO - method: mark_paint_from_clip (param type)
// TODO - method: move_region (param type)
// TODO - method: peek_children (return type)
// TODO - method: set_icon_list (param type)
// TODO - method: set_opaque_region (param type)
// TODO - method: shape_combine_region (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GError
import interop.GdkWindow
import interop.gdk_window_beep
import interop.gdk_window_begin_move_drag
import interop.gdk_window_begin_move_drag_for_device
import interop.gdk_window_begin_resize_drag
import interop.gdk_window_begin_resize_drag_for_device
import interop.gdk_window_create_gl_context
import interop.gdk_window_deiconify
import interop.gdk_window_destroy
import interop.gdk_window_end_draw_frame
import interop.gdk_window_end_paint
import interop.gdk_window_ensure_native
import interop.gdk_window_focus
import interop.gdk_window_freeze_updates
import interop.gdk_window_fullscreen
import interop.gdk_window_fullscreen_on_monitor
import interop.gdk_window_geometry_changed
import interop.gdk_window_get_accept_focus
import interop.gdk_window_get_cursor
import interop.gdk_window_get_device_cursor
import interop.gdk_window_get_device_events
import interop.gdk_window_get_display
import interop.gdk_window_get_effective_parent
import interop.gdk_window_get_effective_toplevel
import interop.gdk_window_get_event_compression
import interop.gdk_window_get_events
import interop.gdk_window_get_focus_on_map
import interop.gdk_window_get_frame_clock
import interop.gdk_window_get_fullscreen_mode
import interop.gdk_window_get_group
import interop.gdk_window_get_height
import interop.gdk_window_get_modal_hint
import interop.gdk_window_get_parent
import interop.gdk_window_get_pass_through
import interop.gdk_window_get_scale_factor
import interop.gdk_window_get_screen
import interop.gdk_window_get_source_events
import interop.gdk_window_get_state
import interop.gdk_window_get_support_multidevice
import interop.gdk_window_get_toplevel
import interop.gdk_window_get_type_hint
import interop.gdk_window_get_visual
import interop.gdk_window_get_width
import interop.gdk_window_get_window_type
import interop.gdk_window_has_native
import interop.gdk_window_hide
import interop.gdk_window_iconify
import interop.gdk_window_invalidate_rect
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
import interop.gdk_window_move_to_rect
import interop.gdk_window_new
import interop.gdk_window_raise
import interop.gdk_window_register_dnd
import interop.gdk_window_reparent
import interop.gdk_window_resize
import interop.gdk_window_restack
import interop.gdk_window_scroll
import interop.gdk_window_set_accept_focus
import interop.gdk_window_set_child_input_shapes
import interop.gdk_window_set_child_shapes
import interop.gdk_window_set_cursor
import interop.gdk_window_set_decorations
import interop.gdk_window_set_device_cursor
import interop.gdk_window_set_device_events
import interop.gdk_window_set_event_compression
import interop.gdk_window_set_events
import interop.gdk_window_set_focus_on_map
import interop.gdk_window_set_fullscreen_mode
import interop.gdk_window_set_functions
import interop.gdk_window_set_geometry_hints
import interop.gdk_window_set_group
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
import interop.gdk_window_set_source_events
import interop.gdk_window_set_startup_id
import interop.gdk_window_set_support_multidevice
import interop.gdk_window_set_title
import interop.gdk_window_set_transient_for
import interop.gdk_window_set_type_hint
import interop.gdk_window_set_urgency_hint
import interop.gdk_window_set_user_data
import interop.gdk_window_show
import interop.gdk_window_show_unraised
import interop.gdk_window_show_window_menu
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
import kotlin.Throws
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.gobject.connect

public typealias Window = CPointer<GdkWindow>

public val Window.asObject: Object
  get() = reinterpret()

public object WindowFactory {
  public fun new(
    parent: Window?,
    attributes: WindowAttr?,
    attributesMask: WindowAttributesType
  ): Window = gdk_window_new(parent?.reinterpret(), attributes?.reinterpret(),
      attributesMask.toInt())!!.reinterpret()
}

public var Window.acceptFocus: Boolean
  get() = gdk_window_get_accept_focus(this).toBoolean()
  set(`value`) {
    gdk_window_set_accept_focus(this@acceptFocus, `value`.toInt())
  }

public var Window.cursor: Cursor?
  get() = gdk_window_get_cursor(this)?.reinterpret()
  set(`value`) {
    gdk_window_set_cursor(this@cursor, `value`)
  }

public val Window.display: Display?
  get() = gdk_window_get_display(this)?.reinterpret()

public val Window.effectiveParent: Window?
  get() = gdk_window_get_effective_parent(this)?.reinterpret()

public val Window.effectiveToplevel: Window?
  get() = gdk_window_get_effective_toplevel(this)?.reinterpret()

public var Window.eventCompression: Boolean
  get() = gdk_window_get_event_compression(this).toBoolean()
  set(`value`) {
    gdk_window_set_event_compression(this@eventCompression, `value`.toInt())
  }

public var Window.events: EventMask
  get() = gdk_window_get_events(this)
  set(`value`) {
    gdk_window_set_events(this@events, `value`)
  }

public var Window.focusOnMap: Boolean
  get() = gdk_window_get_focus_on_map(this).toBoolean()
  set(`value`) {
    gdk_window_set_focus_on_map(this@focusOnMap, `value`.toInt())
  }

public val Window.frameClock: FrameClock?
  get() = gdk_window_get_frame_clock(this)?.reinterpret()

public var Window.fullscreenMode: FullscreenMode
  get() = gdk_window_get_fullscreen_mode(this)
  set(`value`) {
    gdk_window_set_fullscreen_mode(this@fullscreenMode, `value`)
  }

public var Window.group: Window?
  get() = gdk_window_get_group(this)?.reinterpret()
  set(`value`) {
    gdk_window_set_group(this@group, `value`)
  }

public val Window.height: Int
  get() = gdk_window_get_height(this)

public var Window.modalHint: Boolean
  get() = gdk_window_get_modal_hint(this).toBoolean()
  set(`value`) {
    gdk_window_set_modal_hint(this@modalHint, `value`.toInt())
  }

public val Window.parent: Window?
  get() = gdk_window_get_parent(this)?.reinterpret()

public var Window.passThrough: Boolean
  get() = gdk_window_get_pass_through(this).toBoolean()
  set(`value`) {
    gdk_window_set_pass_through(this@passThrough, `value`.toInt())
  }

public val Window.scaleFactor: Int
  get() = gdk_window_get_scale_factor(this)

public val Window.screen: Screen?
  get() = gdk_window_get_screen(this)?.reinterpret()

public val Window.state: WindowState
  get() = gdk_window_get_state(this)

public var Window.supportMultidevice: Boolean
  get() = gdk_window_get_support_multidevice(this).toBoolean()
  set(`value`) {
    gdk_window_set_support_multidevice(this@supportMultidevice, `value`.toInt())
  }

public val Window.toplevel: Window?
  get() = gdk_window_get_toplevel(this)?.reinterpret()

public var Window.typeHint: WindowTypeHint
  get() = gdk_window_get_type_hint(this)
  set(`value`) {
    gdk_window_set_type_hint(this@typeHint, `value`)
  }

public val Window.visual: Visual?
  get() = gdk_window_get_visual(this)?.reinterpret()

public val Window.width: Int
  get() = gdk_window_get_width(this)

public val Window.windowType: WindowType
  get() = gdk_window_get_window_type(this)

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

public fun Window.beginMoveDragForDevice(
  device: Device?,
  button: Int,
  rootX: Int,
  rootY: Int,
  timestamp: UInt
): Unit {
  gdk_window_begin_move_drag_for_device(this@beginMoveDragForDevice, device?.reinterpret(), button,
      rootX, rootY, timestamp)
}

public fun Window.beginResizeDrag(
  edge: WindowEdge,
  button: Int,
  rootX: Int,
  rootY: Int,
  timestamp: UInt
): Unit {
  gdk_window_begin_resize_drag(this@beginResizeDrag, edge, button, rootX, rootY, timestamp)
}

public fun Window.beginResizeDragForDevice(
  edge: WindowEdge,
  device: Device?,
  button: Int,
  rootX: Int,
  rootY: Int,
  timestamp: UInt
): Unit {
  gdk_window_begin_resize_drag_for_device(this@beginResizeDragForDevice, edge,
      device?.reinterpret(), button, rootX, rootY, timestamp)
}

@Throws(Error::class)
public fun Window.createGlContext(): GLContext? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: GLContext? = gdk_window_create_gl_context(this@createGlContext, errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Window.deiconify(): Unit {
  gdk_window_deiconify(this@deiconify)
}

public fun Window.destroy(): Unit {
  gdk_window_destroy(this@destroy)
}

public fun Window.endDrawFrame(context: DrawingContext?): Unit {
  gdk_window_end_draw_frame(this@endDrawFrame, context?.reinterpret())
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

public fun Window.getDeviceCursor(device: Device?): Cursor? =
    gdk_window_get_device_cursor(this@getDeviceCursor, device?.reinterpret())?.reinterpret()

public fun Window.getDeviceEvents(device: Device?): EventMask =
    gdk_window_get_device_events(this@getDeviceEvents, device?.reinterpret())

public fun Window.getSourceEvents(source: InputSource): EventMask =
    gdk_window_get_source_events(this@getSourceEvents, source)

public fun Window.hasNative(): Boolean = gdk_window_has_native(this@hasNative).toBoolean()

public fun Window.hide(): Unit {
  gdk_window_hide(this@hide)
}

public fun Window.iconify(): Unit {
  gdk_window_iconify(this@iconify)
}

public fun Window.invalidateRect(rect: Rectangle?, invalidateChildren: Boolean): Unit {
  gdk_window_invalidate_rect(this@invalidateRect, rect?.reinterpret(), invalidateChildren.toInt())
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

public fun Window.moveToRect(
  rect: Rectangle?,
  rectAnchor: Gravity,
  windowAnchor: Gravity,
  anchorHints: AnchorHints,
  rectAnchorDx: Int,
  rectAnchorDy: Int
): Unit {
  gdk_window_move_to_rect(this@moveToRect, rect?.reinterpret(), rectAnchor, windowAnchor,
      anchorHints, rectAnchorDx, rectAnchorDy)
}

public fun Window.raise(): Unit {
  gdk_window_raise(this@raise)
}

public fun Window.registerDnd(): Unit {
  gdk_window_register_dnd(this@registerDnd)
}

public fun Window.reparent(
  newParent: Window?,
  x: Int,
  y: Int
): Unit {
  gdk_window_reparent(this@reparent, newParent?.reinterpret(), x, y)
}

public fun Window.resize(width: Int, height: Int): Unit {
  gdk_window_resize(this@resize, width, height)
}

public fun Window.restack(sibling: Window?, above: Boolean): Unit {
  gdk_window_restack(this@restack, sibling?.reinterpret(), above.toInt())
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

public fun Window.setDecorations(decorations: WMDecoration): Unit {
  gdk_window_set_decorations(this@setDecorations, decorations)
}

public fun Window.setDeviceCursor(device: Device?, cursor: Cursor?): Unit {
  gdk_window_set_device_cursor(this@setDeviceCursor, device?.reinterpret(), cursor?.reinterpret())
}

public fun Window.setDeviceEvents(device: Device?, eventMask: EventMask): Unit {
  gdk_window_set_device_events(this@setDeviceEvents, device?.reinterpret(), eventMask)
}

public fun Window.setFunctions(functions: WMFunction): Unit {
  gdk_window_set_functions(this@setFunctions, functions)
}

public fun Window.setGeometryHints(geometry: Geometry?, geomMask: WindowHints): Unit {
  gdk_window_set_geometry_hints(this@setGeometryHints, geometry?.reinterpret(), geomMask)
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

public fun Window.setSourceEvents(source: InputSource, eventMask: EventMask): Unit {
  gdk_window_set_source_events(this@setSourceEvents, source, eventMask)
}

public fun Window.setStartupId(startupId: String?): Unit {
  gdk_window_set_startup_id(this@setStartupId, startupId)
}

public fun Window.setTitle(title: String?): Unit {
  gdk_window_set_title(this@setTitle, title)
}

public fun Window.setTransientFor(parent: Window?): Unit {
  gdk_window_set_transient_for(this@setTransientFor, parent?.reinterpret())
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

public fun Window.showWindowMenu(event: Event?): Boolean =
    gdk_window_show_window_menu(this@showWindowMenu, event?.reinterpret()).toBoolean()

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
