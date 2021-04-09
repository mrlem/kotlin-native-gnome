// TODO - implement:
//   activate
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
//   create_pango_context
//   create_pango_layout
//   destroy
//   destroyed
//   device_is_shadowed
//   drag_begin
//   drag_begin_with_coordinates
//   drag_check_threshold
//   drag_dest_add_image_targets
//   drag_dest_add_text_targets
//   drag_dest_add_uri_targets
//   drag_dest_find_target
//   drag_dest_get_target_list
//   drag_dest_get_track_motion
//   drag_dest_set
//   drag_dest_set_proxy
//   drag_dest_set_target_list
//   drag_dest_set_track_motion
//   drag_dest_unset
//   drag_get_data
//   drag_highlight
//   drag_source_add_image_targets
//   drag_source_add_text_targets
//   drag_source_add_uri_targets
//   drag_source_get_target_list
//   drag_source_set
//   drag_source_set_icon_gicon
//   drag_source_set_icon_name
//   drag_source_set_icon_pixbuf
//   drag_source_set_icon_stock
//   drag_source_set_target_list
//   drag_source_unset
//   drag_unhighlight
//   draw
//   ensure_style
//   error_bell
//   event
//   freeze_child_notify
//   get_accessible
//   get_action_group
//   get_allocated_size
//   get_allocation
//   get_ancestor
//   get_child_requisition
//   get_clip
//   get_clipboard
//   get_device_enabled
//   get_device_events
//   get_direction
//   get_display
//   get_font_map
//   get_font_options
//   get_frame_clock
//   get_halign
//   get_modifier_mask
//   get_modifier_style
//   get_pango_context
//   get_parent
//   get_parent_window
//   get_path
//   get_pointer
//   get_preferred_height
//   get_preferred_height_and_baseline_for_width
//   get_preferred_height_for_width
//   get_preferred_size
//   get_preferred_width
//   get_preferred_width_for_height
//   get_request_mode
//   get_requisition
//   get_root_window
//   get_screen
//   get_settings
//   get_size_request
//   get_state
//   get_state_flags
//   get_style
//   get_style_context
//   get_template_child
//   get_tooltip_window
//   get_toplevel
//   get_valign
//   get_valign_with_baseline
//   get_visual
//   get_window
//   grab_add
//   grab_default
//   grab_focus
//   grab_remove
//   has_default
//   has_focus
//   has_grab
//   has_rc_style
//   has_screen
//   has_visible_focus
//   hide
//   hide_on_delete
//   in_destruction
//   init_template
//   input_shape_combine_region
//   insert_action_group
//   intersect
//   is_ancestor
//   is_composited
//   is_drawable
//   is_focus
//   is_sensitive
//   is_toplevel
//   is_visible
//   keynav_failed
//   list_accel_closures
//   list_action_prefixes
//   list_mnemonic_labels
//   map
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
//   queue_allocate
//   queue_compute_expand
//   queue_draw
//   queue_draw_area
//   queue_draw_region
//   queue_resize
//   queue_resize_no_redraw
//   realize
//   region_intersect
//   register_window
//   remove_accelerator
//   remove_mnemonic_label
//   remove_tick_callback
//   render_icon
//   render_icon_pixbuf
//   reparent
//   reset_rc_styles
//   reset_style
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
//   show
//   show_all
//   show_now
//   size_allocate
//   size_allocate_with_baseline
//   size_request
//   style_attach
//   style_get
//   style_get_property
//   style_get_valist
//   thaw_child_notify
//   translate_coordinates
//   trigger_tooltip_query
//   unmap
//   unparent
//   unrealize
//   unregister_window
//   unset_state_flags
//   set_redraw_on_allocate
package org.gnome.gtk

import gtk3.*
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Widget = CPointer<GtkWidget>

public val Widget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

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

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

fun Widget.show() = gtk_widget_show(this)

fun Widget.hide() = gtk_widget_hide(this)

fun Widget.showAll() = gtk_widget_show_all(this)

fun Widget.destroy() = gtk_widget_destroy(this)
