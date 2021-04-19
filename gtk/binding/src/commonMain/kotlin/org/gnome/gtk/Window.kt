// TODO - activate_key
// TODO - begin_resize_drag
// TODO - fullscreen_on_monitor
// TODO - get_default_size
// TODO - get_gravity
// TODO - get_icon
// TODO - get_icon_list
// TODO - get_mnemonic_modifier
// TODO - get_position
// TODO - get_screen
// TODO - get_size
// TODO - get_type_hint
// TODO - get_window_type
// TODO - mnemonic_activate
// TODO - propagate_key_event
// TODO - set_geometry_hints
// TODO - set_gravity
// TODO - set_icon
// TODO - set_icon_from_file
// TODO - set_icon_list
// TODO - set_mnemonic_modifier
// TODO - set_position
// TODO - set_screen
// TODO - set_type_hint
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

public fun Window.activateDefault(): Boolean = gtk_window_activate_default(this).toBoolean

public fun Window.activateFocus(): Boolean = gtk_window_activate_focus(this).toBoolean

public fun Window.addAccelGroup(accelGroup: AccelGroup): Unit {
  gtk_window_add_accel_group(this, accelGroup.reinterpret())
}

public fun Window.addMnemonic(keyval: UInt, target: Widget): Unit {
  gtk_window_add_mnemonic(this, keyval, target.reinterpret())
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

public fun Window.getAcceptFocus(): Boolean = gtk_window_get_accept_focus(this).toBoolean

public fun Window.getApplication(): Application? = gtk_window_get_application(this)?.reinterpret()

public fun Window.getAttachedTo(): Widget? = gtk_window_get_attached_to(this)?.reinterpret()

public fun Window.getDecorated(): Boolean = gtk_window_get_decorated(this).toBoolean

public fun Window.getDefaultWidget(): Widget? = gtk_window_get_default_widget(this)?.reinterpret()

public fun Window.getDeletable(): Boolean = gtk_window_get_deletable(this).toBoolean

public fun Window.getDestroyWithParent(): Boolean =
    gtk_window_get_destroy_with_parent(this).toBoolean

public fun Window.getFocus(): Widget? = gtk_window_get_focus(this)?.reinterpret()

public fun Window.getFocusOnMap(): Boolean = gtk_window_get_focus_on_map(this).toBoolean

public fun Window.getFocusVisible(): Boolean = gtk_window_get_focus_visible(this).toBoolean

public fun Window.getGroup(): WindowGroup? = gtk_window_get_group(this)?.reinterpret()

public fun Window.getHideTitlebarWhenMaximized(): Boolean =
    gtk_window_get_hide_titlebar_when_maximized(this).toBoolean

public fun Window.getIconName(): String = gtk_window_get_icon_name(this).toKString

public fun Window.getMnemonicsVisible(): Boolean = gtk_window_get_mnemonics_visible(this).toBoolean

public fun Window.getModal(): Boolean = gtk_window_get_modal(this).toBoolean

public fun Window.getResizable(): Boolean = gtk_window_get_resizable(this).toBoolean

public fun Window.getRole(): String = gtk_window_get_role(this).toKString

public fun Window.getSkipPagerHint(): Boolean = gtk_window_get_skip_pager_hint(this).toBoolean

public fun Window.getSkipTaskbarHint(): Boolean = gtk_window_get_skip_taskbar_hint(this).toBoolean

public fun Window.getTitle(): String = gtk_window_get_title(this).toKString

public fun Window.getTitlebar(): Widget? = gtk_window_get_titlebar(this)?.reinterpret()

public fun Window.getTransientFor(): Window? = gtk_window_get_transient_for(this)?.reinterpret()

public fun Window.getUrgencyHint(): Boolean = gtk_window_get_urgency_hint(this).toBoolean

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

public fun Window.removeAccelGroup(accelGroup: AccelGroup): Unit {
  gtk_window_remove_accel_group(this, accelGroup.reinterpret())
}

public fun Window.removeMnemonic(keyval: UInt, target: Widget): Unit {
  gtk_window_remove_mnemonic(this, keyval, target.reinterpret())
}

public fun Window.resize(width: Int, height: Int): Unit {
  gtk_window_resize(this, width, height)
}

public fun Window.setAcceptFocus(setting: Boolean): Unit {
  gtk_window_set_accept_focus(this, setting.toInt)
}

public fun Window.setApplication(application: Application): Unit {
  gtk_window_set_application(this, application.reinterpret())
}

public fun Window.setAttachedTo(attachWidget: Widget): Unit {
  gtk_window_set_attached_to(this, attachWidget.reinterpret())
}

public fun Window.setDecorated(setting: Boolean): Unit {
  gtk_window_set_decorated(this, setting.toInt)
}

public fun Window.setDefault(defaultWidget: Widget): Unit {
  gtk_window_set_default(this, defaultWidget.reinterpret())
}

public fun Window.setDefaultSize(width: Int, height: Int): Unit {
  gtk_window_set_default_size(this, width, height)
}

public fun Window.setDeletable(setting: Boolean): Unit {
  gtk_window_set_deletable(this, setting.toInt)
}

public fun Window.setDestroyWithParent(setting: Boolean): Unit {
  gtk_window_set_destroy_with_parent(this, setting.toInt)
}

public fun Window.setFocus(focus: Widget): Unit {
  gtk_window_set_focus(this, focus.reinterpret())
}

public fun Window.setFocusOnMap(setting: Boolean): Unit {
  gtk_window_set_focus_on_map(this, setting.toInt)
}

public fun Window.setFocusVisible(setting: Boolean): Unit {
  gtk_window_set_focus_visible(this, setting.toInt)
}

public fun Window.setHasUserRefCount(setting: Boolean): Unit {
  gtk_window_set_has_user_ref_count(this, setting.toInt)
}

public fun Window.setHideTitlebarWhenMaximized(setting: Boolean): Unit {
  gtk_window_set_hide_titlebar_when_maximized(this, setting.toInt)
}

public fun Window.setIconName(name: String?): Unit {
  gtk_window_set_icon_name(this, name)
}

public fun Window.setKeepAbove(setting: Boolean): Unit {
  gtk_window_set_keep_above(this, setting.toInt)
}

public fun Window.setKeepBelow(setting: Boolean): Unit {
  gtk_window_set_keep_below(this, setting.toInt)
}

public fun Window.setMnemonicsVisible(setting: Boolean): Unit {
  gtk_window_set_mnemonics_visible(this, setting.toInt)
}

public fun Window.setModal(modal: Boolean): Unit {
  gtk_window_set_modal(this, modal.toInt)
}

public fun Window.setResizable(resizable: Boolean): Unit {
  gtk_window_set_resizable(this, resizable.toInt)
}

public fun Window.setRole(role: String?): Unit {
  gtk_window_set_role(this, role)
}

public fun Window.setSkipPagerHint(setting: Boolean): Unit {
  gtk_window_set_skip_pager_hint(this, setting.toInt)
}

public fun Window.setSkipTaskbarHint(setting: Boolean): Unit {
  gtk_window_set_skip_taskbar_hint(this, setting.toInt)
}

public fun Window.setStartupId(startupId: String?): Unit {
  gtk_window_set_startup_id(this, startupId)
}

public fun Window.setTitle(title: String?): Unit {
  gtk_window_set_title(this, title)
}

public fun Window.setTitlebar(titlebar: Widget): Unit {
  gtk_window_set_titlebar(this, titlebar.reinterpret())
}

public fun Window.setTransientFor(parent: Window): Unit {
  gtk_window_set_transient_for(this, parent.reinterpret())
}

public fun Window.setUrgencyHint(setting: Boolean): Unit {
  gtk_window_set_urgency_hint(this, setting.toInt)
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
