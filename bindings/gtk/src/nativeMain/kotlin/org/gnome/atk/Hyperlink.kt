@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkHyperlink
import interop.atk_hyperlink_get_end_index
import interop.atk_hyperlink_get_n_anchors
import interop.atk_hyperlink_get_object
import interop.atk_hyperlink_get_start_index
import interop.atk_hyperlink_get_uri
import interop.atk_hyperlink_is_inline
import interop.atk_hyperlink_is_valid
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Hyperlink = CPointer<AtkHyperlink>

public val Hyperlink.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val Hyperlink.parent: org.gnome.gobject.Object
  get() = pointed.parent.ptr

public val Hyperlink.endIndex: Int
  get() = atk_hyperlink_get_end_index(this)

public val Hyperlink.nAnchors: Int
  get() = atk_hyperlink_get_n_anchors(this)

public val Hyperlink.startIndex: Int
  get() = atk_hyperlink_get_start_index(this)

public fun Hyperlink.getObject(i: Int): Object? = atk_hyperlink_get_object(this@getObject,
    i)?.reinterpret()

public fun Hyperlink.getUri(i: Int): String? = atk_hyperlink_get_uri(this@getUri, i).toKString()

public fun Hyperlink.isInline(): Boolean = atk_hyperlink_is_inline(this@isInline).toBoolean()

public fun Hyperlink.isValid(): Boolean = atk_hyperlink_is_valid(this@isValid).toBoolean()

public fun Hyperlink.onLinkActivated(callback: (Hyperlink) -> Unit): Hyperlink {
  // TODO - handle callback data

  asObject.connect("link-activated") { callback(this) }
  return this
}
