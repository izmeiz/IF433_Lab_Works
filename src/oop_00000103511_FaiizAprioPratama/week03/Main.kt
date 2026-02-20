package oop_00000103511_FaiizAprioPratama.week03

fun main(){
    val e = Employee("Budi")

    // Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // test encapsulation
    e.increasePerformance()

    // Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}