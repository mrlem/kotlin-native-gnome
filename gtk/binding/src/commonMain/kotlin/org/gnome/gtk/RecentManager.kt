// TODO - method: get_items
// TODO - method: lookup_item
// TODO - method: move_item
// TODO - method: purge_items
// TODO - method: remove_item
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkRecentManager
import gtk3.gtk_recent_manager_add_full
import gtk3.gtk_recent_manager_add_item
import gtk3.gtk_recent_manager_has_item
import gtk3.gtk_recent_manager_new
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean

public typealias RecentManager = CPointer<GtkRecentManager>

public val RecentManager.asObject: Object
  get() = reinterpret()

public object RecentManagerFactory {
  public fun new(): RecentManager = gtk_recent_manager_new()!!.reinterpret()
}

public fun RecentManager.addFull(uri: String, recentData: RecentData?): Boolean =
    gtk_recent_manager_add_full(this, uri, recentData?.reinterpret()).toBoolean

public fun RecentManager.addItem(uri: String): Boolean = gtk_recent_manager_add_item(this,
    uri).toBoolean

public fun RecentManager.hasItem(uri: String): Boolean = gtk_recent_manager_has_item(this,
    uri).toBoolean

public fun RecentManager.onChanged(callback: (RecentManager) -> Unit): RecentManager {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
