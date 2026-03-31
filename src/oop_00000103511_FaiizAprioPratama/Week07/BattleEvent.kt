package oop_00000103511_FaiizAprioPratama.Week07

sealed class BattleState{
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDrooped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}