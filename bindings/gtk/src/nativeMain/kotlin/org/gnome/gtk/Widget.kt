// TODO - constructor: new
// TODO - method: add_tick_callback (param type)
// TODO - method: destroyed (param type)
// TODO - method: draw (param type)
// TODO - method: get_allocated_size (param type)
// TODO - method: get_allocation (param type)
// TODO - method: get_clip (param type)
// TODO - method: get_font_options (return type)
// TODO - method: get_preferred_height (param type)
// TODO - method: get_preferred_height_and_baseline_for_width (param type)
// TODO - method: get_preferred_height_for_width (param type)
// TODO - method: get_preferred_size (param type)
// TODO - method: get_preferred_width (param type)
// TODO - method: get_preferred_width_for_height (param type)
// TODO - method: get_size_request (param type)
// TODO - method: input_shape_combine_region (param type)
// TODO - method: intersect (param type)
// TODO - method: queue_draw_region (param type)
// TODO - method: set_font_options (param type)
// TODO - method: shape_combine_region (param type)
// TODO - method: style_get (param type)
// TODO - method: style_get_valist (param type)
// TODO - method: translate_coordinates (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GType
import interop.GtkWidget
import interop.gtk_drag_begin_with_coordinates
import interop.gtk_drag_check_threshold
import interop.gtk_drag_dest_add_image_targets
import interop.gtk_drag_dest_add_text_targets
import interop.gtk_drag_dest_add_uri_targets
import interop.gtk_drag_dest_find_target
import interop.gtk_drag_dest_get_target_list
import interop.gtk_drag_dest_get_track_motion
import interop.gtk_drag_dest_set
import interop.gtk_drag_dest_set_target_list
import interop.gtk_drag_dest_set_track_motion
import interop.gtk_drag_dest_unset
import interop.gtk_drag_get_data
import interop.gtk_drag_highlight
import interop.gtk_drag_source_add_image_targets
import interop.gtk_drag_source_add_text_targets
import interop.gtk_drag_source_add_uri_targets
import interop.gtk_drag_source_get_target_list
import interop.gtk_drag_source_set
import interop.gtk_drag_source_set_icon_gicon
import interop.gtk_drag_source_set_icon_name
import interop.gtk_drag_source_set_icon_pixbuf
import interop.gtk_drag_source_set_target_list
import interop.gtk_drag_source_unset
import interop.gtk_drag_unhighlight
import interop.gtk_grab_add
import interop.gtk_grab_remove
import interop.gtk_widget_activate
import interop.gtk_widget_add_accelerator
import interop.gtk_widget_add_device_events
import interop.gtk_widget_add_events
import interop.gtk_widget_add_mnemonic_label
import interop.gtk_widget_can_activate_accel
import interop.gtk_widget_child_focus
import interop.gtk_widget_child_notify
import interop.gtk_widget_compute_expand
import interop.gtk_widget_create_pango_context
import interop.gtk_widget_create_pango_layout
import interop.gtk_widget_destroy
import interop.gtk_widget_device_is_shadowed
import interop.gtk_widget_error_bell
import interop.gtk_widget_event
import interop.gtk_widget_freeze_child_notify
import interop.gtk_widget_get_accessible
import interop.gtk_widget_get_action_group
import interop.gtk_widget_get_allocated_baseline
import interop.gtk_widget_get_allocated_height
import interop.gtk_widget_get_allocated_width
import interop.gtk_widget_get_ancestor
import interop.gtk_widget_get_app_paintable
import interop.gtk_widget_get_can_default
import interop.gtk_widget_get_can_focus
import interop.gtk_widget_get_child_visible
import interop.gtk_widget_get_clipboard
import interop.gtk_widget_get_device_enabled
import interop.gtk_widget_get_device_events
import interop.gtk_widget_get_direction
import interop.gtk_widget_get_display
import interop.gtk_widget_get_double_buffered
import interop.gtk_widget_get_events
import interop.gtk_widget_get_focus_on_click
import interop.gtk_widget_get_font_map
import interop.gtk_widget_get_frame_clock
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
import interop.gtk_widget_get_modifier_mask
import interop.gtk_widget_get_name
import interop.gtk_widget_get_no_show_all
import interop.gtk_widget_get_opacity
import interop.gtk_widget_get_pango_context
import interop.gtk_widget_get_parent
import interop.gtk_widget_get_parent_window
import interop.gtk_widget_get_path
import interop.gtk_widget_get_realized
import interop.gtk_widget_get_receives_default
import interop.gtk_widget_get_request_mode
import interop.gtk_widget_get_scale_factor
import interop.gtk_widget_get_screen
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
import interop.gtk_widget_get_visual
import interop.gtk_widget_get_window
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
import interop.gtk_widget_list_accel_closures
import interop.gtk_widget_list_action_prefixes
import interop.gtk_widget_list_mnemonic_labels
import interop.gtk_widget_map
import interop.gtk_widget_mnemonic_activate
import interop.gtk_widget_queue_allocate
import interop.gtk_widget_queue_compute_expand
import interop.gtk_widget_queue_draw
import interop.gtk_widget_queue_draw_area
import interop.gtk_widget_queue_resize
import interop.gtk_widget_queue_resize_no_redraw
import interop.gtk_widget_realize
import interop.gtk_widget_register_window
import interop.gtk_widget_remove_accelerator
import interop.gtk_widget_remove_mnemonic_label
import interop.gtk_widget_remove_tick_callback
import interop.gtk_widget_reset_style
import interop.gtk_widget_send_focus_change
import interop.gtk_widget_set_accel_path
import interop.gtk_widget_set_allocation
import interop.gtk_widget_set_app_paintable
import interop.gtk_widget_set_can_default
import interop.gtk_widget_set_can_focus
import interop.gtk_widget_set_child_visible
import interop.gtk_widget_set_clip
import interop.gtk_widget_set_device_enabled
import interop.gtk_widget_set_device_events
import interop.gtk_widget_set_direction
import interop.gtk_widget_set_events
import interop.gtk_widget_set_focus_on_click
import interop.gtk_widget_set_font_map
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
import interop.gtk_widget_set_parent_window
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
import interop.gtk_widget_set_visual
import interop.gtk_widget_set_window
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
import interop.gtk_widget_unregister_window
import interop.gtk_widget_unset_state_flags
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Atom
import org.gnome.gdk.Device
import org.gnome.gdk.Display
import org.gnome.gdk.DragAction
import org.gnome.gdk.DragContext
import org.gnome.gdk.Event
import org.gnome.gdk.EventMask
import org.gnome.gdk.FrameClock
import org.gnome.gdk.ModifierIntent
import org.gnome.gdk.ModifierType
import org.gnome.gdk.Screen
import org.gnome.gdk.Visual
import org.gnome.gdkpixbuf.Pixbuf
import org.gnome.gio.ActionGroup
import org.gnome.gio.Icon
import org.gnome.gobject.Closure
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.pango.Context
import org.gnome.pango.FontMap
import org.gnome.pango.Layout
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKArray
import org.mrlem.gnome.toKList
import org.mrlem.gnome.toKString

