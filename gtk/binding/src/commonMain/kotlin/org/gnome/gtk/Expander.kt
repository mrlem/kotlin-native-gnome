package org.gnome.gtk

import gtk3.GtkExpander
import gtk3.gtk_expander_get_expanded
import gtk3.gtk_expander_get_label
import gtk3.gtk_expander_get_label_fill
import gtk3.gtk_expander_get_label_widget
import gtk3.gtk_expander_get_resize_toplevel
import gtk3.gtk_expander_get_use_markup
import gtk3.gtk_expander_get_use_underline
import gtk3.gtk_expander_set_expanded
import gtk3.gtk_expander_set_label
import gtk3.gtk_expander_set_label_fill
import gtk3.gtk_expander_set_label_widget
import gtk3.gtk_expander_set_resize_toplevel
import gtk3.gtk_expander_set_use_markup
import gtk3.gtk_expander_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias Expander = CPointer<GtkExpander>

public val Expander.asObject: Object
  get() = reinterpret()

public val Expander.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Expander.asWidget: Widget
  get() = reinterpret()

public val Expander.asContainer: Container
  get() = reinterpret()

public val Expander.asBin: Bin
  get() = reinterpret()

public fun Expander.getExpanded(): Boolean = gtk_expander_get_expanded(this).toBoolean

public fun Expander.getLabel(): String = gtk_expander_get_label(this).toKString

public fun Expander.getLabelFill(): Boolean = gtk_expander_get_label_fill(this).toBoolean

public fun Expander.getLabelWidget(): Widget? = gtk_expander_get_label_widget(this)?.reinterpret()

public fun Expander.getResizeToplevel(): Boolean = gtk_expander_get_resize_toplevel(this).toBoolean

public fun Expander.getUseMarkup(): Boolean = gtk_expander_get_use_markup(this).toBoolean

public fun Expander.getUseUnderline(): Boolean = gtk_expander_get_use_underline(this).toBoolean

public fun Expander.setExpanded(expanded: Boolean): Unit {
  gtk_expander_set_expanded(this, expanded.toInt)
}

public fun Expander.setLabel(label: String?): Unit {
  gtk_expander_set_label(this, label)
}

public fun Expander.setLabelFill(labelFill: Boolean): Unit {
  gtk_expander_set_label_fill(this, labelFill.toInt)
}

public fun Expander.setLabelWidget(labelWidget: Widget): Unit {
  gtk_expander_set_label_widget(this, labelWidget.reinterpret())
}

public fun Expander.setResizeToplevel(resizeToplevel: Boolean): Unit {
  gtk_expander_set_resize_toplevel(this, resizeToplevel.toInt)
}

public fun Expander.setUseMarkup(useMarkup: Boolean): Unit {
  gtk_expander_set_use_markup(this, useMarkup.toInt)
}

public fun Expander.setUseUnderline(useUnderline: Boolean): Unit {
  gtk_expander_set_use_underline(this, useUnderline.toInt)
}
