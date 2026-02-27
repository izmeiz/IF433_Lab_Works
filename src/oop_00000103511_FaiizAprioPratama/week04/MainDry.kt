package oop_00000103511_FaiizAprioPratama.week04

fun main(){
    println("--- Testing Manager ---")
    val myManager = Manager("Ahmad Rojali", 8_000_000)

    myManager.work()

    println("Bonus Manager ${myManager.name}: Rp ${myManager.calculateBonus()}")

    println("\n--- Testing Developer")
    val myDeveloper = Developer("Rasya Abhista", 6_000_000, "Python")
    myDeveloper.work()

    println("Bonus Developer ${myDeveloper.name}: Rp ${myDeveloper.calculateBonus()}")
}