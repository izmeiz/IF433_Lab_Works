package oop_00000103511_FaiizAprioPratama.week03

fun main(){
    val senjata = Weapon("Excalibur")

    senjata.damage = -50
    println("Damage: ${senjata.damage}")

    senjata.damage = 9999
    println("Damage: ${senjata.damage}")

    println("Tier: ${senjata.tier}")
}