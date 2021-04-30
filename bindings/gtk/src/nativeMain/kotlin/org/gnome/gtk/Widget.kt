// TODO - constructor: new
// TODO - method: add_accelerator
// TODO - method: add_device_events
// TODO - method: add_tick_callback
// TODO - method: class_path
// TODO - method: create_pango_context
// TODO - method: create_pango_layout
// TODO - method: destroyed
// TODO - method: device_is_shadowed
// TODO - method: drag_begin
// TODO - method: drag_begin_with_coordinates
// TODO - method: drag_dest_find_target
// TODO - method: drag_dest_set
// TODO - method: drag_dest_set_proxy
// TODO - method: drag_get_data
// TODO - method: drag_source_set
// TODO - method: drag_source_set_icon_pixbuf
// TODO - method: drag_source_set_icon_stock
// TODO - method: draw
// TODO - method: ensure_style
// TODO - method: event
// TODO - method: get_accessible
// TODO - method: get_allocated_size
// TODO - method: get_allocation
// TODO - method: get_child_requisition
// TODO - method: get_clip
// TODO - method: get_clipboard
// TODO - method: get_composite_name
// TODO - method: get_device_enabled
// TODO - method: get_device_events
// TODO - method: get_display
// TODO - method: get_font_map
// TODO - method: get_font_options
// TODO - method: get_frame_clock
// TODO - method: get_margin_left
// TODO - method: get_margin_right
// TODO - method: get_modifier_mask
// TODO - method: get_modifier_style
// TODO - method: get_pango_context
// TODO - method: get_parent_window
// TODO - method: get_pointer
// TODO - method: get_preferred_height
// TODO - method: get_preferred_height_and_baseline_for_width
// TODO - method: get_preferred_height_for_width
// TODO - method: get_preferred_size
// TODO - method: get_preferred_width
// TODO - method: get_preferred_width_for_height
// TODO - method: get_requisition
// TODO - method: get_root_window
// TODO - method: get_screen
// TODO - method: get_size_request
// TODO - method: get_state
// TODO - method: get_style
// TODO - method: get_visual
// TODO - method: get_window
// TODO - method: has_rc_style
// TODO - method: input_shape_combine_region
// TODO - method: intersect
// TODO - method: is_composited
// TODO - method: list_accel_closures
// TODO - method: list_action_prefixes
// TODO - method: list_mnemonic_labels
// TODO - method: modify_base
// TODO - method: modify_bg
// TODO - method: modify_cursor
// TODO - method: modify_fg
// TODO - method: modify_font
// TODO - method: modify_style
// TODO - method: modify_text
// TODO - method: override_background_color
// TODO - method: override_color
// TODO - method: override_cursor
// TODO - method: override_font
// TODO - method: override_symbolic_color
// TODO - method: path
// TODO - method: queue_draw_region
// TODO - method: region_intersect
// TODO - method: register_window
// TODO - method: remove_accelerator
// TODO - method: render_icon
// TODO - method: render_icon_pixbuf
// TODO - method: reparent
// TODO - method: reset_rc_styles
// TODO - method: send_expose
// TODO - method: send_focus_change
// TODO - method: set_composite_name
// TODO - method: set_device_enabled
// TODO - method: set_device_events
// TODO - method: set_font_map
// TODO - method: set_font_options
// TODO - method: set_margin_left
// TODO - method: set_margin_right
// TODO - method: set_parent_window
// TODO - method: set_state
// TODO - method: set_style
// TODO - method: set_visual
// TODO - method: set_window
// TODO - method: shape_combine_region
// TODO - method: size_request
// TODO - method: style_attach
// TODO - method: style_get
// TODO - method: style_get_valist
// TODO - method: translate_coordinates
// TODO - method: unregister_window
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GType
import interop.GtkWidget
import interop.gtk_drag_check_threshold
import interop.gtk_drag_dest_add_image_targets
import interop.gtk_drag_dest_add_text_targets
import interop.gtk_drag_dest_add_uri_targets
import interop.gtk_drag_dest_get_target_list
import interop.gtk_drag_dest_get_track_motion
import interop.gtk_drag_dest_set_target_list
import interop.gtk_drag_dest_set_track_motion
import interop.gtk_drag_dest_unset
import interop.gtk_drag_highlight
import interop.gtk_drag_source_add_image_targets
import interop.gtk_drag_source_add_text_targets
import interop.gtk_drag_source_add_uri_targets
import interop.gtk_drag_source_get_target_list
import interop.gtk_drag_source_set_icon_gicon
import interop.gtk_drag_source_set_icon_name
import interop.gtk_drag_source_set_target_list
import interop.gtk_drag_source_unset
import interop.gtk_drag_unhighlight
import interop.gtk_grab_add
import interop.gtk_grab_remove
import interop.gtk_widget_activate
import interop.gtk_widget_add_events
import interop.gtk_widget_add_mnemonic_label
import interop.gtk_widget_can_activate_accel
import interop.gtk_widget_child_focus
import interop.gtk_widget_child_notify
import interop.gtk_widget_compute_expand
import interop.gtk_widget_destroy
import interop.gtk_widget_error_bell
import interop.gtk_widget_freeze_child_notify
import interop.gtk_widget_get_action_group
import interop.gtk_widget_get_allocated_baseline
import interop.gtk_widget_get_allocated_height
import interop.gtk_widget_get_allocated_width
import interop.gtk_widget_get_ancestor
import interop.gtk_widget_get_app_paintable
import interop.gtk_widget_get_can_default
import interop.gtk_widget_get_can_focus
import interop.gtk_widget_get_child_visible
import interop.gtk_widget_get_direction
import interop.gtk_widget_get_double_buffered
import interop.gtk_widget_get_events
import interop.gtk_widget_get_focus_on_click
import interop.gtk_widget_get_halign
import interop.gtk_widget_get_has_tooltip
import interop.gtk_widget_get_has_window
import interop.gtk_widget_get_hexpand
import interop.gtk_widget_get_hexpand_set
import interop.gtk_widget_get_mapped
import interop.gtk_widget_get_margin_bottom
import interop.gtk_widget_get_margin_end
import interop.gtk_widget_get_margin_start
import interop.gtk_widget_get_margin_top
import interop.gtk_widget_get_name
import interop.gtk_widget_get_no_show_all
import interop.gtk_widget_get_opacity
import interop.gtk_widget_get_parent
import interop.gtk_widget_get_path
import interop.gtk_widget_get_realized
import interop.gtk_widget_get_receives_default
import interop.gtk_widget_get_request_mode
import interop.gtk_widget_get_scale_factor
import interop.gtk_widget_get_sensitive
import interop.gtk_widget_get_settings
import interop.gtk_widget_get_state_flags
import interop.gtk_widget_get_style_context
import interop.gtk_widget_get_support_multidevice
import interop.gtk_widget_get_template_child
import interop.gtk_widget_get_tooltip_markup
import interop.gtk_widget_get_tooltip_text
import interop.gtk_widget_get_tooltip_window
import interop.gtk_widget_get_toplevel
import interop.gtk_widget_get_valign
import interop.gtk_widget_get_valign_with_baseline
import interop.gtk_widget_get_vexpand
import interop.gtk_widget_get_vexpand_set
import interop.gtk_widget_get_visible
import interop.gtk_widget_grab_default
import interop.gtk_widget_grab_focus
import interop.gtk_widget_has_default
import interop.gtk_widget_has_focus
import interop.gtk_widget_has_grab
import interop.gtk_widget_has_screen
import interop.gtk_widget_has_visible_focus
import interop.gtk_widget_hide
import interop.gtk_widget_hide_on_delete
import interop.gtk_widget_in_destruction
import interop.gtk_widget_init_template
import interop.gtk_widget_insert_action_group
import interop.gtk_widget_is_ancestor
import interop.gtk_widget_is_drawable
import interop.gtk_widget_is_focus
import interop.gtk_widget_is_sensitive
import interop.gtk_widget_is_toplevel
import interop.gtk_widget_is_visible
import interop.gtk_widget_keynav_failed
import interop.gtk_widget_map
import interop.gtk_widget_mnemonic_activate
import interop.gtk_widget_queue_allocate
import interop.gtk_widget_queue_compute_expand
import interop.gtk_widget_queue_draw
import interop.gtk_widget_queue_draw_area
import interop.gtk_widget_queue_resize
import interop.gtk_widget_queue_resize_no_redraw
import interop.gtk_widget_realize
import interop.gtk_widget_remove_mnemonic_label
import interop.gtk_widget_remove_tick_callback
import interop.gtk_widget_reset_style
import interop.gtk_widget_set_accel_path
import interop.gtk_widget_set_allocation
import interop.gtk_widget_set_app_paintable
import interop.gtk_widget_set_can_default
import interop.gtk_widget_set_can_focus
import interop.gtk_widget_set_child_visible
import interop.gtk_widget_set_clip
import interop.gtk_widget_set_direction
import interop.gtk_widget_set_double_buffered
import interop.gtk_widget_set_events
import interop.gtk_widget_set_focus_on_click
import interop.gtk_widget_set_halign
import interop.gtk_widget_set_has_tooltip
import interop.gtk_widget_set_has_window
import interop.gtk_widget_set_hexpand
import interop.gtk_widget_set_hexpand_set
import interop.gtk_widget_set_mapped
import interop.gtk_widget_set_margin_bottom
import interop.gtk_widget_set_margin_end
import interop.gtk_widget_set_margin_start
import interop.gtk_widget_set_margin_top
import interop.gtk_widget_set_name
import interop.gtk_widget_set_no_show_all
import interop.gtk_widget_set_opacity
import interop.gtk_widget_set_parent
import interop.gtk_widget_set_realized
import interop.gtk_widget_set_receives_default
import interop.gtk_widget_set_redraw_on_allocate
import interop.gtk_widget_set_sensitive
import interop.gtk_widget_set_size_request
import interop.gtk_widget_set_state_flags
import interop.gtk_widget_set_support_multidevice
import interop.gtk_widget_set_tooltip_markup
import interop.gtk_widget_set_tooltip_text
import interop.gtk_widget_set_tooltip_window
import interop.gtk_widget_set_valign
import interop.gtk_widget_set_vexpand
import interop.gtk_widget_set_vexpand_set
import interop.gtk_widget_set_visible
import interop.gtk_widget_show
import interop.gtk_widget_show_all
import interop.gtk_widget_show_now
import interop.gtk_widget_size_allocate
import interop.gtk_widget_size_allocate_with_baseline
import interop.gtk_widget_style_get_property
import interop.gtk_widget_thaw_child_notify
import interop.gtk_widget_trigger_tooltip_query
import interop.gtk_widget_unmap
import interop.gtk_widget_unparent
import interop.gtk_widget_unrealize
import interop.gtk_widget_unset_state_flags
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.ActionGroup
import org.gnome.gio.Icon
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Widget = CPointer<GtkWidget>

