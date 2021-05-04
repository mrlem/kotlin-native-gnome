// TODO - method: activate_key
// TODO - method: begin_resize_drag
// TODO - method: fullscreen_on_monitor
// TODO - method: get_default_size
// TODO - method: get_gravity
// TODO - method: get_has_resize_grip
// TODO - method: get_icon
// TODO - method: get_icon_list
// TODO - method: get_mnemonic_modifier
// TODO - method: get_opacity
// TODO - method: get_position
// TODO - method: get_resize_grip_area
// TODO - method: get_screen
// TODO - method: get_size
// TODO - method: get_type_hint
// TODO - method: mnemonic_activate
// TODO - method: parse_geometry
// TODO - method: propagate_key_event
// TODO - method: reshow_with_initial_size
// TODO - method: resize_grip_is_visible
// TODO - method: resize_to_geometry
// TODO - method: set_default_geometry
// TODO - method: set_geometry_hints
// TODO - method: set_gravity
// TODO - method: set_has_resize_grip
// TODO - method: set_icon
// TODO - method: set_icon_list
// TODO - method: set_mnemonic_modifier
// TODO - method: set_opacity
// TODO - method: set_screen
// TODO - method: set_type_hint
// TODO - method: set_wmclass
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkWindow
import interop.gtk_window_activate_default
import interop.gtk_window_activate_focus
import interop.gtk_window_add_accel_group
import interop.gtk_window_add_mnemonic
import interop.gtk_window_begin_move_drag
import interop.gtk_window_close
import interop.gtk_window_deiconify
import interop.gtk_window_fullscreen
import interop.gtk_window_get_accept_focus
import interop.gtk_window_get_application
import interop.gtk_window_get_attached_to
import interop.gtk_window_get_decorated
import interop.gtk_window_get_default_widget
import interop.gtk_window_get_deletable
import interop.gtk_window_get_destroy_with_parent
import interop.gtk_window_get_focus
import interop.gtk_window_get_focus_on_map
import interop.gtk_window_get_focus_visible
import interop.gtk_window_get_group
import interop.gtk_window_get_hide_titlebar_when_maximized
import interop.gtk_window_get_icon_name
import interop.gtk_window_get_mnemonics_visible
import interop.gtk_window_get_modal
import interop.gtk_window_get_resizable
import interop.gtk_window_get_role
import interop.gtk_window_get_skip_pager_hint
import interop.gtk_window_get_skip_taskbar_hint
import interop.gtk_window_get_title
import interop.gtk_window_get_titlebar
import interop.gtk_window_get_transient_for
import interop.gtk_window_get_urgency_hint
import interop.gtk_window_get_window_type
import interop.gtk_window_has_group
import interop.gtk_window_has_toplevel_focus
import interop.gtk_window_iconify
import interop.gtk_window_is_active
import interop.gtk_window_is_maximized
import interop.gtk_window_maximize
import interop.gtk_window_move
import interop.gtk_window_new
import interop.gtk_window_present
import interop.gtk_window_present_with_time
import interop.gtk_window_remove_accel_group
import interop.gtk_window_remove_mnemonic
import interop.gtk_window_resize
import interop.gtk_window_set_accept_focus
import interop.gtk_window_set_application
import interop.gtk_window_set_attached_to
import interop.gtk_window_set_decorated
import interop.gtk_window_set_default
import interop.gtk_window_set_default_size
import interop.gtk_window_set_deletable
import interop.gtk_window_set_destroy_with_parent
import interop.gtk_window_set_focus
import interop.gtk_window_set_focus_on_map
import interop.gtk_window_set_focus_visible
import interop.gtk_window_set_has_user_ref_count
import interop.gtk_window_set_hide_titlebar_when_maximized
import interop.gtk_window_set_icon_from_file
import interop.gtk_window_set_icon_name
import interop.gtk_window_set_keep_above
import interop.gtk_window_set_keep_below
import interop.gtk_window_set_mnemonics_visible
import interop.gtk_window_set_modal
import interop.gtk_window_set_position
import interop.gtk_window_set_resizable
import interop.gtk_window_set_role
import interop.gtk_window_set_skip_pager_hint
import interop.gtk_window_set_skip_taskbar_hint
import interop.gtk_window_set_startup_id
import interop.gtk_window_set_title
import interop.gtk_window_set_titlebar
import interop.gtk_window_set_transient_for
import interop.gtk_window_set_urgency_hint
import interop.gtk_window_stick
import interop.gtk_window_unfullscreen
import interop.gtk_window_unmaximize
import interop.gtk_window_unstick
import kotlin.Boolean
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
import org.gnome.glib.Error
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

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