public typealias Widget = CPointer<GtkWidget>

public val Widget.asObject: Object
  get() = reinterpret()

public val Widget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public object WidgetFactory

public val Widget.parentInstance: InitiallyUnowned
  get() = pointed.parent_instance.ptr

public val Widget.accessible: org.gnome.atk.Object?
  get() = gtk_widget_get_accessible(this)?.reinterpret()

public val Widget.allocatedBaseline: Int
  get() = gtk_widget_get_allocated_baseline(this)

public val Widget.allocatedHeight: Int
  get() = gtk_widget_get_allocated_height(this)

public val Widget.allocatedWidth: Int
  get() = gtk_widget_get_allocated_width(this)

public var Widget.appPaintable: Boolean
  get() = gtk_widget_get_app_paintable(this).toBoolean()
  set(`value`) {
    gtk_widget_set_app_paintable(this@appPaintable, `value`.toInt())
  }

public var Widget.canDefault: Boolean
  get() = gtk_widget_get_can_default(this).toBoolean()
  set(`value`) {
    gtk_widget_set_can_default(this@canDefault, `value`.toInt())
  }

public var Widget.canFocus: Boolean
  get() = gtk_widget_get_can_focus(this).toBoolean()
  set(`value`) {
    gtk_widget_set_can_focus(this@canFocus, `value`.toInt())
  }

