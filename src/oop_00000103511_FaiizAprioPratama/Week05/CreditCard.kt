package oop_00000103511_FaiizAprioPratama.Week05

class CreditCard (accountName: String, val limit: Double) : PaymentMethod(accountName){

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        println("Memproses pembayaran kartu Kredit untuk akun: $accountName")

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi sebesar $amount BERHASIL.")
            println("Total tagihan saat ini: $usedAmount / Limit: $limit")
        }else {
            println("Transaksi DITOLAK: Nominal $amount melebihi batas limit kartu kredit Anda.")
            println("Sisa limit yang bisa digunakan: ${limit - usedAmount}")
        }
        println("------------------------------")
    }

}