public object WindowFactory {
  public fun new(type: WindowType): Window = gtk_window_new(type)!!.reinterpret()
}

public val Window.bin: Bin
  get() = pointed.bin.ptr

public var Window.acceptFocus: Boolean
  get() = gtk_window_get_accept_focus(this).toBoolean()
  set(`value`) {
    gtk_window_set_accept_focus(this@acceptFocus, `value`.toInt())
  }

public var Window.application: Application?
  get() = gtk_window_get_application(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_application(this@application, `value`)
  }

public var Window.attachedTo: Widget?
  get() = gtk_window_get_attached_to(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_attached_to(this@attachedTo, `value`)
  }

public var Window.decorated: Boolean
  get() = gtk_window_get_decorated(this).toBoolean()
  set(`value`) {
    gtk_window_set_decorated(this@decorated, `value`.toInt())
  }

public val Window.defaultWidget: Widget?
  get() = gtk_window_get_default_widget(this)?.reinterpret()

public var Window.deletable: Boolean
  get() = gtk_window_get_deletable(this).toBoolean()
  set(`value`) {
    gtk_window_set_deletable(this@deletable, `value`.toInt())
  }

public var Window.destroyWithParent: Boolean
  get() = gtk_window_get_destroy_with_parent(this).toBoolean()
  set(`value`) {
    gtk_window_set_destroy_with_parent(this@destroyWithParent, `value`.toInt())
  }

public var Window.focus: Widget?
  get() = gtk_window_get_focus(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_focus(this@focus, `value`)
  }

public var Window.focusOnMap: Boolean
  get() = gtk_window_get_focus_on_map(this).toBoolean()
  set(`value`) {
    gtk_window_set_focus_on_map(this@focusOnMap, `value`.toInt())
  }

public var Window.focusVisible: Boolean
  get() = gtk_window_get_focus_visible(this).toBoolean()
  set(`value`) {
    gtk_window_set_focus_visible(this@focusVisible, `value`.toInt())
  }

public val Window.group: WindowGroup?
  get() = gtk_window_get_group(this)?.reinterpret()

public var Window.hideTitlebarWhenMaximized: Boolean
  get() = gtk_window_get_hide_titlebar_when_maximized(this).toBoolean()
  set(`value`) {
    gtk_window_set_hide_titlebar_when_maximized(this@hideTitlebarWhenMaximized, `value`.toInt())
  }

public var Window.iconName: String?
  get() = gtk_window_get_icon_name(this).toKString()
  set(`value`) {
    gtk_window_set_icon_name(this@iconName, `value`)
  }

public var Window.mnemonicsVisible: Boolean
  get() = gtk_window_get_mnemonics_visible(this).toBoolean()
  set(`value`) {
    gtk_window_set_mnemonics_visible(this@mnemonicsVisible, `value`.toInt())
  }

public var Window.modal: Boolean
  get() = gtk_window_get_modal(this).toBoolean()
  set(`value`) {
    gtk_window_set_modal(this@modal, `value`.toInt())
  }

public var Window.resizable: Boolean
  get() = gtk_window_get_resizable(this).toBoolean()
  set(`value`) {
    gtk_window_set_resizable(this@resizable, `value`.toInt())
  }

public var Window.role: String?
  get() = gtk_window_get_role(this).toKString()
  set(`value`) {
    gtk_window_set_role(this@role, `value`)
  }

public var Window.skipPagerHint: Boolean
  get() = gtk_window_get_skip_pager_hint(this).toBoolean()
  set(`value`) {
    gtk_window_set_skip_pager_hint(this@skipPagerHint, `value`.toInt())
  }

public var Window.skipTaskbarHint: Boolean
  get() = gtk_window_get_skip_taskbar_hint(this).toBoolean()
  set(`value`) {
    gtk_window_set_skip_taskbar_hint(this@skipTaskbarHint, `value`.toInt())
  }

public var Window.title: String?
  get() = gtk_window_get_title(this).toKString()
  set(`value`) {
    gtk_window_set_title(this@title, `value`)
  }

public var Window.titlebar: Widget?
  get() = gtk_window_get_titlebar(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_titlebar(this@titlebar, `value`)
  }

public var Window.transientFor: Window?
  get() = gtk_window_get_transient_for(this)?.reinterpret()
  set(`value`) {
    gtk_window_set_transient_for(this@transientFor, `value`)
  }

public var Window.urgencyHint: Boolean
  get() = gtk_window_get_urgency_hint(this).toBoolean()
  set(`value`) {
    gtk_window_set_urgency_hint(this@urgencyHint, `value`.toInt())
  }

public val Window.windowType: WindowType
  get() = gtk_window_get_window_type(this)

