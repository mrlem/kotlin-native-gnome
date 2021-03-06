// TODO - method: get_layout_offsets (param type)
// TODO - method: get_selection_bounds (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLabel
import interop.gtk_label_get_angle
import interop.gtk_label_get_attributes
import interop.gtk_label_get_current_uri
import interop.gtk_label_get_ellipsize
import interop.gtk_label_get_justify
import interop.gtk_label_get_label
import interop.gtk_label_get_layout
import interop.gtk_label_get_line_wrap
import interop.gtk_label_get_line_wrap_mode
import interop.gtk_label_get_lines
import interop.gtk_label_get_max_width_chars
import interop.gtk_label_get_mnemonic_keyval
import interop.gtk_label_get_mnemonic_widget
import interop.gtk_label_get_selectable
import interop.gtk_label_get_single_line_mode
import interop.gtk_label_get_text
import interop.gtk_label_get_track_visited_links
import interop.gtk_label_get_use_markup
import interop.gtk_label_get_use_underline
import interop.gtk_label_get_width_chars
import interop.gtk_label_get_xalign
import interop.gtk_label_get_yalign
import interop.gtk_label_new
import interop.gtk_label_new_with_mnemonic
import interop.gtk_label_select_region
import interop.gtk_label_set_angle
import interop.gtk_label_set_attributes
import interop.gtk_label_set_ellipsize
import interop.gtk_label_set_justify
import interop.gtk_label_set_label
import interop.gtk_label_set_line_wrap
import interop.gtk_label_set_line_wrap_mode
import interop.gtk_label_set_lines
import interop.gtk_label_set_markup
import interop.gtk_label_set_markup_with_mnemonic
import interop.gtk_label_set_max_width_chars
import interop.gtk_label_set_mnemonic_widget
import interop.gtk_label_set_pattern
import interop.gtk_label_set_selectable
import interop.gtk_label_set_single_line_mode
import interop.gtk_label_set_text
import interop.gtk_label_set_text_with_mnemonic
import interop.gtk_label_set_track_visited_links
import interop.gtk_label_set_use_markup
import interop.gtk_label_set_use_underline
import interop.gtk_label_set_width_chars
import interop.gtk_label_set_xalign
import interop.gtk_label_set_yalign
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.pango.AttrList
import org.gnome.pango.EllipsizeMode
import org.gnome.pango.Layout
import org.gnome.pango.WrapMode
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias Label = CPointer<GtkLabel>

public val Label.asObject: Object
  get() = reinterpret()

public val Label.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Label.asWidget: Widget
  get() = reinterpret()

public val Label.asMisc: Misc
  get() = reinterpret()

public object LabelFactory {
  public fun new(str: String?): Label = gtk_label_new(str)!!.reinterpret()

  public fun newWithMnemonic(str: String?): Label = gtk_label_new_with_mnemonic(str)!!.reinterpret()
}

public val Label.misc: Misc
  get() = pointed.misc.ptr

public var Label.angle: Double
  get() = gtk_label_get_angle(this)
  set(`value`) {
    gtk_label_set_angle(this@angle, `value`)
  }

public var Label.attributes: AttrList?
  get() = gtk_label_get_attributes(this)?.reinterpret()
  set(`value`) {
    gtk_label_set_attributes(this@attributes, `value`)
  }

public val Label.currentUri: String?
  get() = gtk_label_get_current_uri(this).toKString()

public var Label.ellipsize: EllipsizeMode
  get() = gtk_label_get_ellipsize(this)
  set(`value`) {
    gtk_label_set_ellipsize(this@ellipsize, `value`)
  }

public var Label.justify: Justification
  get() = gtk_label_get_justify(this)
  set(`value`) {
    gtk_label_set_justify(this@justify, `value`)
  }

public var Label.label: String?
  get() = gtk_label_get_label(this).toKString()
  set(`value`) {
    gtk_label_set_label(this@label, `value`)
  }

public val Label.layout: Layout?
  get() = gtk_label_get_layout(this)?.reinterpret()

public var Label.lineWrap: Boolean
  get() = gtk_label_get_line_wrap(this).toBoolean()
  set(`value`) {
    gtk_label_set_line_wrap(this@lineWrap, `value`.toInt())
  }

