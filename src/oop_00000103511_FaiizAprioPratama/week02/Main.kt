package oop_00000103511_FaiizAprioPratama.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    //Input Data Dasar
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    print("Masukkan Jurusan: ")
    val majorInput = scanner.nextLine()

    val sInitial = Student(name, nim, majorInput)
    println("Status: Pendaftaran Selesai.")

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val choice = scanner.nextInt()
    scanner.nextLine() // Bersihkan buffer

    if (choice == 1) {
        // Jalur Reguler
        val sFinal = Student(name, nim, majorInput)
        println("Terdaftar di: ${sFinal.major} dengan GPA awal ${sFinal.gpa}")
    } else {
        // Jalur Umum
        val sFinal = Student(name, nim)
        println("Terdaftar di: ${sFinal.major} dengan GPA awal ${sFinal.gpa}")
    }
}