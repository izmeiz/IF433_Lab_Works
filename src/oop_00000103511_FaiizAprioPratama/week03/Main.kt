package oop_00000103511_FaiizAprioPratama.week03

fun main(){
    val e = Employee("Budi")
    println("---- Test Error ----")
    e.salary = -5000
    println("Current Salary: ${e.salary}")
    e.salary = 10000
    println("Updated Salary: ${e.salary}")
}