public var Widget.childVisible: Boolean
  get() = gtk_widget_get_child_visible(this).toBoolean()
  set(`value`) {
    gtk_widget_set_child_visible(this@childVisible, `value`.toInt())
  }

public var Widget.direction: TextDirection
  get() = gtk_widget_get_direction(this)
  set(`value`) {
    gtk_widget_set_direction(this@direction, `value`)
  }

public val Widget.display: Display?
  get() = gtk_widget_get_display(this)?.reinterpret()

public val Widget.doubleBuffered: Boolean
  get() = gtk_widget_get_double_buffered(this).toBoolean()

public var Widget.events: Int
  get() = gtk_widget_get_events(this)
  set(`value`) {
    gtk_widget_set_events(this@events, `value`)
  }

public var Widget.focusOnClick: Boolean
  get() = gtk_widget_get_focus_on_click(this).toBoolean()
  set(`value`) {
    gtk_widget_set_focus_on_click(this@focusOnClick, `value`.toInt())
  }

public var Widget.fontMap: FontMap?
  get() = gtk_widget_get_font_map(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_font_map(this@fontMap, `value`)
  }

public val Widget.frameClock: FrameClock?
  get() = gtk_widget_get_frame_clock(this)?.reinterpret()

public var Widget.halign: Align
  get() = gtk_widget_get_halign(this)
  set(`value`) {
    gtk_widget_set_halign(this@halign, `value`)
  }

public var Widget.hasTooltip: Boolean
  get() = gtk_widget_get_has_tooltip(this).toBoolean()
  set(`value`) {
    gtk_widget_set_has_tooltip(this@hasTooltip, `value`.toInt())
  }

public var Widget.hasWindow: Boolean
  get() = gtk_widget_get_has_window(this).toBoolean()
  set(`value`) {
    gtk_widget_set_has_window(this@hasWindow, `value`.toInt())
  }

public var Widget.hexpand: Boolean
  get() = gtk_widget_get_hexpand(this).toBoolean()
  set(`value`) {
    gtk_widget_set_hexpand(this@hexpand, `value`.toInt())
  }

public var Widget.hexpandSet: Boolean
  get() = gtk_widget_get_hexpand_set(this).toBoolean()
  set(`value`) {
    gtk_widget_set_hexpand_set(this@hexpandSet, `value`.toInt())
  }

public var Widget.mapped: Boolean
  get() = gtk_widget_get_mapped(this).toBoolean()
  set(`value`) {
    gtk_widget_set_mapped(this@mapped, `value`.toInt())
  }

public var Widget.marginBottom: Int
  get() = gtk_widget_get_margin_bottom(this)
  set(`value`) {
    gtk_widget_set_margin_bottom(this@marginBottom, `value`)
  }

public var Widget.marginEnd: Int
  get() = gtk_widget_get_margin_end(this)
  set(`value`) {
    gtk_widget_set_margin_end(this@marginEnd, `value`)
  }

public var Widget.marginStart: Int
  get() = gtk_widget_get_margin_start(this)
  set(`value`) {
    gtk_widget_set_margin_start(this@marginStart, `value`)
  }

public var Widget.marginTop: Int
  get() = gtk_widget_get_margin_top(this)
  set(`value`) {
    gtk_widget_set_margin_top(this@marginTop, `value`)
  }

public var Widget.name: String?
  get() = gtk_widget_get_name(this).toKString()
  set(`value`) {
    gtk_widget_set_name(this@name, `value`)
  }

public var Widget.noShowAll: Boolean
  get() = gtk_widget_get_no_show_all(this).toBoolean()
  set(`value`) {
    gtk_widget_set_no_show_all(this@noShowAll, `value`.toInt())
  }

public var Widget.opacity: Double
  get() = gtk_widget_get_opacity(this)
  set(`value`) {
    gtk_widget_set_opacity(this@opacity, `value`)
  }

public val Widget.pangoContext: Context?
  get() = gtk_widget_get_pango_context(this)?.reinterpret()

public var Widget.parent: Widget?
  get() = gtk_widget_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_parent(this@parent, `value`)
  }

