// TODO - implement:
//   activate_key
//   add_accel_group
//   add_mnemonic
//   begin_move_drag
//   begin_resize_drag
//   fullscreen_on_monitor
//   get_default_size
//   get_position
//   get_resize_grip_area
//   get_size
//   mnemonic_activate
//   move
//   parse_geometry
//   present_with_time
//   propagate_key_event
//   remove_accel_group
//   remove_mnemonic
//   resize
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
//   set_has_user_ref_count
//   set_keep_above
//   set_keep_below
//   set_startup_id
package org.gnome.gtk

import gtk3.GtkWindow
import gtk3.gtk_window_activate_default
import gtk3.gtk_window_activate_focus
import gtk3.gtk_window_close
import gtk3.gtk_window_deiconify
import gtk3.gtk_window_fullscreen
import gtk3.gtk_window_get_accept_focus
import gtk3.gtk_window_get_application
import gtk3.gtk_window_get_attached_to
import gtk3.gtk_window_get_decorated
import gtk3.gtk_window_get_default_widget
import gtk3.gtk_window_get_deletable
import gtk3.gtk_window_get_destroy_with_parent
import gtk3.gtk_window_get_focus
import gtk3.gtk_window_get_focus_on_map
import gtk3.gtk_window_get_focus_visible
import gtk3.gtk_window_get_gravity
import gtk3.gtk_window_get_group
import gtk3.gtk_window_get_has_resize_grip
import gtk3.gtk_window_get_hide_titlebar_when_maximized
import gtk3.gtk_window_get_icon
import gtk3.gtk_window_get_icon_list
import gtk3.gtk_window_get_icon_name
import gtk3.gtk_window_get_mnemonic_modifier
import gtk3.gtk_window_get_mnemonics_visible
import gtk3.gtk_window_get_modal
import gtk3.gtk_window_get_opacity
import gtk3.gtk_window_get_resizable
import gtk3.gtk_window_get_role
import gtk3.gtk_window_get_screen
import gtk3.gtk_window_get_skip_pager_hint
import gtk3.gtk_window_get_skip_taskbar_hint
import gtk3.gtk_window_get_title
import gtk3.gtk_window_get_titlebar
import gtk3.gtk_window_get_transient_for
import gtk3.gtk_window_get_type_hint
import gtk3.gtk_window_get_urgency_hint
import gtk3.gtk_window_get_window_type
import gtk3.gtk_window_has_group
import gtk3.gtk_window_has_toplevel_focus
import gtk3.gtk_window_iconify
import gtk3.gtk_window_is_active
import gtk3.gtk_window_is_maximized
import gtk3.gtk_window_maximize
import gtk3.gtk_window_present
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
import gtk3.gtk_window_stick
import gtk3.gtk_window_unfullscreen
import gtk3.gtk_window_unmaximize
import gtk3.gtk_window_unstick
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Window = CPointer<GtkWindow>

public val Window.asObject: Object
  get() = reinterpret()

public val Window.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Window.asWidget: Widget
  get() = reinterpret()

public val Window.asContainer: Container
  get() = reinterpret()

public val Window.asBin: Bin
  get() = reinterpret()

public fun Window.activateDefault(): Boolean = gtk_window_activate_default(this).toBoolean

public fun Window.activateFocus(): Boolean = gtk_window_activate_focus(this).toBoolean

public fun Window.close(): Unit {
  gtk_window_close(this)
}

public fun Window.deiconify(): Unit {
  gtk_window_deiconify(this)
}

public fun Window.fullscreen(): Unit {
  gtk_window_fullscreen(this)
}

public fun Window.getApplication(): Unit {
  gtk_window_get_application(this)
}

public fun Window.getAttachedTo(): Unit {
  gtk_window_get_attached_to(this)
}

public fun Window.getDefaultWidget(): Unit {
  gtk_window_get_default_widget(this)
}

public fun Window.getFocus(): Unit {
  gtk_window_get_focus(this)
}

public fun Window.getGravity(): Unit {
  gtk_window_get_gravity(this)
}

public fun Window.getGroup(): Unit {
  gtk_window_get_group(this)
}

public fun Window.getIcon(): Unit {
  gtk_window_get_icon(this)
}

public fun Window.getIconList(): Unit {
  gtk_window_get_icon_list(this)
}

public fun Window.getMnemonicModifier(): Unit {
  gtk_window_get_mnemonic_modifier(this)
}

public fun Window.getScreen(): Unit {
  gtk_window_get_screen(this)
}

public fun Window.getTitlebar(): Unit {
  gtk_window_get_titlebar(this)
}

public fun Window.getTransientFor(): Unit {
  gtk_window_get_transient_for(this)
}

public fun Window.getTypeHint(): Unit {
  gtk_window_get_type_hint(this)
}

public fun Window.getWindowType(): Unit {
  gtk_window_get_window_type(this)
}

public fun Window.hasGroup(): Boolean = gtk_window_has_group(this).toBoolean

public fun Window.hasToplevelFocus(): Boolean = gtk_window_has_toplevel_focus(this).toBoolean

public fun Window.iconify(): Unit {
  gtk_window_iconify(this)
}

public fun Window.isActive(): Boolean = gtk_window_is_active(this).toBoolean

public fun Window.isMaximized(): Boolean = gtk_window_is_maximized(this).toBoolean

public fun Window.maximize(): Unit {
  gtk_window_maximize(this)
}

public fun Window.present(): Unit {
  gtk_window_present(this)
}

public fun Window.stick(): Unit {
  gtk_window_stick(this)
}

public fun Window.unfullscreen(): Unit {
  gtk_window_unfullscreen(this)
}

public fun Window.unmaximize(): Unit {
  gtk_window_unmaximize(this)
}

public fun Window.unstick(): Unit {
  gtk_window_unstick(this)
}

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
