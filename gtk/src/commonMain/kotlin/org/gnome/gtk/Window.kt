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
//   get_application
//   get_attached_to
//   get_default_size
//   get_default_widget
//   get_focus
//   get_gravity
//   get_group
//   get_icon
//   get_icon_list
//   get_mnemonic_modifier
//   get_position
//   get_resize_grip_area
//   get_screen
//   get_size
//   get_titlebar
//   get_transient_for
//   get_type_hint
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
//   set_application
//   set_attached_to
//   set_default
//   set_default_geometry
//   set_default_size
//   set_focus
//   set_geometry_hints
//   set_gravity
//   set_icon
//   set_icon_from_file
//   set_icon_list
//   set_mnemonic_modifier
//   set_position
//   set_screen
//   set_titlebar
//   set_transient_for
//   set_type_hint
//   set_wmclass
//   stick
//   unfullscreen
//   unmaximize
//   unstick
//   set_has_user_ref_count
//   set_keep_above
//   set_keep_below
//   set_startup_id
package org.gnome.gtk

import gtk3.GtkWindow
import gtk3.gtk_window_get_accept_focus
import gtk3.gtk_window_get_decorated
import gtk3.gtk_window_get_deletable
import gtk3.gtk_window_get_destroy_with_parent
import gtk3.gtk_window_get_focus_on_map
import gtk3.gtk_window_get_focus_visible
import gtk3.gtk_window_get_has_resize_grip
import gtk3.gtk_window_get_hide_titlebar_when_maximized
import gtk3.gtk_window_get_icon_name
import gtk3.gtk_window_get_mnemonics_visible
import gtk3.gtk_window_get_modal
import gtk3.gtk_window_get_opacity
import gtk3.gtk_window_get_resizable
import gtk3.gtk_window_get_role
import gtk3.gtk_window_get_skip_pager_hint
import gtk3.gtk_window_get_skip_taskbar_hint
import gtk3.gtk_window_get_title
import gtk3.gtk_window_get_urgency_hint
import gtk3.gtk_window_set_accept_focus
import gtk3.gtk_window_set_decorated
import gtk3.gtk_window_set_deletable
import gtk3.gtk_window_set_destroy_with_parent
import gtk3.gtk_window_set_focus_on_map
import gtk3.gtk_window_set_focus_visible
import gtk3.gtk_window_set_has_resize_grip
import gtk3.gtk_window_set_hide_titlebar_when_maximized
import gtk3.gtk_window_set_icon_name
import gtk3.gtk_window_set_mnemonics_visible
import gtk3.gtk_window_set_modal
import gtk3.gtk_window_set_opacity
import gtk3.gtk_window_set_resizable
import gtk3.gtk_window_set_role
import gtk3.gtk_window_set_skip_pager_hint
import gtk3.gtk_window_set_skip_taskbar_hint
import gtk3.gtk_window_set_title
import gtk3.gtk_window_set_urgency_hint
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Window = CPointer<GtkWindow>

public val Window.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Window.asWidget: Widget
  get() = reinterpret()

public val Window.asContainer: Container
  get() = reinterpret()

public val Window.asBin: Bin
  get() = reinterpret()

public var Window.acceptFocus: Boolean
  get() = gtk_window_get_accept_focus(this).toBoolean
  set(`value`) {
    gtk_window_set_accept_focus(this, value.toInt)
  }

public var Window.decorated: Boolean
  get() = gtk_window_get_decorated(this).toBoolean
  set(`value`) {
    gtk_window_set_decorated(this, value.toInt)
  }

public var Window.deletable: Boolean
  get() = gtk_window_get_deletable(this).toBoolean
  set(`value`) {
    gtk_window_set_deletable(this, value.toInt)
  }

public var Window.destroyWithParent: Boolean
  get() = gtk_window_get_destroy_with_parent(this).toBoolean
  set(`value`) {
    gtk_window_set_destroy_with_parent(this, value.toInt)
  }

public var Window.focusOnMap: Boolean
  get() = gtk_window_get_focus_on_map(this).toBoolean
  set(`value`) {
    gtk_window_set_focus_on_map(this, value.toInt)
  }

public var Window.focusVisible: Boolean
  get() = gtk_window_get_focus_visible(this).toBoolean
  set(`value`) {
    gtk_window_set_focus_visible(this, value.toInt)
  }

public var Window.hasResizeGrip: Boolean
  get() = gtk_window_get_has_resize_grip(this).toBoolean
  set(`value`) {
    gtk_window_set_has_resize_grip(this, value.toInt)
  }

public var Window.hideTitlebarWhenMaximized: Boolean
  get() = gtk_window_get_hide_titlebar_when_maximized(this).toBoolean
  set(`value`) {
    gtk_window_set_hide_titlebar_when_maximized(this, value.toInt)
  }

public var Window.iconName: String?
  get() = gtk_window_get_icon_name(this).toKString
  set(`value`) {
    gtk_window_set_icon_name(this, value)
  }

public var Window.mnemonicsVisible: Boolean
  get() = gtk_window_get_mnemonics_visible(this).toBoolean
  set(`value`) {
    gtk_window_set_mnemonics_visible(this, value.toInt)
  }

public var Window.modal: Boolean
  get() = gtk_window_get_modal(this).toBoolean
  set(`value`) {
    gtk_window_set_modal(this, value.toInt)
  }

public var Window.opacity: Double
  get() = gtk_window_get_opacity(this)
  set(`value`) {
    gtk_window_set_opacity(this, value)
  }

public var Window.resizable: Boolean
  get() = gtk_window_get_resizable(this).toBoolean
  set(`value`) {
    gtk_window_set_resizable(this, value.toInt)
  }

public var Window.role: String?
  get() = gtk_window_get_role(this).toKString
  set(`value`) {
    gtk_window_set_role(this, value)
  }

public var Window.skipPagerHint: Boolean
  get() = gtk_window_get_skip_pager_hint(this).toBoolean
  set(`value`) {
    gtk_window_set_skip_pager_hint(this, value.toInt)
  }

public var Window.skipTaskbarHint: Boolean
  get() = gtk_window_get_skip_taskbar_hint(this).toBoolean
  set(`value`) {
    gtk_window_set_skip_taskbar_hint(this, value.toInt)
  }

public var Window.title: String?
  get() = gtk_window_get_title(this).toKString
  set(`value`) {
    gtk_window_set_title(this, value)
  }

public var Window.urgencyHint: Boolean
  get() = gtk_window_get_urgency_hint(this).toBoolean
  set(`value`) {
    gtk_window_set_urgency_hint(this, value.toInt)
  }