public var Widget.parentWindow: org.gnome.gdk.Window?
  get() = gtk_widget_get_parent_window(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_parent_window(this@parentWindow, `value`)
  }

public val Widget.path: WidgetPath?
  get() = gtk_widget_get_path(this)?.reinterpret()

public var Widget.realized: Boolean
  get() = gtk_widget_get_realized(this).toBoolean()
  set(`value`) {
    gtk_widget_set_realized(this@realized, `value`.toInt())
  }

public var Widget.receivesDefault: Boolean
  get() = gtk_widget_get_receives_default(this).toBoolean()
  set(`value`) {
    gtk_widget_set_receives_default(this@receivesDefault, `value`.toInt())
  }

public val Widget.requestMode: SizeRequestMode
  get() = gtk_widget_get_request_mode(this)

public val Widget.scaleFactor: Int
  get() = gtk_widget_get_scale_factor(this)

public val Widget.screen: Screen?
  get() = gtk_widget_get_screen(this)?.reinterpret()

public var Widget.sensitive: Boolean
  get() = gtk_widget_get_sensitive(this).toBoolean()
  set(`value`) {
    gtk_widget_set_sensitive(this@sensitive, `value`.toInt())
  }

public val Widget.settings: Settings?
  get() = gtk_widget_get_settings(this)?.reinterpret()

public val Widget.stateFlags: StateFlags
  get() = gtk_widget_get_state_flags(this)

public val Widget.styleContext: StyleContext?
  get() = gtk_widget_get_style_context(this)?.reinterpret()

public var Widget.supportMultidevice: Boolean
  get() = gtk_widget_get_support_multidevice(this).toBoolean()
  set(`value`) {
    gtk_widget_set_support_multidevice(this@supportMultidevice, `value`.toInt())
  }

public var Widget.tooltipMarkup: String?
  get() = gtk_widget_get_tooltip_markup(this).toKString()
  set(`value`) {
    gtk_widget_set_tooltip_markup(this@tooltipMarkup, `value`)
  }

public var Widget.tooltipText: String?
  get() = gtk_widget_get_tooltip_text(this).toKString()
  set(`value`) {
    gtk_widget_set_tooltip_text(this@tooltipText, `value`)
  }

public var Widget.tooltipWindow: Window?
  get() = gtk_widget_get_tooltip_window(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_tooltip_window(this@tooltipWindow, `value`)
  }

public val Widget.toplevel: Widget?
  get() = gtk_widget_get_toplevel(this)?.reinterpret()

public var Widget.valign: Align
  get() = gtk_widget_get_valign(this)
  set(`value`) {
    gtk_widget_set_valign(this@valign, `value`)
  }

public val Widget.valignWithBaseline: Align
  get() = gtk_widget_get_valign_with_baseline(this)

public var Widget.vexpand: Boolean
  get() = gtk_widget_get_vexpand(this).toBoolean()
  set(`value`) {
    gtk_widget_set_vexpand(this@vexpand, `value`.toInt())
  }

public var Widget.vexpandSet: Boolean
  get() = gtk_widget_get_vexpand_set(this).toBoolean()
  set(`value`) {
    gtk_widget_set_vexpand_set(this@vexpandSet, `value`.toInt())
  }

public var Widget.visible: Boolean
  get() = gtk_widget_get_visible(this).toBoolean()
  set(`value`) {
    gtk_widget_set_visible(this@visible, `value`.toInt())
  }

public var Widget.visual: Visual?
  get() = gtk_widget_get_visual(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_visual(this@visual, `value`)
  }

public var Widget.window: org.gnome.gdk.Window?
  get() = gtk_widget_get_window(this)?.reinterpret()
  set(`value`) {
    gtk_widget_set_window(this@window, `value`)
  }

public fun Widget.activate(): Boolean = gtk_widget_activate(this@activate).toBoolean()

public fun Widget.addAccelerator(
  accelSignal: String?,
  accelGroup: AccelGroup?,
  accelKey: UInt,
  accelMods: ModifierType,
  accelFlags: AccelFlags
): Unit {
  gtk_widget_add_accelerator(this@addAccelerator, accelSignal, accelGroup?.reinterpret(), accelKey,
      accelMods, accelFlags)
}