public val Widget.asObject: Object
  get() = reinterpret()

public val Widget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public object WidgetFactory

public val Widget.parentInstance: InitiallyUnowned
  get() = pointed.parent_instance.ptr

public val Widget.allocatedBaseline: Int
  get() = gtk_widget_get_allocated_baseline(this)

public val Widget.allocatedHeight: Int
  get() = gtk_widget_get_allocated_height(this)

public val Widget.allocatedWidth: Int
  get() = gtk_widget_get_allocated_width(this)

public var Widget.appPaintable: Boolean
  get() = gtk_widget_get_app_paintable(this).toBoolean
  set(`value`) {
    gtk_widget_set_app_paintable(this, value.toInt)
  }

public var Widget.canDefault: Boolean
  get() = gtk_widget_get_can_default(this).toBoolean
  set(`value`) {
    gtk_widget_set_can_default(this, value.toInt)
  }

public var Widget.canFocus: Boolean
  get() = gtk_widget_get_can_focus(this).toBoolean
  set(`value`) {
    gtk_widget_set_can_focus(this, value.toInt)
  }

public var Widget.childVisible: Boolean
  get() = gtk_widget_get_child_visible(this).toBoolean
  set(`value`) {
    gtk_widget_set_child_visible(this, value.toInt)
  }

