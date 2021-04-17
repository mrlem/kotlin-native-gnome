package org.gnome.gir.model

import org.gnome.gir.model.meta.InfoElements
import org.gnome.gir.model.enums.When

/**
 * GIR signal.
 *
 * A signal as defined in the GObject system (https://developer.gnome.org/gobject/stable/signal.html).
 *
 * @property name name of the signal.
 * @property detailed binary attribute, true if the signal has a detailed parameter
 *  (https://developer.gnome.org/gobject/stable/signal.html#signal-detail# and
 *  https://developer.gnome.org/gobject/unstable/gobject-Signals.html#GSignalFlags).
 * @property when when to run the signal during the 5 steps of signal emission
 *  (https://developer.gnome.org/gobject/stable/signal.html#signal-emission and
 *  https://developer.gnome.org/gobject/unstable/gobject-Signals.html#GSignalFlags).
 * @property action binary attribute, true if the signal can be freely emitted on alive objects from user code
 *  (https://developer.gnome.org/gobject/unstable/gobject-Signals.html#GSignalFlags).
 * @property noHooks binary attribute, true if no emission hooks are supported for this signal
 *  (https://developer.gnome.org/gobject/unstable/gobject-Signals.html#GSignalFlags).
 * @property noRecurse binary attribute, true if signals emitted for an object while currently being in emission for
 *  this very object will not be emitted recursively, but instead cause the first emission to be restarted
 *  (https://developer.gnome.org/gobject/unstable/gobject-Signals.html#GSignalFlags).
 * @property info signal info.
 * @property parameters signal callable params.
 * @property returnValue signal callable return.
 */
data class SignalDefinition(
    val name: String,
    val detailed: Boolean?,
    val `when`: When?,
    val action: Boolean?,
    val noHooks: Boolean?,
    val noRecurse: Boolean?,
    val info: InfoElements,
    val parameters: List<ParameterDefinition>,
    val returnValue: ReturnValueDefinition?
)
