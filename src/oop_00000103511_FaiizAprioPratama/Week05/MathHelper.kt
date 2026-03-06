package oop_00000103511_FaiizAprioPratama.Week05

class MathHelper {
    // Luas Persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Luas Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int{
        return panjang * lebar
    }

    // Luas Lingkaran
    fun hitungLuas(jarijari: Double): Double{
        return 3.14 * jarijari * jarijari
    }
}