public var Widget.direction: TextDirection
  get() = gtk_widget_get_direction(this)
  set(`value`) {
    gtk_widget_set_direction(this, value)
  }

public var Widget.doubleBuffered: Boolean
  get() = gtk_widget_get_double_buffered(this).toBoolean
  set(`value`) {
    gtk_widget_set_double_buffered(this, value.toInt)
  }

public var Widget.events: Int
  get() = gtk_widget_get_events(this)
  set(`value`) {
    gtk_widget_set_events(this, value)
  }

public var Widget.focusOnClick: Boolean
  get() = gtk_widget_get_focus_on_click(this).toBoolean
  set(`value`) {
    gtk_widget_set_focus_on_click(this, value.toInt)
  }

public var Widget.halign: Align
  get() = gtk_widget_get_halign(this)
  set(`value`) {
    gtk_widget_set_halign(this, value)
  }

public var Widget.hasTooltip: Boolean
  get() = gtk_widget_get_has_tooltip(this).toBoolean
  set(`value`) {
    gtk_widget_set_has_tooltip(this, value.toInt)
  }

public var Widget.hasWindow: Boolean
  get() = gtk_widget_get_has_window(this).toBoolean
  set(`value`) {
    gtk_widget_set_has_window(this, value.toInt)
  }

public var Widget.hexpand: Boolean
  get() = gtk_widget_get_hexpand(this).toBoolean
  set(`value`) {
    gtk_widget_set_hexpand(this, value.toInt)
  }

