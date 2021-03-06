// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFileChooserDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias FileChooserDialog = CPointer<GtkFileChooserDialog>

public val FileChooserDialog.asObject: Object
  get() = reinterpret()

public val FileChooserDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FileChooserDialog.asWidget: Widget
  get() = reinterpret()

public val FileChooserDialog.asContainer: Container
  get() = reinterpret()

public val FileChooserDialog.asBin: Bin
  get() = reinterpret()

public val FileChooserDialog.asWindow: Window
  get() = reinterpret()

public val FileChooserDialog.asDialog: Dialog
  get() = reinterpret()

public object FileChooserDialogFactory

public val FileChooserDialog.parentInstance: Dialog
  get() = pointed.parent_instance.ptr
