// TODO - signal: desktop-folder
// TODO - signal: down-folder
// TODO - signal: home-folder
// TODO - signal: location-popup
// TODO - signal: location-popup-on-paste
// TODO - signal: location-toggle-popup
// TODO - signal: places-shortcut
// TODO - signal: quick-bookmark
// TODO - signal: recent-shortcut
// TODO - signal: search-shortcut
// TODO - signal: show-hidden
// TODO - signal: up-folder
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkFileChooserWidget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias FileChooserWidget = CPointer<GtkFileChooserWidget>

public val FileChooserWidget.asObject: Object
  get() = reinterpret()

public val FileChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FileChooserWidget.asWidget: Widget
  get() = reinterpret()

public val FileChooserWidget.asContainer: Container
  get() = reinterpret()

public val FileChooserWidget.asBox: Box
  get() = reinterpret()
