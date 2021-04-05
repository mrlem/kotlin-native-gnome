// TODO - implement:
//   activate_default
//   activate_focus
//   activate_key
//   add_accel_group
//   add_mnemonic
//   begin_move_drag
//   begin_resize_drag
//   close
//   deiconify
//   fullscreen
//   fullscreen_on_monitor
//   get_accept_focus
//   get_application
//   get_attached_to
//   get_decorated
//   get_default_size
//   get_default_widget
//   get_deletable
//   get_destroy_with_parent
//   get_focus
//   get_focus_on_map
//   get_focus_visible
//   get_gravity
//   get_group
//   get_has_resize_grip
//   get_hide_titlebar_when_maximized
//   get_icon
//   get_icon_list
//   get_icon_name
//   get_mnemonic_modifier
//   get_mnemonics_visible
//   get_modal
//   get_opacity
//   get_position
//   get_resizable
//   get_resize_grip_area
//   get_role
//   get_screen
//   get_size
//   get_skip_pager_hint
//   get_skip_taskbar_hint
//   get_title
//   get_titlebar
//   get_transient_for
//   get_type_hint
//   get_urgency_hint
//   get_window_type
//   has_group
//   has_toplevel_focus
//   iconify
//   is_active
//   is_maximized
//   maximize
//   mnemonic_activate
//   move
//   parse_geometry
//   present
//   present_with_time
//   propagate_key_event
//   remove_accel_group
//   remove_mnemonic
//   reshow_with_initial_size
//   resize
//   resize_grip_is_visible
//   resize_to_geometry
//   set_accept_focus
//   set_application
//   set_attached_to
//   set_decorated
//   set_default
//   set_default_geometry
//   set_default_size
//   set_deletable
//   set_destroy_with_parent
//   set_focus
//   set_focus_on_map
//   set_focus_visible
//   set_geometry_hints
//   set_gravity
//   set_has_resize_grip
//   set_has_user_ref_count
//   set_hide_titlebar_when_maximized
//   set_icon
//   set_icon_from_file
//   set_icon_list
//   set_icon_name
//   set_keep_above
//   set_keep_below
//   set_mnemonic_modifier
//   set_mnemonics_visible
//   set_modal
//   set_opacity
//   set_position
//   set_resizable
//   set_role
//   set_screen
//   set_skip_pager_hint
//   set_skip_taskbar_hint
//   set_startup_id
//   set_title
//   set_titlebar
//   set_transient_for
//   set_type_hint
//   set_urgency_hint
//   set_wmclass
//   stick
//   unfullscreen
//   unmaximize
//   unstick
package org.gnome.gtk

import gtk3.GtkWindow
import gtk3.gtk_window_get_title
import gtk3.gtk_window_set_default_size
import gtk3.gtk_window_set_title
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Window = CPointer<GtkWindow>

public val Window.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Window.asWidget: Widget
  get() = reinterpret()

public val Window.asContainer: Container
  get() = reinterpret()

public val Window.asBin: Bin
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

var Window.title
  get() = gtk_window_get_title(this)?.toKString().orEmpty()
  set(value) = gtk_window_set_title(this, value)

fun Window.setDefaultSize(width: Int, height: Int) = gtk_window_set_default_size(this, width, height)
