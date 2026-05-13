package oop_00000103511_FaiizAprioPratama.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.125))
    coinRepo.add(Coin("ETH", 1.5))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    println("Daftar Koin:")

    response.data.forEach{ coin ->
        println("- ${coin.name}: ${coin.balance}")
    }
}