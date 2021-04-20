// TODO - activate_key
// TODO - begin_resize_drag
// TODO - fullscreen_on_monitor
// TODO - get_default_size
// TODO - get_gravity
// TODO - get_has_resize_grip
// TODO - get_icon
// TODO - get_icon_list
// TODO - get_mnemonic_modifier
// TODO - get_opacity
// TODO - get_position
// TODO - get_resize_grip_area
// TODO - get_screen
// TODO - get_size
// TODO - get_type_hint
// TODO - mnemonic_activate
// TODO - parse_geometry
// TODO - propagate_key_event
// TODO - reshow_with_initial_size
// TODO - resize_grip_is_visible
// TODO - resize_to_geometry
// TODO - set_default_geometry
// TODO - set_geometry_hints
// TODO - set_gravity
// TODO - set_has_resize_grip
// TODO - set_icon
// TODO - set_icon_from_file
// TODO - set_icon_list
// TODO - set_mnemonic_modifier
// TODO - set_opacity
// TODO - set_screen
// TODO - set_type_hint
// TODO - set_wmclass
//
package org.gnome.gtk

import gtk3.GtkWindow
import gtk3.gtk_window_activate_default
import gtk3.gtk_window_activate_focus
import gtk3.gtk_window_add_accel_group
import gtk3.gtk_window_add_mnemonic
import gtk3.gtk_window_begin_move_drag
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
import gtk3.gtk_window_get_group
import gtk3.gtk_window_get_hide_titlebar_when_maximized
import gtk3.gtk_window_get_icon_name
import gtk3.gtk_window_get_mnemonics_visible
import gtk3.gtk_window_get_modal
import gtk3.gtk_window_get_resizable
import gtk3.gtk_window_get_role
import gtk3.gtk_window_get_skip_pager_hint
import gtk3.gtk_window_get_skip_taskbar_hint
import gtk3.gtk_window_get_title
import gtk3.gtk_window_get_titlebar
import gtk3.gtk_window_get_transient_for
import gtk3.gtk_window_get_urgency_hint
import gtk3.gtk_window_get_window_type
import gtk3.gtk_window_has_group
import gtk3.gtk_window_has_toplevel_focus
import gtk3.gtk_window_iconify
import gtk3.gtk_window_is_active
import gtk3.gtk_window_is_maximized
import gtk3.gtk_window_maximize
import gtk3.gtk_window_move
import gtk3.gtk_window_present
import gtk3.gtk_window_present_with_time
import gtk3.gtk_window_remove_accel_group
import gtk3.gtk_window_remove_mnemonic
import gtk3.gtk_window_resize
import gtk3.gtk_window_set_accept_focus
import gtk3.gtk_window_set_application
import gtk3.gtk_window_set_attached_to
import gtk3.gtk_window_set_decorated
import gtk3.gtk_window_set_default
import gtk3.gtk_window_set_default_size
import gtk3.gtk_window_set_deletable
import gtk3.gtk_window_set_destroy_with_parent
import gtk3.gtk_window_set_focus
import gtk3.gtk_window_set_focus_on_map
import gtk3.gtk_window_set_focus_visible
import gtk3.gtk_window_set_has_user_ref_count
import gtk3.gtk_window_set_hide_titlebar_when_maximized
import gtk3.gtk_window_set_icon_name
import gtk3.gtk_window_set_keep_above
import gtk3.gtk_window_set_keep_below
import gtk3.gtk_window_set_mnemonics_visible
import gtk3.gtk_window_set_modal
import gtk3.gtk_window_set_position
import gtk3.gtk_window_set_resizable
import gtk3.gtk_window_set_role
import gtk3.gtk_window_set_skip_pager_hint
import gtk3.gtk_window_set_skip_taskbar_hint
import gtk3.gtk_window_set_startup_id
import gtk3.gtk_window_set_title
import gtk3.gtk_window_set_titlebar
import gtk3.gtk_window_set_transient_for
import gtk3.gtk_window_set_urgency_hint
import gtk3.gtk_window_stick
import gtk3.gtk_window_unfullscreen
import gtk3.gtk_window_unmaximize
import gtk3.gtk_window_unstick
import kotlin.Boolean
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

public var Window.acceptFocus: Boolean
  get() = gtk_window_get_accept_focus(this).toBoolean
  set(`value`) {
    gtk_window_set_accept_focus(this, value.toInt)
  }

public var Window.application: Application?
  get() = gtk_window_get_application(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_application(this, value)
  }

