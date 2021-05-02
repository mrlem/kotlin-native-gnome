@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkPrintOperation
import interop.gtk_print_operation_cancel
import interop.gtk_print_operation_draw_page_finish
import interop.gtk_print_operation_get_default_page_setup
import interop.gtk_print_operation_get_embed_page_setup
import interop.gtk_print_operation_get_error
import interop.gtk_print_operation_get_has_selection
import interop.gtk_print_operation_get_n_pages_to_print
import interop.gtk_print_operation_get_print_settings
import interop.gtk_print_operation_get_status
import interop.gtk_print_operation_get_status_string
import interop.gtk_print_operation_get_support_selection
import interop.gtk_print_operation_is_finished
import interop.gtk_print_operation_new
import interop.gtk_print_operation_run
import interop.gtk_print_operation_set_allow_async
import interop.gtk_print_operation_set_current_page
import interop.gtk_print_operation_set_custom_tab_label
import interop.gtk_print_operation_set_default_page_setup
import interop.gtk_print_operation_set_defer_drawing
import interop.gtk_print_operation_set_embed_page_setup
import interop.gtk_print_operation_set_export_filename
import interop.gtk_print_operation_set_has_selection
import interop.gtk_print_operation_set_job_name
import interop.gtk_print_operation_set_n_pages
import interop.gtk_print_operation_set_print_settings
import interop.gtk_print_operation_set_show_progress
import interop.gtk_print_operation_set_support_selection
import interop.gtk_print_operation_set_track_print_status
import interop.gtk_print_operation_set_unit
import interop.gtk_print_operation_set_use_full_page
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias PrintOperation = CPointer<GtkPrintOperation>

public val PrintOperation.asObject: Object
  get() = reinterpret()

public object PrintOperationFactory {
  public fun new(): PrintOperation = gtk_print_operation_new()!!.reinterpret()
}

public val PrintOperation.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var PrintOperation.defaultPageSetup: PageSetup?
  get() = gtk_print_operation_get_default_page_setup(this)?.reinterpret()
  set(`value`) {
    gtk_print_operation_set_default_page_setup(this, `value`)
  }

public var PrintOperation.embedPageSetup: Boolean
  get() = gtk_print_operation_get_embed_page_setup(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_embed_page_setup(this, `value`.toInt)
  }

public var PrintOperation.hasSelection: Boolean
  get() = gtk_print_operation_get_has_selection(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_has_selection(this, `value`.toInt)
  }

public val PrintOperation.nPagesToPrint: Int
  get() = gtk_print_operation_get_n_pages_to_print(this)

public var PrintOperation.printSettings: PrintSettings?
  get() = gtk_print_operation_get_print_settings(this)?.reinterpret()
  set(`value`) {
    gtk_print_operation_set_print_settings(this, `value`)
  }

public val PrintOperation.status: PrintStatus
  get() = gtk_print_operation_get_status(this)

public val PrintOperation.statusString: String
  get() = gtk_print_operation_get_status_string(this).toKString

public var PrintOperation.supportSelection: Boolean
  get() = gtk_print_operation_get_support_selection(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_support_selection(this, `value`.toInt)
  }

public fun PrintOperation.cancel(): kotlin.Unit {
  gtk_print_operation_cancel(this)
}

public fun PrintOperation.drawPageFinish(): kotlin.Unit {
  gtk_print_operation_draw_page_finish(this)
}

@Throws(Error::class)
public fun PrintOperation.getError(): kotlin.Unit {
  memScoped {
    val errors = allocPointerTo<GError>().ptr
    val result: kotlin.Unit = gtk_print_operation_get_error(this@getError, errors)
    errors.pointed.pointed?.let { throw Error(it) }
    return result
  }
}

public fun PrintOperation.isFinished(): Boolean = gtk_print_operation_is_finished(this).toBoolean

