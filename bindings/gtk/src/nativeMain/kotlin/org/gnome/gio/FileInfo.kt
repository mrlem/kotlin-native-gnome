// TODO - method: get_attribute_data (param type)
// TODO - method: set_attribute (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileInfo
import interop.g_file_info_clear_status
import interop.g_file_info_copy_into
import interop.g_file_info_dup
import interop.g_file_info_get_attribute_as_string
import interop.g_file_info_get_attribute_boolean
import interop.g_file_info_get_attribute_byte_string
import interop.g_file_info_get_attribute_int32
import interop.g_file_info_get_attribute_int64
import interop.g_file_info_get_attribute_object
import interop.g_file_info_get_attribute_status
import interop.g_file_info_get_attribute_string
import interop.g_file_info_get_attribute_stringv
import interop.g_file_info_get_attribute_type
import interop.g_file_info_get_attribute_uint32
import interop.g_file_info_get_attribute_uint64
import interop.g_file_info_get_content_type
import interop.g_file_info_get_deletion_date
import interop.g_file_info_get_display_name
import interop.g_file_info_get_edit_name
import interop.g_file_info_get_etag
import interop.g_file_info_get_file_type
import interop.g_file_info_get_icon
import interop.g_file_info_get_is_backup
import interop.g_file_info_get_is_hidden
import interop.g_file_info_get_is_symlink
import interop.g_file_info_get_modification_date_time
import interop.g_file_info_get_name
import interop.g_file_info_get_size
import interop.g_file_info_get_sort_order
import interop.g_file_info_get_symbolic_icon
import interop.g_file_info_get_symlink_target
import interop.g_file_info_has_attribute
import interop.g_file_info_has_namespace
import interop.g_file_info_list_attributes
import interop.g_file_info_new
import interop.g_file_info_remove_attribute
import interop.g_file_info_set_attribute_boolean
import interop.g_file_info_set_attribute_byte_string
import interop.g_file_info_set_attribute_int32
import interop.g_file_info_set_attribute_int64
import interop.g_file_info_set_attribute_mask
import interop.g_file_info_set_attribute_object
import interop.g_file_info_set_attribute_status
import interop.g_file_info_set_attribute_string
import interop.g_file_info_set_attribute_stringv
import interop.g_file_info_set_attribute_uint32
import interop.g_file_info_set_attribute_uint64
import interop.g_file_info_set_content_type
import interop.g_file_info_set_display_name
import interop.g_file_info_set_edit_name
import interop.g_file_info_set_file_type
import interop.g_file_info_set_icon
import interop.g_file_info_set_is_hidden
import interop.g_file_info_set_is_symlink
import interop.g_file_info_set_modification_date_time
import interop.g_file_info_set_name
import interop.g_file_info_set_size
import interop.g_file_info_set_sort_order
import interop.g_file_info_set_symbolic_icon
import interop.g_file_info_set_symlink_target
import interop.g_file_info_unset_attribute_mask
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gnome.glib.DateTime
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toInt
import org.gnome.toKArray
import org.gnome.toKString

public typealias FileInfo = CPointer<GFileInfo>

public val FileInfo.asObject: Object
  get() = reinterpret()

public object FileInfoFactory {
  public fun new(): FileInfo = g_file_info_new()!!.reinterpret()
}

public var FileInfo.contentType: String?
  get() = g_file_info_get_content_type(this).toKString()
  set(`value`) {
    g_file_info_set_content_type(this@contentType, `value`)
  }

public val FileInfo.deletionDate: DateTime?
  get() = g_file_info_get_deletion_date(this)?.reinterpret()

public var FileInfo.displayName: String?
  get() = g_file_info_get_display_name(this).toKString()
  set(`value`) {
    g_file_info_set_display_name(this@displayName, `value`)
  }

public var FileInfo.editName: String?
  get() = g_file_info_get_edit_name(this).toKString()
  set(`value`) {
    g_file_info_set_edit_name(this@editName, `value`)
  }

