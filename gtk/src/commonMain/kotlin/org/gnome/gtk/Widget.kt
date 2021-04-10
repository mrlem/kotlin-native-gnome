// TODO - implement:
//   add_accelerator
//   add_device_events
//   add_events
//   add_mnemonic_label
//   add_tick_callback
//   can_activate_accel
//   child_focus
//   child_notify
//   class_path
//   compute_expand
//   create_pango_layout
//   destroyed
//   device_is_shadowed
//   drag_begin
//   drag_begin_with_coordinates
//   drag_check_threshold
//   drag_dest_find_target
//   drag_dest_set
//   drag_dest_set_proxy
//   drag_dest_set_target_list
//   drag_dest_set_track_motion
//   drag_get_data
//   drag_source_set
//   drag_source_set_icon_gicon
//   drag_source_set_icon_name
//   drag_source_set_icon_pixbuf
//   drag_source_set_icon_stock
//   drag_source_set_target_list
//   draw
//   event
//   get_action_group
//   get_allocated_size
//   get_allocation
//   get_ancestor
//   get_child_requisition
//   get_clip
//   get_clipboard
//   get_device_enabled
//   get_device_events
//   get_modifier_mask
//   get_pointer
//   get_preferred_height
//   get_preferred_height_and_baseline_for_width
//   get_preferred_height_for_width
//   get_preferred_size
//   get_preferred_width
//   get_preferred_width_for_height
//   get_requisition
//   get_size_request
//   get_template_child
//   input_shape_combine_region
//   insert_action_group
//   intersect
//   is_ancestor
//   keynav_failed
//   mnemonic_activate
//   modify_base
//   modify_bg
//   modify_cursor
//   modify_fg
//   modify_font
//   modify_style
//   modify_text
//   override_background_color
//   override_color
//   override_cursor
//   override_font
//   override_symbolic_color
//   path
//   queue_draw_area
//   queue_draw_region
//   region_intersect
//   register_window
//   remove_accelerator
//   remove_mnemonic_label
//   remove_tick_callback
//   render_icon
//   render_icon_pixbuf
//   reparent
//   send_expose
//   send_focus_change
//   set_accel_path
//   set_allocation
//   set_clip
//   set_device_enabled
//   set_device_events
//   set_direction
//   set_font_map
//   set_font_options
//   set_halign
//   set_parent
//   set_parent_window
//   set_size_request
//   set_state
//   set_state_flags
//   set_style
//   set_tooltip_window
//   set_valign
//   set_visual
//   set_window
//   shape_combine_region
//   size_allocate
//   size_allocate_with_baseline
//   size_request
//   style_get
//   style_get_property
//   style_get_valist
//   translate_coordinates
//   unregister_window
//   unset_state_flags
//   set_redraw_on_allocate
package org.gnome.gtk

