@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkFileChooserWidget
import gtk3.gtk_file_chooser_widget_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect

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

public object FileChooserWidgetFactory {
  public fun new(action: FileChooserAction): FileChooserWidget =
      gtk_file_chooser_widget_new(action)!!.reinterpret()
}

public fun FileChooserWidget.onDesktopFolder(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("desktop-folder") { callback(this) }
  return this
}

public fun FileChooserWidget.onDownFolder(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("down-folder") { callback(this) }
  return this
}

public fun FileChooserWidget.onHomeFolder(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("home-folder") { callback(this) }
  return this
}

public fun FileChooserWidget.onLocationPopup(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("location-popup") { callback(this) }
  return this
}

public fun FileChooserWidget.onLocationPopupOnPaste(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("location-popup-on-paste") { callback(this) }
  return this
}

public fun FileChooserWidget.onLocationTogglePopup(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("location-toggle-popup") { callback(this) }
  return this
}

public fun FileChooserWidget.onPlacesShortcut(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("places-shortcut") { callback(this) }
  return this
}

public fun FileChooserWidget.onQuickBookmark(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("quick-bookmark") { callback(this) }
  return this
}

public fun FileChooserWidget.onRecentShortcut(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("recent-shortcut") { callback(this) }
  return this
}

public fun FileChooserWidget.onSearchShortcut(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("search-shortcut") { callback(this) }
  return this
}

public fun FileChooserWidget.onShowHidden(callback: (FileChooserWidget) -> Unit):
    FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("show-hidden") { callback(this) }
  return this
}

public fun FileChooserWidget.onUpFolder(callback: (FileChooserWidget) -> Unit): FileChooserWidget {
  // TODO - handle callback data

  asObject.connect("up-folder") { callback(this) }
  return this
}
