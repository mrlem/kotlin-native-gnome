// TODO - constructor: new
// TODO - constructor: new_for_manager
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkRecentChooserDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias RecentChooserDialog = CPointer<GtkRecentChooserDialog>

public val RecentChooserDialog.asObject: Object
  get() = reinterpret()

public val RecentChooserDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RecentChooserDialog.asWidget: Widget
  get() = reinterpret()

public val RecentChooserDialog.asContainer: Container
  get() = reinterpret()

public val RecentChooserDialog.asBin: Bin
  get() = reinterpret()

public val RecentChooserDialog.asWindow: Window
  get() = reinterpret()

public val RecentChooserDialog.asDialog: Dialog
  get() = reinterpret()

public object RecentChooserDialogFactory
