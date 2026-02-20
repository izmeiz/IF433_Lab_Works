package oop_00000103511_FaiizAprioPratama.week03

fun main(){
    println("==== System Player ====")
    val player1 = Player("Izxovaz")
    println("Hero: ${player1.username} | Level Awal: ${player1.level}")

    println(" Cek Private : Aman (xp tidak bisa diakses langsung)")

    //tambah 50 XP
    println("\n Menambah 50 XP...")
    player1.addXp(50)

    //tambah 60 XP
    println("\n Menambah 60 XP...")
    player1.addXp(60)

    println("\n==== SELESAI =====")
}