public var Widget.hexpandSet: Boolean
  get() = gtk_widget_get_hexpand_set(this).toBoolean
  set(`value`) {
    gtk_widget_set_hexpand_set(this, value.toInt)
  }

public var Widget.mapped: Boolean
  get() = gtk_widget_get_mapped(this).toBoolean
  set(`value`) {
    gtk_widget_set_mapped(this, value.toInt)
  }

public var Widget.marginBottom: Int
  get() = gtk_widget_get_margin_bottom(this)
  set(`value`) {
    gtk_widget_set_margin_bottom(this, value)
  }

public var Widget.marginEnd: Int
  get() = gtk_widget_get_margin_end(this)
  set(`value`) {
    gtk_widget_set_margin_end(this, value)
  }

public var Widget.marginStart: Int
  get() = gtk_widget_get_margin_start(this)
  set(`value`) {
    gtk_widget_set_margin_start(this, value)
  }

public var Widget.marginTop: Int
  get() = gtk_widget_get_margin_top(this)
  set(`value`) {
    gtk_widget_set_margin_top(this, value)
  }

public var Widget.name: String
  get() = gtk_widget_get_name(this).toKString
  set(`value`) {
    gtk_widget_set_name(this, value)
  }

public var Widget.noShowAll: Boolean
  get() = gtk_widget_get_no_show_all(this).toBoolean
  set(`value`) {
    gtk_widget_set_no_show_all(this, value.toInt)
  }

public var Widget.opacity: Double
  get() = gtk_widget_get_opacity(this)
  set(`value`) {
    gtk_widget_set_opacity(this, value)
  }

public var Widget.parent: Widget?
  get() = gtk_widget_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_parent(this, value)
  }

public val Widget.path: WidgetPath?
  get() = gtk_widget_get_path(this)?.reinterpret()

public var Widget.realized: Boolean
  get() = gtk_widget_get_realized(this).toBoolean
  set(`value`) {
    gtk_widget_set_realized(this, value.toInt)
  }

public var Widget.receivesDefault: Boolean
  get() = gtk_widget_get_receives_default(this).toBoolean
  set(`value`) {
    gtk_widget_set_receives_default(this, value.toInt)
  }

public val Widget.requestMode: SizeRequestMode
  get() = gtk_widget_get_request_mode(this)

public val Widget.scaleFactor: Int
  get() = gtk_widget_get_scale_factor(this)

public var Widget.sensitive: Boolean
  get() = gtk_widget_get_sensitive(this).toBoolean
  set(`value`) {
    gtk_widget_set_sensitive(this, value.toInt)
  }

public val Widget.settings: Settings?
  get() = gtk_widget_get_settings(this)?.reinterpret()

public val Widget.stateFlags: StateFlags
  get() = gtk_widget_get_state_flags(this)

public val Widget.styleContext: StyleContext?
  get() = gtk_widget_get_style_context(this)?.reinterpret()

public var Widget.supportMultidevice: Boolean
  get() = gtk_widget_get_support_multidevice(this).toBoolean
  set(`value`) {
    gtk_widget_set_support_multidevice(this, value.toInt)
  }

public var Widget.tooltipMarkup: String
  get() = gtk_widget_get_tooltip_markup(this).toKString
  set(`value`) {
    gtk_widget_set_tooltip_markup(this, value)
  }

public var Widget.tooltipText: String
  get() = gtk_widget_get_tooltip_text(this).toKString
  set(`value`) {
    gtk_widget_set_tooltip_text(this, value)
  }

