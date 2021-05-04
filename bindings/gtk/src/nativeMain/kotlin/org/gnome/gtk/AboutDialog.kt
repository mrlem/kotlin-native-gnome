// TODO - method: get_logo (return type)
// TODO - method: set_logo (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAboutDialog
import interop.gtk_about_dialog_add_credit_section
import interop.gtk_about_dialog_get_artists
import interop.gtk_about_dialog_get_authors
import interop.gtk_about_dialog_get_comments
import interop.gtk_about_dialog_get_copyright
import interop.gtk_about_dialog_get_documenters
import interop.gtk_about_dialog_get_license
import interop.gtk_about_dialog_get_license_type
import interop.gtk_about_dialog_get_logo_icon_name
import interop.gtk_about_dialog_get_program_name
import interop.gtk_about_dialog_get_translator_credits
import interop.gtk_about_dialog_get_version
import interop.gtk_about_dialog_get_website
import interop.gtk_about_dialog_get_website_label
import interop.gtk_about_dialog_get_wrap_license
import interop.gtk_about_dialog_new
import interop.gtk_about_dialog_set_artists
import interop.gtk_about_dialog_set_authors
import interop.gtk_about_dialog_set_comments
import interop.gtk_about_dialog_set_copyright
import interop.gtk_about_dialog_set_documenters
import interop.gtk_about_dialog_set_license
import interop.gtk_about_dialog_set_license_type
import interop.gtk_about_dialog_set_logo_icon_name
import interop.gtk_about_dialog_set_program_name
import interop.gtk_about_dialog_set_translator_credits
import interop.gtk_about_dialog_set_version
import interop.gtk_about_dialog_set_website
import interop.gtk_about_dialog_set_website_label
import interop.gtk_about_dialog_set_wrap_license
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toInt
import org.gnome.toKArray
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias AboutDialog = CPointer<GtkAboutDialog>

public val AboutDialog.asObject: Object
  get() = reinterpret()

public val AboutDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AboutDialog.asWidget: Widget
  get() = reinterpret()

public val AboutDialog.asContainer: Container
  get() = reinterpret()

public val AboutDialog.asBin: Bin
  get() = reinterpret()

public val AboutDialog.asWindow: Window
  get() = reinterpret()

public val AboutDialog.asDialog: Dialog
  get() = reinterpret()

public object AboutDialogFactory {
  public fun new(): AboutDialog = gtk_about_dialog_new()!!.reinterpret()
}

public val AboutDialog.parentInstance: Dialog
  get() = pointed.parent_instance.ptr

public var AboutDialog.artists: Array<String>?
  get() = gtk_about_dialog_get_artists(this)?.toKArray { it.toKString()!! }
  set(`value`) {
    memScoped { gtk_about_dialog_set_artists(this@artists, `value`?.toCArray(memScope)) }
  }

public var AboutDialog.authors: Array<String>?
  get() = gtk_about_dialog_get_authors(this)?.toKArray { it.toKString()!! }
  set(`value`) {
    memScoped { gtk_about_dialog_set_authors(this@authors, `value`?.toCArray(memScope)) }
  }

public var AboutDialog.comments: String?
  get() = gtk_about_dialog_get_comments(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_comments(this@comments, `value`)
  }

public var AboutDialog.copyright: String?
  get() = gtk_about_dialog_get_copyright(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_copyright(this@copyright, `value`)
  }

public var AboutDialog.documenters: Array<String>?
  get() = gtk_about_dialog_get_documenters(this)?.toKArray { it.toKString()!! }
  set(`value`) {
    memScoped { gtk_about_dialog_set_documenters(this@documenters, `value`?.toCArray(memScope)) }
  }

public var AboutDialog.license: String?
  get() = gtk_about_dialog_get_license(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_license(this@license, `value`)
  }

public var AboutDialog.licenseType: License
  get() = gtk_about_dialog_get_license_type(this)
  set(`value`) {
    gtk_about_dialog_set_license_type(this@licenseType, `value`)
  }

public var AboutDialog.logoIconName: String?
  get() = gtk_about_dialog_get_logo_icon_name(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_logo_icon_name(this@logoIconName, `value`)
  }

public var AboutDialog.programName: String?
  get() = gtk_about_dialog_get_program_name(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_program_name(this@programName, `value`)
  }

public var AboutDialog.translatorCredits: String?
  get() = gtk_about_dialog_get_translator_credits(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_translator_credits(this@translatorCredits, `value`)
  }

public var AboutDialog.version: String?
  get() = gtk_about_dialog_get_version(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_version(this@version, `value`)
  }

public var AboutDialog.website: String?
  get() = gtk_about_dialog_get_website(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_website(this@website, `value`)
  }

public var AboutDialog.websiteLabel: String?
  get() = gtk_about_dialog_get_website_label(this).toKString()
  set(`value`) {
    gtk_about_dialog_set_website_label(this@websiteLabel, `value`)
  }

public var AboutDialog.wrapLicense: Boolean
  get() = gtk_about_dialog_get_wrap_license(this).toBoolean()
  set(`value`) {
    gtk_about_dialog_set_wrap_license(this@wrapLicense, `value`.toInt())
  }

public fun AboutDialog.addCreditSection(sectionName: String?, people: Array<String>?): Unit {
  memScoped { gtk_about_dialog_add_credit_section(this@addCreditSection, sectionName,
      people?.toCArray(memScope)) }
}

public fun AboutDialog.onActivateLink(callback: (AboutDialog) -> Unit): AboutDialog {
  // TODO - handle callback data

  asObject.connect("activate-link") { callback(this) }
  return this
}