public var Window.attachedTo: Widget?
  get() = gtk_window_get_attached_to(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_attached_to(this, value)
  }

public var Window.decorated: Boolean
  get() = gtk_window_get_decorated(this).toBoolean
  set(`value`) {
    gtk_window_set_decorated(this, value.toInt)
  }

public val Window.defaultWidget: Widget?
  get() = gtk_window_get_default_widget(this)?.reinterpret()

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

public var Window.focus: Widget?
  get() = gtk_window_get_focus(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_focus(this, value)
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

public val Window.group: WindowGroup?
  get() = gtk_window_get_group(this)?.reinterpret()

public var Window.hideTitlebarWhenMaximized: Boolean
  get() = gtk_window_get_hide_titlebar_when_maximized(this).toBoolean
  set(`value`) {
    gtk_window_set_hide_titlebar_when_maximized(this, value.toInt)
  }

public var Window.iconName: String
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

public var Window.resizable: Boolean
  get() = gtk_window_get_resizable(this).toBoolean
  set(`value`) {
    gtk_window_set_resizable(this, value.toInt)
  }

public var Window.role: String
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

public var Window.title: String
  get() = gtk_window_get_title(this).toKString
  set(`value`) {
    gtk_window_set_title(this, value)
  }

public var Window.titlebar: Widget?
  get() = gtk_window_get_titlebar(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_titlebar(this, value)
  }

public var Window.transientFor: Window?
  get() = gtk_window_get_transient_for(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_transient_for(this, value)
  }

public var Window.urgencyHint: Boolean
  get() = gtk_window_get_urgency_hint(this).toBoolean
  set(`value`) {
    gtk_window_set_urgency_hint(this, value.toInt)
  }

public val Window.windowType: WindowType
  get() = gtk_window_get_window_type(this)

public fun Window.activateDefault(): Boolean = gtk_window_activate_default(this).toBoolean

public fun Window.activateFocus(): Boolean = gtk_window_activate_focus(this).toBoolean

public fun Window.addAccelGroup(accelGroup: AccelGroup?): Unit {
  gtk_window_add_accel_group(this, accelGroup?.reinterpret())
}

public fun Window.addMnemonic(keyval: UInt, target: Widget?): Unit {
  gtk_window_add_mnemonic(this, keyval, target?.reinterpret())
}

public fun Window.beginMoveDrag(
  button: Int,
  rootX: Int,
  rootY: Int,
  timestamp: UInt
): Unit {
  gtk_window_begin_move_drag(this, button, rootX, rootY, timestamp)
}

public fun Window.close(): Unit {
  gtk_window_close(this)
}

public fun Window.deiconify(): Unit {
  gtk_window_deiconify(this)
}

public fun Window.fullscreen(): Unit {
  gtk_window_fullscreen(this)
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

public fun Window.move(x: Int, y: Int): Unit {
  gtk_window_move(this, x, y)
}

public fun Window.present(): Unit {
  gtk_window_present(this)
}

public fun Window.presentWithTime(timestamp: UInt): Unit {
  gtk_window_present_with_time(this, timestamp)
}

public fun Window.removeAccelGroup(accelGroup: AccelGroup?): Unit {
  gtk_window_remove_accel_group(this, accelGroup?.reinterpret())
}

public fun Window.removeMnemonic(keyval: UInt, target: Widget?): Unit {
  gtk_window_remove_mnemonic(this, keyval, target?.reinterpret())
}

public fun Window.resize(width: Int, height: Int): Unit {
  gtk_window_resize(this, width, height)
}

public fun Window.setDefault(defaultWidget: Widget?): Unit {
  gtk_window_set_default(this, defaultWidget?.reinterpret())
}

public fun Window.setDefaultSize(width: Int, height: Int): Unit {
  gtk_window_set_default_size(this, width, height)
}

public fun Window.setHasUserRefCount(setting: Boolean): Unit {
  gtk_window_set_has_user_ref_count(this, setting.toInt)
}

public fun Window.setKeepAbove(setting: Boolean): Unit {
  gtk_window_set_keep_above(this, setting.toInt)
}

public fun Window.setKeepBelow(setting: Boolean): Unit {
  gtk_window_set_keep_below(this, setting.toInt)
}

public fun Window.setPosition(position: WindowPosition): Unit {
  gtk_window_set_position(this, position)
}

public fun Window.setStartupId(startupId: String): Unit {
  gtk_window_set_startup_id(this, startupId)
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
