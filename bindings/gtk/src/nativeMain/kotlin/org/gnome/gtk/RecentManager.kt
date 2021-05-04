// TODO - method: get_items
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkRecentManager
import interop.gtk_recent_manager_add_full
import interop.gtk_recent_manager_add_item
import interop.gtk_recent_manager_has_item
import interop.gtk_recent_manager_lookup_item
import interop.gtk_recent_manager_move_item
import interop.gtk_recent_manager_new
import interop.gtk_recent_manager_purge_items
import interop.gtk_recent_manager_remove_item
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias RecentManager = CPointer<GtkRecentManager>

public val RecentManager.asObject: Object
  get() = reinterpret()

public object RecentManagerFactory {
  public fun new(): RecentManager = gtk_recent_manager_new()!!.reinterpret()
}

public fun RecentManager.addFull(uri: String?, recentData: RecentData?): Boolean =
    gtk_recent_manager_add_full(this@addFull, uri, recentData?.reinterpret()).toBoolean()

public fun RecentManager.addItem(uri: String?): Boolean = gtk_recent_manager_add_item(this@addItem,
    uri).toBoolean()

public fun RecentManager.hasItem(uri: String?): Boolean = gtk_recent_manager_has_item(this@hasItem,
    uri).toBoolean()

@Throws(Error::class)
public fun RecentManager.lookupItem(uri: String?): RecentInfo? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: RecentInfo? = gtk_recent_manager_lookup_item(this@lookupItem, uri,
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun RecentManager.moveItem(uri: String?, newUri: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_recent_manager_move_item(this@moveItem, uri, newUri, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun RecentManager.purgeItems(): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = gtk_recent_manager_purge_items(this@purgeItems, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun RecentManager.removeItem(uri: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_recent_manager_remove_item(this@removeItem, uri, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun RecentManager.onChanged(callback: (RecentManager) -> Unit): RecentManager {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
