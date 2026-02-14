package oop_00000103511_FaiizAprioPratama.week02

class Hero (
    val name: String,
    val basedamage: Int,
    var hp: Int = 100
){
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp <= 0) {
            hp = 0
        }
        println("$name menerima $damage damage! HP tersisa: $hp")
    }

    fun isAlive(): Boolean = hp > 0
}