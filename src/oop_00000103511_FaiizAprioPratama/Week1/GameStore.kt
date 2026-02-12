package oop_00000103511_FaiizAprioPratama.Week1

fun main() {
    val gameTitle  = "Clair Obscur: Expedition 33"
    val price = 600000

    //Hitung total harga
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)

}
//Function implement discount
fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.2).toInt()
    else (price * 0.1).toInt()


//Function Cetak Struk
fun printReceipt(title: String, finalPrice: Int) {
    println("===STRUK PEMBELIAN ===")
    println("Judul Game: $title")
    println("Harga Akhir : Rp $finalPrice")
}