import gtk3.GtkWidget
import gtk3.gtk_drag_dest_add_image_targets
import gtk3.gtk_drag_dest_add_text_targets
import gtk3.gtk_drag_dest_add_uri_targets
import gtk3.gtk_drag_dest_get_target_list
import gtk3.gtk_drag_dest_get_track_motion
import gtk3.gtk_drag_dest_unset
import gtk3.gtk_drag_highlight
import gtk3.gtk_drag_source_add_image_targets
import gtk3.gtk_drag_source_add_text_targets
import gtk3.gtk_drag_source_add_uri_targets
import gtk3.gtk_drag_source_get_target_list
import gtk3.gtk_drag_source_unset
import gtk3.gtk_drag_unhighlight
import gtk3.gtk_grab_add
import gtk3.gtk_grab_remove
import gtk3.gtk_widget_activate
import gtk3.gtk_widget_create_pango_context
import gtk3.gtk_widget_destroy
import gtk3.gtk_widget_error_bell
import gtk3.gtk_widget_freeze_child_notify
import gtk3.gtk_widget_get_accessible
import gtk3.gtk_widget_get_allocated_baseline
import gtk3.gtk_widget_get_allocated_height
import gtk3.gtk_widget_get_allocated_width
import gtk3.gtk_widget_get_app_paintable
import gtk3.gtk_widget_get_can_default
import gtk3.gtk_widget_get_can_focus
import gtk3.gtk_widget_get_child_visible
import gtk3.gtk_widget_get_composite_name
import gtk3.gtk_widget_get_direction
import gtk3.gtk_widget_get_display
import gtk3.gtk_widget_get_double_buffered
import gtk3.gtk_widget_get_events
import gtk3.gtk_widget_get_focus_on_click
import gtk3.gtk_widget_get_font_map
import gtk3.gtk_widget_get_font_options
import gtk3.gtk_widget_get_frame_clock
import gtk3.gtk_widget_get_halign
import gtk3.gtk_widget_get_has_tooltip
import gtk3.gtk_widget_get_has_window
import gtk3.gtk_widget_get_hexpand
import gtk3.gtk_widget_get_hexpand_set
import gtk3.gtk_widget_get_mapped
import gtk3.gtk_widget_get_margin_bottom
import gtk3.gtk_widget_get_margin_end
import gtk3.gtk_widget_get_margin_left
import gtk3.gtk_widget_get_margin_right
import gtk3.gtk_widget_get_margin_start
import gtk3.gtk_widget_get_margin_top
import gtk3.gtk_widget_get_name
import gtk3.gtk_widget_get_no_show_all
import gtk3.gtk_widget_get_opacity
import gtk3.gtk_widget_get_pango_context
import gtk3.gtk_widget_get_parent
import gtk3.gtk_widget_get_parent_window
import gtk3.gtk_widget_get_path
import gtk3.gtk_widget_get_realized
import gtk3.gtk_widget_get_receives_default
import gtk3.gtk_widget_get_request_mode
import gtk3.gtk_widget_get_scale_factor
import gtk3.gtk_widget_get_screen
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
import gtk3.gtk_widget_get_visual
import gtk3.gtk_widget_get_window
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
import gtk3.gtk_widget_is_drawable
import gtk3.gtk_widget_is_focus
import gtk3.gtk_widget_is_sensitive
import gtk3.gtk_widget_is_toplevel
import gtk3.gtk_widget_is_visible
import gtk3.gtk_widget_list_accel_closures
import gtk3.gtk_widget_list_action_prefixes
import gtk3.gtk_widget_list_mnemonic_labels
import gtk3.gtk_widget_map
import gtk3.gtk_widget_queue_allocate
import gtk3.gtk_widget_queue_compute_expand
import gtk3.gtk_widget_queue_draw
import gtk3.gtk_widget_queue_resize
import gtk3.gtk_widget_queue_resize_no_redraw
import gtk3.gtk_widget_realize
import gtk3.gtk_widget_reset_style
import gtk3.gtk_widget_set_app_paintable
import gtk3.gtk_widget_set_can_default
import gtk3.gtk_widget_set_can_focus
import gtk3.gtk_widget_set_child_visible
import gtk3.gtk_widget_set_composite_name
import gtk3.gtk_widget_set_double_buffered
import gtk3.gtk_widget_set_events
import gtk3.gtk_widget_set_focus_on_click
import gtk3.gtk_widget_set_has_tooltip
import gtk3.gtk_widget_set_has_window
import gtk3.gtk_widget_set_hexpand
import gtk3.gtk_widget_set_hexpand_set
import gtk3.gtk_widget_set_mapped
import gtk3.gtk_widget_set_margin_bottom
import gtk3.gtk_widget_set_margin_end
import gtk3.gtk_widget_set_margin_left
import gtk3.gtk_widget_set_margin_right
import gtk3.gtk_widget_set_margin_start
import gtk3.gtk_widget_set_margin_top
import gtk3.gtk_widget_set_name
import gtk3.gtk_widget_set_no_show_all
import gtk3.gtk_widget_set_opacity
import gtk3.gtk_widget_set_realized
import gtk3.gtk_widget_set_receives_default
import gtk3.gtk_widget_set_sensitive
import gtk3.gtk_widget_set_support_multidevice
import gtk3.gtk_widget_set_tooltip_markup
import gtk3.gtk_widget_set_tooltip_text
import gtk3.gtk_widget_set_vexpand
import gtk3.gtk_widget_set_vexpand_set
import gtk3.gtk_widget_set_visible
import gtk3.gtk_widget_show
import gtk3.gtk_widget_show_all
import gtk3.gtk_widget_show_now
import gtk3.gtk_widget_thaw_child_notify
import gtk3.gtk_widget_trigger_tooltip_query
import gtk3.gtk_widget_unmap
import gtk3.gtk_widget_unparent
import gtk3.gtk_widget_unrealize
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Widget = CPointer<GtkWidget>

public val Widget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun Widget.activate(): Boolean = gtk_widget_activate(this).toBoolean

public fun Widget.createPangoContext(): Unit {
  gtk_widget_create_pango_context(this)
}

public fun Widget.destroy(): Unit {
  gtk_widget_destroy(this)
}

public fun Widget.dragDestAddImageTargets(): Unit {
  gtk_drag_dest_add_image_targets(this)
}

public fun Widget.dragDestAddTextTargets(): Unit {
  gtk_drag_dest_add_text_targets(this)
}

public fun Widget.dragDestAddUriTargets(): Unit {
  gtk_drag_dest_add_uri_targets(this)
}

public fun Widget.dragDestGetTargetList(): Unit {
  gtk_drag_dest_get_target_list(this)
}

public fun Widget.dragDestGetTrackMotion(): Boolean = gtk_drag_dest_get_track_motion(this).toBoolean

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

