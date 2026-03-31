package oop_00000103511_FaiizAprioPratama.Week07

fun processEvent(event: BattleState) {
    // Blok when ini wajib exhaustive (menangani semua kemungkinan BattleState)
    when (event) {
        is BattleState.MonsterEncounter -> {
            println(" AWAS! Kamu dihadang oleh monster: ${event.monsterName}!")
        }

        is BattleState.LootDrooped -> {
            val itemName = event.item.name
            val itemRarity = event.item.rarity
            println(" HORE! Mendapatkan loot: $itemName (Rarity: $itemRarity)")
        }

        is BattleState.GameOver -> {
            println(" GAME OVER... Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println(" Kamu telah memasuki Safe Zone. Silakan beristirahat dengan aman.")
        }
    }
}