public var Label.lineWrapMode: WrapMode
  get() = gtk_label_get_line_wrap_mode(this)
  set(`value`) {
    gtk_label_set_line_wrap_mode(this@lineWrapMode, `value`)
  }

public var Label.lines: Int
  get() = gtk_label_get_lines(this)
  set(`value`) {
    gtk_label_set_lines(this@lines, `value`)
  }

public var Label.maxWidthChars: Int
  get() = gtk_label_get_max_width_chars(this)
  set(`value`) {
    gtk_label_set_max_width_chars(this@maxWidthChars, `value`)
  }

public val Label.mnemonicKeyval: UInt
  get() = gtk_label_get_mnemonic_keyval(this)

public var Label.mnemonicWidget: Widget?
  get() = gtk_label_get_mnemonic_widget(this)?.reinterpret()
  set(`value`) {
    gtk_label_set_mnemonic_widget(this@mnemonicWidget, `value`)
  }

public var Label.selectable: Boolean
  get() = gtk_label_get_selectable(this).toBoolean()
  set(`value`) {
    gtk_label_set_selectable(this@selectable, `value`.toInt())
  }

public var Label.singleLineMode: Boolean
  get() = gtk_label_get_single_line_mode(this).toBoolean()
  set(`value`) {
    gtk_label_set_single_line_mode(this@singleLineMode, `value`.toInt())
  }

public var Label.text: String?
  get() = gtk_label_get_text(this).toKString()
  set(`value`) {
    gtk_label_set_text(this@text, `value`)
  }

public var Label.trackVisitedLinks: Boolean
  get() = gtk_label_get_track_visited_links(this).toBoolean()
  set(`value`) {
    gtk_label_set_track_visited_links(this@trackVisitedLinks, `value`.toInt())
  }

public var Label.useMarkup: Boolean
  get() = gtk_label_get_use_markup(this).toBoolean()
  set(`value`) {
    gtk_label_set_use_markup(this@useMarkup, `value`.toInt())
  }

public var Label.useUnderline: Boolean
  get() = gtk_label_get_use_underline(this).toBoolean()
  set(`value`) {
    gtk_label_set_use_underline(this@useUnderline, `value`.toInt())
  }

public var Label.widthChars: Int
  get() = gtk_label_get_width_chars(this)
  set(`value`) {
    gtk_label_set_width_chars(this@widthChars, `value`)
  }

public var Label.xalign: Float
  get() = gtk_label_get_xalign(this)
  set(`value`) {
    gtk_label_set_xalign(this@xalign, `value`)
  }

public var Label.yalign: Float
  get() = gtk_label_get_yalign(this)
  set(`value`) {
    gtk_label_set_yalign(this@yalign, `value`)
  }

public fun Label.selectRegion(startOffset: Int, endOffset: Int): Unit {
  gtk_label_select_region(this@selectRegion, startOffset, endOffset)
}

public fun Label.setMarkup(str: String?): Unit {
  gtk_label_set_markup(this@setMarkup, str)
}

public fun Label.setMarkupWithMnemonic(str: String?): Unit {
  gtk_label_set_markup_with_mnemonic(this@setMarkupWithMnemonic, str)
}

public fun Label.setPattern(pattern: String?): Unit {
  gtk_label_set_pattern(this@setPattern, pattern)
}

public fun Label.setTextWithMnemonic(str: String?): Unit {
  gtk_label_set_text_with_mnemonic(this@setTextWithMnemonic, str)
}

public fun Label.onActivateCurrentLink(callback: (Label) -> Unit): Label {
  // TODO - handle callback data

  asObject.connect("activate-current-link") { callback(this) }
  return this
}

public fun Label.onActivateLink(callback: (Label) -> Unit): Label {
  // TODO - handle callback data

  asObject.connect("activate-link") { callback(this) }
  return this
}

public fun Label.onCopyClipboard(callback: (Label) -> Unit): Label {
  // TODO - handle callback data

  asObject.connect("copy-clipboard") { callback(this) }
  return this
}

public fun Label.onMoveCursor(callback: (Label) -> Unit): Label {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun Label.onPopulatePopup(callback: (Label) -> Unit): Label {
  // TODO - handle callback data

  asObject.connect("populate-popup") { callback(this) }
  return this
}
