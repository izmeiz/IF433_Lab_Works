package oop_00000103511_FaiizAprioPratama.Week05

fun main(){

    val dompetDigital = EWallet("Ahmad", 50000.0)

    val kartukredit = CreditCard("Reza", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(dompetDigital, kartukredit)

    println("====  SIMULASI PEMBAYARAN SEBESAR 75.000 ====")
    println()

    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)
    }
}