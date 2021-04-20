// TODO - get_group
// TODO - set_group
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkRadioToolButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias RadioToolButton = CPointer<GtkRadioToolButton>

public val RadioToolButton.asObject: Object
  get() = reinterpret()

public val RadioToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioToolButton.asWidget: Widget
  get() = reinterpret()

public val RadioToolButton.asContainer: Container
  get() = reinterpret()

public val RadioToolButton.asBin: Bin
  get() = reinterpret()

public val RadioToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val RadioToolButton.asToolButton: ToolButton
  get() = reinterpret()

public val RadioToolButton.asToggleToolButton: ToggleToolButton
  get() = reinterpret()
