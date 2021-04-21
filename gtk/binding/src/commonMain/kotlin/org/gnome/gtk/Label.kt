// TODO - method: get_attributes
// TODO - method: get_ellipsize
// TODO - method: get_layout
// TODO - method: get_layout_offsets
// TODO - method: get_line_wrap_mode
// TODO - method: get_selection_bounds
// TODO - method: set_attributes
// TODO - method: set_ellipsize
// TODO - method: set_line_wrap_mode
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkLabel
import gtk3.gtk_label_get_angle
import gtk3.gtk_label_get_current_uri
import gtk3.gtk_label_get_justify
import gtk3.gtk_label_get_label
import gtk3.gtk_label_get_line_wrap
import gtk3.gtk_label_get_lines
import gtk3.gtk_label_get_max_width_chars
import gtk3.gtk_label_get_mnemonic_keyval
import gtk3.gtk_label_get_mnemonic_widget
import gtk3.gtk_label_get_selectable
import gtk3.gtk_label_get_single_line_mode
import gtk3.gtk_label_get_text
import gtk3.gtk_label_get_track_visited_links
import gtk3.gtk_label_get_use_markup
import gtk3.gtk_label_get_use_underline
import gtk3.gtk_label_get_width_chars
import gtk3.gtk_label_get_xalign
import gtk3.gtk_label_get_yalign
import gtk3.gtk_label_new
import gtk3.gtk_label_new_with_mnemonic
import gtk3.gtk_label_select_region
import gtk3.gtk_label_set_angle
import gtk3.gtk_label_set_justify
import gtk3.gtk_label_set_label
import gtk3.gtk_label_set_line_wrap
import gtk3.gtk_label_set_lines
import gtk3.gtk_label_set_markup
import gtk3.gtk_label_set_markup_with_mnemonic
import gtk3.gtk_label_set_max_width_chars
import gtk3.gtk_label_set_mnemonic_widget
import gtk3.gtk_label_set_pattern
import gtk3.gtk_label_set_selectable
import gtk3.gtk_label_set_single_line_mode
import gtk3.gtk_label_set_text
import gtk3.gtk_label_set_text_with_mnemonic
import gtk3.gtk_label_set_track_visited_links
import gtk3.gtk_label_set_use_markup
import gtk3.gtk_label_set_use_underline
import gtk3.gtk_label_set_width_chars
import gtk3.gtk_label_set_xalign
import gtk3.gtk_label_set_yalign
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

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
  public fun new(str: String): Label = gtk_label_new(str)!!.reinterpret()

  public fun newWithMnemonic(str: String): Label = gtk_label_new_with_mnemonic(str)!!.reinterpret()
}

public var Label.angle: Double
  get() = gtk_label_get_angle(this)
  set(`value`) {
    gtk_label_set_angle(this, value)
  }

public val Label.currentUri: String
  get() = gtk_label_get_current_uri(this).toKString

public var Label.justify: Justification
  get() = gtk_label_get_justify(this)
  set(`value`) {
    gtk_label_set_justify(this, value)
  }

public var Label.label: String
  get() = gtk_label_get_label(this).toKString
  set(`value`) {
    gtk_label_set_label(this, value)
  }

public var Label.lineWrap: Boolean
  get() = gtk_label_get_line_wrap(this).toBoolean
  set(`value`) {
    gtk_label_set_line_wrap(this, value.toInt)
  }

public var Label.lines: Int
  get() = gtk_label_get_lines(this)
  set(`value`) {
    gtk_label_set_lines(this, value)
  }

public var Label.maxWidthChars: Int
  get() = gtk_label_get_max_width_chars(this)
  set(`value`) {
    gtk_label_set_max_width_chars(this, value)
  }

public val Label.mnemonicKeyval: UInt
  get() = gtk_label_get_mnemonic_keyval(this)

public var Label.mnemonicWidget: Widget?
  get() = gtk_label_get_mnemonic_widget(this)?.reinterpret()
  set(`value`) {
    gtk_label_set_mnemonic_widget(this, value)
  }

public var Label.selectable: Boolean
  get() = gtk_label_get_selectable(this).toBoolean
  set(`value`) {
    gtk_label_set_selectable(this, value.toInt)
  }

public var Label.singleLineMode: Boolean
  get() = gtk_label_get_single_line_mode(this).toBoolean
  set(`value`) {
    gtk_label_set_single_line_mode(this, value.toInt)
  }

public var Label.text: String
  get() = gtk_label_get_text(this).toKString
  set(`value`) {
    gtk_label_set_text(this, value)
  }

public var Label.trackVisitedLinks: Boolean
  get() = gtk_label_get_track_visited_links(this).toBoolean
  set(`value`) {
    gtk_label_set_track_visited_links(this, value.toInt)
  }

public var Label.useMarkup: Boolean
  get() = gtk_label_get_use_markup(this).toBoolean
  set(`value`) {
    gtk_label_set_use_markup(this, value.toInt)
  }

public var Label.useUnderline: Boolean
  get() = gtk_label_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_label_set_use_underline(this, value.toInt)
  }

public var Label.widthChars: Int
  get() = gtk_label_get_width_chars(this)
  set(`value`) {
    gtk_label_set_width_chars(this, value)
  }

public var Label.xalign: Float
  get() = gtk_label_get_xalign(this)
  set(`value`) {
    gtk_label_set_xalign(this, value)
  }

public var Label.yalign: Float
  get() = gtk_label_get_yalign(this)
  set(`value`) {
    gtk_label_set_yalign(this, value)
  }

public fun Label.selectRegion(startOffset: Int, endOffset: Int): Unit {
  gtk_label_select_region(this, startOffset, endOffset)
}

public fun Label.setMarkup(str: String): Unit {
  gtk_label_set_markup(this, str)
}

public fun Label.setMarkupWithMnemonic(str: String): Unit {
  gtk_label_set_markup_with_mnemonic(this, str)
}

public fun Label.setPattern(pattern: String): Unit {
  gtk_label_set_pattern(this, pattern)
}

public fun Label.setTextWithMnemonic(str: String): Unit {
  gtk_label_set_text_with_mnemonic(this, str)
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
