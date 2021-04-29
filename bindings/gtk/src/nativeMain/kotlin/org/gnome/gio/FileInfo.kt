// TODO - method: copy_into
// TODO - method: get_attribute_as_string
// TODO - method: get_attribute_boolean
// TODO - method: get_attribute_byte_string
// TODO - method: get_attribute_data
// TODO - method: get_attribute_int32
// TODO - method: get_attribute_int64
// TODO - method: get_attribute_object
// TODO - method: get_attribute_status
// TODO - method: get_attribute_string
// TODO - method: get_attribute_stringv
// TODO - method: get_attribute_type
// TODO - method: get_attribute_uint32
// TODO - method: get_attribute_uint64
// TODO - method: get_deletion_date
// TODO - method: get_modification_date_time
// TODO - method: get_modification_time
// TODO - method: has_attribute
// TODO - method: has_namespace
// TODO - method: list_attributes
// TODO - method: remove_attribute
// TODO - method: set_attribute
// TODO - method: set_attribute_boolean
// TODO - method: set_attribute_byte_string
// TODO - method: set_attribute_int32
// TODO - method: set_attribute_int64
// TODO - method: set_attribute_mask
// TODO - method: set_attribute_object
// TODO - method: set_attribute_status
// TODO - method: set_attribute_string
// TODO - method: set_attribute_stringv
// TODO - method: set_attribute_uint32
// TODO - method: set_attribute_uint64
// TODO - method: set_modification_date_time
// TODO - method: set_modification_time
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileInfo
import interop.g_file_info_clear_status
import interop.g_file_info_dup
import interop.g_file_info_get_content_type
import interop.g_file_info_get_display_name
import interop.g_file_info_get_edit_name
import interop.g_file_info_get_etag
import interop.g_file_info_get_file_type
import interop.g_file_info_get_icon
import interop.g_file_info_get_is_backup
import interop.g_file_info_get_is_hidden
import interop.g_file_info_get_is_symlink
import interop.g_file_info_get_name
import interop.g_file_info_get_size
import interop.g_file_info_get_sort_order
import interop.g_file_info_get_symbolic_icon
import interop.g_file_info_get_symlink_target
import interop.g_file_info_new
import interop.g_file_info_set_content_type
import interop.g_file_info_set_display_name
import interop.g_file_info_set_edit_name
import interop.g_file_info_set_file_type
import interop.g_file_info_set_icon
import interop.g_file_info_set_is_hidden
import interop.g_file_info_set_is_symlink
import interop.g_file_info_set_name
import interop.g_file_info_set_size
import interop.g_file_info_set_sort_order
import interop.g_file_info_set_symbolic_icon
import interop.g_file_info_set_symlink_target
import interop.g_file_info_unset_attribute_mask
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias FileInfo = CPointer<GFileInfo>

public val FileInfo.asObject: Object
  get() = reinterpret()

public object FileInfoFactory {
  public fun new(): FileInfo = g_file_info_new()!!.reinterpret()
}

public var FileInfo.contentType: String
  get() = g_file_info_get_content_type(this).toKString
  set(`value`) {
    g_file_info_set_content_type(this, value)
  }

public var FileInfo.displayName: String
  get() = g_file_info_get_display_name(this).toKString
  set(`value`) {
    g_file_info_set_display_name(this, value)
  }

public var FileInfo.editName: String
  get() = g_file_info_get_edit_name(this).toKString
  set(`value`) {
    g_file_info_set_edit_name(this, value)
  }

public val FileInfo.etag: String
  get() = g_file_info_get_etag(this).toKString

public var FileInfo.fileType: FileType
  get() = g_file_info_get_file_type(this)
  set(`value`) {
    g_file_info_set_file_type(this, value)
  }

public var FileInfo.icon: Icon?
  get() = g_file_info_get_icon(this)?.reinterpret()
  set(`value`) {
    g_file_info_set_icon(this, value)
  }

public val FileInfo.isBackup: Boolean
  get() = g_file_info_get_is_backup(this).toBoolean

public var FileInfo.isHidden: Boolean
  get() = g_file_info_get_is_hidden(this).toBoolean
  set(`value`) {
    g_file_info_set_is_hidden(this, value.toInt)
  }

public var FileInfo.isSymlink: Boolean
  get() = g_file_info_get_is_symlink(this).toBoolean
  set(`value`) {
    g_file_info_set_is_symlink(this, value.toInt)
  }

public var FileInfo.name: String
  get() = g_file_info_get_name(this).toKString
  set(`value`) {
    g_file_info_set_name(this, value)
  }

public var FileInfo.size: Long
  get() = g_file_info_get_size(this)
  set(`value`) {
    g_file_info_set_size(this, value)
  }

public var FileInfo.sortOrder: Int
  get() = g_file_info_get_sort_order(this)
  set(`value`) {
    g_file_info_set_sort_order(this, value)
  }

public var FileInfo.symbolicIcon: Icon?
  get() = g_file_info_get_symbolic_icon(this)?.reinterpret()
  set(`value`) {
    g_file_info_set_symbolic_icon(this, value)
  }

public var FileInfo.symlinkTarget: String
  get() = g_file_info_get_symlink_target(this).toKString
  set(`value`) {
    g_file_info_set_symlink_target(this, value)
  }

public fun FileInfo.clearStatus(): Unit {
  g_file_info_clear_status(this)
}

public fun FileInfo.dup(): FileInfo? = g_file_info_dup(this)?.reinterpret()

public fun FileInfo.unsetAttributeMask(): Unit {
  g_file_info_unset_attribute_mask(this)
}
