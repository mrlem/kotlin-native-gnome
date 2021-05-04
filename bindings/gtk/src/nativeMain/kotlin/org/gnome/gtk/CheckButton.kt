@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCheckButton
import interop.gtk_check_button_new
import interop.gtk_check_button_new_with_label
import interop.gtk_check_button_new_with_mnemonic
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CheckButton = CPointer<GtkCheckButton>

public val CheckButton.asObject: Object
  get() = reinterpret()

public val CheckButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CheckButton.asWidget: Widget
  get() = reinterpret()

public val CheckButton.asContainer: Container
  get() = reinterpret()

public val CheckButton.asBin: Bin
  get() = reinterpret()

public val CheckButton.asButton: Button
  get() = reinterpret()

public val CheckButton.asToggleButton: ToggleButton
  get() = reinterpret()

public object CheckButtonFactory {
  public fun new(): CheckButton = gtk_check_button_new()!!.reinterpret()

  public fun newWithLabel(label: String?): CheckButton =
      gtk_check_button_new_with_label(label)!!.reinterpret()

  public fun newWithMnemonic(label: String?): CheckButton =
      gtk_check_button_new_with_mnemonic(label)!!.reinterpret()
}

public val CheckButton.toggleButton: ToggleButton
  get() = pointed.toggle_button.ptr
