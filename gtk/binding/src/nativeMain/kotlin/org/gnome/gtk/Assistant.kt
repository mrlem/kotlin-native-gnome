// TODO - method: get_page_header_image
// TODO - method: get_page_side_image
// TODO - method: set_forward_page_func
// TODO - method: set_page_header_image
// TODO - method: set_page_side_image
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAssistant
import interop.gtk_assistant_add_action_widget
import interop.gtk_assistant_append_page
import interop.gtk_assistant_commit
import interop.gtk_assistant_get_current_page
import interop.gtk_assistant_get_n_pages
import interop.gtk_assistant_get_nth_page
import interop.gtk_assistant_get_page_complete
import interop.gtk_assistant_get_page_has_padding
import interop.gtk_assistant_get_page_title
import interop.gtk_assistant_get_page_type
import interop.gtk_assistant_insert_page
import interop.gtk_assistant_new
import interop.gtk_assistant_next_page
import interop.gtk_assistant_prepend_page
import interop.gtk_assistant_previous_page
import interop.gtk_assistant_remove_action_widget
import interop.gtk_assistant_remove_page
import interop.gtk_assistant_set_current_page
import interop.gtk_assistant_set_page_complete
import interop.gtk_assistant_set_page_has_padding
import interop.gtk_assistant_set_page_title
import interop.gtk_assistant_set_page_type
import interop.gtk_assistant_update_buttons_state
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias Assistant = CPointer<GtkAssistant>

public val Assistant.asObject: Object
  get() = reinterpret()

public val Assistant.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Assistant.asWidget: Widget
  get() = reinterpret()

public val Assistant.asContainer: Container
  get() = reinterpret()

public val Assistant.asBin: Bin
  get() = reinterpret()

public val Assistant.asWindow: Window
  get() = reinterpret()

public object AssistantFactory {
  public fun new(): Assistant = gtk_assistant_new()!!.reinterpret()
}

public var Assistant.currentPage: Int
  get() = gtk_assistant_get_current_page(this)
  set(`value`) {
    gtk_assistant_set_current_page(this, value)
  }

public val Assistant.nPages: Int
  get() = gtk_assistant_get_n_pages(this)

public fun Assistant.addActionWidget(child: Widget?): Unit {
  gtk_assistant_add_action_widget(this, child?.reinterpret())
}

public fun Assistant.appendPage(page: Widget?): Int = gtk_assistant_append_page(this,
    page?.reinterpret())

public fun Assistant.commit(): Unit {
  gtk_assistant_commit(this)
}

public fun Assistant.getNthPage(pageNum: Int): Widget? = gtk_assistant_get_nth_page(this,
    pageNum)?.reinterpret()

public fun Assistant.getPageComplete(page: Widget?): Boolean = gtk_assistant_get_page_complete(this,
    page?.reinterpret()).toBoolean

public fun Assistant.getPageHasPadding(page: Widget?): Boolean =
    gtk_assistant_get_page_has_padding(this, page?.reinterpret()).toBoolean

public fun Assistant.getPageTitle(page: Widget?): String = gtk_assistant_get_page_title(this,
    page?.reinterpret()).toKString

public fun Assistant.getPageType(page: Widget?): AssistantPageType =
    gtk_assistant_get_page_type(this, page?.reinterpret())

public fun Assistant.insertPage(page: Widget?, position: Int): Int = gtk_assistant_insert_page(this,
    page?.reinterpret(), position)

public fun Assistant.nextPage(): Unit {
  gtk_assistant_next_page(this)
}

public fun Assistant.prependPage(page: Widget?): Int = gtk_assistant_prepend_page(this,
    page?.reinterpret())

public fun Assistant.previousPage(): Unit {
  gtk_assistant_previous_page(this)
}

public fun Assistant.removeActionWidget(child: Widget?): Unit {
  gtk_assistant_remove_action_widget(this, child?.reinterpret())
}

public fun Assistant.removePage(pageNum: Int): Unit {
  gtk_assistant_remove_page(this, pageNum)
}

public fun Assistant.setPageComplete(page: Widget?, complete: Boolean): Unit {
  gtk_assistant_set_page_complete(this, page?.reinterpret(), complete.toInt)
}

public fun Assistant.setPageHasPadding(page: Widget?, hasPadding: Boolean): Unit {
  gtk_assistant_set_page_has_padding(this, page?.reinterpret(), hasPadding.toInt)
}

public fun Assistant.setPageTitle(page: Widget?, title: String): Unit {
  gtk_assistant_set_page_title(this, page?.reinterpret(), title)
}

public fun Assistant.setPageType(page: Widget?, type: AssistantPageType): Unit {
  gtk_assistant_set_page_type(this, page?.reinterpret(), type)
}

public fun Assistant.updateButtonsState(): Unit {
  gtk_assistant_update_buttons_state(this)
}

public fun Assistant.onApply(callback: (Assistant) -> Unit): Assistant {
  // TODO - handle callback data

  asObject.connect("apply") { callback(this) }
  return this
}

public fun Assistant.onCancel(callback: (Assistant) -> Unit): Assistant {
  // TODO - handle callback data

  asObject.connect("cancel") { callback(this) }
  return this
}

public fun Assistant.onClose(callback: (Assistant) -> Unit): Assistant {
  // TODO - handle callback data

  asObject.connect("close") { callback(this) }
  return this
}

public fun Assistant.onEscape(callback: (Assistant) -> Unit): Assistant {
  // TODO - handle callback data

  asObject.connect("escape") { callback(this) }
  return this
}

public fun Assistant.onPrepare(callback: (Assistant) -> Unit): Assistant {
  // TODO - handle callback data

  asObject.connect("prepare") { callback(this) }
  return this
}
