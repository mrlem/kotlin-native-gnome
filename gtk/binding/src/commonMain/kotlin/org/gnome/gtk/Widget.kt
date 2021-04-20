// TODO - add_accelerator
// TODO - add_device_events
// TODO - add_tick_callback
// TODO - class_path
// TODO - create_pango_context
// TODO - create_pango_layout
// TODO - destroyed
// TODO - device_is_shadowed
// TODO - drag_begin
// TODO - drag_begin_with_coordinates
// TODO - drag_dest_find_target
// TODO - drag_dest_set
// TODO - drag_dest_set_proxy
// TODO - drag_get_data
// TODO - drag_source_set
// TODO - drag_source_set_icon_gicon
// TODO - drag_source_set_icon_pixbuf
// TODO - drag_source_set_icon_stock
// TODO - draw
// TODO - ensure_style
// TODO - event
// TODO - get_accessible
// TODO - get_action_group
// TODO - get_allocated_size
// TODO - get_allocation
// TODO - get_child_requisition
// TODO - get_clip
// TODO - get_clipboard
// TODO - get_composite_name
// TODO - get_device_enabled
// TODO - get_device_events
// TODO - get_display
// TODO - get_font_map
// TODO - get_font_options
// TODO - get_frame_clock
// TODO - get_margin_left
// TODO - get_margin_right
// TODO - get_modifier_mask
// TODO - get_modifier_style
// TODO - get_pango_context
// TODO - get_parent_window
// TODO - get_pointer
// TODO - get_preferred_height
// TODO - get_preferred_height_and_baseline_for_width
// TODO - get_preferred_height_for_width
// TODO - get_preferred_size
// TODO - get_preferred_width
// TODO - get_preferred_width_for_height
// TODO - get_requisition
// TODO - get_root_window
// TODO - get_screen
// TODO - get_size_request
// TODO - get_state
// TODO - get_style
// TODO - get_template_child
// TODO - get_visual
// TODO - get_window
// TODO - has_rc_style
// TODO - input_shape_combine_region
// TODO - insert_action_group
// TODO - intersect
// TODO - is_composited
// TODO - list_accel_closures
// TODO - list_action_prefixes
// TODO - list_mnemonic_labels
// TODO - modify_base
// TODO - modify_bg
// TODO - modify_cursor
// TODO - modify_fg
// TODO - modify_font
// TODO - modify_style
// TODO - modify_text
// TODO - override_background_color
// TODO - override_color
// TODO - override_cursor
// TODO - override_font
// TODO - override_symbolic_color
// TODO - path
// TODO - queue_draw_region
// TODO - region_intersect
// TODO - register_window
// TODO - remove_accelerator
// TODO - render_icon
// TODO - render_icon_pixbuf
// TODO - reparent
// TODO - reset_rc_styles
// TODO - send_expose
// TODO - send_focus_change
// TODO - set_composite_name
// TODO - set_device_enabled
// TODO - set_device_events
// TODO - set_font_map
// TODO - set_font_options
// TODO - set_margin_left
// TODO - set_margin_right
// TODO - set_parent_window
// TODO - set_state
// TODO - set_style
// TODO - set_visual
// TODO - set_window
// TODO - shape_combine_region
// TODO - size_request
// TODO - style_attach
// TODO - style_get
// TODO - style_get_property
// TODO - style_get_valist
// TODO - translate_coordinates
// TODO - unregister_window
//
package org.gnome.gtk

