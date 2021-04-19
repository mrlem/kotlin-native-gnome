// TODO - get_attributes
// TODO - get_ellipsize
// TODO - get_justify
// TODO - get_layout
// TODO - get_layout_offsets
// TODO - get_line_wrap_mode
// TODO - get_selection_bounds
// TODO - set_attributes
// TODO - set_ellipsize
// TODO - set_justify
// TODO - set_line_wrap_mode
//
package org.gnome.gtk

import gtk3.GtkLabel
import gtk3.gtk_label_get_angle
import gtk3.gtk_label_get_current_uri
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
import gtk3.gtk_label_select_region
import gtk3.gtk_label_set_angle
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

public fun Label.getAngle(): Double = gtk_label_get_angle(this)

public fun Label.getCurrentUri(): String = gtk_label_get_current_uri(this).toKString

public fun Label.getLabel(): String = gtk_label_get_label(this).toKString

public fun Label.getLineWrap(): Boolean = gtk_label_get_line_wrap(this).toBoolean

public fun Label.getLines(): Int = gtk_label_get_lines(this)

public fun Label.getMaxWidthChars(): Int = gtk_label_get_max_width_chars(this)

public fun Label.getMnemonicKeyval(): UInt = gtk_label_get_mnemonic_keyval(this)

public fun Label.getMnemonicWidget(): Widget? = gtk_label_get_mnemonic_widget(this)?.reinterpret()

public fun Label.getSelectable(): Boolean = gtk_label_get_selectable(this).toBoolean

public fun Label.getSingleLineMode(): Boolean = gtk_label_get_single_line_mode(this).toBoolean

public fun Label.getText(): String = gtk_label_get_text(this).toKString

public fun Label.getTrackVisitedLinks(): Boolean = gtk_label_get_track_visited_links(this).toBoolean

public fun Label.getUseMarkup(): Boolean = gtk_label_get_use_markup(this).toBoolean

public fun Label.getUseUnderline(): Boolean = gtk_label_get_use_underline(this).toBoolean

public fun Label.getWidthChars(): Int = gtk_label_get_width_chars(this)

public fun Label.getXalign(): Float = gtk_label_get_xalign(this)

public fun Label.getYalign(): Float = gtk_label_get_yalign(this)

public fun Label.selectRegion(startOffset: Int, endOffset: Int): Unit {
  gtk_label_select_region(this, startOffset, endOffset)
}

public fun Label.setAngle(angle: Double): Unit {
  gtk_label_set_angle(this, angle)
}

public fun Label.setLabel(str: String?): Unit {
  gtk_label_set_label(this, str)
}

public fun Label.setLineWrap(wrap: Boolean): Unit {
  gtk_label_set_line_wrap(this, wrap.toInt)
}

public fun Label.setLines(lines: Int): Unit {
  gtk_label_set_lines(this, lines)
}

public fun Label.setMarkup(str: String?): Unit {
  gtk_label_set_markup(this, str)
}

public fun Label.setMarkupWithMnemonic(str: String?): Unit {
  gtk_label_set_markup_with_mnemonic(this, str)
}

public fun Label.setMaxWidthChars(nChars: Int): Unit {
  gtk_label_set_max_width_chars(this, nChars)
}

public fun Label.setMnemonicWidget(widget: Widget): Unit {
  gtk_label_set_mnemonic_widget(this, widget.reinterpret())
}

public fun Label.setPattern(pattern: String?): Unit {
  gtk_label_set_pattern(this, pattern)
}

public fun Label.setSelectable(setting: Boolean): Unit {
  gtk_label_set_selectable(this, setting.toInt)
}

public fun Label.setSingleLineMode(singleLineMode: Boolean): Unit {
  gtk_label_set_single_line_mode(this, singleLineMode.toInt)
}

public fun Label.setText(str: String?): Unit {
  gtk_label_set_text(this, str)
}

public fun Label.setTextWithMnemonic(str: String?): Unit {
  gtk_label_set_text_with_mnemonic(this, str)
}

public fun Label.setTrackVisitedLinks(trackLinks: Boolean): Unit {
  gtk_label_set_track_visited_links(this, trackLinks.toInt)
}

public fun Label.setUseMarkup(setting: Boolean): Unit {
  gtk_label_set_use_markup(this, setting.toInt)
}

public fun Label.setUseUnderline(setting: Boolean): Unit {
  gtk_label_set_use_underline(this, setting.toInt)
}

public fun Label.setWidthChars(nChars: Int): Unit {
  gtk_label_set_width_chars(this, nChars)
}

public fun Label.setXalign(xalign: Float): Unit {
  gtk_label_set_xalign(this, xalign)
}

public fun Label.setYalign(yalign: Float): Unit {
  gtk_label_set_yalign(this, yalign)
}
