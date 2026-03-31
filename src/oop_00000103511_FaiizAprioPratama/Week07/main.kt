package oop_00000103511_FaiizAprioPratama.Week07

fun main(){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST GAME MANAGER (SINGLETON) ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST ENUM & FACTORY ===")
    println("Peluang drop item LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal Pemain:")
    println("- Nama: ${starterWeapon.item.name}")
    println("- Damage: ${starterWeapon.item.damage}")
    println("- Rarity: ${starterWeapon.item.rarity}")
    println("- Durability: ${starterWeapon.durability}")


}