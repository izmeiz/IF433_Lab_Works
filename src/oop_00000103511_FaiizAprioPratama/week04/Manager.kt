package oop_00000103511_FaiizAprioPratama.week04

class Manager (name: String, baseSalary: Int) : Employee (name, baseSalary){

    override fun work(){
        println("$name sedang memimpin rapat divisi.")
    }

    //CalculateBonus
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500_000
    }
}