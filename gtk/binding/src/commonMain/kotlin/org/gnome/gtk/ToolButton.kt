package org.gnome.gtk

import gtk3.GtkToolButton
import gtk3.gtk_tool_button_get_icon_name
import gtk3.gtk_tool_button_get_icon_widget
import gtk3.gtk_tool_button_get_label
import gtk3.gtk_tool_button_get_label_widget
import gtk3.gtk_tool_button_get_use_underline
import gtk3.gtk_tool_button_set_icon_name
import gtk3.gtk_tool_button_set_icon_widget
import gtk3.gtk_tool_button_set_label
import gtk3.gtk_tool_button_set_label_widget
import gtk3.gtk_tool_button_set_use_underline
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

public typealias ToolButton = CPointer<GtkToolButton>

public val ToolButton.asObject: Object
  get() = reinterpret()

public val ToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolButton.asWidget: Widget
  get() = reinterpret()

public val ToolButton.asContainer: Container
  get() = reinterpret()

public val ToolButton.asBin: Bin
  get() = reinterpret()

public val ToolButton.asToolItem: ToolItem
  get() = reinterpret()

public fun ToolButton.getIconName(): String = gtk_tool_button_get_icon_name(this).toKString

public fun ToolButton.getIconWidget(): Widget? =
    gtk_tool_button_get_icon_widget(this)?.reinterpret()

public fun ToolButton.getLabel(): String = gtk_tool_button_get_label(this).toKString

public fun ToolButton.getLabelWidget(): Widget? =
    gtk_tool_button_get_label_widget(this)?.reinterpret()

public fun ToolButton.getUseUnderline(): Boolean = gtk_tool_button_get_use_underline(this).toBoolean

public fun ToolButton.setIconName(iconName: String?): Unit {
  gtk_tool_button_set_icon_name(this, iconName)
}

public fun ToolButton.setIconWidget(iconWidget: Widget): Unit {
  gtk_tool_button_set_icon_widget(this, iconWidget.reinterpret())
}

public fun ToolButton.setLabel(label: String?): Unit {
  gtk_tool_button_set_label(this, label)
}

public fun ToolButton.setLabelWidget(labelWidget: Widget): Unit {
  gtk_tool_button_set_label_widget(this, labelWidget.reinterpret())
}

public fun ToolButton.setUseUnderline(useUnderline: Boolean): Unit {
  gtk_tool_button_set_use_underline(this, useUnderline.toInt)
}
