package oop_00000103511_FaiizAprioPratama.Week06

interface Clickable {
    val name : String
    fun click()
}

class button (override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}