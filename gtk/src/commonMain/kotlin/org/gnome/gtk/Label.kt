// TODO - implement:
//   get_layout_offsets
//   get_selection_bounds
//   select_region
//   set_attributes
//   set_ellipsize
//   set_justify
//   set_line_wrap_mode
//   set_mnemonic_widget
//   set_markup
//   set_markup_with_mnemonic
//   set_pattern
//   set_text_with_mnemonic
package org.gnome.gtk

import gtk3.GtkLabel
import gtk3.gtk_label_get_angle
import gtk3.gtk_label_get_attributes
import gtk3.gtk_label_get_current_uri
import gtk3.gtk_label_get_ellipsize
import gtk3.gtk_label_get_justify
import gtk3.gtk_label_get_label
import gtk3.gtk_label_get_layout
import gtk3.gtk_label_get_line_wrap
import gtk3.gtk_label_get_line_wrap_mode
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
import gtk3.gtk_label_set_angle
import gtk3.gtk_label_set_label
import gtk3.gtk_label_set_line_wrap
import gtk3.gtk_label_set_lines
import gtk3.gtk_label_set_max_width_chars
import gtk3.gtk_label_set_selectable
import gtk3.gtk_label_set_single_line_mode
import gtk3.gtk_label_set_text
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
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Label = CPointer<GtkLabel>

public val Label.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Label.asWidget: Widget
  get() = reinterpret()

public val Label.asMisc: Misc
  get() = reinterpret()

public fun Label.getAttributes(): Unit {
  gtk_label_get_attributes(this)
}

public fun Label.getEllipsize(): Unit {
  gtk_label_get_ellipsize(this)
}

public fun Label.getJustify(): Unit {
  gtk_label_get_justify(this)
}

public fun Label.getLayout(): Unit {
  gtk_label_get_layout(this)
}

public fun Label.getLineWrapMode(): Unit {
  gtk_label_get_line_wrap_mode(this)
}

public fun Label.getMnemonicWidget(): Unit {
  gtk_label_get_mnemonic_widget(this)
}

public var Label.angle: Double
  get() = gtk_label_get_angle(this)
  set(`value`) {
    gtk_label_set_angle(this, value)
  }

public var Label.label: String?
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

public var Label.text: String?
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

public val Label.currentUri: String?
  get() = gtk_label_get_current_uri(this).toKString

public val Label.mnemonicKeyval: UInt
  get() = gtk_label_get_mnemonic_keyval(this)