public val FileInfo.etag: String?
  get() = g_file_info_get_etag(this).toKString()

public var FileInfo.fileType: FileType
  get() = g_file_info_get_file_type(this)
  set(`value`) {
    g_file_info_set_file_type(this@fileType, `value`)
  }

public var FileInfo.icon: Icon?
  get() = g_file_info_get_icon(this)?.reinterpret()
  set(`value`) {
    g_file_info_set_icon(this@icon, `value`)
  }

public val FileInfo.isBackup: Boolean
  get() = g_file_info_get_is_backup(this).toBoolean()

public var FileInfo.isHidden: Boolean
  get() = g_file_info_get_is_hidden(this).toBoolean()
  set(`value`) {
    g_file_info_set_is_hidden(this@isHidden, `value`.toInt())
  }

public var FileInfo.isSymlink: Boolean
  get() = g_file_info_get_is_symlink(this).toBoolean()
  set(`value`) {
    g_file_info_set_is_symlink(this@isSymlink, `value`.toInt())
  }

public var FileInfo.modificationDateTime: DateTime?
  get() = g_file_info_get_modification_date_time(this)?.reinterpret()
  set(`value`) {
    g_file_info_set_modification_date_time(this@modificationDateTime, `value`)
  }

public var FileInfo.name: String?
  get() = g_file_info_get_name(this).toKString()
  set(`value`) {
    g_file_info_set_name(this@name, `value`)
  }

public var FileInfo.size: Long
  get() = g_file_info_get_size(this)
  set(`value`) {
    g_file_info_set_size(this@size, `value`)
  }

public var FileInfo.sortOrder: Int
  get() = g_file_info_get_sort_order(this)
  set(`value`) {
    g_file_info_set_sort_order(this@sortOrder, `value`)
  }

public var FileInfo.symbolicIcon: Icon?
  get() = g_file_info_get_symbolic_icon(this)?.reinterpret()
  set(`value`) {
    g_file_info_set_symbolic_icon(this@symbolicIcon, `value`)
  }

public var FileInfo.symlinkTarget: String?
  get() = g_file_info_get_symlink_target(this).toKString()
  set(`value`) {
    g_file_info_set_symlink_target(this@symlinkTarget, `value`)
  }

public fun FileInfo.clearStatus(): Unit {
  g_file_info_clear_status(this@clearStatus)
}

public fun FileInfo.copyInto(destInfo: FileInfo?): Unit {
  g_file_info_copy_into(this@copyInto, destInfo?.reinterpret())
}

public fun FileInfo.dup(): FileInfo? = g_file_info_dup(this@dup)?.reinterpret()

public fun FileInfo.getAttributeAsString(attribute: String?): String? =
    g_file_info_get_attribute_as_string(this@getAttributeAsString, attribute).toKString()

public fun FileInfo.getAttributeBoolean(attribute: String?): Boolean =
    g_file_info_get_attribute_boolean(this@getAttributeBoolean, attribute).toBoolean()

public fun FileInfo.getAttributeByteString(attribute: String?): String? =
    g_file_info_get_attribute_byte_string(this@getAttributeByteString, attribute).toKString()

public fun FileInfo.getAttributeInt32(attribute: String?): Int =
    g_file_info_get_attribute_int32(this@getAttributeInt32, attribute)

public fun FileInfo.getAttributeInt64(attribute: String?): Long =
    g_file_info_get_attribute_int64(this@getAttributeInt64, attribute)

public fun FileInfo.getAttributeObject(attribute: String?): Object? =
    g_file_info_get_attribute_object(this@getAttributeObject, attribute)?.reinterpret()

public fun FileInfo.getAttributeStatus(attribute: String?): FileAttributeStatus =
    g_file_info_get_attribute_status(this@getAttributeStatus, attribute)

