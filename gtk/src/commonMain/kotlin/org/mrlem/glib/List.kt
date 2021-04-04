package org.mrlem.glib

import gtk3.*
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.convert

class List<T : CPointer<*>>(
    private val list: CPointer<GList>,
    private val converter: (gconstpointer) -> T
) : kotlin.collections.List<T> {

    override val size: Int
        get() = g_list_length(list).convert()

    override fun contains(element: T): Boolean {
        return g_list_index(list, element as gconstpointer) != -1
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return elements.all { contains(it) }
    }

    override fun get(index: Int): T {
        return converter(g_list_nth_data(list, index.convert())!!)
    }

    override fun indexOf(element: T): Int {
        return g_list_index(list, element)
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun iterator(): Iterator<T> = Itr(0)

    override fun lastIndexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<T> = Itr(0)

    override fun listIterator(index: Int): ListIterator<T> = Itr(index)

    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        TODO("Not yet implemented")
    }

    private inner class Itr(
        private var index: Int
    ) : ListIterator<T> {

        private var lastIndex: Int

        init {
            this.lastIndex = -1
        }

        override fun hasPrevious(): Boolean = index > 0
        override fun hasNext(): Boolean = index < size

        override fun previousIndex(): Int = index - 1
        override fun nextIndex(): Int = index

        override fun previous(): T {
            if (index <= 0) throw NoSuchElementException()
            lastIndex = --index
            return get(lastIndex)
        }

        override fun next(): T {
            if (index >= size) throw NoSuchElementException()
            lastIndex = index++
            return get(lastIndex)
        }
    }
}

fun <T : CPointer<*>> CPointer<GList>.toKList(converter: (gconstpointer) -> T) = List(this, converter)