public fun Widget.addDeviceEvents(device: Device?, events: EventMask): Unit {
  gtk_widget_add_device_events(this@addDeviceEvents, device?.reinterpret(), events)
}

public fun Widget.addEvents(events: Int): Unit {
  gtk_widget_add_events(this@addEvents, events)
}

public fun Widget.addMnemonicLabel(label: Widget?): Unit {
  gtk_widget_add_mnemonic_label(this@addMnemonicLabel, label?.reinterpret())
}

public fun Widget.canActivateAccel(signalId: UInt): Boolean =
    gtk_widget_can_activate_accel(this@canActivateAccel, signalId).toBoolean()

public fun Widget.childFocus(direction: DirectionType): Boolean =
    gtk_widget_child_focus(this@childFocus, direction).toBoolean()

public fun Widget.childNotify(childProperty: String?): Unit {
  gtk_widget_child_notify(this@childNotify, childProperty)
}

public fun Widget.computeExpand(orientation: Orientation): Boolean =
    gtk_widget_compute_expand(this@computeExpand, orientation).toBoolean()

public fun Widget.createPangoContext(): Context? =
    gtk_widget_create_pango_context(this@createPangoContext)?.reinterpret()

public fun Widget.createPangoLayout(text: String?): Layout? =
    gtk_widget_create_pango_layout(this@createPangoLayout, text)?.reinterpret()

public fun Widget.destroy(): Unit {
  gtk_widget_destroy(this@destroy)
}

public fun Widget.deviceIsShadowed(device: Device?): Boolean =
    gtk_widget_device_is_shadowed(this@deviceIsShadowed, device?.reinterpret()).toBoolean()

public fun Widget.dragBeginWithCoordinates(
  targets: TargetList?,
  actions: DragAction,
  button: Int,
  event: Event?,
  x: Int,
  y: Int
): DragContext? = gtk_drag_begin_with_coordinates(this@dragBeginWithCoordinates,
    targets?.reinterpret(), actions, button, event?.reinterpret(), x, y)?.reinterpret()

public fun Widget.dragCheckThreshold(
  startX: Int,
  startY: Int,
  currentX: Int,
  currentY: Int
): Boolean = gtk_drag_check_threshold(this@dragCheckThreshold, startX, startY, currentX,
    currentY).toBoolean()

public fun Widget.dragDestAddImageTargets(): Unit {
  gtk_drag_dest_add_image_targets(this@dragDestAddImageTargets)
}

public fun Widget.dragDestAddTextTargets(): Unit {
  gtk_drag_dest_add_text_targets(this@dragDestAddTextTargets)
}

public fun Widget.dragDestAddUriTargets(): Unit {
  gtk_drag_dest_add_uri_targets(this@dragDestAddUriTargets)
}

public fun Widget.dragDestFindTarget(context: DragContext?, targetList: TargetList?): Atom? =
    gtk_drag_dest_find_target(this@dragDestFindTarget, context?.reinterpret(),
    targetList?.reinterpret())?.reinterpret()

public fun Widget.dragDestGetTargetList(): TargetList? =
    gtk_drag_dest_get_target_list(this@dragDestGetTargetList)?.reinterpret()

public fun Widget.dragDestGetTrackMotion(): Boolean =
    gtk_drag_dest_get_track_motion(this@dragDestGetTrackMotion).toBoolean()

public fun Widget.dragDestSet(
  flags: DestDefaults,
  targets: Array<TargetEntry>?,
  nTargets: Int,
  actions: DragAction
): Unit {
  memScoped { gtk_drag_dest_set(this@dragDestSet, flags, targets?.map { it.pointed
      }?.toTypedArray()?.toCArray(memScope), nTargets, actions) }
}

public fun Widget.dragDestSetTargetList(targetList: TargetList?): Unit {
  gtk_drag_dest_set_target_list(this@dragDestSetTargetList, targetList?.reinterpret())
}

public fun Widget.dragDestSetTrackMotion(trackMotion: Boolean): Unit {
  gtk_drag_dest_set_track_motion(this@dragDestSetTrackMotion, trackMotion.toInt())
}

public fun Widget.dragDestUnset(): Unit {
  gtk_drag_dest_unset(this@dragDestUnset)
}