public var Widget.tooltipWindow: Window?
  get() = gtk_widget_get_tooltip_window(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_tooltip_window(this, value)
  }

public val Widget.toplevel: Widget?
  get() = gtk_widget_get_toplevel(this)?.reinterpret()

public var Widget.valign: Align
  get() = gtk_widget_get_valign(this)
  set(`value`) {
    gtk_widget_set_valign(this, value)
  }

public val Widget.valignWithBaseline: Align
  get() = gtk_widget_get_valign_with_baseline(this)

public var Widget.vexpand: Boolean
  get() = gtk_widget_get_vexpand(this).toBoolean
  set(`value`) {
    gtk_widget_set_vexpand(this, value.toInt)
  }

public var Widget.vexpandSet: Boolean
  get() = gtk_widget_get_vexpand_set(this).toBoolean
  set(`value`) {
    gtk_widget_set_vexpand_set(this, value.toInt)
  }

public var Widget.visible: Boolean
  get() = gtk_widget_get_visible(this).toBoolean
  set(`value`) {
    gtk_widget_set_visible(this, value.toInt)
  }

public fun Widget.activate(): Boolean = gtk_widget_activate(this).toBoolean

public fun Widget.addEvents(events: Int): Unit {
  gtk_widget_add_events(this, events)
}

public fun Widget.addMnemonicLabel(label: Widget?): Unit {
  gtk_widget_add_mnemonic_label(this, label?.reinterpret())
}

public fun Widget.canActivateAccel(signalId: UInt): Boolean = gtk_widget_can_activate_accel(this,
    signalId).toBoolean

public fun Widget.childFocus(direction: DirectionType): Boolean = gtk_widget_child_focus(this,
    direction).toBoolean

public fun Widget.childNotify(childProperty: String): Unit {
  gtk_widget_child_notify(this, childProperty)
}

public fun Widget.computeExpand(orientation: Orientation): Boolean = gtk_widget_compute_expand(this,
    orientation).toBoolean

public fun Widget.destroy(): Unit {
  gtk_widget_destroy(this)
}

public fun Widget.dragCheckThreshold(
  startX: Int,
  startY: Int,
  currentX: Int,
  currentY: Int
): Boolean = gtk_drag_check_threshold(this, startX, startY, currentX, currentY).toBoolean

public fun Widget.dragDestAddImageTargets(): Unit {
  gtk_drag_dest_add_image_targets(this)
}

public fun Widget.dragDestAddTextTargets(): Unit {
  gtk_drag_dest_add_text_targets(this)
}

public fun Widget.dragDestAddUriTargets(): Unit {
  gtk_drag_dest_add_uri_targets(this)
}

public fun Widget.dragDestGetTargetList(): TargetList? =
    gtk_drag_dest_get_target_list(this)?.reinterpret()

public fun Widget.dragDestGetTrackMotion(): Boolean = gtk_drag_dest_get_track_motion(this).toBoolean

public fun Widget.dragDestSetTargetList(targetList: TargetList?): Unit {
  gtk_drag_dest_set_target_list(this, targetList?.reinterpret())
}

public fun Widget.dragDestSetTrackMotion(trackMotion: Boolean): Unit {
  gtk_drag_dest_set_track_motion(this, trackMotion.toInt)
}

public fun Widget.dragDestUnset(): Unit {
  gtk_drag_dest_unset(this)
}

public fun Widget.dragHighlight(): Unit {
  gtk_drag_highlight(this)
}

public fun Widget.dragSourceAddImageTargets(): Unit {
  gtk_drag_source_add_image_targets(this)
}

public fun Widget.dragSourceAddTextTargets(): Unit {
  gtk_drag_source_add_text_targets(this)
}

public fun Widget.dragSourceAddUriTargets(): Unit {
  gtk_drag_source_add_uri_targets(this)
}

public fun Widget.dragSourceGetTargetList(): TargetList? =
    gtk_drag_source_get_target_list(this)?.reinterpret()

public fun Widget.dragSourceSetIconGicon(icon: Icon?): Unit {
  gtk_drag_source_set_icon_gicon(this, icon?.reinterpret())
}

public fun Widget.dragSourceSetIconName(iconName: String): Unit {
  gtk_drag_source_set_icon_name(this, iconName)
}

public fun Widget.dragSourceSetTargetList(targetList: TargetList?): Unit {
  gtk_drag_source_set_target_list(this, targetList?.reinterpret())
}

