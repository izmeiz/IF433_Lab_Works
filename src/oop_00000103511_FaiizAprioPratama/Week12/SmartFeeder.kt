package oop_00000103511_FaiizAprioPratama.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Peringatan Hardware: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan Stok: ${e.message}")
    } catch (e: Exception) {
        println("Error Tidak Dikenal: ${e.message}")
    } finally {
        // Langkah 8: Jadwal Makan 1: Cleanup (Finally)
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("=== JADWAL MAKAN 2 (SORE) ===")
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
    // jalan
}