public fun Widget.dragGetData(
  context: DragContext?,
  target: Atom?,
  time: UInt
): Unit {
  gtk_drag_get_data(this@dragGetData, context?.reinterpret(), target?.reinterpret(), time)
}

public fun Widget.dragHighlight(): Unit {
  gtk_drag_highlight(this@dragHighlight)
}

public fun Widget.dragSourceAddImageTargets(): Unit {
  gtk_drag_source_add_image_targets(this@dragSourceAddImageTargets)
}

public fun Widget.dragSourceAddTextTargets(): Unit {
  gtk_drag_source_add_text_targets(this@dragSourceAddTextTargets)
}

public fun Widget.dragSourceAddUriTargets(): Unit {
  gtk_drag_source_add_uri_targets(this@dragSourceAddUriTargets)
}

public fun Widget.dragSourceGetTargetList(): TargetList? =
    gtk_drag_source_get_target_list(this@dragSourceGetTargetList)?.reinterpret()

public fun Widget.dragSourceSet(
  startButtonMask: ModifierType,
  targets: Array<TargetEntry>?,
  nTargets: Int,
  actions: DragAction
): Unit {
  memScoped { gtk_drag_source_set(this@dragSourceSet, startButtonMask, targets?.map { it.pointed
      }?.toTypedArray()?.toCArray(memScope), nTargets, actions) }
}

public fun Widget.dragSourceSetIconGicon(icon: Icon?): Unit {
  gtk_drag_source_set_icon_gicon(this@dragSourceSetIconGicon, icon?.reinterpret())
}

public fun Widget.dragSourceSetIconName(iconName: String?): Unit {
  gtk_drag_source_set_icon_name(this@dragSourceSetIconName, iconName)
}

public fun Widget.dragSourceSetIconPixbuf(pixbuf: Pixbuf?): Unit {
  gtk_drag_source_set_icon_pixbuf(this@dragSourceSetIconPixbuf, pixbuf?.reinterpret())
}

public fun Widget.dragSourceSetTargetList(targetList: TargetList?): Unit {
  gtk_drag_source_set_target_list(this@dragSourceSetTargetList, targetList?.reinterpret())
}

public fun Widget.dragSourceUnset(): Unit {
  gtk_drag_source_unset(this@dragSourceUnset)
}

public fun Widget.dragUnhighlight(): Unit {
  gtk_drag_unhighlight(this@dragUnhighlight)
}

public fun Widget.errorBell(): Unit {
  gtk_widget_error_bell(this@errorBell)
}

public fun Widget.event(event: Event?): Boolean = gtk_widget_event(this@event,
    event?.reinterpret()).toBoolean()

public fun Widget.freezeChildNotify(): Unit {
  gtk_widget_freeze_child_notify(this@freezeChildNotify)
}

public fun Widget.getActionGroup(prefix: String?): ActionGroup? =
    gtk_widget_get_action_group(this@getActionGroup, prefix)?.reinterpret()

public fun Widget.getAncestor(widgetType: GType): Widget? =
    gtk_widget_get_ancestor(this@getAncestor, widgetType)?.reinterpret()

public fun Widget.getClipboard(selection: Atom?): Clipboard? =
    gtk_widget_get_clipboard(this@getClipboard, selection?.reinterpret())?.reinterpret()

public fun Widget.getDeviceEnabled(device: Device?): Boolean =
    gtk_widget_get_device_enabled(this@getDeviceEnabled, device?.reinterpret()).toBoolean()

public fun Widget.getDeviceEvents(device: Device?): EventMask =
    gtk_widget_get_device_events(this@getDeviceEvents, device?.reinterpret())

public fun Widget.getModifierMask(intent: ModifierIntent): ModifierType =
    gtk_widget_get_modifier_mask(this@getModifierMask, intent)

public fun Widget.getTemplateChild(widgetType: GType, name: String?): Object? =
    gtk_widget_get_template_child(this@getTemplateChild, widgetType, name)?.reinterpret()

public fun Widget.grabAdd(): Unit {
  gtk_grab_add(this@grabAdd)
}

public fun Widget.grabDefault(): Unit {
  gtk_widget_grab_default(this@grabDefault)
}

