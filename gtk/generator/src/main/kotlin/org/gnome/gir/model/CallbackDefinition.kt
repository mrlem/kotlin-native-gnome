package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements
import org.gnome.gir.model.meta.AnyTypeOrCallback
import org.gnome.gir.model.meta.DefinedType

/**
 * GIR callback.
 *
 * A callback closure, that is a function called when a signal is emitted (as an answer to that signal).
 *
 * @property name name of the callback.
 * @property cType the C type returned by the callback closure (i.e. function).
 * @property throws binary attribute, true if the callback can throw an error.
 * @property info callback info.
 * @property parameters TODO.
 * @property returnValue TODO.
 */
data class CallbackDefinition(
    override val name: String,
    val cType: String?,
    val throws: Boolean,
    val info: InfoElements,
    val parameters: List<ParameterDefinition>,
    val returnValue: ReturnValueDefinition?
) : DefinedType, AnyTypeOrCallback