public fun FileInfo.getAttributeString(attribute: String?): String? =
    g_file_info_get_attribute_string(this@getAttributeString, attribute).toKString()

public fun FileInfo.getAttributeStringv(attribute: String?): Array<String>? =
    g_file_info_get_attribute_stringv(this@getAttributeStringv, attribute)?.toKArray {
    it.toKString()!! }

public fun FileInfo.getAttributeType(attribute: String?): FileAttributeType =
    g_file_info_get_attribute_type(this@getAttributeType, attribute)

public fun FileInfo.getAttributeUint32(attribute: String?): UInt =
    g_file_info_get_attribute_uint32(this@getAttributeUint32, attribute)

public fun FileInfo.getAttributeUint64(attribute: String?): ULong =
    g_file_info_get_attribute_uint64(this@getAttributeUint64, attribute)

public fun FileInfo.hasAttribute(attribute: String?): Boolean =
    g_file_info_has_attribute(this@hasAttribute, attribute).toBoolean()

public fun FileInfo.hasNamespace(nameSpace: String?): Boolean =
    g_file_info_has_namespace(this@hasNamespace, nameSpace).toBoolean()

public fun FileInfo.listAttributes(nameSpace: String?): Array<String>? =
    g_file_info_list_attributes(this@listAttributes, nameSpace)?.toKArray { it.toKString()!! }

public fun FileInfo.removeAttribute(attribute: String?): Unit {
  g_file_info_remove_attribute(this@removeAttribute, attribute)
}

public fun FileInfo.setAttributeBoolean(attribute: String?, attrValue: Boolean): Unit {
  g_file_info_set_attribute_boolean(this@setAttributeBoolean, attribute, attrValue.toInt())
}

public fun FileInfo.setAttributeByteString(attribute: String?, attrValue: String?): Unit {
  g_file_info_set_attribute_byte_string(this@setAttributeByteString, attribute, attrValue)
}

public fun FileInfo.setAttributeInt32(attribute: String?, attrValue: Int): Unit {
  g_file_info_set_attribute_int32(this@setAttributeInt32, attribute, attrValue)
}

public fun FileInfo.setAttributeInt64(attribute: String?, attrValue: Long): Unit {
  g_file_info_set_attribute_int64(this@setAttributeInt64, attribute, attrValue)
}

public fun FileInfo.setAttributeMask(mask: FileAttributeMatcher?): Unit {
  g_file_info_set_attribute_mask(this@setAttributeMask, mask?.reinterpret())
}

public fun FileInfo.setAttributeObject(attribute: String?, attrValue: Object?): Unit {
  g_file_info_set_attribute_object(this@setAttributeObject, attribute, attrValue?.reinterpret())
}

public fun FileInfo.setAttributeStatus(attribute: String?, status: FileAttributeStatus): Boolean =
    g_file_info_set_attribute_status(this@setAttributeStatus, attribute, status).toBoolean()

public fun FileInfo.setAttributeString(attribute: String?, attrValue: String?): Unit {
  g_file_info_set_attribute_string(this@setAttributeString, attribute, attrValue)
}

public fun FileInfo.setAttributeStringv(attribute: String?, attrValue: Array<String>?): Unit {
  memScoped { g_file_info_set_attribute_stringv(this@setAttributeStringv, attribute,
      attrValue?.toCArray(memScope)) }
}

public fun FileInfo.setAttributeUint32(attribute: String?, attrValue: UInt): Unit {
  g_file_info_set_attribute_uint32(this@setAttributeUint32, attribute, attrValue)
}

public fun FileInfo.setAttributeUint64(attribute: String?, attrValue: ULong): Unit {
  g_file_info_set_attribute_uint64(this@setAttributeUint64, attribute, attrValue)
}

public fun FileInfo.unsetAttributeMask(): Unit {
  g_file_info_unset_attribute_mask(this@unsetAttributeMask)
}