public fun Widget.grabFocus(): Unit {
  gtk_widget_grab_focus(this@grabFocus)
}

public fun Widget.grabRemove(): Unit {
  gtk_grab_remove(this@grabRemove)
}

public fun Widget.hasDefault(): Boolean = gtk_widget_has_default(this@hasDefault).toBoolean()

public fun Widget.hasFocus(): Boolean = gtk_widget_has_focus(this@hasFocus).toBoolean()

public fun Widget.hasGrab(): Boolean = gtk_widget_has_grab(this@hasGrab).toBoolean()

public fun Widget.hasScreen(): Boolean = gtk_widget_has_screen(this@hasScreen).toBoolean()

public fun Widget.hasVisibleFocus(): Boolean =
    gtk_widget_has_visible_focus(this@hasVisibleFocus).toBoolean()

public fun Widget.hide(): Unit {
  gtk_widget_hide(this@hide)
}

public fun Widget.hideOnDelete(): Boolean = gtk_widget_hide_on_delete(this@hideOnDelete).toBoolean()

public fun Widget.inDestruction(): Boolean =
    gtk_widget_in_destruction(this@inDestruction).toBoolean()

public fun Widget.initTemplate(): Unit {
  gtk_widget_init_template(this@initTemplate)
}

public fun Widget.insertActionGroup(name: String?, group: ActionGroup?): Unit {
  gtk_widget_insert_action_group(this@insertActionGroup, name, group?.reinterpret())
}

public fun Widget.isAncestor(ancestor: Widget?): Boolean = gtk_widget_is_ancestor(this@isAncestor,
    ancestor?.reinterpret()).toBoolean()

public fun Widget.isDrawable(): Boolean = gtk_widget_is_drawable(this@isDrawable).toBoolean()

public fun Widget.isFocus(): Boolean = gtk_widget_is_focus(this@isFocus).toBoolean()

public fun Widget.isSensitive(): Boolean = gtk_widget_is_sensitive(this@isSensitive).toBoolean()

public fun Widget.isToplevel(): Boolean = gtk_widget_is_toplevel(this@isToplevel).toBoolean()

public fun Widget.isVisible(): Boolean = gtk_widget_is_visible(this@isVisible).toBoolean()

public fun Widget.keynavFailed(direction: DirectionType): Boolean =
    gtk_widget_keynav_failed(this@keynavFailed, direction).toBoolean()

public fun Widget.listAccelClosures(): List<Closure>? =
    gtk_widget_list_accel_closures(this@listAccelClosures)?.reinterpret<GList>()?.toKList()

public fun Widget.listActionPrefixes(): Array<String>? =
    gtk_widget_list_action_prefixes(this@listActionPrefixes)?.toKArray { it.toKString()!! }

public fun Widget.listMnemonicLabels(): List<Widget>? =
    gtk_widget_list_mnemonic_labels(this@listMnemonicLabels)?.reinterpret<GList>()?.toKList()

public fun Widget.map(): Unit {
  gtk_widget_map(this@map)
}

public fun Widget.mnemonicActivate(groupCycling: Boolean): Boolean =
    gtk_widget_mnemonic_activate(this@mnemonicActivate, groupCycling.toInt()).toBoolean()

public fun Widget.queueAllocate(): Unit {
  gtk_widget_queue_allocate(this@queueAllocate)
}

public fun Widget.queueComputeExpand(): Unit {
  gtk_widget_queue_compute_expand(this@queueComputeExpand)
}

public fun Widget.queueDraw(): Unit {
  gtk_widget_queue_draw(this@queueDraw)
}

public fun Widget.queueDrawArea(
  x: Int,
  y: Int,
  width: Int,
  height: Int
): Unit {
  gtk_widget_queue_draw_area(this@queueDrawArea, x, y, width, height)
}

public fun Widget.queueResize(): Unit {
  gtk_widget_queue_resize(this@queueResize)
}

public fun Widget.queueResizeNoRedraw(): Unit {
  gtk_widget_queue_resize_no_redraw(this@queueResizeNoRedraw)
}

public fun Widget.realize(): Unit {
  gtk_widget_realize(this@realize)
}

