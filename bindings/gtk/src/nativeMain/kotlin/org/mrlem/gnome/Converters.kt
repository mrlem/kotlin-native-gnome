package org.mrlem.gnome

import interop.*
import kotlinx.cinterop.*
import kotlinx.cinterop.toKString
import org.gnome.glib.List

fun Boolean.toInt() = if (this) 1 else 0

fun Int.toBoolean() = this == 1

fun Char.toUInt() = code.toUInt()

fun UInt.toChar() = Char(this.toInt())

fun CPointer<gcharVar>?.toKString() = this?.toKString().orEmpty()

fun CPointerVar<ByteVar>?.toKString() = this?.pointed?.ptr?.toKStringFromUtf8()

inline fun <reified V : CPointed, reified P : CPointer<V>> List.toKList(): kotlin.collections.List<P> = org.mrlem.gnome.glib.List(this)

fun kotlin.collections.List<*>.toCList(): List = (this as org.mrlem.gnome.glib.List<*, *>).list

inline fun <reified P : CVariable, reified K> CPointer<P>.toKArray(mapper: (P) -> K): Array<K> {
    val arrayList = ArrayList<K>()
    var index = 0
    while (true) {
        val pointed = getOrNull(index++)
        pointed
            ?.also { arrayList.add(mapper(it)) }
            ?: break
    }
    return arrayList.toTypedArray()
}

@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
inline fun <reified P : CPointed> Array<CPointer<P>>.toCArray(memScope: MemScope) = (this as Array<CPointer<P>?>).toCValues()

inline fun <reified V : CVariable> Array<V>.toCArray(memScope: MemScope): CArrayPointer<V> = memScope.allocArray(this@toCArray.size) { index -> this@toCArray[index] }

@Suppress("UNUSED_PARAMETER")
fun Array<String>.toCArray(memScope: MemScope) = toCStringArray(memScope)

@Suppress("UNUSED_PARAMETER")
fun Array<Byte>.toCArray(memScope: MemScope) = toByteArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<Short>.toCArray(memScope: MemScope) = toShortArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<Int>.toCArray(memScope: MemScope) = toIntArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<Long>.toCArray(memScope: MemScope) = toLongArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<UByte>.toCArray(memScope: MemScope) = toUByteArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<UShort>.toCArray(memScope: MemScope) = toUShortArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<UInt>.toCArray(memScope: MemScope) = toUIntArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<ULong>.toCArray(memScope: MemScope) = toULongArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<Float>.toCArray(memScope: MemScope) = toFloatArray().toCValues()

@Suppress("UNUSED_PARAMETER")
fun Array<Double>.toCArray(memScope: MemScope) = toDoubleArray().toCValues()

///////////////////////////////////////////////////////////////////////////
// Private
///////////////////////////////////////////////////////////////////////////

inline fun <reified T : CVariable> CPointer<T>.getOrNull(index: Int): T? {
    val offset = if (index == 0) {
        0L // optimization for JVM impl which uses reflection for now.
    } else {
        index * sizeOf<T>()
    }
    return interpretNullablePointed(this.rawValue + offset)
}
