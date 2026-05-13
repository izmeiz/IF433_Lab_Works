package oop_00000103511_FaiizAprioPratama.Week10

interface NamedItem {
    val name: String
}

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}

fun <T : NamedItem> WalletRepository<T>.findByName(query: String): List<T> {
    return getAll().filter {
        it.name.contains(query, ignoreCase = true)
    }
}