public fun Widget.registerWindow(window: org.gnome.gdk.Window?): Unit {
  gtk_widget_register_window(this@registerWindow, window?.reinterpret())
}

public fun Widget.removeAccelerator(
  accelGroup: AccelGroup?,
  accelKey: UInt,
  accelMods: ModifierType
): Boolean = gtk_widget_remove_accelerator(this@removeAccelerator, accelGroup?.reinterpret(),
    accelKey, accelMods).toBoolean()

public fun Widget.removeMnemonicLabel(label: Widget?): Unit {
  gtk_widget_remove_mnemonic_label(this@removeMnemonicLabel, label?.reinterpret())
}

public fun Widget.removeTickCallback(id: UInt): Unit {
  gtk_widget_remove_tick_callback(this@removeTickCallback, id)
}

public fun Widget.resetStyle(): Unit {
  gtk_widget_reset_style(this@resetStyle)
}

public fun Widget.sendFocusChange(event: Event?): Boolean =
    gtk_widget_send_focus_change(this@sendFocusChange, event?.reinterpret()).toBoolean()

public fun Widget.setAccelPath(accelPath: String?, accelGroup: AccelGroup?): Unit {
  gtk_widget_set_accel_path(this@setAccelPath, accelPath, accelGroup?.reinterpret())
}

public fun Widget.setAllocation(allocation: Allocation): Unit {
  gtk_widget_set_allocation(this@setAllocation, allocation)
}

public fun Widget.setClip(clip: Allocation): Unit {
  gtk_widget_set_clip(this@setClip, clip)
}

public fun Widget.setDeviceEnabled(device: Device?, enabled: Boolean): Unit {
  gtk_widget_set_device_enabled(this@setDeviceEnabled, device?.reinterpret(), enabled.toInt())
}

public fun Widget.setDeviceEvents(device: Device?, events: EventMask): Unit {
  gtk_widget_set_device_events(this@setDeviceEvents, device?.reinterpret(), events)
}

public fun Widget.setRedrawOnAllocate(redrawOnAllocate: Boolean): Unit {
  gtk_widget_set_redraw_on_allocate(this@setRedrawOnAllocate, redrawOnAllocate.toInt())
}

public fun Widget.setSizeRequest(width: Int, height: Int): Unit {
  gtk_widget_set_size_request(this@setSizeRequest, width, height)
}

public fun Widget.setStateFlags(flags: StateFlags, clear: Boolean): Unit {
  gtk_widget_set_state_flags(this@setStateFlags, flags, clear.toInt())
}

public fun Widget.show(): Unit {
  gtk_widget_show(this@show)
}

public fun Widget.showAll(): Unit {
  gtk_widget_show_all(this@showAll)
}

public fun Widget.showNow(): Unit {
  gtk_widget_show_now(this@showNow)
}

public fun Widget.sizeAllocate(allocation: Allocation): Unit {
  gtk_widget_size_allocate(this@sizeAllocate, allocation)
}

public fun Widget.sizeAllocateWithBaseline(allocation: Allocation, baseline: Int): Unit {
  gtk_widget_size_allocate_with_baseline(this@sizeAllocateWithBaseline, allocation, baseline)
}

public fun Widget.styleGetProperty(propertyName: String?, `value`: Value?): Unit {
  gtk_widget_style_get_property(this@styleGetProperty, propertyName, `value`?.reinterpret())
}

public fun Widget.thawChildNotify(): Unit {
  gtk_widget_thaw_child_notify(this@thawChildNotify)
}

public fun Widget.triggerTooltipQuery(): Unit {
  gtk_widget_trigger_tooltip_query(this@triggerTooltipQuery)
}

public fun Widget.unmap(): Unit {
  gtk_widget_unmap(this@unmap)
}

public fun Widget.unparent(): Unit {
  gtk_widget_unparent(this@unparent)
}

public fun Widget.unrealize(): Unit {
  gtk_widget_unrealize(this@unrealize)
}

public fun Widget.unregisterWindow(window: org.gnome.gdk.Window?): Unit {
  gtk_widget_unregister_window(this@unregisterWindow, window?.reinterpret())
}

public fun Widget.unsetStateFlags(flags: StateFlags): Unit {
  gtk_widget_unset_state_flags(this@unsetStateFlags, flags)
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
