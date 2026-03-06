package oop_00000103511_FaiizAprioPratama.Week05

import oop_00000103511_FaiizAprioPratama.Pegawai

class Admin (nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi. ")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }

}