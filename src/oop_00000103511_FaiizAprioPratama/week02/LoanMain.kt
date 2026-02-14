package oop_00000103511_FaiizAprioPratama.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- PERPUSTAKAAN UMN ---")

    //Input Data
    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine() // Bersihkan buffer

    //Validasi dengan if
    if (duration < 0) {
        println("WARNING: Durasi tidak boleh minus! Diubah otomatis ke 1 hari.")
        duration = 1
    }

    //Objek Loan
    val loan = Loan(title, borrower, duration)

    // Cetak Detail & Denda
    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul   : ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi  : ${loan.loanDuration} hari")
    println("Denda   : Rp ${loan.calculateFine()}")
}