public fun Widget.dragSourceGetTargetList(): Unit {
  gtk_drag_source_get_target_list(this)
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

public fun Widget.getAccessible(): Unit {
  gtk_widget_get_accessible(this)
}

public fun Widget.getDirection(): Unit {
  gtk_widget_get_direction(this)
}

public fun Widget.getDisplay(): Unit {
  gtk_widget_get_display(this)
}

public fun Widget.getFontMap(): Unit {
  gtk_widget_get_font_map(this)
}

public fun Widget.getFontOptions(): Unit {
  gtk_widget_get_font_options(this)
}

public fun Widget.getFrameClock(): Unit {
  gtk_widget_get_frame_clock(this)
}

public fun Widget.getHalign(): Unit {
  gtk_widget_get_halign(this)
}

public fun Widget.getPangoContext(): Unit {
  gtk_widget_get_pango_context(this)
}

public fun Widget.getParent(): Unit {
  gtk_widget_get_parent(this)
}

public fun Widget.getParentWindow(): Unit {
  gtk_widget_get_parent_window(this)
}

public fun Widget.getPath(): Unit {
  gtk_widget_get_path(this)
}

public fun Widget.getRequestMode(): Unit {
  gtk_widget_get_request_mode(this)
}

public fun Widget.getScreen(): Unit {
  gtk_widget_get_screen(this)
}

public fun Widget.getSettings(): Unit {
  gtk_widget_get_settings(this)
}

public fun Widget.getStateFlags(): Unit {
  gtk_widget_get_state_flags(this)
}

public fun Widget.getStyleContext(): Unit {
  gtk_widget_get_style_context(this)
}

public fun Widget.getTooltipWindow(): Unit {
  gtk_widget_get_tooltip_window(this)
}

public fun Widget.getToplevel(): Unit {
  gtk_widget_get_toplevel(this)
}

public fun Widget.getValign(): Unit {
  gtk_widget_get_valign(this)
}

public fun Widget.getValignWithBaseline(): Unit {
  gtk_widget_get_valign_with_baseline(this)
}

public fun Widget.getVisual(): Unit {
  gtk_widget_get_visual(this)
}

public fun Widget.getWindow(): Unit {
  gtk_widget_get_window(this)
}

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

public fun Widget.isDrawable(): Boolean = gtk_widget_is_drawable(this).toBoolean

public fun Widget.isFocus(): Boolean = gtk_widget_is_focus(this).toBoolean

public fun Widget.isSensitive(): Boolean = gtk_widget_is_sensitive(this).toBoolean

public fun Widget.isToplevel(): Boolean = gtk_widget_is_toplevel(this).toBoolean

public fun Widget.isVisible(): Boolean = gtk_widget_is_visible(this).toBoolean

public fun Widget.listAccelClosures(): Unit {
  gtk_widget_list_accel_closures(this)
}

public fun Widget.listActionPrefixes(): Unit {
  gtk_widget_list_action_prefixes(this)
}

public fun Widget.listMnemonicLabels(): Unit {
  gtk_widget_list_mnemonic_labels(this)
}

public fun Widget.map(): Unit {
  gtk_widget_map(this)
}

public fun Widget.queueAllocate(): Unit {
  gtk_widget_queue_allocate(this)
}

public fun Widget.queueComputeExpand(): Unit {
  gtk_widget_queue_compute_expand(this)
}

public fun Widget.queueDraw(): Unit {
  gtk_widget_queue_draw(this)
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

public fun Widget.resetStyle(): Unit {
  gtk_widget_reset_style(this)
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

public var Widget.compositeName: String?
  get() = gtk_widget_get_composite_name(this).toKString
  set(`value`) {
    gtk_widget_set_composite_name(this, value)
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

public var Widget.marginLeft: Int
  get() = gtk_widget_get_margin_left(this)
  set(`value`) {
    gtk_widget_set_margin_left(this, value)
  }

public var Widget.marginRight: Int
  get() = gtk_widget_get_margin_right(this)
  set(`value`) {
    gtk_widget_set_margin_right(this, value)
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

public var Widget.name: String?
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

public var Widget.sensitive: Boolean
  get() = gtk_widget_get_sensitive(this).toBoolean
  set(`value`) {
    gtk_widget_set_sensitive(this, value.toInt)
  }

public var Widget.supportMultidevice: Boolean
  get() = gtk_widget_get_support_multidevice(this).toBoolean
  set(`value`) {
    gtk_widget_set_support_multidevice(this, value.toInt)
  }

public var Widget.tooltipMarkup: String?
  get() = gtk_widget_get_tooltip_markup(this).toKString
  set(`value`) {
    gtk_widget_set_tooltip_markup(this, value)
  }

public var Widget.tooltipText: String?
  get() = gtk_widget_get_tooltip_text(this).toKString
  set(`value`) {
    gtk_widget_set_tooltip_text(this, value)
  }

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

public val Widget.allocatedBaseline: Int
  get() = gtk_widget_get_allocated_baseline(this)

public val Widget.allocatedHeight: Int
  get() = gtk_widget_get_allocated_height(this)

public val Widget.allocatedWidth: Int
  get() = gtk_widget_get_allocated_width(this)

public val Widget.scaleFactor: Int
  get() = gtk_widget_get_scale_factor(this)
