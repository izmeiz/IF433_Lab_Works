package oop_00000103511_FaiizAprioPratama.week03

class Player(val username: String) {

    // Private XP
    private var xp: Int = 0

    // Level
    val level : Int
        get(){
            return (xp / 100) + 1
        }

    fun addXp(amount: Int){

        if (amount > 0){
            val levelSebelumnya = this.level

            xp+= amount

            val levelSekarang = this.level

            if (levelSekarang > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke $levelSekarang")
            } else {
                println("$username mendapat $amount XP. (Total XP: $xp, Level: $levelSekarang)")
            }
        } else {
            println("Peringatan: JUmalh XP yang ditambahkan harus lebih dari 0")
        }
    }
}