@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTestDBus
import interop.g_test_dbus_add_service_dir
import interop.g_test_dbus_down
import interop.g_test_dbus_get_bus_address
import interop.g_test_dbus_get_flags
import interop.g_test_dbus_new
import interop.g_test_dbus_stop
import interop.g_test_dbus_up
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias TestDBus = CPointer<GTestDBus>

public val TestDBus.asObject: Object
  get() = reinterpret()

public object TestDBusFactory {
  public fun new(flags: TestDBusFlags): TestDBus = g_test_dbus_new(flags)!!.reinterpret()
}

public val TestDBus.busAddress: String
  get() = g_test_dbus_get_bus_address(this).toKString()

public val TestDBus.flags: TestDBusFlags
  get() = g_test_dbus_get_flags(this)

public fun TestDBus.addServiceDir(path: String): Unit {
  g_test_dbus_add_service_dir(this, path)
}

public fun TestDBus.down(): Unit {
  g_test_dbus_down(this)
}

public fun TestDBus.stop(): Unit {
  g_test_dbus_stop(this)
}

public fun TestDBus.up(): Unit {
  g_test_dbus_up(this)
}
