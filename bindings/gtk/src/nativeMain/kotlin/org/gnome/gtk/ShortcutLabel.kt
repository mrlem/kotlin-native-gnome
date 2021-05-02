@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkShortcutLabel
import interop.gtk_shortcut_label_get_accelerator
import interop.gtk_shortcut_label_get_disabled_text
import interop.gtk_shortcut_label_new
import interop.gtk_shortcut_label_set_accelerator
import interop.gtk_shortcut_label_set_disabled_text
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias ShortcutLabel = CPointer<GtkShortcutLabel>

public val ShortcutLabel.asObject: Object
  get() = reinterpret()

public val ShortcutLabel.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutLabel.asWidget: Widget
  get() = reinterpret()

public val ShortcutLabel.asContainer: Container
  get() = reinterpret()

public val ShortcutLabel.asBox: Box
  get() = reinterpret()

public object ShortcutLabelFactory {
  public fun new(accelerator: String): ShortcutLabel =
      gtk_shortcut_label_new(accelerator)!!.reinterpret()
}

public var ShortcutLabel.accelerator: String
  get() = gtk_shortcut_label_get_accelerator(this).toKString
  set(`value`) {
    gtk_shortcut_label_set_accelerator(this, `value`)
  }

public var ShortcutLabel.disabledText: String
  get() = gtk_shortcut_label_get_disabled_text(this).toKString
  set(`value`) {
    gtk_shortcut_label_set_disabled_text(this, `value`)
  }
