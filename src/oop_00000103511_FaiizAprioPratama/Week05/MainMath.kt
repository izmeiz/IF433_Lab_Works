package oop_00000103511_FaiizAprioPratama.Week05

fun main (){
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    println("LuasPersegi (sisi 4)               : $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5,6)
    println("Luas Persegi Panjang (5 x 6)       : $luasPersegiPanjang")

    val luaslingkaran = mathHelper.hitungLuas(14.0)
    println("Luas Lingkaran (jari-jari 14.0)    : $luaslingkaran")
}