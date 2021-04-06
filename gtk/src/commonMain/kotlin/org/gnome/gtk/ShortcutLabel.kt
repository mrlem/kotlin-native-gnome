package org.gnome.gtk

import gtk3.GtkShortcutLabel
import gtk3.gtk_shortcut_label_get_accelerator
import gtk3.gtk_shortcut_label_get_disabled_text
import gtk3.gtk_shortcut_label_set_accelerator
import gtk3.gtk_shortcut_label_set_disabled_text
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toKString

public typealias ShortcutLabel = CPointer<GtkShortcutLabel>

public val ShortcutLabel.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutLabel.asWidget: Widget
  get() = reinterpret()

public val ShortcutLabel.asContainer: Container
  get() = reinterpret()

public val ShortcutLabel.asBox: Box
  get() = reinterpret()

public var ShortcutLabel.accelerator: String?
  get() = gtk_shortcut_label_get_accelerator(this).toKString
  set(`value`) {
    gtk_shortcut_label_set_accelerator(this, value)
  }

public var ShortcutLabel.disabledText: String?
  get() = gtk_shortcut_label_get_disabled_text(this).toKString
  set(`value`) {
    gtk_shortcut_label_set_disabled_text(this, value)
  }
