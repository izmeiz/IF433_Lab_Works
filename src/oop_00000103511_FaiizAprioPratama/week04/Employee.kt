package oop_00000103511_FaiizAprioPratama.week04

open class Employee (val name: String, val baseSalary: Int){

    open fun work(){
        println("$name sedang bekerja.")
    }
    // menghitung 10% base salary
    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}