import gtk3.GType
import gtk3.GtkWidget
import gtk3.gtk_drag_check_threshold
import gtk3.gtk_drag_dest_add_image_targets
import gtk3.gtk_drag_dest_add_text_targets
import gtk3.gtk_drag_dest_add_uri_targets
import gtk3.gtk_drag_dest_get_target_list
import gtk3.gtk_drag_dest_get_track_motion
import gtk3.gtk_drag_dest_set_target_list
import gtk3.gtk_drag_dest_set_track_motion
import gtk3.gtk_drag_dest_unset
import gtk3.gtk_drag_highlight
import gtk3.gtk_drag_source_add_image_targets
import gtk3.gtk_drag_source_add_text_targets
import gtk3.gtk_drag_source_add_uri_targets
import gtk3.gtk_drag_source_get_target_list
import gtk3.gtk_drag_source_set_icon_name
import gtk3.gtk_drag_source_set_target_list
import gtk3.gtk_drag_source_unset
import gtk3.gtk_drag_unhighlight
import gtk3.gtk_grab_add
import gtk3.gtk_grab_remove
import gtk3.gtk_widget_activate
import gtk3.gtk_widget_add_events
import gtk3.gtk_widget_add_mnemonic_label
import gtk3.gtk_widget_can_activate_accel
import gtk3.gtk_widget_child_focus
import gtk3.gtk_widget_child_notify
import gtk3.gtk_widget_compute_expand
import gtk3.gtk_widget_destroy
import gtk3.gtk_widget_error_bell
import gtk3.gtk_widget_freeze_child_notify
import gtk3.gtk_widget_get_allocated_baseline
import gtk3.gtk_widget_get_allocated_height
import gtk3.gtk_widget_get_allocated_width
import gtk3.gtk_widget_get_ancestor
import gtk3.gtk_widget_get_app_paintable
import gtk3.gtk_widget_get_can_default
import gtk3.gtk_widget_get_can_focus
import gtk3.gtk_widget_get_child_visible
import gtk3.gtk_widget_get_direction
import gtk3.gtk_widget_get_double_buffered
import gtk3.gtk_widget_get_events
import gtk3.gtk_widget_get_focus_on_click
import gtk3.gtk_widget_get_halign
import gtk3.gtk_widget_get_has_tooltip
import gtk3.gtk_widget_get_has_window
import gtk3.gtk_widget_get_hexpand
import gtk3.gtk_widget_get_hexpand_set
import gtk3.gtk_widget_get_mapped
import gtk3.gtk_widget_get_margin_bottom
import gtk3.gtk_widget_get_margin_end
import gtk3.gtk_widget_get_margin_start
import gtk3.gtk_widget_get_margin_top
import gtk3.gtk_widget_get_name
import gtk3.gtk_widget_get_no_show_all
import gtk3.gtk_widget_get_opacity
import gtk3.gtk_widget_get_parent
import gtk3.gtk_widget_get_path
import gtk3.gtk_widget_get_realized
import gtk3.gtk_widget_get_receives_default
import gtk3.gtk_widget_get_request_mode
import gtk3.gtk_widget_get_scale_factor
import gtk3.gtk_widget_get_sensitive
import gtk3.gtk_widget_get_settings
import gtk3.gtk_widget_get_state_flags
import gtk3.gtk_widget_get_style_context
import gtk3.gtk_widget_get_support_multidevice
import gtk3.gtk_widget_get_tooltip_markup
import gtk3.gtk_widget_get_tooltip_text
import gtk3.gtk_widget_get_tooltip_window
import gtk3.gtk_widget_get_toplevel
import gtk3.gtk_widget_get_valign
import gtk3.gtk_widget_get_valign_with_baseline
import gtk3.gtk_widget_get_vexpand
import gtk3.gtk_widget_get_vexpand_set
import gtk3.gtk_widget_get_visible
import gtk3.gtk_widget_grab_default
import gtk3.gtk_widget_grab_focus
import gtk3.gtk_widget_has_default
import gtk3.gtk_widget_has_focus
import gtk3.gtk_widget_has_grab
import gtk3.gtk_widget_has_screen
import gtk3.gtk_widget_has_visible_focus
import gtk3.gtk_widget_hide
import gtk3.gtk_widget_hide_on_delete
import gtk3.gtk_widget_in_destruction
import gtk3.gtk_widget_init_template
import gtk3.gtk_widget_is_ancestor
import gtk3.gtk_widget_is_drawable
import gtk3.gtk_widget_is_focus
import gtk3.gtk_widget_is_sensitive
import gtk3.gtk_widget_is_toplevel
import gtk3.gtk_widget_is_visible
import gtk3.gtk_widget_keynav_failed
import gtk3.gtk_widget_map
import gtk3.gtk_widget_mnemonic_activate
import gtk3.gtk_widget_queue_allocate
import gtk3.gtk_widget_queue_compute_expand
import gtk3.gtk_widget_queue_draw
import gtk3.gtk_widget_queue_draw_area
import gtk3.gtk_widget_queue_resize
import gtk3.gtk_widget_queue_resize_no_redraw
import gtk3.gtk_widget_realize
import gtk3.gtk_widget_remove_mnemonic_label
import gtk3.gtk_widget_remove_tick_callback
import gtk3.gtk_widget_reset_style
import gtk3.gtk_widget_set_accel_path
import gtk3.gtk_widget_set_allocation
import gtk3.gtk_widget_set_app_paintable
import gtk3.gtk_widget_set_can_default
import gtk3.gtk_widget_set_can_focus
import gtk3.gtk_widget_set_child_visible
import gtk3.gtk_widget_set_clip
import gtk3.gtk_widget_set_direction
import gtk3.gtk_widget_set_double_buffered
import gtk3.gtk_widget_set_events
import gtk3.gtk_widget_set_focus_on_click
import gtk3.gtk_widget_set_halign
import gtk3.gtk_widget_set_has_tooltip
import gtk3.gtk_widget_set_has_window
import gtk3.gtk_widget_set_hexpand
import gtk3.gtk_widget_set_hexpand_set
import gtk3.gtk_widget_set_mapped
import gtk3.gtk_widget_set_margin_bottom
import gtk3.gtk_widget_set_margin_end
import gtk3.gtk_widget_set_margin_start
import gtk3.gtk_widget_set_margin_top
import gtk3.gtk_widget_set_name
import gtk3.gtk_widget_set_no_show_all
import gtk3.gtk_widget_set_opacity
import gtk3.gtk_widget_set_parent
import gtk3.gtk_widget_set_realized
import gtk3.gtk_widget_set_receives_default
import gtk3.gtk_widget_set_redraw_on_allocate
import gtk3.gtk_widget_set_sensitive
import gtk3.gtk_widget_set_size_request
import gtk3.gtk_widget_set_state_flags
import gtk3.gtk_widget_set_support_multidevice
import gtk3.gtk_widget_set_tooltip_markup
import gtk3.gtk_widget_set_tooltip_text
import gtk3.gtk_widget_set_tooltip_window
import gtk3.gtk_widget_set_valign
import gtk3.gtk_widget_set_vexpand
import gtk3.gtk_widget_set_vexpand_set
import gtk3.gtk_widget_set_visible
import gtk3.gtk_widget_show
import gtk3.gtk_widget_show_all
import gtk3.gtk_widget_show_now
import gtk3.gtk_widget_size_allocate
import gtk3.gtk_widget_size_allocate_with_baseline
import gtk3.gtk_widget_thaw_child_notify
import gtk3.gtk_widget_trigger_tooltip_query
import gtk3.gtk_widget_unmap
import gtk3.gtk_widget_unparent
import gtk3.gtk_widget_unrealize
import gtk3.gtk_widget_unset_state_flags
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias Widget = CPointer<GtkWidget>

public val Widget.asObject: Object
  get() = reinterpret()

public val Widget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

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

public fun Widget.getAncestor(widgetType: GType): Widget? = gtk_widget_get_ancestor(this,
    widgetType)?.reinterpret()

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
