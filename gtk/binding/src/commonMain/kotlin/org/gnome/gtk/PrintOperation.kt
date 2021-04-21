// TODO - method: get_error
// TODO - method: run
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkPrintOperation
import gtk3.gtk_print_operation_cancel
import gtk3.gtk_print_operation_draw_page_finish
import gtk3.gtk_print_operation_get_default_page_setup
import gtk3.gtk_print_operation_get_embed_page_setup
import gtk3.gtk_print_operation_get_has_selection
import gtk3.gtk_print_operation_get_n_pages_to_print
import gtk3.gtk_print_operation_get_print_settings
import gtk3.gtk_print_operation_get_status
import gtk3.gtk_print_operation_get_status_string
import gtk3.gtk_print_operation_get_support_selection
import gtk3.gtk_print_operation_is_finished
import gtk3.gtk_print_operation_set_allow_async
import gtk3.gtk_print_operation_set_current_page
import gtk3.gtk_print_operation_set_custom_tab_label
import gtk3.gtk_print_operation_set_default_page_setup
import gtk3.gtk_print_operation_set_defer_drawing
import gtk3.gtk_print_operation_set_embed_page_setup
import gtk3.gtk_print_operation_set_export_filename
import gtk3.gtk_print_operation_set_has_selection
import gtk3.gtk_print_operation_set_job_name
import gtk3.gtk_print_operation_set_n_pages
import gtk3.gtk_print_operation_set_print_settings
import gtk3.gtk_print_operation_set_show_progress
import gtk3.gtk_print_operation_set_support_selection
import gtk3.gtk_print_operation_set_track_print_status
import gtk3.gtk_print_operation_set_unit
import gtk3.gtk_print_operation_set_use_full_page
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias PrintOperation = CPointer<GtkPrintOperation>

public val PrintOperation.asObject: Object
  get() = reinterpret()

public var PrintOperation.defaultPageSetup: PageSetup?
  get() = gtk_print_operation_get_default_page_setup(this)?.reinterpret()
  set(`value`) {
    gtk_print_operation_set_default_page_setup(this, value)
  }

public var PrintOperation.embedPageSetup: Boolean
  get() = gtk_print_operation_get_embed_page_setup(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_embed_page_setup(this, value.toInt)
  }

public var PrintOperation.hasSelection: Boolean
  get() = gtk_print_operation_get_has_selection(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_has_selection(this, value.toInt)
  }

public val PrintOperation.nPagesToPrint: Int
  get() = gtk_print_operation_get_n_pages_to_print(this)

public var PrintOperation.printSettings: PrintSettings?
  get() = gtk_print_operation_get_print_settings(this)?.reinterpret()
  set(`value`) {
    gtk_print_operation_set_print_settings(this, value)
  }

public val PrintOperation.status: PrintStatus
  get() = gtk_print_operation_get_status(this)

public val PrintOperation.statusString: String
  get() = gtk_print_operation_get_status_string(this).toKString

public var PrintOperation.supportSelection: Boolean
  get() = gtk_print_operation_get_support_selection(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_support_selection(this, value.toInt)
  }

public fun PrintOperation.cancel(): kotlin.Unit {
  gtk_print_operation_cancel(this)
}

public fun PrintOperation.drawPageFinish(): kotlin.Unit {
  gtk_print_operation_draw_page_finish(this)
}

public fun PrintOperation.isFinished(): Boolean = gtk_print_operation_is_finished(this).toBoolean

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
