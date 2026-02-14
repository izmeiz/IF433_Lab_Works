package oop_00000103511_FaiizAprioPratama.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- HERO BATTLE SIMULATOR ---")

    //Setup Hero
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)

    // Setup Enemy
    var enemyHp = 100
    println("Musuh liar muncul! (HP: $enemyHp)")

    // Main Loop
    while (myHero.isAlive() && enemyHp > 0) {
        println("\n=== STATUS ===")
        println("${myHero.name} HP: ${myHero.hp} | Enemy HP: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")

        when (scanner.nextInt()) {
            1 -> {
                // Hero menyerang
                myHero.attack("Musuh")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    println("Musuh menyerang balik!")
                    val randomDamage = (10..20).random()
                    myHero.takeDamage(randomDamage) // State HP Hero berubah di sini
                }
            }
            2 -> {
                println("${myHero.name} memutuskan untuk kabur dari pertarungan!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    // Winner Anouncement
    println("\n--- PERTARUNGAN BERAKHIR ---")
    if (!myHero.isAlive()) {
        println("GAME OVER: ${myHero.name} telah gugur dalam tugas.")
    } else if (enemyHp <= 0) {
        println("VICTORY: ${myHero.name} berhasil mengalahkan musuh!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}