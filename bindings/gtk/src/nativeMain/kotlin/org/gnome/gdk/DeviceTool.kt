@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDeviceTool
import interop.gdk_device_tool_get_hardware_id
import interop.gdk_device_tool_get_serial
import interop.gdk_device_tool_get_tool_type
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DeviceTool = CPointer<GdkDeviceTool>

public val DeviceTool.asObject: Object
  get() = reinterpret()

public val DeviceTool.hardwareId: ULong
  get() = gdk_device_tool_get_hardware_id(this)

public val DeviceTool.serial: ULong
  get() = gdk_device_tool_get_serial(this)

public val DeviceTool.toolType: DeviceToolType
  get() = gdk_device_tool_get_tool_type(this)
