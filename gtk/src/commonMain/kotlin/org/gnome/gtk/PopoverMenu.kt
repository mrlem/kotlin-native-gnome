// TODO - implement:
//   open_submenu
package org.gnome.gtk

import gtk3.GtkPopoverMenu
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias PopoverMenu = CPointer<GtkPopoverMenu>

public val PopoverMenu.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val PopoverMenu.asWidget: Widget
  get() = reinterpret()

public val PopoverMenu.asContainer: Container
  get() = reinterpret()

public val PopoverMenu.asBin: Bin
  get() = reinterpret()

public val PopoverMenu.asPopover: Popover
  get() = reinterpret()