@Throws(Error::class)
public fun PrintOperation.run(action: PrintOperationAction, parent: Window?): PrintOperationResult =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: PrintOperationResult = gtk_print_operation_run(this@run, action,
      parent?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PrintOperation.setAllowAsync(allowAsync: Boolean): kotlin.Unit {
  gtk_print_operation_set_allow_async(this, allowAsync.toInt)
}

public fun PrintOperation.setCurrentPage(currentPage: Int): kotlin.Unit {
  gtk_print_operation_set_current_page(this, currentPage)
}

public fun PrintOperation.setCustomTabLabel(label: String): kotlin.Unit {
  gtk_print_operation_set_custom_tab_label(this, label)
}

public fun PrintOperation.setDeferDrawing(): kotlin.Unit {
  gtk_print_operation_set_defer_drawing(this)
}

public fun PrintOperation.setExportFilename(filename: String): kotlin.Unit {
  gtk_print_operation_set_export_filename(this, filename)
}

public fun PrintOperation.setJobName(jobName: String): kotlin.Unit {
  gtk_print_operation_set_job_name(this, jobName)
}

public fun PrintOperation.setNPages(nPages: Int): kotlin.Unit {
  gtk_print_operation_set_n_pages(this, nPages)
}

public fun PrintOperation.setShowProgress(showProgress: Boolean): kotlin.Unit {
  gtk_print_operation_set_show_progress(this, showProgress.toInt)
}

public fun PrintOperation.setTrackPrintStatus(trackStatus: Boolean): kotlin.Unit {
  gtk_print_operation_set_track_print_status(this, trackStatus.toInt)
}

public fun PrintOperation.setUnit(unit: Unit): kotlin.Unit {
  gtk_print_operation_set_unit(this, unit)
}

public fun PrintOperation.setUseFullPage(fullPage: Boolean): kotlin.Unit {
  gtk_print_operation_set_use_full_page(this, fullPage.toInt)
}

public fun PrintOperation.onBeginPrint(callback: (PrintOperation) -> kotlin.Unit): PrintOperation {
  // TODO - handle callback data

  asObject.connect("begin-print") { callback(this) }
  return this
}

public fun PrintOperation.onCreateCustomWidget(callback: (PrintOperation) -> kotlin.Unit):
    PrintOperation {
  // TODO - handle callback data

  asObject.connect("create-custom-widget") { callback(this) }
  return this
}

public fun PrintOperation.onCustomWidgetApply(callback: (PrintOperation) -> kotlin.Unit):
    PrintOperation {
  // TODO - handle callback data

  asObject.connect("custom-widget-apply") { callback(this) }
  return this
}

public fun PrintOperation.onDone(callback: (PrintOperation) -> kotlin.Unit): PrintOperation {
  // TODO - handle callback data

  asObject.connect("done") { callback(this) }
  return this
}

public fun PrintOperation.onDrawPage(callback: (PrintOperation) -> kotlin.Unit): PrintOperation {
  // TODO - handle callback data

  asObject.connect("draw-page") { callback(this) }
  return this
}

public fun PrintOperation.onEndPrint(callback: (PrintOperation) -> kotlin.Unit): PrintOperation {
  // TODO - handle callback data

  asObject.connect("end-print") { callback(this) }
  return this
}

public fun PrintOperation.onPaginate(callback: (PrintOperation) -> kotlin.Unit): PrintOperation {
  // TODO - handle callback data

  asObject.connect("paginate") { callback(this) }
  return this
}

public fun PrintOperation.onPreview(callback: (PrintOperation) -> kotlin.Unit): PrintOperation {
  // TODO - handle callback data

  asObject.connect("preview") { callback(this) }
  return this
}

public fun PrintOperation.onRequestPageSetup(callback: (PrintOperation) -> kotlin.Unit):
    PrintOperation {
  // TODO - handle callback data

  asObject.connect("request-page-setup") { callback(this) }
  return this
}

public fun PrintOperation.onStatusChanged(callback: (PrintOperation) -> kotlin.Unit):
    PrintOperation {
  // TODO - handle callback data

  asObject.connect("status-changed") { callback(this) }
  return this
}

public fun PrintOperation.onUpdateCustomWidget(callback: (PrintOperation) -> kotlin.Unit):
    PrintOperation {
  // TODO - handle callback data

  asObject.connect("update-custom-widget") { callback(this) }
  return this
}
