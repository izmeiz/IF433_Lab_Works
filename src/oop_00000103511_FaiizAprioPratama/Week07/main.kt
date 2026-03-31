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

    println("\n=== TEST IMMUTABILITY & EVENT SIMULATION ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Senjata setelah di-upgrade di Blacksmith:")
    println("- Nama: ${upgradedItem.name}")
    println("- Damage: ${upgradedItem.damage}")

    println("\n--- Eksekusi Event Berurutan ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDrooped(upgradedItem)) // Memasukkan item hasil copy
    processEvent(BattleState.GameOver("Terkena jebakan racun"))


}