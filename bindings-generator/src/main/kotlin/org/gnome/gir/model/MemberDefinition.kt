package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements

/**
 * GIR member.
 *
 * Element defining a member of a bit field or an enumeration.
 *
 * @property name name of the member.
 * @property value value of the member.
 * @property cIdentifier corresponding C type of the member.
 * @property glibNick short nickname of the member.
 * @property info member info.
 */
data class MemberDefinition(
    val name: String,
    val value: String,
    val cIdentifier: String?,
    val glibNick: String?,
    val info: InfoElements
)
