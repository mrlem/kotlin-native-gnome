@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GList
import interop.GVolumeMonitor
import interop.g_volume_monitor_get_connected_drives
import interop.g_volume_monitor_get_mount_for_uuid
import interop.g_volume_monitor_get_mounts
import interop.g_volume_monitor_get_volume_for_uuid
import interop.g_volume_monitor_get_volumes
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toKList

public typealias VolumeMonitor = CPointer<GVolumeMonitor>

public val VolumeMonitor.asObject: Object
  get() = reinterpret()

public val VolumeMonitor.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val VolumeMonitor.connectedDrives: List<Drive>?
  get() = g_volume_monitor_get_connected_drives(this)?.reinterpret<GList>()?.toKList()

public val VolumeMonitor.mounts: List<Mount>?
  get() = g_volume_monitor_get_mounts(this)?.reinterpret<GList>()?.toKList()

public val VolumeMonitor.volumes: List<Volume>?
  get() = g_volume_monitor_get_volumes(this)?.reinterpret<GList>()?.toKList()

public fun VolumeMonitor.getMountForUuid(uuid: String?): Mount? =
    g_volume_monitor_get_mount_for_uuid(this@getMountForUuid, uuid)?.reinterpret()

public fun VolumeMonitor.getVolumeForUuid(uuid: String?): Volume? =
    g_volume_monitor_get_volume_for_uuid(this@getVolumeForUuid, uuid)?.reinterpret()

public fun VolumeMonitor.onDriveChanged(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("drive-changed") { callback(this) }
  return this
}

public fun VolumeMonitor.onDriveConnected(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("drive-connected") { callback(this) }
  return this
}

public fun VolumeMonitor.onDriveDisconnected(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("drive-disconnected") { callback(this) }
  return this
}

public fun VolumeMonitor.onDriveEjectButton(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("drive-eject-button") { callback(this) }
  return this
}

public fun VolumeMonitor.onDriveStopButton(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("drive-stop-button") { callback(this) }
  return this
}

public fun VolumeMonitor.onMountAdded(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("mount-added") { callback(this) }
  return this
}

public fun VolumeMonitor.onMountChanged(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("mount-changed") { callback(this) }
  return this
}

public fun VolumeMonitor.onMountPreUnmount(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("mount-pre-unmount") { callback(this) }
  return this
}

public fun VolumeMonitor.onMountRemoved(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("mount-removed") { callback(this) }
  return this
}

public fun VolumeMonitor.onVolumeAdded(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("volume-added") { callback(this) }
  return this
}

public fun VolumeMonitor.onVolumeChanged(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("volume-changed") { callback(this) }
  return this
}

public fun VolumeMonitor.onVolumeRemoved(callback: (VolumeMonitor) -> Unit): VolumeMonitor {
  // TODO - handle callback data

  asObject.connect("volume-removed") { callback(this) }
  return this
}
