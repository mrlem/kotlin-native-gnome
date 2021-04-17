// TODO - implement:
//   set
package org.gnome.gtk

import gtk3.GtkAspectFrame
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias AspectFrame = CPointer<GtkAspectFrame>

public val AspectFrame.asObject: Object
  get() = reinterpret()

public val AspectFrame.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AspectFrame.asWidget: Widget
  get() = reinterpret()

public val AspectFrame.asContainer: Container
  get() = reinterpret()

public val AspectFrame.asBin: Bin
  get() = reinterpret()

public val AspectFrame.asFrame: Frame
  get() = reinterpret()
