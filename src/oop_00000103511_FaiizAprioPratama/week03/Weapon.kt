package oop_00000103511_FaiizAprioPratama.week03

class Weapon (val name: String){

    // Properti Damage
    var damage: Int = 0
        set(value) {
            if (value > 0){
                println("Peringatan: Damage tidak boleh negatif!")
            } else if (value > 1000){
                println("Peringatan: Damage Overpowered! Damage dipaksa menjadi 1000")
                field = 1000
            } else {
                field = value
            }
        }
    // Properti tier dengan Getter
    val tier: String
        get(){
            return if (damage > 800) {
                "Legendary"
            } else if (damage > 500) {
                "Epic"
            } else {
                "Common"
            }
        }
}