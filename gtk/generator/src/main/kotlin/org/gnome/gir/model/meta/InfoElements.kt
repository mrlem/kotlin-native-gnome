package org.gnome.gir.model.meta

import org.gnome.gir.model.AnnotationDefinition
import org.gnome.gir.model.enums.Stability

/**
 * Some base information for most elements like version, deprecation, stability, if they are introspectable or not,
 * etc...
 *
 * @property introspectable binary attribute which is "0" (false) if the element is not introspectable. It doesn't
 *  exist in the bindings, due in general to missing information in the annotations in the original C code.
 * @property deprecated binary attribute which is "1" (true) if the element has been deprecated.
 * @property deprecatedVersion version number from which this element is deprecated.
 * @property version version number of an element.
 * @property stability gives the stability status of the element.
 * @property doc info doc.
 * @property annotations info annotations.
 */
data class InfoElements(
    val introspectable: Boolean,
    val deprecated: Boolean,
    val deprecatedVersion: String?,
    val version: String?,
    val stability: Stability,
    val doc: DocElements,
    val annotations: List<AnnotationDefinition>
)
