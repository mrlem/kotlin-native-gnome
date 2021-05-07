@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMountOperation
import interop.g_mount_operation_get_anonymous
import interop.g_mount_operation_get_choice
import interop.g_mount_operation_get_domain
import interop.g_mount_operation_get_is_tcrypt_hidden_volume
import interop.g_mount_operation_get_is_tcrypt_system_volume
import interop.g_mount_operation_get_password
import interop.g_mount_operation_get_password_save
import interop.g_mount_operation_get_pim
import interop.g_mount_operation_get_username
import interop.g_mount_operation_new
import interop.g_mount_operation_reply
import interop.g_mount_operation_set_anonymous
import interop.g_mount_operation_set_choice
import interop.g_mount_operation_set_domain
import interop.g_mount_operation_set_is_tcrypt_hidden_volume
import interop.g_mount_operation_set_is_tcrypt_system_volume
import interop.g_mount_operation_set_password
import interop.g_mount_operation_set_password_save
import interop.g_mount_operation_set_pim
import interop.g_mount_operation_set_username
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias MountOperation = CPointer<GMountOperation>

public val MountOperation.asObject: Object
  get() = reinterpret()

public object MountOperationFactory {
  public fun new(): MountOperation = g_mount_operation_new()!!.reinterpret()
}

public val MountOperation.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var MountOperation.anonymous: Boolean
  get() = g_mount_operation_get_anonymous(this).toBoolean()
  set(`value`) {
    g_mount_operation_set_anonymous(this@anonymous, `value`.toInt())
  }

public var MountOperation.choice: Int
  get() = g_mount_operation_get_choice(this)
  set(`value`) {
    g_mount_operation_set_choice(this@choice, `value`)
  }

public var MountOperation.domain: String?
  get() = g_mount_operation_get_domain(this).toKString()
  set(`value`) {
    g_mount_operation_set_domain(this@domain, `value`)
  }

public var MountOperation.isTcryptHiddenVolume: Boolean
  get() = g_mount_operation_get_is_tcrypt_hidden_volume(this).toBoolean()
  set(`value`) {
    g_mount_operation_set_is_tcrypt_hidden_volume(this@isTcryptHiddenVolume, `value`.toInt())
  }

public var MountOperation.isTcryptSystemVolume: Boolean
  get() = g_mount_operation_get_is_tcrypt_system_volume(this).toBoolean()
  set(`value`) {
    g_mount_operation_set_is_tcrypt_system_volume(this@isTcryptSystemVolume, `value`.toInt())
  }

public var MountOperation.password: String?
  get() = g_mount_operation_get_password(this).toKString()
  set(`value`) {
    g_mount_operation_set_password(this@password, `value`)
  }

public var MountOperation.passwordSave: PasswordSave
  get() = g_mount_operation_get_password_save(this)
  set(`value`) {
    g_mount_operation_set_password_save(this@passwordSave, `value`)
  }

public var MountOperation.pim: UInt
  get() = g_mount_operation_get_pim(this)
  set(`value`) {
    g_mount_operation_set_pim(this@pim, `value`)
  }

public var MountOperation.username: String?
  get() = g_mount_operation_get_username(this).toKString()
  set(`value`) {
    g_mount_operation_set_username(this@username, `value`)
  }

public fun MountOperation.reply(result: MountOperationResult): Unit {
  g_mount_operation_reply(this@reply, result)
}

public fun MountOperation.onAborted(callback: (MountOperation) -> Unit): MountOperation {
  // TODO - handle callback data

  asObject.connect("aborted") { callback(this) }
  return this
}

public fun MountOperation.onAskPassword(callback: (MountOperation) -> Unit): MountOperation {
  // TODO - handle callback data

  asObject.connect("ask-password") { callback(this) }
  return this
}

public fun MountOperation.onAskQuestion(callback: (MountOperation) -> Unit): MountOperation {
  // TODO - handle callback data

  asObject.connect("ask-question") { callback(this) }
  return this
}

public fun MountOperation.onReply(callback: (MountOperation) -> Unit): MountOperation {
  // TODO - handle callback data

  asObject.connect("reply") { callback(this) }
  return this
}

public fun MountOperation.onShowProcesses(callback: (MountOperation) -> Unit): MountOperation {
  // TODO - handle callback data

  asObject.connect("show-processes") { callback(this) }
  return this
}

public fun MountOperation.onShowUnmountProgress(callback: (MountOperation) -> Unit):
    MountOperation {
  // TODO - handle callback data

  asObject.connect("show-unmount-progress") { callback(this) }
  return this
}
