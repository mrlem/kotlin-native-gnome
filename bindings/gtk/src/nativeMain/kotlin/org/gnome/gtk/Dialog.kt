// TODO - constructor: new_with_buttons
// TODO - method: add_buttons
// TODO - method: get_action_area
// TODO - method: set_alternative_button_order
// TODO - method: set_alternative_button_order_from_array
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkDialog
import interop.gtk_dialog_add_action_widget
import interop.gtk_dialog_add_button
import interop.gtk_dialog_get_content_area
import interop.gtk_dialog_get_header_bar
import interop.gtk_dialog_get_response_for_widget
import interop.gtk_dialog_get_widget_for_response
import interop.gtk_dialog_new
import interop.gtk_dialog_response
import interop.gtk_dialog_run
import interop.gtk_dialog_set_default_response
import interop.gtk_dialog_set_response_sensitive
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias Dialog = CPointer<GtkDialog>

public val Dialog.asObject: Object
  get() = reinterpret()

public val Dialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Dialog.asWidget: Widget
  get() = reinterpret()

public val Dialog.asContainer: Container
  get() = reinterpret()

public val Dialog.asBin: Bin
  get() = reinterpret()

public val Dialog.asWindow: Window
  get() = reinterpret()

public object DialogFactory {
  public fun new(): Dialog = gtk_dialog_new()!!.reinterpret()
}

public val Dialog.contentArea: Box?
  get() = gtk_dialog_get_content_area(this)?.reinterpret()

public val Dialog.headerBar: HeaderBar?
  get() = gtk_dialog_get_header_bar(this)?.reinterpret()

public fun Dialog.addActionWidget(child: Widget?, responseId: Int): Unit {
  gtk_dialog_add_action_widget(this, child?.reinterpret(), responseId)
}

public fun Dialog.addButton(buttonText: String, responseId: Int): Widget? =
    gtk_dialog_add_button(this, buttonText, responseId)?.reinterpret()

public fun Dialog.getResponseForWidget(widget: Widget?): Int =
    gtk_dialog_get_response_for_widget(this, widget?.reinterpret())

public fun Dialog.getWidgetForResponse(responseId: Int): Widget? =
    gtk_dialog_get_widget_for_response(this, responseId)?.reinterpret()

public fun Dialog.response(responseId: Int): Unit {
  gtk_dialog_response(this, responseId)
}

public fun Dialog.run(): Int = gtk_dialog_run(this)

public fun Dialog.setDefaultResponse(responseId: Int): Unit {
  gtk_dialog_set_default_response(this, responseId)
}

public fun Dialog.setResponseSensitive(responseId: Int, setting: Boolean): Unit {
  gtk_dialog_set_response_sensitive(this, responseId, setting.toInt)
}

public fun Dialog.onClose(callback: (Dialog) -> Unit): Dialog {
  // TODO - handle callback data

  asObject.connect("close") { callback(this) }
  return this
}

public fun Dialog.onResponse(callback: (Dialog) -> Unit): Dialog {
  // TODO - handle callback data

  asObject.connect("response") { callback(this) }
  return this
}