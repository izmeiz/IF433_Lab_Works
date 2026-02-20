package oop_00000103511_FaiizAprioPratama.week03

class Employee (val name: String){
    var salary: Int = 0
    set(value) {
        println("Mencoba set gaji ke: $value")
        // INI KODE SALAH
        // Kita manggil setter di dalam setter (recursive)
        this.salary = value
    }

}