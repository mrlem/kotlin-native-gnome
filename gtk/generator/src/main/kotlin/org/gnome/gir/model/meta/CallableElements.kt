package org.gnome.gir.model.meta

import org.gnome.gir.model.InstanceParameterDefinition
import org.gnome.gir.model.ParameterDefinition
import org.gnome.gir.model.ReturnValueDefinition

/**
 * Attributes of a Callable (functions, callbacks, closures, etc...).
 *
 * TODO - doc
 */
data class CallableElements(
    val info: InfoElements,
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?, // TODO - resolve?
    val shadows: String?, // TODO - resolve?
    val throws: Boolean,
    val movedTo: String?, // TODO - resolve?
    val parameters: List<ParameterDefinition>,
    val instanceParameter: InstanceParameterDefinition?,
    val returnValue: ReturnValueDefinition?
)