public fun Widget.dragSourceUnset(): Unit {
  gtk_drag_source_unset(this)
}

public fun Widget.dragUnhighlight(): Unit {
  gtk_drag_unhighlight(this)
}

public fun Widget.errorBell(): Unit {
  gtk_widget_error_bell(this)
}

public fun Widget.freezeChildNotify(): Unit {
  gtk_widget_freeze_child_notify(this)
}

public fun Widget.getActionGroup(prefix: String): ActionGroup? = gtk_widget_get_action_group(this,
    prefix)?.reinterpret()

public fun Widget.getAncestor(widgetType: GType): Widget? = gtk_widget_get_ancestor(this,
    widgetType)?.reinterpret()

public fun Widget.getTemplateChild(widgetType: GType, name: String): Object? =
    gtk_widget_get_template_child(this, widgetType, name)?.reinterpret()

public fun Widget.grabAdd(): Unit {
  gtk_grab_add(this)
}

public fun Widget.grabDefault(): Unit {
  gtk_widget_grab_default(this)
}

public fun Widget.grabFocus(): Unit {
  gtk_widget_grab_focus(this)
}

public fun Widget.grabRemove(): Unit {
  gtk_grab_remove(this)
}

public fun Widget.hasDefault(): Boolean = gtk_widget_has_default(this).toBoolean

public fun Widget.hasFocus(): Boolean = gtk_widget_has_focus(this).toBoolean

public fun Widget.hasGrab(): Boolean = gtk_widget_has_grab(this).toBoolean

public fun Widget.hasScreen(): Boolean = gtk_widget_has_screen(this).toBoolean

public fun Widget.hasVisibleFocus(): Boolean = gtk_widget_has_visible_focus(this).toBoolean

public fun Widget.hide(): Unit {
  gtk_widget_hide(this)
}

public fun Widget.hideOnDelete(): Boolean = gtk_widget_hide_on_delete(this).toBoolean

public fun Widget.inDestruction(): Boolean = gtk_widget_in_destruction(this).toBoolean

public fun Widget.initTemplate(): Unit {
  gtk_widget_init_template(this)
}

public fun Widget.insertActionGroup(name: String, group: ActionGroup?): Unit {
  gtk_widget_insert_action_group(this, name, group?.reinterpret())
}

public fun Widget.isAncestor(ancestor: Widget?): Boolean = gtk_widget_is_ancestor(this,
    ancestor?.reinterpret()).toBoolean

public fun Widget.isDrawable(): Boolean = gtk_widget_is_drawable(this).toBoolean

public fun Widget.isFocus(): Boolean = gtk_widget_is_focus(this).toBoolean

public fun Widget.isSensitive(): Boolean = gtk_widget_is_sensitive(this).toBoolean

public fun Widget.isToplevel(): Boolean = gtk_widget_is_toplevel(this).toBoolean

public fun Widget.isVisible(): Boolean = gtk_widget_is_visible(this).toBoolean

public fun Widget.keynavFailed(direction: DirectionType): Boolean = gtk_widget_keynav_failed(this,
    direction).toBoolean

public fun Widget.map(): Unit {
  gtk_widget_map(this)
}

public fun Widget.mnemonicActivate(groupCycling: Boolean): Boolean =
    gtk_widget_mnemonic_activate(this, groupCycling.toInt).toBoolean

public fun Widget.queueAllocate(): Unit {
  gtk_widget_queue_allocate(this)
}

public fun Widget.queueComputeExpand(): Unit {
  gtk_widget_queue_compute_expand(this)
}

public fun Widget.queueDraw(): Unit {
  gtk_widget_queue_draw(this)
}

public fun Widget.queueDrawArea(
  x: Int,
  y: Int,
  width: Int,
  height: Int
): Unit {
  gtk_widget_queue_draw_area(this, x, y, width, height)
}

public fun Widget.queueResize(): Unit {
  gtk_widget_queue_resize(this)
}

public fun Widget.queueResizeNoRedraw(): Unit {
  gtk_widget_queue_resize_no_redraw(this)
}

public fun Widget.realize(): Unit {
  gtk_widget_realize(this)
}

public fun Widget.removeMnemonicLabel(label: Widget?): Unit {
  gtk_widget_remove_mnemonic_label(this, label?.reinterpret())
}

public fun Widget.removeTickCallback(id: UInt): Unit {
  gtk_widget_remove_tick_callback(this, id)
}

