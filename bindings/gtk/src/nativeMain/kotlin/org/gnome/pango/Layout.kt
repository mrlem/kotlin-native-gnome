// TODO - method: get_cursor_pos (param type)
// TODO - method: get_extents (param type)
// TODO - method: get_log_attrs (param type)
// TODO - method: get_log_attrs_readonly (param type)
// TODO - method: get_pixel_extents (param type)
// TODO - method: get_pixel_size (param type)
// TODO - method: get_size (param type)
// TODO - method: index_to_line_x (param type)
// TODO - method: index_to_pos (param type)
// TODO - method: move_cursor_visually (param type)
// TODO - method: set_markup_with_accel (param type)
// TODO - method: xy_to_index (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoLayout
import interop.pango_layout_context_changed
import interop.pango_layout_copy
import interop.pango_layout_get_alignment
import interop.pango_layout_get_attributes
import interop.pango_layout_get_auto_dir
import interop.pango_layout_get_baseline
import interop.pango_layout_get_character_count
import interop.pango_layout_get_context
import interop.pango_layout_get_ellipsize
import interop.pango_layout_get_font_description
import interop.pango_layout_get_height
import interop.pango_layout_get_indent
import interop.pango_layout_get_iter
import interop.pango_layout_get_justify
import interop.pango_layout_get_line
import interop.pango_layout_get_line_count
import interop.pango_layout_get_line_readonly
import interop.pango_layout_get_line_spacing
import interop.pango_layout_get_lines
import interop.pango_layout_get_lines_readonly
import interop.pango_layout_get_serial
import interop.pango_layout_get_single_paragraph_mode
import interop.pango_layout_get_spacing
import interop.pango_layout_get_tabs
import interop.pango_layout_get_text
import interop.pango_layout_get_unknown_glyphs_count
import interop.pango_layout_get_width
import interop.pango_layout_get_wrap
import interop.pango_layout_is_ellipsized
import interop.pango_layout_is_wrapped
import interop.pango_layout_new
import interop.pango_layout_set_alignment
import interop.pango_layout_set_attributes
import interop.pango_layout_set_auto_dir
import interop.pango_layout_set_ellipsize
import interop.pango_layout_set_font_description
import interop.pango_layout_set_height
import interop.pango_layout_set_indent
import interop.pango_layout_set_justify
import interop.pango_layout_set_line_spacing
import interop.pango_layout_set_markup
import interop.pango_layout_set_single_paragraph_mode
import interop.pango_layout_set_spacing
import interop.pango_layout_set_tabs
import interop.pango_layout_set_text
import interop.pango_layout_set_width
import interop.pango_layout_set_wrap
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias Layout = CPointer<PangoLayout>

public val Layout.asObject: Object
  get() = reinterpret()

public object LayoutFactory {
  public fun new(context: Context?): Layout =
      pango_layout_new(context?.reinterpret())!!.reinterpret()
}

public var Layout.alignment: Alignment
  get() = pango_layout_get_alignment(this)
  set(`value`) {
    pango_layout_set_alignment(this@alignment, `value`)
  }

public var Layout.attributes: AttrList?
  get() = pango_layout_get_attributes(this)?.reinterpret()
  set(`value`) {
    pango_layout_set_attributes(this@attributes, `value`)
  }

public var Layout.autoDir: Boolean
  get() = pango_layout_get_auto_dir(this).toBoolean()
  set(`value`) {
    pango_layout_set_auto_dir(this@autoDir, `value`.toInt())
  }

public val Layout.baseline: Int
  get() = pango_layout_get_baseline(this)

public val Layout.characterCount: Int
  get() = pango_layout_get_character_count(this)

public val Layout.context: Context?
  get() = pango_layout_get_context(this)?.reinterpret()

public var Layout.ellipsize: EllipsizeMode
  get() = pango_layout_get_ellipsize(this)
  set(`value`) {
    pango_layout_set_ellipsize(this@ellipsize, `value`)
  }

public var Layout.fontDescription: FontDescription?
  get() = pango_layout_get_font_description(this)?.reinterpret()
  set(`value`) {
    pango_layout_set_font_description(this@fontDescription, `value`)
  }

public var Layout.height: Int
  get() = pango_layout_get_height(this)
  set(`value`) {
    pango_layout_set_height(this@height, `value`)
  }

public var Layout.indent: Int
  get() = pango_layout_get_indent(this)
  set(`value`) {
    pango_layout_set_indent(this@indent, `value`)
  }

public val Layout.iter: LayoutIter?
  get() = pango_layout_get_iter(this)?.reinterpret()

public var Layout.justify: Boolean
  get() = pango_layout_get_justify(this).toBoolean()
  set(`value`) {
    pango_layout_set_justify(this@justify, `value`.toInt())
  }

public val Layout.lineCount: Int
  get() = pango_layout_get_line_count(this)

public var Layout.lineSpacing: Float
  get() = pango_layout_get_line_spacing(this)
  set(`value`) {
    pango_layout_set_line_spacing(this@lineSpacing, `value`)
  }

public val Layout.lines: SList?
  get() = pango_layout_get_lines(this)?.reinterpret()

public val Layout.linesReadonly: SList?
  get() = pango_layout_get_lines_readonly(this)?.reinterpret()

public val Layout.serial: UInt
  get() = pango_layout_get_serial(this)

public var Layout.singleParagraphMode: Boolean
  get() = pango_layout_get_single_paragraph_mode(this).toBoolean()
  set(`value`) {
    pango_layout_set_single_paragraph_mode(this@singleParagraphMode, `value`.toInt())
  }

public var Layout.spacing: Int
  get() = pango_layout_get_spacing(this)
  set(`value`) {
    pango_layout_set_spacing(this@spacing, `value`)
  }

public var Layout.tabs: TabArray?
  get() = pango_layout_get_tabs(this)?.reinterpret()
  set(`value`) {
    pango_layout_set_tabs(this@tabs, `value`)
  }

public val Layout.text: String?
  get() = pango_layout_get_text(this).toKString()

public val Layout.unknownGlyphsCount: Int
  get() = pango_layout_get_unknown_glyphs_count(this)

public var Layout.width: Int
  get() = pango_layout_get_width(this)
  set(`value`) {
    pango_layout_set_width(this@width, `value`)
  }

public var Layout.wrap: WrapMode
  get() = pango_layout_get_wrap(this)
  set(`value`) {
    pango_layout_set_wrap(this@wrap, `value`)
  }

public fun Layout.contextChanged(): Unit {
  pango_layout_context_changed(this@contextChanged)
}

public fun Layout.copy(): Layout? = pango_layout_copy(this@copy)?.reinterpret()

public fun Layout.getLine(line: Int): LayoutLine? = pango_layout_get_line(this@getLine,
    line)?.reinterpret()

public fun Layout.getLineReadonly(line: Int): LayoutLine? =
    pango_layout_get_line_readonly(this@getLineReadonly, line)?.reinterpret()

public fun Layout.isEllipsized(): Boolean =
    pango_layout_is_ellipsized(this@isEllipsized).toBoolean()

public fun Layout.isWrapped(): Boolean = pango_layout_is_wrapped(this@isWrapped).toBoolean()

public fun Layout.setMarkup(markup: String?, length: Int): Unit {
  pango_layout_set_markup(this@setMarkup, markup, length)
}

public fun Layout.setText(text: String?, length: Int): Unit {
  pango_layout_set_text(this@setText, text, length)
}
