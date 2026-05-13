package oop_00000103511_FaiizAprioPratama.Week10

class WalletRepository <T>{
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getALL(): List<T>{
        return items.toList()
    }
}