public fun Widget.resetStyle(): Unit {
  gtk_widget_reset_style(this)
}

public fun Widget.setAccelPath(accelPath: String, accelGroup: AccelGroup?): Unit {
  gtk_widget_set_accel_path(this, accelPath, accelGroup?.reinterpret())
}

public fun Widget.setAllocation(allocation: Allocation): Unit {
  gtk_widget_set_allocation(this, allocation)
}

public fun Widget.setClip(clip: Allocation): Unit {
  gtk_widget_set_clip(this, clip)
}

public fun Widget.setRedrawOnAllocate(redrawOnAllocate: Boolean): Unit {
  gtk_widget_set_redraw_on_allocate(this, redrawOnAllocate.toInt)
}

public fun Widget.setSizeRequest(width: Int, height: Int): Unit {
  gtk_widget_set_size_request(this, width, height)
}

public fun Widget.setStateFlags(flags: StateFlags, clear: Boolean): Unit {
  gtk_widget_set_state_flags(this, flags, clear.toInt)
}

public fun Widget.show(): Unit {
  gtk_widget_show(this)
}

public fun Widget.showAll(): Unit {
  gtk_widget_show_all(this)
}

public fun Widget.showNow(): Unit {
  gtk_widget_show_now(this)
}

public fun Widget.sizeAllocate(allocation: Allocation): Unit {
  gtk_widget_size_allocate(this, allocation)
}

public fun Widget.sizeAllocateWithBaseline(allocation: Allocation, baseline: Int): Unit {
  gtk_widget_size_allocate_with_baseline(this, allocation, baseline)
}

public fun Widget.styleGetProperty(propertyName: String, `value`: Value?): Unit {
  gtk_widget_style_get_property(this, propertyName, value?.reinterpret())
}

public fun Widget.thawChildNotify(): Unit {
  gtk_widget_thaw_child_notify(this)
}

public fun Widget.triggerTooltipQuery(): Unit {
  gtk_widget_trigger_tooltip_query(this)
}

public fun Widget.unmap(): Unit {
  gtk_widget_unmap(this)
}

public fun Widget.unparent(): Unit {
  gtk_widget_unparent(this)
}

public fun Widget.unrealize(): Unit {
  gtk_widget_unrealize(this)
}

public fun Widget.unsetStateFlags(flags: StateFlags): Unit {
  gtk_widget_unset_state_flags(this, flags)
}

public fun Widget.onAccelClosuresChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("accel-closures-changed") { callback(this) }
  return this
}

public fun Widget.onButtonPressEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("button-press-event") { callback(this) }
  return this
}

public fun Widget.onButtonReleaseEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("button-release-event") { callback(this) }
  return this
}

public fun Widget.onCanActivateAccel(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("can-activate-accel") { callback(this) }
  return this
}

public fun Widget.onChildNotify(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("child-notify") { callback(this) }
  return this
}

public fun Widget.onCompositedChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("composited-changed") { callback(this) }
  return this
}

public fun Widget.onConfigureEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("configure-event") { callback(this) }
  return this
}

public fun Widget.onDamageEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("damage-event") { callback(this) }
  return this
}

public fun Widget.onDeleteEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("delete-event") { callback(this) }
  return this
}

public fun Widget.onDestroy(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("destroy") { callback(this) }
  return this
}

public fun Widget.onDestroyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("destroy-event") { callback(this) }
  return this
}

public fun Widget.onDirectionChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("direction-changed") { callback(this) }
  return this
}

public fun Widget.onDragBegin(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-begin") { callback(this) }
  return this
}

public fun Widget.onDragDataDelete(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-data-delete") { callback(this) }
  return this
}

public fun Widget.onDragDataGet(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-data-get") { callback(this) }
  return this
}

public fun Widget.onDragDataReceived(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-data-received") { callback(this) }
  return this
}

public fun Widget.onDragDrop(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-drop") { callback(this) }
  return this
}

public fun Widget.onDragEnd(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-end") { callback(this) }
  return this
}

public fun Widget.onDragFailed(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-failed") { callback(this) }
  return this
}

public fun Widget.onDragLeave(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-leave") { callback(this) }
  return this
}

public fun Widget.onDragMotion(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("drag-motion") { callback(this) }
  return this
}

public fun Widget.onDraw(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("draw") { callback(this) }
  return this
}

