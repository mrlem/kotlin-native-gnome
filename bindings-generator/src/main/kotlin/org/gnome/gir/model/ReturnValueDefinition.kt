package org.gnome.gir.model

import org.gnome.gir.model.enums.Ownership
import org.gnome.gir.model.enums.Scope
import org.gnome.gir.model.meta.DocElements
import org.gnome.gir.model.types.AnyType

/**
 * GIR return value.
 *
 * Return value of a callable.
 *
 * @property introspectable binary attribute which is "0" (false) if the element is not introspectable. It doesn't exist in the bindings, due in general to missing information in the annotations in the original C code.
 * @property nullable binary attribute, true if the parameter can have a null value.
 * @property closure the parameter is a user_data for callbacks. The value points to a different parameter that is the actual callback.
 * @property scope the parameter is a callback, the value indicates the lifetime of the call. For language bindings which want to know when the resources required to do the call can be freed. "notified" valid until a GDestroyNotify argument is called, "async" only valid for the duration of the first callback invocationi (can only be called once), "call" only valid for the duration of the call, can be called multiple times during the call.
 * @property destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is the actual callback.
 * @property skip binary attribute, true if the parameter can be omitted from the introspected output.
 * @property allowNone deprecated, replaced by nullable and optional.
 * @property transferOwnership TODO.
 * @property type return value type.
 * @property doc return value doc.
 */
data class ReturnValueDefinition(
    val introspectable: Boolean,
    val nullable: Boolean,
    val closure: Int?,
    val scope: Scope?,
    val destroy: Int?,
    val skip: Boolean,
    @Deprecated("replaced by nullable and optional")
    val allowNone: Boolean,
    val transferOwnership: Ownership,
    var type: AnyType?,
    val doc: DocElements
)
