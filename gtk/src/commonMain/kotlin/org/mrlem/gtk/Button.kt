package org.mrlem.gtk

import gtk3.*
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

///////////////////////////////////////////////////////////////////////////
// Type
///////////////////////////////////////////////////////////////////////////

typealias Button = CPointer<GtkButton>

///////////////////////////////////////////////////////////////////////////
// Conversion
///////////////////////////////////////////////////////////////////////////

val Button.asWidget: Widget
    get() = reinterpret()

val Button.asObject: Object
    get() = reinterpret()

val Object.asButton: Button
    get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Button(label: String) = gtk_button_new_with_label(label)!!.reinterpret<GtkButton>()

///////////////////////////////////////////////////////////////////////////
// Event handlers
///////////////////////////////////////////////////////////////////////////

fun Button.onClick(onClick: (Button) -> Unit): Button {
    asObject.connect("clicked") { onClick(this) }
    return this
}