public fun Window.activateDefault(): Boolean =
    gtk_window_activate_default(this@activateDefault).toBoolean()

public fun Window.activateFocus(): Boolean =
    gtk_window_activate_focus(this@activateFocus).toBoolean()

public fun Window.addAccelGroup(accelGroup: AccelGroup?): Unit {
  gtk_window_add_accel_group(this@addAccelGroup, accelGroup?.reinterpret())
}

public fun Window.addMnemonic(keyval: UInt, target: Widget?): Unit {
  gtk_window_add_mnemonic(this@addMnemonic, keyval, target?.reinterpret())
}

public fun Window.beginMoveDrag(
  button: Int,
  rootX: Int,
  rootY: Int,
  timestamp: UInt
): Unit {
  gtk_window_begin_move_drag(this@beginMoveDrag, button, rootX, rootY, timestamp)
}

public fun Window.close(): Unit {
  gtk_window_close(this@close)
}

public fun Window.deiconify(): Unit {
  gtk_window_deiconify(this@deiconify)
}

public fun Window.fullscreen(): Unit {
  gtk_window_fullscreen(this@fullscreen)
}

public fun Window.hasGroup(): Boolean = gtk_window_has_group(this@hasGroup).toBoolean()

public fun Window.hasToplevelFocus(): Boolean =
    gtk_window_has_toplevel_focus(this@hasToplevelFocus).toBoolean()

public fun Window.iconify(): Unit {
  gtk_window_iconify(this@iconify)
}

public fun Window.isActive(): Boolean = gtk_window_is_active(this@isActive).toBoolean()

public fun Window.isMaximized(): Boolean = gtk_window_is_maximized(this@isMaximized).toBoolean()

public fun Window.maximize(): Unit {
  gtk_window_maximize(this@maximize)
}

public fun Window.move(x: Int, y: Int): Unit {
  gtk_window_move(this@move, x, y)
}

public fun Window.present(): Unit {
  gtk_window_present(this@present)
}

public fun Window.presentWithTime(timestamp: UInt): Unit {
  gtk_window_present_with_time(this@presentWithTime, timestamp)
}

public fun Window.removeAccelGroup(accelGroup: AccelGroup?): Unit {
  gtk_window_remove_accel_group(this@removeAccelGroup, accelGroup?.reinterpret())
}

public fun Window.removeMnemonic(keyval: UInt, target: Widget?): Unit {
  gtk_window_remove_mnemonic(this@removeMnemonic, keyval, target?.reinterpret())
}

public fun Window.resize(width: Int, height: Int): Unit {
  gtk_window_resize(this@resize, width, height)
}

public fun Window.setDefault(defaultWidget: Widget?): Unit {
  gtk_window_set_default(this@setDefault, defaultWidget?.reinterpret())
}

public fun Window.setDefaultSize(width: Int, height: Int): Unit {
  gtk_window_set_default_size(this@setDefaultSize, width, height)
}

public fun Window.setHasUserRefCount(setting: Boolean): Unit {
  gtk_window_set_has_user_ref_count(this@setHasUserRefCount, setting.toInt())
}

@Throws(Error::class)
public fun Window.setIconFromFile(filename: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_window_set_icon_from_file(this@setIconFromFile, filename,
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Window.setKeepAbove(setting: Boolean): Unit {
  gtk_window_set_keep_above(this@setKeepAbove, setting.toInt())
}

public fun Window.setKeepBelow(setting: Boolean): Unit {
  gtk_window_set_keep_below(this@setKeepBelow, setting.toInt())
}

public fun Window.setPosition(position: WindowPosition): Unit {
  gtk_window_set_position(this@setPosition, position)
}

public fun Window.setStartupId(startupId: String?): Unit {
  gtk_window_set_startup_id(this@setStartupId, startupId)
}

public fun Window.stick(): Unit {
  gtk_window_stick(this@stick)
}

public fun Window.unfullscreen(): Unit {
  gtk_window_unfullscreen(this@unfullscreen)
}

public fun Window.unmaximize(): Unit {
  gtk_window_unmaximize(this@unmaximize)
}

public fun Window.unstick(): Unit {
  gtk_window_unstick(this@unstick)
}

public fun Window.onActivateDefault(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("activate-default") { callback(this) }
  return this
}

public fun Window.onActivateFocus(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("activate-focus") { callback(this) }
  return this
}

public fun Window.onEnableDebugging(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("enable-debugging") { callback(this) }
  return this
}

public fun Window.onKeysChanged(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("keys-changed") { callback(this) }
  return this
}

public fun Window.onSetFocus(callback: (Window) -> Unit): Window {
  // TODO - handle callback data

  asObject.connect("set-focus") { callback(this) }
  return this
}
