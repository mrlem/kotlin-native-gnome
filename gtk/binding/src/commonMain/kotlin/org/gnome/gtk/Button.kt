// TODO - get_event_window
// TODO - get_image_position
// TODO - get_relief
// TODO - set_image_position
// TODO - set_relief
//
package org.gnome.gtk

import gtk3.*
import kotlin.Boolean
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

public typealias Button = CPointer<GtkButton>

public val Button.asObject: Object
  get() = reinterpret()

public val Button.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Button.asWidget: Widget
  get() = reinterpret()

public val Button.asContainer: Container
  get() = reinterpret()

public val Button.asBin: Bin
  get() = reinterpret()

public fun Button.clicked(): Unit {
  gtk_button_clicked(this)
}

public fun Button.getAlwaysShowImage(): Boolean = gtk_button_get_always_show_image(this).toBoolean

public fun Button.getImage(): Widget? = gtk_button_get_image(this)?.reinterpret()

public fun Button.getLabel(): String = gtk_button_get_label(this).toKString

public fun Button.getUseUnderline(): Boolean = gtk_button_get_use_underline(this).toBoolean

public fun Button.setAlwaysShowImage(alwaysShow: Boolean): Unit {
  gtk_button_set_always_show_image(this, alwaysShow.toInt)
}

public fun Button.setImage(image: Widget): Unit {
  gtk_button_set_image(this, image.reinterpret())
}

public fun Button.setLabel(label: String?): Unit {
  gtk_button_set_label(this, label)
}

public fun Button.setUseUnderline(useUnderline: Boolean): Unit {
  gtk_button_set_use_underline(this, useUnderline.toInt)
}

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Button(label: String) = gtk_button_new_with_label(label)!!.reinterpret<GtkButton>()

///////////////////////////////////////////////////////////////////////////
// Event handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun Button.onClick(onClick: (Button) -> Unit): Button {
  asObject.connect("clicked") { onClick(this) }
  return this
}
