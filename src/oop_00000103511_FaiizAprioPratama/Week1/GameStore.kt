package oop_00000103511_FaiizAprioPratama.Week1

fun main() {
    val gameTitle: String = "Clair Obscur: Expedition 33"
    val price: Int = 600000

}
//Function implement discount
fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.2).toInt()
    else (price * 0.1).toInt()