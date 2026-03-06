package oop_00000103511_FaiizAprioPratama.Week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        println("Memproses pembayaran E-Wallet untuk akun $accountName")

        if (balance >= amount){
            balance -= amount
            println("Pembayaran sebesar $amount BERHASIL.")
            println("Sisa saldo Anda saat ini: $balance")
        } else{
            println("Gagal: Saldo tidak cukup untuk melakukan pembayaran sebesar $amount.")
            println("Saldo saat ini: $balance")
        }
        println("----------------------------------------------")
    }
    fun topUp(amount: Double){
        if (amount > 0) {
            balance += amount
            println("Top Up sebesar $amount BERHASIL.")
            println("Saldo saat ini: $balance")
        } else {
            println("Jumlah Top Up harus lebih besar dari 0")
        }
    }
}