public fun Widget.onEnterNotifyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("enter-notify-event") { callback(this) }
  return this
}

public fun Widget.onEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}

public fun Widget.onEventAfter(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("event-after") { callback(this) }
  return this
}

public fun Widget.onFocus(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("focus") { callback(this) }
  return this
}

public fun Widget.onFocusInEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("focus-in-event") { callback(this) }
  return this
}

public fun Widget.onFocusOutEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("focus-out-event") { callback(this) }
  return this
}

public fun Widget.onGrabBrokenEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("grab-broken-event") { callback(this) }
  return this
}

public fun Widget.onGrabFocus(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("grab-focus") { callback(this) }
  return this
}

public fun Widget.onGrabNotify(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("grab-notify") { callback(this) }
  return this
}

public fun Widget.onHide(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("hide") { callback(this) }
  return this
}

public fun Widget.onHierarchyChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("hierarchy-changed") { callback(this) }
  return this
}

public fun Widget.onKeyPressEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("key-press-event") { callback(this) }
  return this
}

public fun Widget.onKeyReleaseEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("key-release-event") { callback(this) }
  return this
}

public fun Widget.onKeynavFailed(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("keynav-failed") { callback(this) }
  return this
}

public fun Widget.onLeaveNotifyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("leave-notify-event") { callback(this) }
  return this
}

public fun Widget.onMap(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("map") { callback(this) }
  return this
}

public fun Widget.onMapEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("map-event") { callback(this) }
  return this
}

public fun Widget.onMnemonicActivate(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("mnemonic-activate") { callback(this) }
  return this
}

public fun Widget.onMotionNotifyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("motion-notify-event") { callback(this) }
  return this
}

public fun Widget.onMoveFocus(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("move-focus") { callback(this) }
  return this
}

public fun Widget.onParentSet(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("parent-set") { callback(this) }
  return this
}

public fun Widget.onPopupMenu(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("popup-menu") { callback(this) }
  return this
}

public fun Widget.onPropertyNotifyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("property-notify-event") { callback(this) }
  return this
}

public fun Widget.onProximityInEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("proximity-in-event") { callback(this) }
  return this
}

public fun Widget.onProximityOutEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("proximity-out-event") { callback(this) }
  return this
}

public fun Widget.onQueryTooltip(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("query-tooltip") { callback(this) }
  return this
}

public fun Widget.onRealize(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("realize") { callback(this) }
  return this
}

public fun Widget.onScreenChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("screen-changed") { callback(this) }
  return this
}

public fun Widget.onScrollEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("scroll-event") { callback(this) }
  return this
}

public fun Widget.onSelectionClearEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("selection-clear-event") { callback(this) }
  return this
}

public fun Widget.onSelectionGet(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("selection-get") { callback(this) }
  return this
}

public fun Widget.onSelectionNotifyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("selection-notify-event") { callback(this) }
  return this
}

public fun Widget.onSelectionReceived(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("selection-received") { callback(this) }
  return this
}

public fun Widget.onSelectionRequestEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("selection-request-event") { callback(this) }
  return this
}

public fun Widget.onShow(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("show") { callback(this) }
  return this
}

public fun Widget.onShowHelp(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("show-help") { callback(this) }
  return this
}

public fun Widget.onSizeAllocate(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("size-allocate") { callback(this) }
  return this
}

public fun Widget.onStateChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("state-changed") { callback(this) }
  return this
}

public fun Widget.onStateFlagsChanged(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("state-flags-changed") { callback(this) }
  return this
}

public fun Widget.onStyleSet(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("style-set") { callback(this) }
  return this
}

public fun Widget.onStyleUpdated(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("style-updated") { callback(this) }
  return this
}

public fun Widget.onTouchEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("touch-event") { callback(this) }
  return this
}

public fun Widget.onUnmap(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("unmap") { callback(this) }
  return this
}

public fun Widget.onUnmapEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("unmap-event") { callback(this) }
  return this
}

public fun Widget.onUnrealize(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("unrealize") { callback(this) }
  return this
}

public fun Widget.onVisibilityNotifyEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("visibility-notify-event") { callback(this) }
  return this
}

public fun Widget.onWindowStateEvent(callback: (Widget) -> Unit): Widget {
  // TODO - handle callback data

  asObject.connect("window-state-event") { callback(this) }
  return this
}
